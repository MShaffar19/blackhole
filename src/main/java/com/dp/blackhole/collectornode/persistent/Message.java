package com.dp.blackhole.collectornode.persistent;

import java.nio.ByteBuffer;

import com.dp.blackhole.common.Util;

public class Message {
    final private byte VERSION = 1;
    private ByteBuffer buffer;
    
    public Message(ByteBuffer buf) {
        buffer = buf;
    }
    
    public Message(byte[] data) {
        buffer = ByteBuffer.allocate(headSize() + data.length);
        buffer.put(VERSION);
        buffer.putLong(Util.getCRC32(data));
        buffer.put(data);
        buffer.rewind();
    }
    
    int headSize() {
        return (Byte.SIZE + Long.SIZE)/8;
    }
    
    void write(ByteBuffer serBuffer) {
        serBuffer.putInt(buffer.limit());
        serBuffer.put(buffer);
    }
    
    public int payloadSize() {
        return buffer.capacity() - headSize();
    }
    
    public ByteBuffer payload() {
        ByteBuffer buf = buffer.duplicate();
        buf.position(headSize());
        return buf.slice();
    }

    private long checksum() {
        ByteBuffer buf = buffer.duplicate();
        buf.position(Byte.SIZE/8);
        return buf.getLong();
    }
    
    public boolean valid() {
        return checksum() == Util.getCRC32(buffer.array(), headSize(), payloadSize()); 
    }
}
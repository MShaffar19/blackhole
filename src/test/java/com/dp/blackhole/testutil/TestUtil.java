package com.dp.blackhole.testutil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestUtil {
  private static final Log LOG = LogFactory.getLog(TestUtil.class);
  
  public static File createTmpFile(String MAGIC, String expected) 
      throws IOException, FileNotFoundException {
    String string = 
        "begin>  owefoq jfojnofownfowofnownefowoefojweofjwosfnvvoco\n" +
        "jlsdfpasjdfaopsdpfaskdfkpasdkpfkasdfas   100>   jcsopdnvon\n" +
        "vononoifjopwejf opwjfiop jpwj fopqwejfop qjfopiqjqertgbrtg\n" +
        "aspd jfoiasj df ioajsiodf asj fasof jasdopjf pasfj asopfjo\n" +
        "rtgrtghrthrthrthrhrthtrp sjfop asdj fopasj fopsfjopsjf wef\n" +
        "j faiosjf opwqejo fjopwej faeopsf jopawefj opsjf opsafj ao\n" +
        " wopejf opwj efopqwj epo fjwopefj pwef opw ejfopwj efopwf \n" +
        "3 wjopef joiqwf io j 9049 fj2490r 0pjfioj fioj qiowegio f \n" +
        " f90fj 9034u j90 jgioqpwejf iopwe jfopqwefj opewji fopq934\n" +
        expected + "\n";
    //build a app log
    File file = File.createTempFile(MAGIC, null);
    LOG.info("create tmp file " + file);
    BufferedWriter writer = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(file)));
    writer.write(string);
    writer.flush();
    writer.close();
    return file;
  }
  
  public static boolean deleteTmpFile(File file) {
    return file.delete();
  }
}

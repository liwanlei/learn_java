package com.jinjie;

import java.io.*;

public class SD{
  public static void main(String[] args) throws IOException {
    File file=new File("b.txt");
    FileOutputStream ft=new FileOutputStream(file);
    OutputStreamWriter writer=new OutputStreamWriter(ft,"utf-8");
    writer.append("Engilis");
    writer.append("中国");
    writer.close();
    ft.close();
    FileInputStream fileInputStream=new FileInputStream(file);
    InputStreamReader reader=new InputStreamReader(fileInputStream, "utf-8");
    StringBuffer sb = new StringBuffer();
    while (reader.ready()) {
      sb.append((char) reader.read());
    }
    reader.close();
    fileInputStream.close();
    }
}
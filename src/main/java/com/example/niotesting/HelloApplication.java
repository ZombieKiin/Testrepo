package com.example.niotesting;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class HelloApplication {
  public static void main(String[] args) {
    try { 
    //  FileInputStream file = new FileInputStream("data.txt");
    //  FileChannel channel = file.getChannel();
      Path dataPath = FileSystems.getDefault().getPath("data.txt");
      Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
      List<String> lines = Files.readAllLines(dataPath);
      for(String line : lines) {
        System.out.println(line);
      }
  } catch(IOException e) {
      e.printStackTrace();
      System.out.println(e.getStackTrace());
    }

  }
}
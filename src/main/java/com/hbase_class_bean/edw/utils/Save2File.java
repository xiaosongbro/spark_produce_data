package com.hbase_class_bean.edw.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;


public class Save2File {

  static Logger logger = LoggerFactory.getLogger(Save2File.class);


  public static void saveBytes2NewFile(String path,String fileName, byte[] bytes) throws IOException {

    Path filePath = getPartPath(path, fileName);
    OutputStream os = Files.newOutputStream(filePath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    os.write(bytes);
    os.close();
    logger.info("----->  {} 文件创建成功", filePath);
  }

  public static void saveString2NewFile(String path,String fileName, String content) throws IOException {

    Path filePath = getPartPath(path, fileName);
    BufferedWriter bw = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    bw.write(content);
    bw.flush();
    bw.close();
    logger.info("----->  {} 文件创建成功", filePath);
  }
  public static void append2File(String path, String fileName, byte[] bytes) throws IOException {
    Path filePath = getPartPath(path, fileName);
    OutputStream os = Files.newOutputStream(filePath, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    os.write(bytes);
    os.close();
    logger.info("----->  {} 文件内容追加成功", filePath);
  }

  private static Path getPartPath(String path, String fileName) throws IOException {

    String[] splitByDot = path.split("\\.");
    Path dir;
    if (splitByDot.length > 1) {
      dir = FileSystems.getDefault().getPath(splitByDot[1]);
    } else {
      dir = FileSystems.getDefault().getPath(path);
    }
    Files.createDirectories(dir);

    return Paths.get(dir.toString(), fileName);
  }

  private static Path getFullPath(String path, String fileName) throws IOException {

    Path dir = FileSystems.getDefault().getPath(path);
    Files.createDirectories(dir);

    return Paths.get(dir.toString(), fileName);
  }
}

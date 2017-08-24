package net.galvin.hadoop.comm.hdfs;

import org.apache.hadoop.fs.FileStatus;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface HdfsService {

    List<FileStatus> listDir(String dirName);

    boolean createDir(String DirName);

    Object createFile(String fileName);

    boolean append(String fileName, String content);

    List<String> cat(String fileName);

}
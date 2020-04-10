package cn.hw.io;

import com.sun.jmx.snmp.tasks.ThreadService;

import java.io.*;
import java.nio.channels.FileLock;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class IOUtils {

    /**
     * 读取文件
     * @param inputPath
     * @return
     */
    public static String[] readDataFile(String inputPath) {

        File file = new File(inputPath);
        byte[] buffer = new byte[8192];
        String data = null;

        try (
                FileInputStream fis = new FileInputStream(file);
                ByteArrayOutputStream baos = new ByteArrayOutputStream(8192);
        ) {
            int len;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            data = baos.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] split = data.split("\r\n");

        return split;
    }



    public static boolean syncWriteNthBucket(String fileName, LinkedList<String> circles) {

        // 用FileLock或者用读写锁
        FileLock lock = null;

        return false;
    }

    public static void bucketFileSort(String fileName) {

    }

    /**
     * IO线程池
     */
    private static final ThreadPoolExecutor THREAD_POOL_EXECUTOR;

    static {
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    private static ThreadService getBucketIOThread(int bucket) {
        return null;
    }
}

package cn.hw.job;

import cn.hw.object.Vertex;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Job {

    public Job(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public static boolean waitForComplement(Class<? extends Job> task, String inputPath, String outputPath) {
        return false;
    }

    private String inputPath;
    private String outputPath;
    private static final ThreadPoolExecutor THREAD_POOL_EXECUTOR;

    private static Map<Integer, Vertex> dataSet = null;

    static {
        /**
         * 创建5个临时文件
         */

        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    /**
     * 第一步，读取数据集
     * @param inputPath
     */
    private Map<Integer, Vertex> readDataFile(String inputPath) {
        return null;
    }

    /**
     * 第二步，找环
     * @return
     */
    private String[] searchAllCircles() {
        return null;
    }

    private boolean bucketFilesSort(String[] bucketFile) {
        return false;
    }

    /**
     * 第四步，合并临时文件
     */
    private boolean mergeBucketFiles(String outputPath, String[] buckets) {
        return false;
    }
}

package cn.hw;

import cn.hw.job.Job;

public class JoJo {

    public static boolean run(Class<? extends Job> task, String inputPath, String outputPath) {
        return Job.waitForComplement(Job.class, inputPath, outputPath);
    }
}

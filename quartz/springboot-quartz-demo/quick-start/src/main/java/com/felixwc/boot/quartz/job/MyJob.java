package com.felixwc.boot.quartz.job;

import org.quartz.*;

/**
 * in order to learn java!
 * created at 2022/7/28 17:50
 *
 * @author felixwc
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(context.getJobInstance().hashCode());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

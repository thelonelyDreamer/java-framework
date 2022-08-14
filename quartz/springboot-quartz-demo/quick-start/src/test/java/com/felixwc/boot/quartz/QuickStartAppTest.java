package com.felixwc.boot.quartz;

import com.felixwc.boot.quartz.job.MyJob;
import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class QuickStartAppTest {
    @Autowired
    private Scheduler scheduler;

    @Test
    public void test() throws SchedulerException, InterruptedException {
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                .withDescription("任务")
                .withIdentity("job1", "group1")
                .usingJobData("name", "name-value")
                .requestRecovery(true)
                .build();
        Trigger trigger = TriggerBuilder.newTrigger().withDescription("触发器")
                .usingJobData("name", "触发器")
                .startNow()
                .endAt(new Date(new Date().getTime()+10*1000))
                .withSchedule(
                        SimpleScheduleBuilder
                                .simpleSchedule()
                                .withIntervalInSeconds(1)
                                .withMisfireHandlingInstructionIgnoreMisfires()
                                .repeatForever()

                )
                .build();
        scheduler.scheduleJob(jobDetail,trigger);
        Thread.sleep(11*1000);

    }
}
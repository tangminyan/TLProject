package baobei.cute.job.task;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.springframework.stereotype.Component;

/**
 * Quartz工具类
 * Created by tangminyan on 2019/3/15.
 */
@Component
public class QuartzScheduler {
    private Scheduler scheduler;

    public QuartzScheduler(Scheduler sch) {
        this.scheduler = sch;
    }

    public void startJob() throws SchedulerException {
        startJob1(scheduler);
        scheduler.start();
    }

    private void startJob1(Scheduler scheduler) throws SchedulerException {
        // 创建一个JodDetail实例 将该实例与SchedulerQuartzJob class绑定 (链式写法)
        JobDetail jobDetail = JobBuilder.newJob(SchedulerQuartzJob.class) //定义Job类，真正的执行逻辑所在
                .withIdentity("job1", "group1") //定义name/group
                .build();
        //定义任务调度的时间间隔和次数
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("job1", "group1")
                .withSchedule(cronScheduleBuilder).build();
        // 将trigger和jobdetail加入这个调度
        scheduler.scheduleJob(jobDetail, cronTrigger);
    }

}






















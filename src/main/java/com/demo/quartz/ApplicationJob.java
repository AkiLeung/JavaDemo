package com.demo.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JOSEPH.L
 * @date    2019-03-02
 * */
public class ApplicationJob {

    /**主方法*/
    public static void main(String[] args) throws SchedulerException {
        //創建一個JobDetail實例，將該實例與HelloJob Class綁定
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob","jobGroup01").build();
        //創建一個Trigger實例，定義該job立即執行，並且每隔兩秒重複執行一次，直到永遠
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger","triGroup01").startNow().withSchedule(
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()
        ).build();
        //創建Scheduler實例
        SchedulerFactory sfact = new StdSchedulerFactory();
        Scheduler scheduler = sfact.getScheduler();
        scheduler.start();
        //打印當前的時間，格式為 2019-01-01 00:00:00
        Date date = new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("開始執行Job時間："+sf.format(date));
        scheduler.scheduleJob(jobDetail,trigger);
    }
}

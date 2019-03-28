package com.demo.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Joseph.l
 * @Date 20190304
 */
public class HelloJob implements Job {

    public void execute(JobExecutionContext jobExecutionContext) {
        //打印當前時間，格式：yyyy-MM-dd hh:mm:ss 2019-01-01 00:00:00
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("HelloJob execution time:" + sf.format(date));
        //編寫具體執行業務邏輯
        System.out.println("Hello World........");
    }
}

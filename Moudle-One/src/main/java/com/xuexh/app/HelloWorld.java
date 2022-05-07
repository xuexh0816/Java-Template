package com.xuexh.app;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * author: Xue Xionghui
 * crt_time: 2022/5/7 22:30
 * description:
 */
@Slf4j
public class HelloWorld {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("CTT"));
        String s = simpleDateFormat.format(date);
        log.info("this is " + s + "!");
    }
}

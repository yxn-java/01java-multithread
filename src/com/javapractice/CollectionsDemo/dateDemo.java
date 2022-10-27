package com.javapractice.CollectionsDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateDemo {
    public static void main(String[] args) {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssa");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        //LocalDateTime datetime = LocalDateTime.parse("20210601140102123", formatter); //这里报错
        LocalDateTime datetime = LocalDateTime.parse("6/1/2021 04:01:02", formatter); //这里报错
        System.out.println(datetime);

//        String formatTime = datetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
//        System.out.println(formatTime);
//        String formatTime2 = datetime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.SSS"));
//        System.out.println(formatTime2);
    }
}

package com.datajpademo.datajpademo2.profiler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        new Producer("_Producer 1").start();
        new Producer("_Producer 2").start();
        new Consumer("_Consumer 1").start();
        new Consumer("_Consumer 2").start();
    }
}

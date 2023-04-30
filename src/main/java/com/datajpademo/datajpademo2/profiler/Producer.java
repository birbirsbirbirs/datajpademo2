package com.datajpademo.datajpademo2.profiler;

import com.datajpademo.datajpademo2.Datajpademo2Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;


public class Producer extends Thread {
    private final Logger log = LogManager.getLogger(getClass());

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            synchronized (Datajpademo2Application.list) {
                if (Datajpademo2Application.list.size() < 100) {
                    int x = r.nextInt();
                    Datajpademo2Application.list.add(x);
                    log.info("Producer " + Thread.currentThread().getName() + " added value " + x);
                }
            }
        }
    }
}

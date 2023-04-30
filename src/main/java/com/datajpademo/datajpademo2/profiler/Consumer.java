package com.datajpademo.datajpademo2.profiler;

import com.datajpademo.datajpademo2.Datajpademo2Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Consumer extends Thread {
    private final Logger log = LogManager.getLogger(getClass());

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Datajpademo2Application.list) {
                if (Datajpademo2Application.list.size() > 0) {
                    int x = Datajpademo2Application.list.get(0);
                    Datajpademo2Application.list.remove(0);
                    log.info("Consumer " + Thread.currentThread().getName() + " removed value " + x);
                }
            }
        }
    }
}

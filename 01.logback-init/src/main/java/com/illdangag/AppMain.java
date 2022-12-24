package com.illdangag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppMain {
    private static final Logger log = LoggerFactory.getLogger(AppMain.class);

    public void run() throws Exception {
        log.info(" - AppMain.run() start");
        for (int index = 0; index < 100; index++) {
            log.debug("Logger Test: {}", index);
            Thread.sleep(10);
        }
        log.info(" - AppMain.run() end");
    }

    public static void main(String[] args) throws Exception {
        AppMain appMain = new AppMain();
        appMain.run();
    }
}

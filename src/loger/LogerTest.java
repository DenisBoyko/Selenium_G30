package loger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogerTest {
    private static final Logger log = LogManager.getLogger(LogerTest.class);
    public static void main(String[] args) {
        log.trace("Log trace");
        log.debug("Log debug");
        log.info("Log info");

        log.warn("Log warn");
        log.error("Log error");
        log.fatal("Log fatal");




    }
}

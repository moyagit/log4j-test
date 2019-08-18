package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimplestTest {
    protected static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        log.info("test log info");
    }
}

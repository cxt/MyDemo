package com.cxt.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author Administrator
 * date   2018/10/19
 */
public class Test {
    public static void main(String[] argv){
        Logger logger = LoggerFactory.getLogger(Test.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}

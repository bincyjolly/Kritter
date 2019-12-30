package com.kritter.slf4j;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Sapleslf4j {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        //Creating the Logger object
        Logger logger = LoggerFactory.getLogger("SampleLogger");

        //Logging the information
        logger.info("Hi This is my first SLF4J program");
    }
}

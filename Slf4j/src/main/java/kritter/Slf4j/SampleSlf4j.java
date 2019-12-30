package kritter.Slf4j;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleSlf4j {
    public static void main(String[] args) {
        try {
            BasicConfigurator.configure();
            //Creating the Logger object
            //Logger logger = LoggerFactory.getLogger("SampleLogger");
        } finally {
            //Logging the information
            Logger logger = LoggerFactory.getLogger("SampleLogger");
            logger.info("Hi This is my first SLF4J program");
        }

    }
}

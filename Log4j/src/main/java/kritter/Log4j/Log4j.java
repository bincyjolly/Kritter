package kritter.Log4j;

import org.apache.log4j.PropertyConfigurator;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Log4j {


        static Logger log = Logger.getLogger(Log4j.class);

        public static void main(String[] args)
        {
            String path="/home/sciera/IdeaProjects/Log4j/src/log4j.properties";
            PropertyConfigurator.configure(path);

            log.debug("Sample debug message");
            log.info("Sample info message");
            log.error("Sample error message");
            log.fatal("Sample fatal message");

        }
    }

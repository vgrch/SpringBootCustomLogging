package az.lsim.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping("/test")
    public @ResponseBody String test(){
        logger.warn("warn message");
        logger.info("info message");
        logger.trace("trace message");
        logger.error("error message");
        logger.debug("debug message");
        logger.fatal("FATAL message");
        return "Log4j2 tested; Look at console";
    }
}

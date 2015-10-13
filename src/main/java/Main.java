import com.uyghurbiz.core.CoreEngineConfig;
import com.uyghurbiz.repository.TestRepository;
import com.uyghurbiz.service.TwitterUserServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import twitter4j.TwitterObjectFactory;

import java.util.logging.Logger;

/**
 * Created by Yari_Dev on 9/11/15.
 */
public class Main {
    public static Logger LOGGER = Logger.getLogger(Main.class.getName());

    /**
     * We will use SpringBoot Later
     *
     * @param args
     */
    public static void main(String args[]) throws Exception {
        /**
         * This will test your core application configuration
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoreEngineConfig.class);
        /**
         * This will test the repository that u created and functionality
         */
        TestRepository rep = (TestRepository) context.getBean("testRepository");
        /**
         * This will service layer of the application
         */
        TwitterUserServices userServices = (TwitterUserServices) context.getBean("twitterTestUserService");

        LOGGER.info("The collection exist : " + rep.isDbContainCollection());
        LOGGER.info(TwitterObjectFactory.getRawJSON(userServices.getUserResource("Uyghur")));


    }
}

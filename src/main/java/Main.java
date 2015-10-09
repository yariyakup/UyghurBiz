import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterObjectFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by Yari_Dev on 9/11/15.
 */
public class Main {


    public static void main(String args[]) {


        ConfigurationBuilder cb = new ConfigurationBuilder();

        //Store the credential locally
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("")
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("")
                .setJSONStoreEnabled(true);

        Twitter tf = new TwitterFactory(cb.build()).getInstance();
        try {
            System.out.println(TwitterObjectFactory.getRawJSON(tf.users().lookupUsers("Uyghur")));

        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }
}

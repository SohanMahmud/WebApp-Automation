import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Polok on 8/26/2016.
 */
public class searchYouTube extends Base {
    @Test
    public void searchVideo () throws InterruptedException {
        typeByCss("#masthead-search-term", "maven project in intellij");
        sleepFor(3);
    }
}

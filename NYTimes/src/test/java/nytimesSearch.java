import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Polok on 8/26/2016.
 */
public class nytimesSearch extends Base{
   @Test
    public void searchNews() throws InterruptedException {
        clickByCss(".button.search-button");
        typeByCss("#search-input.text", "Olympics");
        sleepFor(3);
    }
}

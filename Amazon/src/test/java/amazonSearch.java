import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Polok on 8/26/2016.
 */
public class amazonSearch extends Base{


    @Test

public void searchItems() throws InterruptedException {

    typeByCss("#twotabsearchtextbox", "Laptop");
    sleepFor(3);

}




}

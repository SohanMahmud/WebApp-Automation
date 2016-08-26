import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Polok on 8/26/2016.
 */
public class searchWikipedia extends Base {
    @Test
    public void searchWiki () throws InterruptedException {

        typeByCss("#searchInput", "Java Programming");
        sleepFor(3);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


}
@Test
    public void searchWiki2 () throws InterruptedException {
    typeByCss("#searchInput", "Java Programming");
    sleepFor(3);
    clickByCss("#History");
    sleepFor(3);
}
}

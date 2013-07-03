import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 03.07.13
 * Time: 09:34
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Arquillian.class)
public class GrapheneTest {
    @Before
    public void beforeEachTest(){
        driver.manage().deleteAllCookies();
    }
    @Drone
    WebDriver driver;
    @Test
    public void testHappyPath(){
        //Given
        driver.get("http://www.google.com");
        //When
        String pageTitle = driver.getTitle();
        //Then
        Assert.assertEquals(pageTitle, "Google");
    }
    @Test
    public void testLoginVOP(){
        //Given
         driver.get("https://itcrowd.pl/vop");
        //When
        WebElement openedElement = driver.findElement(By.id("j_idt13:login"));
        guardHttp(openedElement).click();
        boolean isItTrue = driver.getCurrentUrl().startsWith("https://itcrowd.pl/vop/login");
        //Then
        Assert.assertTrue(isItTrue);


    }


}

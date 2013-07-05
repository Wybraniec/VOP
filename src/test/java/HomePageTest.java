import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 05.07.13
 * Time: 12:35
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Arquillian.class)
public class HomePageTest {
    @FindBy(css = "#wrap")
    HomePage homePage;
    @Drone
    WebDriver browser;
    @Before
    public void beforeTests(){

    }
}

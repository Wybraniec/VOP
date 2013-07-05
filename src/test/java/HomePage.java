import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 03.07.13
 * Time: 09:34
 * To change this template use File | Settings | File Templates.
 */

public class HomePage {

    @FindBy(css = "div.alert > a > h4")
    private WebElement registerToGet3Minutes;

    @FindBy(css = "div.container > div.row-fluid:nth-of-type(4) > div > a > img")
    private WebElement areYouPsychicJoin;

    public WebElement getAreYouPsychicJoin(){
        return areYouPsychicJoin;
    }
    public WebElement getRegisterToGet3Minutes(){
        return registerToGet3Minutes;
    }


    /**
     * Created with IntelliJ IDEA.
     * User: Wybraniec
     * Date: 04.07.13
     * Time: 08:49
     * To change this template use File | Settings | File Templates.
     */
    //Subclass in HomePageClass, represents socials share menu below banner.
    public static class SocialsSharesMenu {

        @FindBy(xpath = "//*[@id=\"u_0_0\"]/div")
        private WebElement fbLikeItButton;

        @FindBy(xpath = "//*[@id=\"facebook\"]/body/div/div/div/table/tbody/tr/td[2]/div/div[1]")
        private WebElement fbLikesCounter;

        @FindBy(xpath = "//*[@id=\"widget\"]/div[1]")
        private WebElement twittButton;

        @FindBy(xpath = "//*[@id=\"c\"]")
        private WebElement twittsCounter;

        @FindBy(xpath = "//*[@id=\"wrap\"]/div[2]/div[2]/div[2]/div/a[3]")
        private WebElement pinItButton;

        @FindBy(xpath = "//*[@id=\"wrap\"]/div[2]/div[2]/div[2]/div/a[4]/a[1]")
        private WebElement shareOnSubMenu;



        public WebElement getFbLikeItButton() {
            return fbLikeItButton;
        }

        public WebElement getFbLikesCounter() {
            return fbLikesCounter;
        }

        public WebElement getTwittButton() {
            return twittButton;
        }

        public WebElement getTwittsCounter() {
            return twittsCounter;
        }

        public WebElement getPinItButton() {
            return pinItButton;
        }

        public WebElement getShareOnSubMenu() {
            return shareOnSubMenu;
        }
    }
}

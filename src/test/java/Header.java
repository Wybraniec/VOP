import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 04.07.13
 * Time: 08:23
 * To change this template use File | Settings | File Templates.
 */

public class Header {

    @FindBy(css = "div.row-fluid.logoWrapper")
    private WebElement vopLogo;

    @FindBy(css= "div.span12 div:nth-of-type(2) ul.nav > li:nth-of-type(1) > a")
    private WebElement psychicsButton;

    @FindBy(css= "div.span12 div:nth-of-type(2) ul.nav > li:nth-of-type(3) > a")
    private WebElement marketplaceButton;

    @FindBy(css= "div.span12 div:nth-of-type(2) ul.nav > li:nth-of-type(5) > a > href")
    private WebElement blogButton;

    @FindBy(css= "div.span12 div:nth-of-type(2) ul.nav > li:nth-of-type(7) > a")
    private WebElement myaccountButton;

    @FindBy(className = "searchTemplate")
    private WebElement searchInput;

    @FindBy(id = "searchBtn")
    private WebElement searchConfirmButton;

    @FindBy(css= "div.span12 div:nth-of-type(1) ul.nav > li:nth-of-type(1) > a")
    private WebElement loginButton;

    @FindBy(css= "div.span12 div:nth-of-type(1) ul.nav > li:nth-of-type(2) > a")
    private WebElement signupButton;

    @FindBy(css= "div.span12 div:nth-of-type(1) ul.nav > li:nth-of-type(4) > a")
    private WebElement shoppingcartButton;

    @FindBy(css = "li.languageMenu ul > li.nth-of-type(1) > script")
    private WebElement languageMenuEnglish;

    @FindBy(css = "li.languageMenu ul > li.nth-of-type(2) > script")
    private WebElement languageMenuPolish;

    public void vopLogoClick(){
        guardHttp(vopLogo).click();
    }
    public void psychicsButtonClick(){
        guardHttp(psychicsButton).click();
    }
    public void marketplaceButtonClick(){
        guardHttp(marketplaceButton).click();
    }
    public void blogButtonClick(){
        guardHttp(blogButton).click();
    }
    public void myaccountButtonClick(){
        guardHttp(myaccountButton).click();
    }
    public void searchConfirmButtonClick(){
        guardHttp(searchConfirmButton).click();
    }
    public void loginButtonClick(){
        guardHttp(loginButton).click();
    }
    public void signUpButtonClick(){
        guardHttp(signupButton).click();
    }
    public void shoppingCartButtonClick(){
        guardHttp(shoppingcartButton).click();
    }
    public void englishMenuClick(){
        guardHttp(languageMenuEnglish).click();
    }
    public void polishMenuClick(){
        guardHttp(languageMenuPolish).click();
    }

    //Getters
    public WebElement getVopLogo() {
        return vopLogo;
    }

    public WebElement getPsychicsButton() {
        return psychicsButton;
    }

    public WebElement getMarketplaceButton() {
        return marketplaceButton;
    }

    public WebElement getBlogButton() {
        return blogButton;
    }

    public WebElement getMyaccountButton() {
        return myaccountButton;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchConfirmButton() {
        return searchConfirmButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSignupButton() {
        return signupButton;
    }

    public WebElement getShoppingcartButton() {
        return shoppingcartButton;
    }

    public WebElement getLanguageMenuEnglish(){
        return  languageMenuEnglish;
    }

    public WebElement getLanguageMenuPolish(){
        return languageMenuPolish;
    }


    //Setters

    public void setSearchInput() {
        searchInput.clear();
        searchInput.sendKeys("psychic7");
    }

}

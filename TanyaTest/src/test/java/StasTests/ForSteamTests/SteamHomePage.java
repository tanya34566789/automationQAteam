package StasTests.ForSteamTests;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamHomePage extends BasePage {
    public SteamHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement loginButton() {
        return findElementByXpath("//a[@class=\"global_action_link\"]");
    }
    public WebElement loginName(){
        return findElementByXpath("//input[@type='text']");
    }
    public WebElement loginPassword(){
        return findElementByXpath("//input[@type='password']");
    }
    public WebElement loginConfButton(){
        return findElementByXpath("//button[@type=\"submit\"]");
    }
    public WebElement categoryCatalog(){
        return findElementByXpath("//div[@id=\"genre_tab\"]");
    }
    public WebElement categoryJRPG(){
        return findElementByXpath("//a[contains(@href,'jrpg')]");
    }
    public WebElement categoryAnime(){
        return findElementByXpath("//a[contains(@href,'anime')]");
    }
    public WebElement categorySingleplayer(){
        return findElementByXpath("//a[contains(@href,'singleplayer')]");
    }
    public WebElement categorySoundtracks(){
        return findElementByXpath("//a[contains(@href,'soundtracks')]");
    }
    public WebElement chatButton(){
        return findElementByXpath("//a[contains(@href,'chat')]");
    }
    public WebElement offlineFriends(){
        return findElementByXpath("//div[contains(@class,'groupHeaderContainer ')]");
    }
    public WebElement mySecondAccFriendChat(){
        return findElementByXpath("//div[@draggable=\"true\"]");
    }
    public WebElement messageText(){
        return findElementByXpath("//textarea");
    }
    public WebElement sendMessage(){
        return findElementByXpath("//button[@type=\"submit\"]");
    }
    public WebElement openMyProfile(){
        return findElementByXpath("//a[@data-tooltip-type=\"selector\"][text()[contains(.,'中午尋找月亮')]]");
    }
    public WebElement editMyProfileButton(){
        return findElementByXpath("//a[contains(@href,'edit/')]");
    }
    public WebElement editRealName(){
        return findElementByXpath("//input[@name='real_name']");
    }
    public WebElement generalSave(){
        return findElementByXpath("//button[@type=\"submit\"]");
    }
    public WebElement editMyAvatar(){
        return findElementByXpath("//a[contains(@href,'avatar')]");
    }
    public WebElement myImageForProfile(){
        return findElementByXpath("//div[contains(@class,'Zj')]/div[contains(@class,'avatarcollection_AvatarP')]");
    }
    public WebElement saveAvatar(){
        return findElementByXpath("//button[contains(@class,'Primary ')]");
    }
    public WebElement openAddFriendList(){
        return findElementByXpath("//a[contains(@href,'friends')]/span[@class='profile_menu_text']");
    }
    public WebElement addFriendListButton(){
        return findElementByXpath("//button[@id='add_friends_button']");
    }
    public WebElement enterFriendNameTextField(){
        return findElementByXpath("//input[@placeholder=\"Enter your friend's profile name\"]");
    }
    public WebElement searchFriend(){
        return findElementByXpath("//div[@id=\"searchIcon\"]");
    }
    public WebElement addAsFriendButton(){
        return findElementByXpath("//a[contains(@class,'btn_uppercase')]");
    }
    public WebElement storeSearch(){
        return findElementByXpath("//input[@id='store_nav_search_term']");
    }
    public WebElement counterStrikeGo(){
        return findElementByXpath("//a[contains(@href,'CounterStrike_Global_Offensive')]");
    }
    public WebElement addGameToLibraryButton(){
        return findElementByXpath("//span[contains(@onclick,'AddFreeLicense')]");
    }
    public WebElement accountPullDown(){
        return findElementByXpath("//span[@id=\"account_pulldown\"]");
    }
    public WebElement viewMyProfile(){
        return findElementByXpath("//a[@class=\"popup_menu_item\"][contains(@href,'765')]");
    }
    public WebElement logoutAccount(){
        return findElementByXpath("//a[@href=\"javascript:Logout();\"]");
    }
    public WebElement changeLanguage(){
        return findElementByXpath("//span[@class=\"popup_menu_item\"]");
    }
    public WebElement languageJapanese(){
        return findElementByXpath("//a[@onclick=\"ChangeLanguage( 'japanese' ); return false;\"]");
    }
    public WebElement primaryLanguageTrigger(){
        return findElementByXpath("//a[@id=\"primary_language_trigger\"]");
    }
    public WebElement changeEnglishPrimary(){
        return findElementByXpath("//a[@id=\"english\"]");
    }
    public WebElement saveLanguage(){
        return findElementByXpath("//a[@onclick=\"SavePreferences( this ); return false;\"]");
    }
    public WebElement cyberpunk(){
        return findElementByXpath("//img[contains(@src,'1663663573')]");
    }
    public WebElement selectAge(){
        return findElementByXpath("//select[@id=\"ageYear\"]");
    }
    public WebElement adult(){
        return findElementByXpath("//option[@value=\"2000\"]");
    }
    public WebElement viewPageButton(){
        return findElementByXpath("//a[@id=\"view_product_page_btn\"]");
    }
    public WebElement addToWishlistButton(){
        return findElementByXpath("//a[contains(@class,'btn_medium add_to_wishlist')]");
    }
    public WebElement myWishlistButton(){
        return findElementByXpath("//a[@id=\"wishlist_link\"]");
    }
    public WebElement communitySubMenu(){
        return findElementByXpath("//a[@class=\"menuitem supernav\"][text()[contains(.,'COMMUNITY')]]");
    }
    public WebElement communityDota2(){
        return findElementByXpath("//a[@class=\"appHubShortcut_Title ellipsis\"][text()[contains(.,'Dota 2')]]");
    }
    public WebElement followCommunity(){
        return findElementByXpath("//a[@onclick=\"joinOGG( 570); return false;\"]");
    }
    public WebElement workshopButton(){
        return findElementByXpath("//a[contains(@href,'/570/workshop/')]");
    }
    public WebElement skinVote(){
        return findElementByXpath("//div[@class=\"voting_queue_link\"]");
    }
    public WebElement unfollowCommunity(){
        return findElementByXpath("//a[@onclick=\"leaveOGG( 570); return false;\"]");
    }
    public WebElement storeSubMenu(){
        return findElementByXpath("//a[@class=\"menuitem supernav\"][contains(@href,'-header')]");
    }
    public WebElement statsApps(){
        return findElementByXpath("//a[contains(@href,'stats/?snr=1_4_4__global-header')]");
    }
    public WebElement topSellers(){
        return findElementByXpath("//a[contains(@href,'g/UA')]");
    }
    public WebElement mostPlayed(){
        return findElementByXpath("//a[contains(@href,'mostplayed')]");
    }
    public WebElement discussion(){
        return findElementByXpath("//div[@class=\"supernav_content\"]//a[contains(@href,'discussions')]");
    }
    public WebElement gameForums(){
        return findElementByXpath("//a[@id=\"tab_games\"]");
    }
    public WebElement toolsAndServise(){
        return findElementByXpath("//a[@id=\"tab_tools\"]");
    }
    public WebElement communityMarket(){
        return findElementByXpath("//div[@class=\"supernav_content\"]//a[contains(@href,'market')]");
    }
    public WebElement marketDota2(){
        return findElementByXpath("//span[@class=\"game_button_game_name\"][text()[contains(.,'Dota 2')]]");
    }
    public WebElement marketAdvancedOptions(){
        return findElementByXpath("//div[@class=\"market_search_advanced_button\"]");
    }
    public WebElement selectHeroField(){
        return findElementByXpath("//select[contains(@name,'Hero[]')]");
    }
    public WebElement selectHeroSF(){
        return findElementByXpath("//option[contains(@value,'nevermore')]");
    }
    public WebElement checkArcana(){
        return findElementByXpath("//input[@id=\"tag_570_Rarity_Rarity_Arcana\"]");
    }
    public WebElement advancedOptionsSearch(){
        return findElementByXpath("//div[@onclick=\"document.forms['market_advanced_search'].submit();\"]");
    }
    public WebElement sfArcana(){
        return findElementByXpath("//span[@id=\"result_1_name\"]");
    }
    public WebElement news(){
        return findElementByXpath("//a[contains(@href,'news/?snr=1_4_4__12')]");
    }
    public WebElement newsFeatured(){
        return findElementByXpath("//a[contains(@href,'featured')]");
    }
    public WebElement newsSteamOfficial(){
        return findElementByXpath("//a[contains(@href,'steam/')]");
    }
    public WebElement supportSteam(){
        return findElementByXpath("//div[@class=\"supernav_container\"]/a[contains(@href,'en/')]");
    }
    public WebElement supportMyAccount(){
        return findElementByXpath("//a[contains(@href,'HelpWithAccount')]");
    }
    public WebElement supportSteamGuard(){
        return findElementByXpath("//a[contains(@href,'808')]");
    }
    public WebElement contactSteamSupport(){
        return findElementByXpath("//div[contains(@class,'create_request')]");
    }
    public WebElement supportTextArea(){
        return findElementByXpath("//textarea[@id=\"create_help_request_issue_text\"]");
    }
    public WebElement sendSupportMessage(){
        return findElementByXpath("//button[@class=\"btnv6_blue_hoverfade\"]");
    }
    public WebElement trueAssert(){
        return findElementByXpath("//div[contains(@class,'btn_grey')]");
    }
    public WebElement assertCategory(){
        return findElementByXpath("//div[contains(@class,'j C')]");
    }
    public WebElement discussionHeader(){
        return findElementByXpath("//h2[contains(@class,'d')]");
    }
    public WebElement cyberpunkWishlist(){
        return findElementByXpath("//div[@data-app-id=\"1091500\"]");
    }
    public WebElement deleteWishlist(){
        return findElementByXpath("//div[@class=\"delete\"]");
    }
    public WebElement deleteOK(){
        return findElementByXpath("//div[contains(@class,'btn_green_')]");
    }
    public WebElement accountDetails(){
        return findElementByXpath("//a[contains(@href,'account/?snr=1_4_4__global-header')]");
    }
    public WebElement accountLicenses(){
        return findElementByXpath("//a[contains(@href,'licens')]");
    }
    public WebElement removeLicense(){
        return findElementByXpath("//div[contains(@class,'license')]");
    }
}
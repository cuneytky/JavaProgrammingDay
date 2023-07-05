package day38_Inheritance.tasks_Browser;

public class BrowserObject {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.closeBrowser();
        chrome.openBrowser();

        Opera opera=new Opera();
        opera.closeBrowser();
        opera.openBrowser();
    }
}

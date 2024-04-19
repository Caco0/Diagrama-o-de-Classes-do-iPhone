package home;

import Apps.Browser.Browser;
import Apps.Music.Music;
import Apps.Phone.Phone;

public class Mobile implements Music, Browser, Phone{
        
    public void music() {
        System.out.println("CLic on App Music...");  
        
    }
    public void openBrowser() {
        System.out.println("CLic on App Browser...");  
    }
    public void call() { 
        System.out.println("CLic on App Phone...");  
    }
    
    
}

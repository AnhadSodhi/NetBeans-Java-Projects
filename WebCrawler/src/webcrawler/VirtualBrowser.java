/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

import java.util.logging.Level;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.service.DriverService;

public class VirtualBrowser {
    public VirtualBrowser()
    {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "OFF");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }
    
    public String download(String url)
    {
        return download(url, 0);
    }
    
    public String download(String url, int renderingTime)
    {
        // redirect console output from chromedriver to null stream (nowhere)
        DriverService.Builder<ChromeDriverService, ChromeDriverService.Builder> serviceBuilder = new ChromeDriverService.Builder();
        ChromeDriverService chromeDriverService = serviceBuilder.build();
        chromeDriverService.sendOutputTo(new NullOutputStream());

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        //chromeOptions.setLogLevel(ChromeDriverLogLevel.OFF);
        WebDriver driver = new ChromeDriver(chromeDriverService, chromeOptions);  //new ChromeDriver(chromeOptions);
        
        String html = "";
        try 
        {
            // Navigate to Url
            driver.get(url);
            Thread.sleep(renderingTime);
            html = driver.getPageSource();
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally 
        {
            driver.quit();
        }
        
        return html;
    }
}
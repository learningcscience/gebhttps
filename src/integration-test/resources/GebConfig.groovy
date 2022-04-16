import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

environments {

    // run via “./gradlew -Dgeb.env=chrome iT”
    chrome {

        driver = {


//            System.setProperty('webdriver.chrome.driver', 'C:\\webdrivers\\chromedriver.exe')
           new ChromeDriver()

        }
    }

    // run via “./gradlew -Dgeb.env=chromeHeadless iT”
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }

    // run via “./gradlew -Dgeb.env=firefox iT”
    firefox {
        driver = { new FirefoxDriver() }
    }
}

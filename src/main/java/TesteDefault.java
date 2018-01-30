import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TesteDefault {
	
    public static void main(String[] args){
    	
    	// Alterar caminho do driver
        System.setProperty("webdriver.gecko.driver", "/home/angelo/Testes/drivers/geckodriver");
        
        // Alterar a instância do webdriver
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://google.com");
    }
    
}

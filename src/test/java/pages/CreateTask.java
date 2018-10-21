package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CreateTask {
    AndroidDriver driver;

    public CreateTask(AndroidDriver driver) {
        this.driver = driver;
    }

    public void enterTaskName(String name){
        driver.findElement(By.id("com.splendapps.splendo:id/edtTaskName")).sendKeys(name);
    }

    public void saveTaskButton(){
        driver.findElement(By.id("com.splendapps.splendo:id/action_save_task")).click();
    }
}

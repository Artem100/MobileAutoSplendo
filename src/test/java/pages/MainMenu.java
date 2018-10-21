package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainMenu {
    AndroidDriver driver;

    public MainMenu(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickAddTaskButton(){
        driver.findElement(By.id("com.splendapps.splendo:id/imgFirstTask")).click();
    }

    public void checkCreatedTask(String nameTask){
        driver.findElement(By.id("com.splendapps.splendo:id/task_name")).getText().contains(nameTask);
    }

}

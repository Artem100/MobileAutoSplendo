package splendo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreateTask;
import pages.MainMenu;

public class TestsSplenDo{

    MainMenu mainMenu;
    CreateTask createTask;

    @BeforeClass
    public void setUp() throws Exception {
        AndroidSetupSplenDo.prepareAndroidForAppium();
         mainMenu = new MainMenu(AndroidSetupSplenDo.driver);
         createTask = new CreateTask(AndroidSetupSplenDo.driver);
    }

    @Test
    public void test() throws InterruptedException{
        mainMenu.clickAddTaskButton();
        createTask.enterTaskName("test");
        createTask.saveTaskButton();
        mainMenu.checkCreatedTask("test");
    }

    @AfterClass
    public void tearDown() throws Exception {
        AndroidSetupSplenDo.driver.quit();
    }
}

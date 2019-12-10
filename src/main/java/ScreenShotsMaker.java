import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShotsMaker {

    //screenshot method : used for making screenshots
    public static void screenshot(WebDriver webDriver) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh_mm_ss_dd_mm_yy");
        String fileName = formatter.format(LocalDateTime.now()) + ".png";

        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("src/main/resources/ScreenShots/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

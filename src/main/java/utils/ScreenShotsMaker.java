package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static managers.WebDriverManager.driver;

public class ScreenShotsMaker {

    private static String basePath = "target/screenShots/";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yy hh_mm_ss");
    private static Path screenShotPath;
    private static String scenarioName;
    private static Logger log = Logger.getLogger(ScreenShotsMaker.class);

    public static void takeScreenshot(boolean flag) {
        if (flag) {
            String fileName = scenarioName + "_" + (formatter.format(LocalDateTime.now())) + ".png";
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(screenshot, new File(screenShotPath + "/" + fileName));
            } catch (IOException exception) {
                exception.printStackTrace();
                log.error("Error: " + exception);
            }
        }
    }

    public static void makeDir(String name) {
        scenarioName = name;
        Path path = Paths.get(basePath + name + "_" + (formatter.format(LocalDateTime.now())));
        if (!Files.exists(path)) {
            try {
                screenShotPath = Files.createDirectories(path);
            } catch (IOException exception) {
                exception.printStackTrace();
                log.error("Error: " + exception);
            }
        }
    }
}


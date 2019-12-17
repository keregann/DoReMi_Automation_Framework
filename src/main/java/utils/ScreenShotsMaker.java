package utils;

import managers.WebDriverManager;
import org.apache.commons.io.FileUtils;
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

public class ScreenShotsMaker {

    private static String pathString = "target/screenShots/";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh_mm_ss_dd_MM_yy");
    private static int counter = 1;
    private static Path screenShotPath;
    private static String scenarioName;
    //screenshot method : used for making screenshots
    public static void screenshot() {
        String fileName = scenarioName + "_" + (formatter.format(LocalDateTime.now())) + ".png";
        File screenshot = ((TakesScreenshot) WebDriverManager.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File(screenShotPath + "/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeDir(String name) {
        //  String pathString = "src/main/resources/screenShots/";
        Path path = Paths.get(pathString + "scenario" + "_" + (counter++) + "_" + name + "_" + (formatter.format(LocalDateTime.now())));
        if (!Files.exists(path)) {
            try {
                screenShotPath = Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scenarioName = name;
    }

    public static void cleanDir() throws IOException {
        FileUtils.cleanDirectory(FileUtils.getFile(pathString));
    }
}


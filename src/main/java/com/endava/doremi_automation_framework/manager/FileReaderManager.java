package com.endava.doremi_automation_framework.manager;

import com.endava.doremi_automation_framework.dataProvider.ConfigFileReader;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance() {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return ConfigFileReader.getInstance();
    }
}

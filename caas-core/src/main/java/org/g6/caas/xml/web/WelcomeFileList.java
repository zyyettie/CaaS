package org.g6.caas.xml.web;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WelcomeFileList {
    private List<String> fileList;

    public void addWelcomeFile(String file){
        if(fileList == null)
            fileList = new ArrayList<>();

        fileList.add(file);
    }
}

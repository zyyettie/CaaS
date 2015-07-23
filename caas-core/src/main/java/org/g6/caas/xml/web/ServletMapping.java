package org.g6.caas.xml.web;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ServletMapping {
    private String name;
    private List<String> urlPatterns;

    public void addUrlPattern(String pattern){
        if(urlPatterns == null)
            urlPatterns = new ArrayList<>();
        urlPatterns.add(pattern);
    }
}

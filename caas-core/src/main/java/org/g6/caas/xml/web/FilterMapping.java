package org.g6.caas.xml.web;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FilterMapping {
    private String name;
    private List<String> urlPatterns;

    public void addUrlPattern(String urlPattern) {
        if (urlPatterns == null)
            urlPatterns = new ArrayList<>();
        urlPatterns.add(urlPattern);
    }
}

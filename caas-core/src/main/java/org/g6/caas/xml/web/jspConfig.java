package org.g6.caas.xml.web;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class jspConfig {
    private List<Taglib> taglibs;
    private JspPropertyGroup group;

    public void addTaglib(Taglib tag) {
        if (taglibs == null)
            taglibs = new ArrayList<>();
         String a = null;
        taglibs.add(tag);
    }
}

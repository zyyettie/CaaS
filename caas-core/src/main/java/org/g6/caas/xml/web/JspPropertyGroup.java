package org.g6.caas.xml.web;

import lombok.Data;

@Data
public class JspPropertyGroup {
    private String description;
    private String displayName;
    private String urlPattern;
    private boolean elIgnored;
    private boolean scriptingInvalid;
    private String pageEncoding;
    private String includePrelude;
    private String includeCoda;

}

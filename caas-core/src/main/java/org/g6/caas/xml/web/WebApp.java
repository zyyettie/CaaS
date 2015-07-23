package org.g6.caas.xml.web;

import lombok.Data;

import java.util.List;

@Data
public class WebApp {
    private String version;
    private String metadataComplete;
    private String xmlns;
    private String xmlns_xsi;
    private String xsi_schemaLocation;

    private String displayName;
    private String description;

    private List<ContextParam> contextParams;
    private List<MimeMapping> mimeMappings;
    private List<Filter> filters;
    private List<FilterMapping> filterMappings;
    private List<Listener> listeners;
    private List<Servlet> servlets;
    private List<ServletMapping> servletMappings;
    private List<ErrorPage> errorPages;
}

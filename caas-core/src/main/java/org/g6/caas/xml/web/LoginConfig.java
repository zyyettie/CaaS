package org.g6.caas.xml.web;

import lombok.Data;

@Data
public class LoginConfig {
    private String authMethod;
    private String realmName;
    private FormLoginConfig formLoginConfig;
}

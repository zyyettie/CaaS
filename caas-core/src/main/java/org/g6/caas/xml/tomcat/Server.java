package org.g6.caas.xml.tomcat;

import lombok.Data;

@Data
public class Server {
    private String port;
    private String shutDown;
    private String address;
    private String className;
}

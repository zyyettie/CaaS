package org.g6.util;


import com.google.common.io.Resources;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.g6.caas.exception.CaaSRuntimeException;

import static org.apache.commons.digester3.binder.DigesterLoader.newLoader;

public class XMLUtil {
    public static <T> T parse(String rule, String xmlFile) {
        return parse(new String[]{rule}, xmlFile);
    }

    public static <T> T parse(String[] rules, String xmlFile) {
        CaaSXMLRuleModule module = new CaaSXMLRuleModule(rules);

        DigesterLoader loader = newLoader(module);
        try {
            return loader.newDigester().parse(Resources.getResource(xmlFile));
        } catch (Exception e) {
            String ruleFiles = null;
            for (String rule : rules) {
                ruleFiles += rule + ",";
            }
            throw new CaaSRuntimeException("Errors happen while parsing XML file: "
                    + xmlFile + " with rule files:" + ruleFiles, e);
        }
    }
}

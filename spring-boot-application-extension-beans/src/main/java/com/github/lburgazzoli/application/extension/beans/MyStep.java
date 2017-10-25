package com.github.lburgazzoli.application.extension.beans;

import java.util.Map;

import io.syndesis.integration.runtime.SyndesisStepExtension;
import org.apache.camel.CamelContext;
import org.apache.camel.model.ProcessorDefinition;

public class MyStep implements SyndesisStepExtension {
    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public ProcessorDefinition configure(CamelContext context, ProcessorDefinition definition, Map<String, Object> parameters) {
        return definition.log("Something is set to <" + something + ">, parameters are: " + parameters);
    }
}

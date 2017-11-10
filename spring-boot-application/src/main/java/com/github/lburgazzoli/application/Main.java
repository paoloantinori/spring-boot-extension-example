package com.github.lburgazzoli.application;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import io.syndesis.integration.runtime.api.SyndesisExtensionAction;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @SyndesisExtensionAction(id ="myid", value="myValue", description="myDescription", entrypoint="myEntrypoint", inputDataShape="myInputDataShape", name="myName", outputDataShape="myOutputDataShape", tags={"a","b"})
    @Component
    public static class MainRouteBuilder extends RouteBuilder {
        @Override
        public void configure() throws Exception {
            from("timer:main")
                .log("Main route");
        }
    }
}

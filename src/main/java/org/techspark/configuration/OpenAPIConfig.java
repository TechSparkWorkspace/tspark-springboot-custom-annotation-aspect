package org.techspark.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(
        title = "TechSpark SpringBoot Custom Annotation with Aspect",
        version = "1.0",
        description = "The SpringBoot application is built to demonstrate the use of Custom Annotation with Aspect.",
        contact = @Contact(name = "Support Team", email = "codrixtechtrainer@gmail.com"),
        license = @License(name = "MIT License", url = "https://opensource.org/licenses/MIT")
))
public class OpenAPIConfig {
}

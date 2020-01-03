package dk.bringlarsen.springboot.externalizedconfigurationexploration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Component
@Validated
@ConfigurationProperties(prefix = "dk.bringlarsen")
public class CustomProperties {

    @NotBlank
    private String property;

    public String getProperty() {
        return property;
    }

    public CustomProperties setProperty(String property) {
        this.property = property;
        return this;
    }
}

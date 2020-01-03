package dk.bringlarsen.springboot.externalizedconfigurationexploration.properties;

import dk.bringlarsen.springboot.externalizedconfigurationexploration.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomPropertiesValidatorTest {

    @Test
    void testMissingProperties() {
        SpringApplication application = new SpringApplication(Application.class);

        ConfigurationPropertiesBindException configurationPropertiesBindException = assertThrows(ConfigurationPropertiesBindException.class, application::run);

        assertThat(configurationPropertiesBindException.getCause().getCause().getMessage(), containsString("'dk.bringlarsen' on field 'property': rejected value [null]"));
    }
}
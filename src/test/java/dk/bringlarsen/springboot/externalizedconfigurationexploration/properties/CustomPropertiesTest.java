package dk.bringlarsen.springboot.externalizedconfigurationexploration.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"dk.bringlarsen.property=test"})
class CustomPropertiesTest {

    @Autowired
    CustomProperties properties;

    @Test
    void testProperties() {
        Assertions.assertEquals("test", properties.getProperty());
    }
}
package com.snailmann.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * define a config and it prefix is "girl"
 * it can find the application of GirlProperties class in application-dev.yml
 * it need a constructor without params(not sure)
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;
    private Integer age;

    public GirlProperties() {

    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}

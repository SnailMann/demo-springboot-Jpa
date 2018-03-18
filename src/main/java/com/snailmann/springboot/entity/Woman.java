package com.snailmann.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.sql.Date;

/**
 * a entity class
 * it will generate a woman table according to the entity and jpa configuration
 */
@Entity
public class Woman {

    //@Id mean that declare the primary key
    //@GeneratedValue mean that the primary key is follow self-increasing strategy
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;

    //learn to useing Form Validation
    //it will be get the message when Woman's age is less than 18
    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

    //constructor
    public Woman() {
    }

    //get & set method
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "Woman{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}

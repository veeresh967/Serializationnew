package com.veeresh.b37_serialization;

import java.io.Serializable;

/**
 * Created by skillgun on 11/07/2017.
 */
//HERE WE ARE USING BEAN CLASS TO ACHIEVE DATA SECURITY (ENCAPSULATION)
//TASK 1 : CREATE A BEAN CLASS
public class Student implements Serializable{
    private String name, education, mobile;

    public Student(String name, String education, String mobile) {
        this.name = name;
        this.education = education;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

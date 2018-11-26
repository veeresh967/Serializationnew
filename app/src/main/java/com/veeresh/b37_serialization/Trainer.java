package com.veeresh.b37_serialization;

import java.io.Serializable;

/**
 * Created by skillgun on 11/07/2017.
 */

public class Trainer implements Serializable{
    private String name, course;

    public Trainer(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

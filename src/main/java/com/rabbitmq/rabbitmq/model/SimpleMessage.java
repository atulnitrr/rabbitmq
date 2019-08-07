package com.rabbitmq.rabbitmq.model;

import java.io.Serializable;


public class SimpleMessage implements Serializable {

    private String name;
    private String description;

    public SimpleMessage() {
    }



    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override public String toString() {
        return "SimpleMessage{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

package com.epicodus.bigfun;


public class UserEvents {
    private String mName;
    private String mDescription;


    public UserEvents(String name, String description) {
        this.mName = name;
        this.mDescription = description;

    }

    public String getName() {
        return mName;
    }
    public String getDescription() {
        return mDescription;
    }

}


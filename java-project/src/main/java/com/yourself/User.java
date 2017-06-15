package com.yourself;

/**
 * Created by charlotte on 15/06/17.
 */
public class User {


    private String status;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




    public User(String name, String status){
        this.name = name;
        this.status = status;
    }
}

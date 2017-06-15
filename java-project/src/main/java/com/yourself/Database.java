package com.yourself;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlotte on 15/06/17.
 */
public enum  Database {

    userDatabase;

  /* Class can be defined in a different file or defined here.
     For example:
  public static class Car {
    public String name;
    public String make;
  }

  */

    private List<User> users;
    Database() {
        users = new ArrayList<User>();
        users.add(new User("Matheo", "Intern"));
        users.add(new User("Nico", "CTO"));
        users.add(new User("Vincent", "DA"));
        users.add(new User("Val", "Dev"));
        users.add(new User("Maxime", "Dev"));
        users.add(new User("Sylvain", "Dev"));
    }

    // ... functions to deal with Cars
    // or simply return the entire list
    public List<User> getList() {
        return users;
    }
}

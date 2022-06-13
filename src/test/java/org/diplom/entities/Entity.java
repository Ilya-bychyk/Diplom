package org.diplom.entities;

import org.diplom.model.User;

public class Entity {
    public static User getUserValid() {
        return User.builder().password(System.getProperty("passwordValid")).name(System.getProperty("nameValid")).build();
    }

    public static User getUserInvalid() {
        return User.builder().password("passwordInvalid").name(System.getProperty("nameInvalid")).build();
    }

}

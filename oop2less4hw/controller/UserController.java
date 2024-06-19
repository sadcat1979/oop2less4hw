package oop2less4hw.controller;

import oop2less4hw.model.User;

public interface UserController<T extends User> {

    void create(String lastName, String firstName, String middleName);
}

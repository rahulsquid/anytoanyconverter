package com.ts.a2converter.dto;

import java.util.Date;

/**
 * Created by rahul on 1/20/19.
 */
public class User {

    String id;
    String title;
    String name;
    Date dob;

    public User() {
    }

    public User(String id, String title, String name, Date dob) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.dob = dob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        return dob.equals(user.dob);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + dob.hashCode();
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}

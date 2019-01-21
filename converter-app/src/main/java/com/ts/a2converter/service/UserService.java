package com.ts.a2converter.service;

import com.ts.a2converter.dto.User;

import java.util.Date;

/**
 * Created by rahul on 1/20/19.
 */
public interface UserService {
    User register(String title, String name, Date dob);
}

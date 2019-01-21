package com.ts.a2converter.controller;
import java.util.Date;
import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.ts.a2converter.dto.User;
import com.ts.a2converter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private UserService userService;

    public User register(String title, String name, Date dob) {
        return userService.register(title,name,dob);
    }
}
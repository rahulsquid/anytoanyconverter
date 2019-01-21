package com.ts.a2converter.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ts.a2converter.dao.A2Dao;
import com.ts.a2converter.dto.QueryDetails;
import com.ts.a2converter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A2QueryResolver implements GraphQLQueryResolver {

    @Autowired
    @Qualifier("converterService")
    private ConverterService<QueryDetails> service;

    public QueryDetails convert(QueryDetails id) {
        return service.convert(id);
    }
}

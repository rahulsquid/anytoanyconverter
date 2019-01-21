package com.ts.a2converter.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ts.a2converter.dao.A2Dao;
import com.ts.a2converter.dto.QueryDetails;

public class A2QueryResolver implements GraphQLQueryResolver {
    private A2Dao<QueryDetails> a2Dao;
    public QueryDetails getPost(int id) {
        return a2Dao.getDetails(id);
    }
}

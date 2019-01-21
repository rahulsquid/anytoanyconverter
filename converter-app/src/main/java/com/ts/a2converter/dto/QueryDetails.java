package com.ts.a2converter.dto;

public class QueryDetails {
    private String id;
    private String data;
    private long ts;
    private User user;

    public QueryDetails() {

    }

    public QueryDetails(String id, String data) {
        this.id = id;
        this.data = data;
    }

    public QueryDetails(String id, String data, long ts, User user) {
        this.id = id;
        this.data = data;
        this.ts = ts;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueryDetails that = (QueryDetails) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

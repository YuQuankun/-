package com.library.bean;

import java.io.Serializable;

public class ReaderCard implements Serializable {

    private long readerId;
    private String username;
    private String password;

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long reader_id) {
        this.readerId = reader_id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

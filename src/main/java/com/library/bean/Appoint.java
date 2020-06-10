package com.library.bean;

import java.io.Serializable;
import java.util.Date;

public class Appoint implements Serializable {

    private long bookId;
    private long readerId;
    private Date appoint_date;

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long reader_id) {
        this.readerId = reader_id;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long book_id) {
        this.bookId = book_id;
    }



    public Date getAppoint_date() {
        return appoint_date;
    }

    public void setAppoint_date(Date lend_date) {
        this.appoint_date = lend_date;
    }
}

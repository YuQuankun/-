package com.library.service;

import com.library.bean.Admin;
import com.library.bean.Book;
import com.library.bean.ReaderCard;
import com.library.dao.AdminDao;
import com.library.dao.AppointDao;
import com.library.dao.ReaderCardDao;
import com.library.bean.Appoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AppointService {
    @Autowired
    private AppointDao appointDao;
    public boolean Appointbook(Appoint appoint){
        return appointDao.insertAppoint(appoint)>0;
    }
}

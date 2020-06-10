package com.library.service;

import com.library.bean.Admin;
import com.library.bean.Book;
import com.library.bean.ReaderCard;
import com.library.dao.AdminDao;
import com.library.dao.ReaderCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    public boolean InsertAdmin(Admin ad) {
        return adminDao.insertAdmin(ad)> 0;
    }
}

package com.library.service;

import com.library.bean.ReaderCard;
import com.library.dao.AdminDao;
import com.library.dao.ReaderCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//@service声明当前类为一个service类
public class LoginService {

    @Autowired//通过自动装配@Autowird引入Dao接口。
    private ReaderCardDao readerCardDao;
    @Autowired
    private AdminDao adminDao;

    public boolean hasMatchReader(long readerId,String password){
        return  readerCardDao.getIdMatchCount(readerId, password)>0;
    }//判断输入的读者账号密码是否符合数据库的信息，登录控制。

    public String getAdminUsername(long adminId) {
        return adminDao.getUsername(adminId);
    }//获取管理员的用户名

    public ReaderCard findReaderCardByReaderId(long readerId){
        return readerCardDao.findReaderByReaderId(readerId);
    }//通过读者的id获取所有的信息

    public boolean hasMatchAdmin(long adminId,String password){
        return adminDao.getMatchCount(adminId, password) ==1;
    }//获取管理员的信息

    public boolean adminRePassword(long adminId, String newPassword){
        return adminDao.resetPassword(adminId,newPassword)>0;
    }//重设管理员的密码
    public String getAdminPassword(long adminId){
        return adminDao.getPassword(adminId);
    }//获取管理员密码
    public boolean readerRePassword(long readerId, String newPassword) {
        return readerCardDao.resetPassword(readerId, newPassword) > 0;
    }//重设读者的密码
    public String getReaderPassword(long readerId) {
        return readerCardDao.getPassword(readerId);
    }//获取读者的密码
}

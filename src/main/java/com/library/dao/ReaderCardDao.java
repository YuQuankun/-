package com.library.dao;

import com.library.bean.ReaderCard;
import com.library.bean.ReaderInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
//sqlSessionTemplate 是 MyBatis-Spring 的核心。 这个类负责管理 MyBatis 的 SqlSession,
// 调用 MyBatis 的 SQL 方法, 翻译异常。 SqlSessionTemplate 是线程安全的,
// 可以被多个 DAO 所共享使用。

@Repository
public class ReaderCardDao {//定义了读者的Dao接口

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;//定义了一个session对象

    private final static String NAMESPACE = "com.library.dao.ReaderCardDao.";

    public int getIdMatchCount(final long readerId, final String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("readerId", readerId);
        map.put("password", password);
        return sqlSessionTemplate.selectOne(NAMESPACE + "getIdMatchCount", map);
    }

    public ReaderCard findReaderByReaderId(final long readerId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "findReaderByReaderId", readerId);
    }

    public int resetPassword(final long readerId, final String newPassword) {
        Map<String, Object> map = new HashMap<>();
        map.put("readerId", readerId);
        map.put("newPassword", newPassword);
        return sqlSessionTemplate.update(NAMESPACE + "resetPassword", map);
    }

    public int addReaderCard(final ReaderInfo readerInfo, final String password) {
        String username = readerInfo.getName();
        long readerId = readerInfo.getReaderId();
        Map<String, Object> map = new HashMap<>();
        map.put("readerId", readerId);
        map.put("username", username);
        map.put("password", password);
        return sqlSessionTemplate.update(NAMESPACE + "addReaderCard", map);
    }//增加读者，读者表的属性有reader_id,username,password，实现数据库中的update操作。

    public String getPassword(final long readerId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "getPassword", readerId);
    }//获取读者密码，实现数据库的selectOne操作。

    public int deleteReaderCard(final long readerId) {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteReaderCard", readerId);
    }//删除读者，实现数据库的delete操作
    public int insertUser(final ReaderCard readerCard){
        System.out.println("=====================================");
        System.out.println(readerCard.getName());//这个值也为NULL。
        System.out.println("===================================");
        return sqlSessionTemplate.insert(NAMESPACE+"insertUser",readerCard);
    }
}

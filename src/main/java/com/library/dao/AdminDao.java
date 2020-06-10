package com.library.dao;

import antlr.NameSpace;
import com.library.bean.Admin;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

//admin.xml用来和AdminDao相互配合，进行各种数据库操作，比如增删查改。
/*
SqlSessionTemplate是MyBatis-Spring的核心，这个类负责管理MyBatis的SqlSession，调用MyBatis的Sql方法。
SqlSessionTemplate实现了sqlSession接口，这就是说，在代码中无需对MyBatis的SqlSession进行替换。
 */

@Repository
public class AdminDao {//定义管理员的Dao接口，里面有各种操作。

    private final static String NAMESPACE = "com.library.dao.AdminDao.";
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public int getMatchCount(final long adminId, final String password) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("adminId", adminId);
        paramMap.put("password", password);
        return sqlSessionTemplate.selectOne(NAMESPACE + "getMatchCount", paramMap);
    }//获取正确的符合的账号信息

    public int resetPassword(final long adminId, final String password) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("adminId", adminId);
        paramMap.put("password", password);
        return sqlSessionTemplate.update(NAMESPACE + "resetPassword", paramMap);
    }//重置密码

    public String getPassword(final long adminId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "getPassword", adminId);
    }//获取密码

    public String getUsername(final long adminId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "getUsername", adminId);
    }//获取用户名
    public int insertAdmin(final Admin ad){
        return sqlSessionTemplate.insert(NAMESPACE+"insertAdmin",ad);
    }//插入admin的代码部分。
}

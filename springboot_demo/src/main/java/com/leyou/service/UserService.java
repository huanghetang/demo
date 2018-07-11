package com.leyou.service;

import com.leyou.mapper.UserMapper;
import com.leyou.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author zhoumo
 * @datetime 2018/6/29 22:03
 * @desc
 */
@Service
public class UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    /**
     * 测试example
     * @param name
     * @return
     */
    public List findUserByExample(String name) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("uname", "%"+name+"%");
        Example.Criteria criteria1 = example.createCriteria();
        criteria1.andEqualTo("uid",18);
        example.or(criteria1);
        List<User> users = userMapper.selectByExample(example);
        return users;

    }

    /**
     * count
     * @return
     */
    public int findUserbyUser(){
        int i = userMapper.selectCount(null);
        return i;
    }


    public int addUser(User u){
        System.out.println("u = " + u);
        int i = userMapper.insert(u);
        System.out.println(u);
        return i;
    }

    public void addUserBy(User u){
        System.out.println("u = " + u);
        userMapper.insertSelective(u);
    }

    public void  updateUser(User u){
        int i = userMapper.updateByPrimaryKeySelective(u);
        System.out.println("i = " + i);

    }

    public void updateUserBy(User u){
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLessThan("uid",6);
        userMapper.updateByExampleSelective(u,example);
    }

    public void deleteUser(int id){
        int i = userMapper.deleteByPrimaryKey(id);
        System.out.println("i = " + i);
    }
    @Transactional()
    public void deleteUserBy(User u){
        int delete = userMapper.delete(u);
        int a = 1/0;
        System.out.println("delete = " + delete);


    }




}

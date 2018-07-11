package com.leyou.controller;

import com.leyou.JdbcConfig2;
import com.leyou.JdbcConfig3;
import com.leyou.pojo.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author zhoumo
 * @datetime 2018/7/11 16:57
 * @desc
 */
//是组合注解 有@Controller和@ResponseBody的功能
@RestController
public class UserController {
   @Autowired
   private UserService userService;

    @GetMapping("user/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        User user = userService.findUserById(id);
        return user;
    }


    @GetMapping("user/name/{name}")
    public List<User> findUserById(@PathVariable("name") String name){
        List users = userService.findUserByExample(name);
        return users;
    }
//返回值为string 时 默认返回类型是applicatioin/json
    @GetMapping(value = "user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String findUserCount() throws Exception{
        int i = userService.findUserbyUser();
        return i+"";
    }


    @GetMapping("addUser")
    public void addUser(User user){
        userService.addUser(user);

    }
    @GetMapping("addUser1")
    public void addUser1(User user){
        userService.addUserBy(user);

    }
    @GetMapping("updateUser")
    public void updateUser(User user){
        userService.updateUser(user);

    }
    @GetMapping("updateUser1")
    public void updateUser1(User user){
        userService.updateUserBy(user);

    }
    @GetMapping("deleteUser")
    public void deleteUser(@RequestParam Integer id){
        userService.deleteUser(id);
    }
    @GetMapping("deleteUser1")
    public void deleteUser1(User user){
        userService.deleteUserBy(user);

    }

}

package cn.yyjkc.jiaochengdemo.user.controller;

import cn.yyjkc.jiaochengdemo.user.entity.UserEntity;

import cn.yyjkc.jiaochengdemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/*
 *
 * RestController =@ResponseBody+@Controller
 * */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }



    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
//        return "success";
        return "redirect:/index.html";
    }


    //保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        System.out.println("用户注册" + userEntity.toString());
        userService.save(userEntity);
        return "success";
    }



    //根据id查询用户信息
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){
        return userService.getUserById(id);
    }
    //根据id修改用户信息
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(@RequestBody UserEntity userEntity){
        userService.updateUserById(userEntity);
        return "success";
    }


}

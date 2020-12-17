package cn.yyjkc.jiaochengdemo.user.service;

import cn.yyjkc.jiaochengdemo.user.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);


    // 保存用户
    void save(UserEntity userEntity);


    //根据id查询用户数据
    UserEntity getUserById(Integer id);
    //根据id修改用户数据
    void updateUserById(UserEntity userEntity);
}

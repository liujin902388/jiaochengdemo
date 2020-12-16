package cn.yyjkc.jiaochengdemo.user.service;

import cn.yyjkc.jiaochengdemo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);


    // 保存用户
    void save(UserEntity userEntity);
}

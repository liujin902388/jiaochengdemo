package cn.yyjkc.jiaochengdemo.user.dao;

import cn.yyjkc.jiaochengdemo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);


    void delById(Integer id);


    void save(UserEntity userEntity);

    UserEntity getUserById(Integer id);

    void updateUserById(UserEntity userEntity);



}

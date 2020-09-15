package com.example.springboot.Repository;

import com.example.springboot.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper extends JpaRepository<UserEntity, Integer>{
    @Query("select u from user u where u.id = #{id}")
    UserEntity selectUserByID(@Param("id") Integer id);

    @Query("select * from user")
    List<UserEntity> selectAllUser();
}

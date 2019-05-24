package com.wangcai.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wangcai.entity.UserEntity;

@Mapper
public interface MemberDao {

	@Select("select  id,username,password,phone,email,created,updated from mb_user where id =#{userId}")
	UserEntity findByID(@Param("userId") Long userId);

	@Insert("INSERT  INTO `mb_user`  (username,password,phone,email,created,updated) VALUES (#{username}, #{password},#{phone},#{email},#{created},#{updated});")
	Integer insertUser(UserEntity userEntity);


	@Select("select  id,username,password,phone,email,created,updated ,openid from mb_user where username=#{username} and password=#{password}")
	UserEntity login(@Param("username") String username, @Param("password") String password);
	@Select("select  id,username,password,phone,email,created,updated ,openid from mb_user where openid =#{openid}")
	UserEntity findByOpenIdUser(@Param("openid") String openid);
	@Update("update mb_users set openid=#{openid} where id=#{userId}")
    Integer updateByOpenIdUser(@Param("openid") String openid,@Param("userId") Integer userId);

	
}
package com.thom.mapper;

import com.thom.dto.LuUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LuUserMapper {

    /**
     * 新增一条用户信息
     *
     * @param luUser
     * @return
     */
    int insertUser(LuUser luUser);

    List<LuUser> findUsersShort();
}
package com.qiqi.store.service;

import com.qiqi.store.dto.UserInfoDTO;
import com.qiqi.store.repository.domain.UserInfoDO;
import com.qiqi.store.repository.domain.UserInfoDOExample;
import com.qiqi.store.repository.mapper.UserInfoDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    @Override
    public Long addUserInfo(UserInfoDTO dto) {
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setAddress(dto.getAddress());
        userInfoDO.setAge(dto.getAge());
        userInfoDO.setName(dto.getName());
        userInfoDO.setPhone(dto.getPhone());
        userInfoDOMapper.insert(userInfoDO);
        return userInfoDO.getId();
    }

    @Override
    public Boolean updateUserInfo(Long id, UserInfoDTO dto) {

        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setAddress(dto.getAddress());
        userInfoDO.setAge(dto.getAge());
        userInfoDO.setName(dto.getName());
        userInfoDO.setPhone(dto.getPhone());
        UserInfoDOExample example = new UserInfoDOExample();
        example.createCriteria().andIdEqualTo(id);
        userInfoDOMapper.updateByExample(userInfoDO, example);
        return true;
    }
}

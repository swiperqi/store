package com.qiqi.store.service;

import com.qiqi.store.dto.UserAuthDTO;
import com.qiqi.store.dto.UserInfoDTO;
import com.qiqi.store.repository.domain.UserAuthDO;
import com.qiqi.store.repository.domain.UserAuthDOExample;
import com.qiqi.store.repository.mapper.UserAuthDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserAuthDOMapper userAuthDOMapper;

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public Boolean login(UserAuthDTO dto) {
        UserAuthDOExample example = new UserAuthDOExample();
        example.createCriteria()
                .andUsernameEqualTo(dto.getUsername())
                .andPasswordEqualTo(dto.getPassword());
        long count = userAuthDOMapper.countByExample(example);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Long register(UserAuthDTO dto) {
        Long userId = userInfoService.addUserInfo(new UserInfoDTO());
        UserAuthDO userAuthDO = new UserAuthDO();
        userAuthDO.setUserId(userId);
        userAuthDO.setUsername(dto.getUsername());
        userAuthDO.setPassword(dto.getPassword());
        userAuthDOMapper.insert(userAuthDO);
        return userId;
    }
}

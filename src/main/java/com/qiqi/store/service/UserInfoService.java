package com.qiqi.store.service;

import com.qiqi.store.dto.UserInfoDTO;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

public interface UserInfoService {

    Long addUserInfo(UserInfoDTO dto);

    Boolean updateUserInfo(Long id, UserInfoDTO dto);
}

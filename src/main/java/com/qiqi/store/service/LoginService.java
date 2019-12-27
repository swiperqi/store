package com.qiqi.store.service;

import com.qiqi.store.dto.UserAuthDTO;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

public interface LoginService {

    Boolean login(UserAuthDTO dto);

    Long register(UserAuthDTO dto);
}

package com.qiqi.store.service;

import com.qiqi.store.repository.domain.ElasticsearchUserDO;

import java.util.List;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */

public interface ElasticsearchUserService {

    Long saveUser(ElasticsearchUserDO user);

    Long deleteUser(Long id);

    ElasticsearchUserDO getUser(Long id);

    List<ElasticsearchUserDO> getAll();
}

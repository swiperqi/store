package com.qiqi.store.service;

import com.qiqi.store.repository.domain.ElasticsearchUserDO;
import com.qiqi.store.repository.mapper.ElasticsearchUserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */
@Service
public class ElasticsearchUserServiceImpl implements ElasticsearchUserService {

    @Autowired
    private ElasticsearchUserDOMapper elasticsearchUserDOMapper;

    @Override
    public Long saveUser(ElasticsearchUserDO user) {
        return elasticsearchUserDOMapper.save(user).getId();
    }

    @Override
    public Long deleteUser(Long id) {
        elasticsearchUserDOMapper.deleteById(id);
        return id;
    }

    @Override
    public ElasticsearchUserDO getUser(Long id) {
        return elasticsearchUserDOMapper.findById(id).get();
    }

    @Override
    public List<ElasticsearchUserDO> getAll() {
        List<ElasticsearchUserDO> elasticsearchUserDOList = new ArrayList<>();
        Iterable<ElasticsearchUserDO> all = elasticsearchUserDOMapper.findAll();
        all.forEach(elasticsearchUserDOList::add);
        return elasticsearchUserDOList;
    }
}

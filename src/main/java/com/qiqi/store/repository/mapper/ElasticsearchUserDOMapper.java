package com.qiqi.store.repository.mapper;

import com.qiqi.store.repository.domain.ElasticsearchUserDO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */

public interface ElasticsearchUserDOMapper extends ElasticsearchRepository<ElasticsearchUserDO, Long> {
}

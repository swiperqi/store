package com.qiqi.store.repository.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */

@Data
@Document(indexName = "users", type = "user")
public class ElasticsearchUserDO {
    private Long id;

    private String name;

    private Integer age;

    private String username;

    private String password;

    private String phone;

    private String address;
}

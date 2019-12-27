package com.qiqi.store.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */

@Data
public class ElasticsearchUserDTO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("地址")
    private String address;
}

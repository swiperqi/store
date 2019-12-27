package com.qiqi.store.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

@Data
public class UserInfoDTO {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("地址")
    private String address;
}

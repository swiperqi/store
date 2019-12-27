package com.qiqi.store.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

@Data
public class UserAuthDTO {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;
}

package com.qiqi.store.controller;

import com.qiqi.store.converter.dto.ElasticsearchUserDTOConverter;
import com.qiqi.store.dto.ElasticsearchUserDTO;
import com.qiqi.store.service.ElasticsearchUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */
@Api(tags = "Elasticsearch")
@RestController
@RequestMapping("/user")
public class ElasticsearchUserController {

    @Autowired
    private ElasticsearchUserService elasticsearchUserService;

    @PostMapping("/addUser")
    @ApiOperation("添加用户")
    public Long addUser(@RequestBody ElasticsearchUserDTO user) {
        user.setId(UUID.randomUUID().getMostSignificantBits());
        return elasticsearchUserService.saveUser(ElasticsearchUserDTOConverter.convertDto2Do(user));
    }

    @PostMapping("/updateUser")
    @ApiOperation("更新用户信息")
    public Long updateUser(@RequestBody ElasticsearchUserDTO user) {
        if (user.getId() == null) {
            return -1L;
        }
        if (elasticsearchUserService.getUser(user.getId()) == null) {
            return -1L;
        }
        return elasticsearchUserService.saveUser(ElasticsearchUserDTOConverter.convertDto2Do(user));
    }

    @PostMapping("/deleteUser")
    @ApiOperation("删除用户")
    public Long deleteUser(Long id) {
        return elasticsearchUserService.deleteUser(id);
    }

    @GetMapping("/getUserById")
    @ApiOperation("根据id获取用户")
    public ElasticsearchUserDTO getUserById(Long id) {
        return ElasticsearchUserDTOConverter.convertDo2Dto(elasticsearchUserService.getUser(id));
    }

    @GetMapping("/getAllUser")
    @ApiOperation("获取所有用户")
    public List<ElasticsearchUserDTO> getAllUser() {
        return ElasticsearchUserDTOConverter.convertDoList2DtoList(elasticsearchUserService.getAll());
    }
}

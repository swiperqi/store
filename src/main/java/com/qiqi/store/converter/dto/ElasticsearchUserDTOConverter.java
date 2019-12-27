package com.qiqi.store.converter.dto;

import com.qiqi.store.dto.ElasticsearchUserDTO;
import com.qiqi.store.repository.domain.ElasticsearchUserDO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */

public class ElasticsearchUserDTOConverter {

    public static ElasticsearchUserDO convertDto2Do(ElasticsearchUserDTO dto) {
        if (dto == null) {
            return null;
        }
        ElasticsearchUserDO elasticsearchUserDO = new ElasticsearchUserDO();
        elasticsearchUserDO.setId(dto.getId());
        elasticsearchUserDO.setAddress(dto.getAddress());
        elasticsearchUserDO.setAge(dto.getAge());
        elasticsearchUserDO.setName(dto.getName());
        elasticsearchUserDO.setPassword(dto.getPassword());
        elasticsearchUserDO.setPhone(dto.getPhone());
        elasticsearchUserDO.setUsername(dto.getUsername());
        return elasticsearchUserDO;
    }

    public static ElasticsearchUserDTO convertDo2Dto(ElasticsearchUserDO elasticsearchUserDO) {
        if (elasticsearchUserDO == null) {
            return null;
        }
        ElasticsearchUserDTO dto = new ElasticsearchUserDTO();
        dto.setId(elasticsearchUserDO.getId());
        dto.setAddress(elasticsearchUserDO.getAddress());
        dto.setAge(elasticsearchUserDO.getAge());
        dto.setName(elasticsearchUserDO.getName());
        dto.setPassword(elasticsearchUserDO.getPassword());
        dto.setPhone(elasticsearchUserDO.getPhone());
        dto.setUsername(elasticsearchUserDO.getUsername());
        return dto;
    }

    public static List<ElasticsearchUserDTO> convertDoList2DtoList(List<ElasticsearchUserDO> doList) {
        if (doList == null) {
            return null;
        }
        List<ElasticsearchUserDTO> dtoList = new ArrayList<>();
        doList.forEach(elasticsearchUserDO -> {
            dtoList.add(convertDo2Dto(elasticsearchUserDO));
        });
        return dtoList;
    }
}

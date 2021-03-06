package com.qiqi.store.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author qiqi
 * @date 2020/1/15 0015
 */

@Data
@ConfigurationProperties(prefix = "rabbit.routing.name")
@Component
public class RabbitmqRoutingName {

    private String log;
}

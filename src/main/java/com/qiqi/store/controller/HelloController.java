package com.qiqi.store.controller;

import com.qiqi.store.config.properties.RabbitmqExchangeName;
import com.qiqi.store.config.properties.RabbitmqQueueName;
import com.qiqi.store.config.properties.RabbitmqRoutingName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.AbstractJavaTypeMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiqi
 * @date 2020/1/9 0009
 */

@Api(tags = "hello")
@RestController
public class HelloController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitmqExchangeName exchangeName;

    @Autowired
    private RabbitmqRoutingName routingName;

    @ApiOperation("hello")
    @GetMapping("/hello")
    public String hello() {
//        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
//        rabbitTemplate.setExchange(exchangeName.getLog());
//        rabbitTemplate.setRoutingKey(routingName.getLog());
//
//        Message message= MessageBuilder.withBody("hello".getBytes()).setDeliveryMode(MessageDeliveryMode.PERSISTENT).build();
//        message.getMessageProperties().setHeader(AbstractJavaTypeMapper.DEFAULT_CONTENT_CLASSID_FIELD_NAME, MessageProperties.CONTENT_TYPE_JSON);
//        rabbitTemplate.convertAndSend(message);
        return "hello";
    }
}

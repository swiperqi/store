//package com.qiqi.store.config;
//
//import com.qiqi.store.config.properties.RabbitmqRoutingName;
//import com.qiqi.store.config.properties.RabbitmqExchangeName;
//import com.qiqi.store.config.properties.RabbitmqQueueName;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author qiqi
// * @date 2020/1/15 0015
// */
//@Configuration
//@Slf4j
//public class RabbitmqConfig {
////
////    @Value("${spring.rabbitmq.host")
////    private String host;
////
////    @Value("${spring.rabbitmq.virtual-host")
////    private String virtualHost;
////
////    @Value("${spring.rabbitmq.username")
////    private String username;
////
////    @Value("${spring.rabbitmq.password")
////    private String password;
////
////    @Value("${spring.rabbitmq.port")
////    private String port;
//
//    @Autowired
//    private RabbitmqQueueName queueName;
//
//    @Autowired
//    private RabbitmqExchangeName exchangeName;
//
//    @Autowired
//    private RabbitmqRoutingName routingName;
//
//    @Autowired
//    private CachingConnectionFactory connectionFactory;
//
//    @Bean
//    public SimpleRabbitListenerContainerFactory listenerContainer() {
//        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory);
////        factory.setMessageConverter(new Jackson2JsonMessageConverter());
//        factory.setAcknowledgeMode(AcknowledgeMode.MANUAL);
//        return factory;
//    }
//
//    @Bean
//    public RabbitTemplate rabbitTemplate() {
//        connectionFactory.setPublisherReturns(true);
//        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMandatory(true);
//        rabbitTemplate.setConfirmCallback((correlationData, b, s) ->
//                log.info("发送消息成功，correlationData({}),ack({}),cause({})", correlationData, b, s)
//        );
//        rabbitTemplate.setReturnCallback((message, i, s, s1, s2) ->
//                log.info("消息丢失，exchange({}),route({}),replyCode({}),replyText({}),message:{}", s1, s2, i, s, message)
//        );
//        return rabbitTemplate;
//    }
//
//    @Bean
//    public Queue logQueue() {
//        return new Queue(queueName.getLog(), false);
//    }
//
//    @Bean
//    public DirectExchange logExchange() {
//        return new DirectExchange(exchangeName.getLog());
//    }
//
//    @Bean
//    public Binding logBinding() {
//        return BindingBuilder.bind(logQueue()).to(logExchange()).with(routingName.getLog());
//    }
//
//}

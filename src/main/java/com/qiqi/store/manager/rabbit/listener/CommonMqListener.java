//package com.qiqi.store.manager.rabbit.listener;
//
//import com.rabbitmq.client.Channel;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
///**
// * @author qiqi
// * @date 2020/1/15 0015
// */
//@Component
//@Slf4j
//public class CommonMqListener {
//
//    @RabbitListener(queues = "${rabbit.queue.name.log}", containerFactory = "listenerContainer")
//    @RabbitHandler
//    public void consumerLogQueue(String msg, Channel channel, Message message) {
//        log.info("log get message: {}", msg);
//        try {
//            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        } catch (IOException e) {
//            log.error("get an error", e);
//        }
//    }
//
//    @RabbitListener(queues = "${rabbit.queue.name.testQueue}", containerFactory = "listenerContainer")
//    @RabbitHandler
//    public void testQueue(String msg, Channel channel, Message message) {
//        try {
//            Thread.sleep(2000);
//            log.info("test get message: {}", msg);
//            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        } catch (InterruptedException | IOException e) {
//            log.error("get an error", e);
//        }
//    }
//
//
//}

//package com.qiqi.store.mongo.test;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * @author qiqi
// * @date 2020/1/6 0006
// */
//
//public class InsertData {
//    public static void main(String[] args) {
//        MongoClient mongo = new MongoClient("192.168.52.177", 27017);
//        MongoDatabase test = mongo.getDatabase("ticket_open");
//        MongoCollection<Document> collection = test.getCollection("ticket_check");
//
//        for (int i = 0; i < 10000; i++) {
//            List<Document> dataList = new ArrayList<>();
//            for (int j = 0; j < 1000; j++) {
//                Document detail = new Document();
//                detail.put("invoiceCode", "044031900111");
//                detail.put("invoiceNumber", "66951372");
//                detail.put("issueDate", "20200106");
//                detail.put("taxExclusive", "50.00");
//                detail.put("tax", "0.00");
//                detail.put("buyerName", "齐祺");
//                detail.put("buyerTaxpayerId", "");
//                detail.put("buyerAddrTell", "");
//                detail.put("buyerBankAccount", "");
//                detail.put("sellerBankAccount", "中国银行深圳市分行 748457928279");
//                detail.put("sellerAddrTell", "广东省深圳市福田区红树林路地铁车辆段运营综合楼B座2楼214号 0755-23701432");
//                detail.put("sellerName", "深圳市深圳通有限公司");
//                detail.put("sellerTaxpayerId", "914403007703110594");
//                detail.put("machineNumber", "661616260888");
//                detail.put("checkCode", "61873412250725247003");
//                detail.put("checkCount", "1");
//                detail.put("remarks", "手机号码:15927629006 深圳通卡号:692063527");
//                detail.put("discard", false);
//                List<Document> inventories = new ArrayList<>();
//                Document inventory1 = new Document();
//                inventory1.put("specific", "");
//                inventory1.put("tax", "0");
//                inventory1.put("unit", "次");
//                inventory1.put("name", "*预付卡销售*深圳通充值款");
//                inventory1.put("unitPrice", "50.00000000");
//                inventory1.put("amount", "1.00000000");
//                inventory1.put("taxExclusive", "50.00");
//                inventory1.put("taxRate", "0.00");
//                inventories.add(inventory1);
//                detail.put("inventories", inventories);
//                Document data = new Document();
//                data.put("detail", detail);
//                data.put("projectId", Math.abs(new Random().nextLong() % 100) + 1L);
//                data.put("bizNum", String.valueOf(new Double(Math.random() * 1000000000).intValue()));
//                data.put("ticketId", "1");
//                data.put("ticketAutoId", UUID.randomUUID().toString());
//                data.put("code", 201);
//                data.put("updateTime", new Date());
//                Date date = randomDate("2019-12-10", "2020-01-10");
//                data.put("createTime", date);
//                dataList.add(data);
//            }
//
//            collection.insertMany(dataList);
//        }
//    }
//
//    private static Date randomDate(String beginDate, String endDate) {
//        try {
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//            // 构造开始日期
//            Date start = format.parse(beginDate);
//            // 构造结束日期
//            Date end = format.parse(endDate);
//            // getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
//            if (start.getTime() >= end.getTime()) {
//                return null;
//            }
//
//            long date = random(start.getTime(), end.getTime());
//
//            return new Date(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private static long random(long begin, long end) {
//        long rtn = begin + (long) (Math.random() * (end - begin));
//        // 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
//        if (rtn == begin || rtn == end) {
//            return random(begin, end);
//        }
//        return rtn;
//    }
//}

package com.mmall.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderVo {
    private Long orderNo;

    private BigDecimal payment;

    private Integer paymentType;
    
    private String paymentTypeDesc;

    private Integer postage;

    private Integer status;
    
    private String statusDesc;

    private String paymentTime;

    private String sendTime;

    private String endTime;

    private String closeTime;

    private String createTime;

    private String updateTime;
    
    //订单的明细
    private List<OrderItemVo> orderItemList;
    private String imageHost;
    private Integer shippingId;
    private String receiverName;
    
}

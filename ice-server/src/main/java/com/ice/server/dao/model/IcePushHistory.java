package com.ice.server.dao.model;

import java.util.Date;

import lombok.Data;

@Data
public class IcePushHistory {
    private Long id;

    private Integer app;

    private Long iceId;

    private String reason;

    private String operator;

    private Date createAt;

    private String pushData;
}
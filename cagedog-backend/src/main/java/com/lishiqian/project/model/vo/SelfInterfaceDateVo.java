package com.lishiqian.project.model.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SelfInterfaceDateVo implements Serializable {

    private String interfaceName;

    private int totalNum;

    private int leftNum;
}

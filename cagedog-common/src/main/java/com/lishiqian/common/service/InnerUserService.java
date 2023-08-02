package com.lishiqian.common.service;

import com.lishiqian.common.model.entity.User;


/**
 * 用户服务
 *
 * @author lishiqian
 */
public interface InnerUserService {


//    1.实际情况应该是去数据库中查是否已分配给用户秘钥（ak、sk是否合法）
//    a先根据 accessKey 判断用户是否存在，查到 secretKey
//    b对比 secretKey 和用户传的加密后的 secretKey 是否一致

    /**
     * 数据库中查是否已经分配给用户密钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}

package com.lishiqian.common.service;

import com.lishiqian.common.model.entity.InterfaceInfo;


/**
* @author li'shi'qian
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-07-12 17:17:20
*/
public interface InnerInterfaceInfoService {

//    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 从数据库中查询模拟接口是否存在（请求路径，请求方法）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
    //    2.从数据库中查询模拟接口是否存在，以及请求方法是否匹配（还可以校验请求参数）

}

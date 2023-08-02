package com.lishiqian.common.service;

import com.lishiqian.common.model.entity.UserInterfaceInfo;

/**
* @author li'shi'qian
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-07-16 10:03:16
*/
public interface InnerUserInterfaceInfoService {

    //    3.调用成功，接口调用次数 + 1 invokeCount
    boolean invokeCount(long interfaceInfoId,long userId);

    UserInterfaceInfo getById(long interfaceInfoId, long userId);

    int addDefault(long interfaceInfoId, long userId);
}

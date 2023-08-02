package com.lishiqian.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lishiqian.common.model.entity.UserInterfaceInfo;
/**
* @author li'shi'qian
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-07-16 10:03:16
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 校验
     *
     * @param userInterfaceInfo
     * @param add 是否为创建校验
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}

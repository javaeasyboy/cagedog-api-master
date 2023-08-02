package com.lishiqian.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lishiqian.common.model.entity.InterfaceInfo;


/**
* @author li'shi'qian
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-07-12 17:17:20
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

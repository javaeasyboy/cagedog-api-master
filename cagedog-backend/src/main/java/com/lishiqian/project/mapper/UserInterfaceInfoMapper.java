package com.lishiqian.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lishiqian.common.model.entity.UserInterfaceInfo;

import java.util.List;


/**
* @author li'shi'qian
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-07-16 10:03:16
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}





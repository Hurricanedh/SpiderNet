package com.spidernet.dashboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spidernet.dashboard.entity.CCapability;

public interface CCapabilityMapper
{
    List<CCapability> viewCCapability(@Param("blockId")String blockId, @Param("buList")String buList);
    CCapability fetchCommonCapabilty(String capabilityId);
}

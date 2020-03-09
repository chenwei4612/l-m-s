package com.chen.lms.dao;

import com.chen.lms.bean.Route;
import com.chen.lms.bean.RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteMapper {
    long countByExample(RouteExample example);

    int deleteByExample(RouteExample example);

    int deleteByPrimaryKey(String routeId);

    int insert(Route record);

    int insertSelective(Route record);

    List<Route> selectByExampleWithBLOBs(RouteExample example);

    List<Route> selectByExample(RouteExample example);

    Route selectByPrimaryKey(String routeId);

    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByExampleWithBLOBs(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByExample(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKeyWithBLOBs(Route record);

    int updateByPrimaryKey(Route record);
}
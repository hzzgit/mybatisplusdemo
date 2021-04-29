package com.hzz.mybatisplusdemo.vechile.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzz.mybatisplusdemo.vechile.entity.Vehicle;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.ResultSetType;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * <p>
 * 车辆表 Mapper 接口
 * </p>
 *
 * @author hzz
 * @since 2021-04-06
 */
@Repository
@DS("db1")
public interface VehicleMapper extends BaseMapper<Vehicle> {



    @Select("${sql}")
    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = 1000)
    @ResultType(Map.class)
    void dynamicSelectLargeData(@Param("sql") String sql, ResultHandler<Map> handler);

    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = 1000)
    void selectvehicle(Map params,ResultHandler<Vehicle> handler);


    @DS("db2")
    @Transactional
    @Select("select count(1) from vehicle")
    int selectco2();

    @DS("db1")
    @Transactional
    @Select("select count(1) from vehicle")
    int selectco1();
}

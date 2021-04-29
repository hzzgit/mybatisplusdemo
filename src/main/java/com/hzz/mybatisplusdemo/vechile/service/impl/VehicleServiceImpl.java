package com.hzz.mybatisplusdemo.vechile.service.impl;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzz.mybatisplusdemo.vechile.entity.Vehicle;
import com.hzz.mybatisplusdemo.vechile.mapper.VehicleMapper;
import com.hzz.mybatisplusdemo.vechile.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆表 服务实现类
 * </p>
 *
 * @author hzz
 * @since 2021-04-06
 */
@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements IVehicleService {

    @Autowired
    private VehicleMapper vehicleMapper;
    public Page<Vehicle> selectList(){

        Page<Vehicle> page = new Page<>(2, 5);
        page.setSearchCount(false);
        page.addOrder(OrderItem.asc("createdate"));
        Page<Vehicle> userIPage = vehicleMapper.selectPage(page, Wrappers.<Vehicle>lambdaQuery().like(Vehicle::getSimno, "1"));

            return userIPage;
    }

}

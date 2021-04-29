package com.hzz.mybatisplusdemo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzz.mybatisplusdemo.vechile.entity.Vehicle;
import com.hzz.mybatisplusdemo.vechile.mapper.VehicleMapper;
import com.hzz.mybatisplusdemo.vechile.service.impl.VehicleServiceImpl;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：hzz
 * @description：TODO
 * @date ：2021/4/6 14:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =MybatisplusdemoApplication.class )
public class VehicleTest {


    @Autowired
    private VehicleServiceImpl vehicleService;


    @Autowired
    private VehicleMapper vehicleMapper;

    @Test
    public void testSelect() {

        Page<Vehicle> vehiclePage = vehicleService.selectList();
        List<Vehicle> records = vehiclePage.getRecords();

    }

    @Test
    public void testMostDataSource() {
        System.out.println(vehicleMapper.selectco1());
        System.out.println(vehicleMapper.selectco2());

    }
    /**
     * 流式读取测试
     */
    @Test
    public void liushiread(){
        String sql="select v.plateNo,d.name depName from vehicle v inner join department d on v.depid=d.depid";
        vehicleMapper.dynamicSelectLargeData(sql, new ResultHandler<Map>() {
            @Override
            public void handleResult(ResultContext<? extends Map> resultContext) {
                Map resultObject = resultContext.getResultObject();
                System.out.println(resultObject);
            }
        });

    }

    @Test
    public void selectVehicleByPlateNo(){
            Map param=new HashMap();
            param.put("plateNo","闽A77777");
       vehicleMapper.selectvehicle(param, new ResultHandler<Vehicle>() {
            @Override
            public void handleResult(ResultContext<? extends Vehicle> resultContext) {
                Vehicle resultObject = resultContext.getResultObject();
                System.out.println(resultObject);
            }
        });
    }


    @Test
    public void selectvehicleBydeleted(){
        vehicleMapper.update(null,Wrappers.<Vehicle>lambdaUpdate().set(Vehicle::getDeleted,0).eq(Vehicle::getVehicleId,12019));
        Vehicle vehicle = vehicleMapper.selectById(12019);
        System.out.println(vehicle);
    }

    @Test
    public void updatetest(){
        int i = vehicleMapper.updateById(new Vehicle().setVehicleId(12019).setPlatecolor(3));
        System.out.println(i);

        int update = vehicleMapper.update(null, Wrappers.<Vehicle>lambdaUpdate().set(Vehicle::getPlatecolor, 11).eq(Vehicle::getVehicleId, 12019));

        Vehicle vehicle = vehicleMapper.selectById(12019);
        vehicle.setProtocolVersion("测试");
        vehicle.setPlatecolor(33);
        vehicleMapper.updateById(vehicle);
        System.out.println(update);
    }
}

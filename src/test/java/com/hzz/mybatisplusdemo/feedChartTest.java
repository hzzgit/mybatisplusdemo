package com.hzz.mybatisplusdemo;

import com.hzz.mybatisplusdemo.feedcharting.dto.SearchChartDto;
import com.hzz.mybatisplusdemo.feedcharting.entity.FeebbackchartingVo;
import com.hzz.mybatisplusdemo.feedcharting.mapper.FeebbackchartingMapper;
import com.hzz.mybatisplusdemo.feedcharting.mapper.FeedbackMapper;
import com.hzz.mybatisplusdemo.vechile.entity.Vehicle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @author ：hzz
 * @description：TODO
 * @date ：2021/4/6 14:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =MybatisplusdemoApplication.class )
public class feedChartTest {


    @Autowired
    private FeedbackMapper  feedbackMapper;


    @Autowired
    private FeebbackchartingMapper   feebbackchartingMapper;

    @Test
    public void selectalarmco() {

        SearchChartDto searchChartDto=new SearchChartDto();
        searchChartDto.setChatId(124);
        searchChartDto.setMainId(5370948754848612353L);
        searchChartDto.setFu(">");
        searchChartDto.setPage(100);
        List<FeebbackchartingVo> feebbackchartingVos = feedbackMapper.searchChartIng(searchChartDto);
        System.out.println(feebbackchartingVos.size());
    }



    @Test
    public void deleteFeebBackCharting(){
        int i = feedbackMapper.deleteById(5370948754848612353L);
        System.out.println(i);
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void selectid(){


        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap("select vehicleId from vehicle limit 1");
        Vehicle vehicle = jdbcTemplate.queryForObject("select * from vehicle limit 1",new BeanPropertyRowMapper<>(Vehicle.class));
        System.out.println(1);


    }

}

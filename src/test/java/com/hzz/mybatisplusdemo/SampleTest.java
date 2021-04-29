package com.hzz.mybatisplusdemo;

import com.hzz.mybatisplusdemo.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author ：hzz
 * @description：TODO
 * @date ：2021/4/6 14:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =MybatisplusdemoApplication.class )
public class SampleTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<com.hzz.mybatisplusdemo.entity.Test> tests = testMapper.selectList(null);
        System.out.println(tests);
    }

}

package com.hzz.mybatisplusdemo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzz.mybatisplusdemo.board.mapper.BoardMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

/**
 * @author ：hzz
 * @description：TODO
 * @date ：2021/4/6 14:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =MybatisplusdemoApplication.class )
public class BoardTest {


    @Autowired
    private BoardMapper  boardMapper;

    @Test
    public void selectalarmco() {
        HashMap selectalarmco = boardMapper.selectalarmco(null);
        System.out.println(selectalarmco);
    }

    @Test
    public void selectalarmbymonthadmin() {
        Page<HashMap> selectalarmbymonthadmin = boardMapper.selectalarmbymonthadmin(new Page(1, 2).setSearchCount(false), null);

        System.out.println(selectalarmbymonthadmin);
    }


    @Test
    public void testchart(){
        List<HashMap> searchallchart = boardMapper.searchallchart(124,"desc");
        long id=0;
        for (HashMap hashMap : searchallchart) {
            long id1 = (long) hashMap.get("id");
            if(id!=0&&id<id1){
                System.out.println(id+"，上一个小于下一个"+id1);
            }
            id=id1;
        }
    }

}

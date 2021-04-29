package com.hzz.mybatisplusdemo.board.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hzz.mybatisplusdemo.entity.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface BoardMapper extends BaseMapper<Test> {

    /**
     * 查询报警数量
     * @param params
     * @return
     */
    HashMap selectalarmco(Map params);

    Page<HashMap> selectalarmbymonthadmin(IPage page, Map params);

    @Select("select * from feebbackcharting where 1=1 " +
            "    and id=#{id} " +
            " order by createdate ${orderType}")
    List<HashMap> searchallchart(int id,String orderType);
}

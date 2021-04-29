package com.hzz.mybatisplusdemo.feedcharting.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzz.mybatisplusdemo.feedcharting.dto.SearchChartDto;
import com.hzz.mybatisplusdemo.feedcharting.entity.FeebbackchartingVo;
import com.hzz.mybatisplusdemo.feedcharting.entity.Feedback;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 意见反馈主表 Mapper 接口
 * </p>
 *
 * @author hzz
 * @since 2021-04-09
 */
@Repository
public interface FeedbackMapper extends BaseMapper<Feedback> {

    /**
     * 读取最新的聊天消息
     *

     * @return
     */
    @Select(" select f.*,u.name username from feebbackcharting f left join userinfo u " +
            " on f.userid=u.userid and u.deleted=false where mainId=#{mainId} " +
            " and id ${fu} #{chatId} order by id desc limit ${page} ")
    public List<FeebbackchartingVo> searchChartIng(SearchChartDto searchChartDto);

}

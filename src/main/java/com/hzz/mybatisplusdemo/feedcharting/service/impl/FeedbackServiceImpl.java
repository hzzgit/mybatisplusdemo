package com.hzz.mybatisplusdemo.feedcharting.service.impl;

import com.hzz.mybatisplusdemo.feedcharting.entity.Feedback;
import com.hzz.mybatisplusdemo.feedcharting.mapper.FeedbackMapper;
import com.hzz.mybatisplusdemo.feedcharting.service.IFeedbackService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 意见反馈主表 服务实现类
 * </p>
 *
 * @author hzz
 * @since 2021-04-09
 */
@Service
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements IFeedbackService {

}

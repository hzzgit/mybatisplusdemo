package com.hzz.mybatisplusdemo.feedcharting.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ：hzz
 * @description：TODO
 * @date ：2021/3/18 16:22
 */
@Data
public class FeebbackchartingVo {
    private Long  id;
    /**  创建时间  */
    private Date createdate;
    /**  附件路径，用逗号隔开  */
    private String  filepath;
    /**  意见反馈id  */
    private Long  mainid;
    /**  聊天内容  */
    private String  chartcontent;
    /**  回复用户id  */
    private Long  userid;
    /**  附件名称  */
    private String  filename;
    private String userName;
}

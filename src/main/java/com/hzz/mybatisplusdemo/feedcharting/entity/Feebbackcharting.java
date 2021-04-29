package com.hzz.mybatisplusdemo.feedcharting.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 意见反馈聊天列表
 * </p>
 *
 * @author hzz
 * @since 2021-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Feebbackcharting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private LocalDateTime createdate;

    /**
     * 附件路径，用逗号隔开
     */
    private String filepath;

    /**
     * 意见反馈id
     */
    private Long mainid;

    /**
     * 聊天内容
     */
    private String chartcontent;

    /**
     * 回复用户id
     */
    private Integer userid;

    /**
     * 附件名称,逗号隔开
     */
    private String filename;


}

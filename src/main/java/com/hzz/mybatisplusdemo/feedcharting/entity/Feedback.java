package com.hzz.mybatisplusdemo.feedcharting.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 意见反馈主表
 * </p>
 *
 * @author hzz
 * @since 2021-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    @TableField("titleName")
    private String titlename;

    /**
     * 描述
     */
    @TableField("describeText")
    private String describetext;

    /**
     * 附件地址，逗号隔开
     */
    private String filepath;

    /**
     * 创建时间
     */
    private LocalDateTime createdate;

    /**
     * 修改时间
     */
    private LocalDateTime updatedate;

    /**
     * 删除标志，0未删除，1已删除
     */
    @TableLogic
    private Integer deleted;

    /**
     * 创建用户id
     */
    private Integer userid;

    /**
     * 附件名称
     */
    private String filename;


}

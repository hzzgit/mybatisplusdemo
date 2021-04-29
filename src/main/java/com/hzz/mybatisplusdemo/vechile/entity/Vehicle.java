package com.hzz.mybatisplusdemo.vechile.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 车辆表
 * </p>
 *
 * @author hzz
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车辆主键
     */
    @TableId(value = "vehicleId", type = IdType.AUTO)
    private Integer vehicleId;

    /**
     * 创建时间
     */
    @TableField("createDate")
    private LocalDateTime createdate;

    /**
     * 删除标志: 0正常,大于0删除
     */
    @TableLogic //删除标志
    private Integer deleted;

    /**
     * 无用
     */
    private String owner;

    /**
     * 备注
     */
    private String remark;

    /**
     * 无用
     */
    @TableField("buyTime")
    private LocalDateTime buytime;

    /**
     * 所属机构id
     */
    @TableField("depId")
    private Integer depid;

    /**
     * 无用
     */
    @TableField("depName")
    private String depname;

    /**
     * 无用
     */
    private String driver;

    /**
     * 无用
     */
    @TableField("driverMobile")
    private String drivermobile;

    /**
     * 无用
     */
    @TableField("gpsTerminalType")
    private String gpsterminaltype;

    /**
     * 运输行业编码
     */
    private String industry;

    /**
     * 安装时间
     */
    @TableField("installDate")
    private LocalDateTime installdate;

    /**
     * 无用
     */
    @TableField("lastCheckTime")
    private LocalDateTime lastchecktime;

    /**
     * 业户id
     */
    @TableField("memberId")
    private Integer memberid;

    /**
     * 无用
     */
    private String monitor;

    /**
     * 无用
     */
    @TableField("monitorMobile")
    private String monitormobile;

    /**
     * 发动机号
     */
    @TableField("motorID")
    private String motorid;

    /**
     * 无用
     */
    @TableField("offlineTime")
    private LocalDateTime offlinetime;

    /**
     * 无用
     */
    @TableField("onlineTime")
    private LocalDateTime onlinetime;

    /**
     * 无用
     */
    @TableField("operPermit")
    private String operpermit;

    /**
     * 车辆颜色,编码，对应basicdata字典表
     */
    @TableField("plateColor")
    private Integer platecolor;

    /**
     * 车牌号
     */
    @TableField("plateNo")
    private String plateno;

    /**
     * 车籍地
     */
    private String region;

    /**
     * 无用
     */
    private String routes;

    /**
     * 运行状态
     */
    @TableField("runStatus")
    private String runstatus;

    /**
     * simNo通信号
     */
    @TableField("simNo")
    private String simno;

    /**
     * 无用
     */
    private String status;

    /**
     * 终端表主键
     */
    @TableField("termId")
    private Integer termid;

    /**
     * 无用
     */
    @TableField("useType")
    private String usetype;

    /**
     * 车辆类型
     */
    @TableField("vehicleType")
    private String vehicletype;

    /**
     * 无用
     */
    private String vendor;

    /**
     * 无用
     */
    @TableField("videoDeviceId")
    private String videodeviceid;

    /**
     * 无用
     */
    @TableField("endDate")
    private LocalDateTime enddate;

    /**
     * 无用
     */
    @TableField("startDate")
    private LocalDateTime startdate;

    /**
     * 无用
     */
    @TableField("workHour")
    private BigDecimal workhour;

    /**
     * 无用
     */
    @TableField("buyDate")
    private LocalDateTime buydate;

    /**
     * 无用
     */
    @TableField("engineNo")
    private String engineno;

    /**
     * 无用
     */
    @TableField("frameNo")
    private String frameno;

    /**
     * 无用
     */
    private String manufacture;

    /**
     * 无用
     */
    @TableField("modelNo")
    private String modelno;

    /**
     * 无用
     */
    private String photo;

    /**
     * 无用
     */
    @TableField("companyId")
    private Integer companyid;

    /**
     * 视频通道数
     */
    @TableField("videoChannelNum")
    private Integer videochannelnum;

    /**
     * 无用
     */
    @TableField("UserName")
    private String username;

    /**
     * 无用
     */
    @TableField("VideoDataType")
    private Integer videodatatype;

    /**
     * 无用
     */
    @TableField("ChannelId")
    private Integer channelid;

    /**
     * 视频存储器序号，0~11，代表主存储器序号，12~15代表备用存储器序号,多个存储器时，用逗号隔开，如0,1,2
     */
    @TableField("videoDisk")
    private String videodisk;

    /**
     * 视频设备通道名称 :格式由通道号,名称; 组成的字符串, 如 1,通道1;2,通道2
     */
    @TableField("videoChannelNames")
    private String videochannelnames;

    /**
     * 物联网卡号
     */
    @TableField("flowRateNo")
    private String flowrateno;

    /**
     * 车辆登录密码
     */
    @TableField("vehiclePassWord")
    private String vehiclepassword;

    /**
     * 上级平台的营运类型代码    (必填)	  字典维护
     */
    @TableField("superTransType")
    private String supertranstype;

    /**
     * 吨（座）位
     */
    @TableField("seatingCapacity")
    private String seatingcapacity;

    /**
     * 道路运输证号
     */
    private String transserialno;

    /**
     * 营运线路
     */
    @TableField("routeName")
    private String routename;

    /**
     * 服务开始时间
     */
    @TableField("serviceStartDate")
    private LocalDateTime servicestartdate;

    /**
     * 服务结束时间
     */
    @TableField("serviceEndDate")
    private LocalDateTime serviceenddate;

    /**
     * 里程调整
     */
    @TableField("mileageAdjustment")
    private Double mileageadjustment;

    /**
     * 百公里油耗
     */
    @TableField("fuelConsumption")
    private Double fuelconsumption;

    /**
     * 更新时间
     */
    @TableField("updateDate")
    private LocalDateTime updatedate;

    /**
     * 更新人
     */
    @TableField("updateStaff")
    private Integer updatestaff;

    /**
     * 创建人
     */
    @TableField("createStaff")
    private Integer createstaff;

    /**
     * 车辆厂商
     */
    @TableField("vehicleManufacturer")
    private String vehiclemanufacturer;

    /**
     * 无用
     */
    @TableField("inLineDate")
    private LocalDateTime inlinedate;

    /**
     * 同步时间
     */
    @TableField("synchronizedDate")
    private LocalDateTime synchronizeddate;

    /**
     * 运营商id
     */
    @TableField("operatorId")
    private Integer operatorid;

    /**
     * 协议版本
     */
    @TableField("protocol_version")
    private String protocolVersion;


}

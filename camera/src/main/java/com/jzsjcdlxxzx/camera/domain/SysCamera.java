package com.jzsjcdlxxzx.camera.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jzsjcdlxxzx.common.annotation.Excel;
import com.jzsjcdlxxzx.common.core.domain.BaseEntity;

/**
 * 监控管理对象 sys_camera
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-18
 */
public class SysCamera extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 监控ID */
    private Long cameraId;

    /** 视频源地址 */
    @Excel(name = "视频源地址")
    private String url;

    /** 是否开启flv */
    @Excel(name = "是否开启flv")
    private String flv;

    /** 是否开启hls */
    @Excel(name = "是否开启hls")
    private String hls;

    /** flv方式 */
    @Excel(name = "flv方式")
    private Integer mode;

    /** 无人拉流是否自动关闭流 */
    @Excel(name = "无人拉流是否自动关闭流")
    private String autoclose;

    /** 类型 */
    @Excel(name = "类型")
    private Integer type;

    /** md5媒体标识 */
    @Excel(name = "md5媒体标识")
    private String mediakey;

    public void setCameraId(Long cameraId) 
    {
        this.cameraId = cameraId;
    }

    public Long getCameraId() 
    {
        return cameraId;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setFlv(String flv) 
    {
        this.flv = flv;
    }

    public String getFlv() 
    {
        return flv;
    }
    public void setHls(String hls) 
    {
        this.hls = hls;
    }

    public String getHls() 
    {
        return hls;
    }
    public void setMode(Integer mode) 
    {
        this.mode = mode;
    }

    public Integer getMode() 
    {
        return mode;
    }
    public void setAutoclose(String autoclose) 
    {
        this.autoclose = autoclose;
    }

    public String getAutoclose() 
    {
        return autoclose;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setMediakey(String mediakey) 
    {
        this.mediakey = mediakey;
    }

    public String getMediakey() 
    {
        return mediakey;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cameraId", getCameraId())
            .append("url", getUrl())
            .append("flv", getFlv())
            .append("hls", getHls())
            .append("mode", getMode())
            .append("autoclose", getAutoclose())
            .append("type", getType())
            .append("mediakey", getMediakey())
            .append("remark", getRemark())
            .toString();
    }
}

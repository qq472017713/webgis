package com.jzsjcdlxxzx.zhsc.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jzsjcdlxxzx.common.annotation.Excel;
import com.jzsjcdlxxzx.common.core.domain.BaseEntity;

/**
 * 工作台账对象 zhsc_gztz
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-03
 */
public class ZhscGztz extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 辖区 */
    @Excel(name = "辖区")
    private String xq;

    /** 组别 */
    @Excel(name = "组别")
    private String zb;

    /** 原土地使用权人 */
    @Excel(name = "原土地使用权人")
    private String ytdsyqr;

    /** 位置 */
    @Excel(name = "位置")
    private String wz;

    /** 面积（亩） */
    @Excel(name = "面积", readConverterExp = "亩=")
    private Long mj;

    /** 规划用途 */
    @Excel(name = "规划用途")
    private String ghyt;

    /** 是否列入年度储备计划 */
    @Excel(name = "是否列入年度储备计划")
    private String sflrndcbjh;

    /** 土地征转（权属）情况 */
    @Excel(name = "土地征转", readConverterExp = "权=属")
    private String tdzqqk;

    /** 土地使用权是否收回 */
    @Excel(name = "土地使用权是否收回")
    private String tdsyqsfsh;

    /** 注销土地证 */
    @Excel(name = "注销土地证")
    private String zxtdz;

    /** 路网套核 */
    @Excel(name = "路网套核")
    private String lwth;

    /** 项目生成 */
    @Excel(name = "项目生成")
    private String xmsc;

    /** 覆矿 */
    @Excel(name = "覆矿")
    private String fk;

    /** 质灾 */
    @Excel(name = "质灾")
    private String zz;

    /** 涝隐 */
    @Excel(name = "涝隐")
    private String ly;

    /** 物勘 */
    @Excel(name = "物勘")
    private String wk;

    /** 壤污 */
    @Excel(name = "壤污")
    private String rw;

    /** 控规编制情况 */
    @Excel(name = "控规编制情况")
    private String kgbzqk;

    /** 补偿情况 */
    @Excel(name = "补偿情况")
    private String bcqk;

    /** 拆迁情况 */
    @Excel(name = "拆迁情况")
    private String cqqk;

    /** 地下管网核查 */
    @Excel(name = "地下管网核查")
    private String dxgwhc;

    /** 垃圾清运 */
    @Excel(name = "垃圾清运")
    private String ljqy;

    /** 储备合同签订 */
    @Excel(name = "储备合同签订")
    private String cbhtqd;

    /** 补偿费支付 */
    @Excel(name = "补偿费支付")
    private String bcfzf;

    /** 成本核算 */
    @Excel(name = "成本核算")
    private String cbhs;

    /** 边界核查 */
    @Excel(name = "边界核查")
    private String bjhc;

    /** 提请供地 */
    @Excel(name = "提请供地")
    private String tqgd;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setXq(String xq) 
    {
        this.xq = xq;
    }

    public String getXq() 
    {
        return xq;
    }
    public void setZb(String zb) 
    {
        this.zb = zb;
    }

    public String getZb() 
    {
        return zb;
    }
    public void setYtdsyqr(String ytdsyqr) 
    {
        this.ytdsyqr = ytdsyqr;
    }

    public String getYtdsyqr() 
    {
        return ytdsyqr;
    }
    public void setWz(String wz) 
    {
        this.wz = wz;
    }

    public String getWz() 
    {
        return wz;
    }
    public void setMj(Long mj) 
    {
        this.mj = mj;
    }

    public Long getMj() 
    {
        return mj;
    }
    public void setGhyt(String ghyt) 
    {
        this.ghyt = ghyt;
    }

    public String getGhyt() 
    {
        return ghyt;
    }
    public void setSflrndcbjh(String sflrndcbjh) 
    {
        this.sflrndcbjh = sflrndcbjh;
    }

    public String getSflrndcbjh() 
    {
        return sflrndcbjh;
    }
    public void setTdzqqk(String tdzqqk) 
    {
        this.tdzqqk = tdzqqk;
    }

    public String getTdzqqk() 
    {
        return tdzqqk;
    }
    public void setTdsyqsfsh(String tdsyqsfsh) 
    {
        this.tdsyqsfsh = tdsyqsfsh;
    }

    public String getTdsyqsfsh() 
    {
        return tdsyqsfsh;
    }
    public void setZxtdz(String zxtdz) 
    {
        this.zxtdz = zxtdz;
    }

    public String getZxtdz() 
    {
        return zxtdz;
    }
    public void setLwth(String lwth) 
    {
        this.lwth = lwth;
    }

    public String getLwth() 
    {
        return lwth;
    }
    public void setXmsc(String xmsc) 
    {
        this.xmsc = xmsc;
    }

    public String getXmsc() 
    {
        return xmsc;
    }
    public void setFk(String fk) 
    {
        this.fk = fk;
    }

    public String getFk() 
    {
        return fk;
    }
    public void setZz(String zz) 
    {
        this.zz = zz;
    }

    public String getZz() 
    {
        return zz;
    }
    public void setLy(String ly) 
    {
        this.ly = ly;
    }

    public String getLy() 
    {
        return ly;
    }
    public void setWk(String wk) 
    {
        this.wk = wk;
    }

    public String getWk() 
    {
        return wk;
    }
    public void setRw(String rw) 
    {
        this.rw = rw;
    }

    public String getRw() 
    {
        return rw;
    }
    public void setKgbzqk(String kgbzqk) 
    {
        this.kgbzqk = kgbzqk;
    }

    public String getKgbzqk() 
    {
        return kgbzqk;
    }
    public void setBcqk(String bcqk) 
    {
        this.bcqk = bcqk;
    }

    public String getBcqk() 
    {
        return bcqk;
    }
    public void setCqqk(String cqqk) 
    {
        this.cqqk = cqqk;
    }

    public String getCqqk() 
    {
        return cqqk;
    }
    public void setDxgwhc(String dxgwhc) 
    {
        this.dxgwhc = dxgwhc;
    }

    public String getDxgwhc() 
    {
        return dxgwhc;
    }
    public void setLjqy(String ljqy) 
    {
        this.ljqy = ljqy;
    }

    public String getLjqy() 
    {
        return ljqy;
    }
    public void setCbhtqd(String cbhtqd) 
    {
        this.cbhtqd = cbhtqd;
    }

    public String getCbhtqd() 
    {
        return cbhtqd;
    }
    public void setBcfzf(String bcfzf) 
    {
        this.bcfzf = bcfzf;
    }

    public String getBcfzf() 
    {
        return bcfzf;
    }
    public void setCbhs(String cbhs) 
    {
        this.cbhs = cbhs;
    }

    public String getCbhs() 
    {
        return cbhs;
    }
    public void setBjhc(String bjhc) 
    {
        this.bjhc = bjhc;
    }

    public String getBjhc() 
    {
        return bjhc;
    }
    public void setTqgd(String tqgd) 
    {
        this.tqgd = tqgd;
    }

    public String getTqgd() 
    {
        return tqgd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xq", getXq())
            .append("zb", getZb())
            .append("ytdsyqr", getYtdsyqr())
            .append("wz", getWz())
            .append("mj", getMj())
            .append("ghyt", getGhyt())
            .append("sflrndcbjh", getSflrndcbjh())
            .append("tdzqqk", getTdzqqk())
            .append("tdsyqsfsh", getTdsyqsfsh())
            .append("zxtdz", getZxtdz())
            .append("lwth", getLwth())
            .append("xmsc", getXmsc())
            .append("fk", getFk())
            .append("zz", getZz())
            .append("ly", getLy())
            .append("wk", getWk())
            .append("rw", getRw())
            .append("kgbzqk", getKgbzqk())
            .append("bcqk", getBcqk())
            .append("cqqk", getCqqk())
            .append("dxgwhc", getDxgwhc())
            .append("ljqy", getLjqy())
            .append("cbhtqd", getCbhtqd())
            .append("bcfzf", getBcfzf())
            .append("cbhs", getCbhs())
            .append("bjhc", getBjhc())
            .append("tqgd", getTqgd())
            .toString();
    }
}

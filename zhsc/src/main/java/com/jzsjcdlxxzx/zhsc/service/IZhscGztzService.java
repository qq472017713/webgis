package com.jzsjcdlxxzx.zhsc.service;

import java.util.List;
import com.jzsjcdlxxzx.zhsc.domain.ZhscGztz;

/**
 * 工作台账Service接口
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-03
 */
public interface IZhscGztzService 
{
    /**
     * 查询工作台账
     * 
     * @param id 工作台账ID
     * @return 工作台账
     */
    public ZhscGztz selectZhscGztzById(Long id);

    /**
     * 查询工作台账列表
     * 
     * @param zhscGztz 工作台账
     * @return 工作台账集合
     */
    public List<ZhscGztz> selectZhscGztzList(ZhscGztz zhscGztz);

    /**
     * 新增工作台账
     * 
     * @param zhscGztz 工作台账
     * @return 结果
     */
    public int insertZhscGztz(ZhscGztz zhscGztz);

    /**
     * 修改工作台账
     * 
     * @param zhscGztz 工作台账
     * @return 结果
     */
    public int updateZhscGztz(ZhscGztz zhscGztz);

    /**
     * 批量删除工作台账
     * 
     * @param ids 需要删除的工作台账ID
     * @return 结果
     */
    public int deleteZhscGztzByIds(Long[] ids);

    /**
     * 删除工作台账信息
     * 
     * @param id 工作台账ID
     * @return 结果
     */
    public int deleteZhscGztzById(Long id);
}

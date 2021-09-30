package com.jzsjcdlxxzx.zhsc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jzsjcdlxxzx.zhsc.mapper.ZhscGztzMapper;
import com.jzsjcdlxxzx.zhsc.domain.ZhscGztz;
import com.jzsjcdlxxzx.zhsc.service.IZhscGztzService;

/**
 * 工作台账Service业务层处理
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-03
 */
@Service
public class ZhscGztzServiceImpl implements IZhscGztzService 
{
    @Autowired
    private ZhscGztzMapper zhscGztzMapper;

    /**
     * 查询工作台账
     * 
     * @param id 工作台账ID
     * @return 工作台账
     */
    @Override
    public ZhscGztz selectZhscGztzById(Long id)
    {
        return zhscGztzMapper.selectZhscGztzById(id);
    }

    /**
     * 查询工作台账列表
     * 
     * @param zhscGztz 工作台账
     * @return 工作台账
     */
    @Override
    public List<ZhscGztz> selectZhscGztzList(ZhscGztz zhscGztz)
    {
        return zhscGztzMapper.selectZhscGztzList(zhscGztz);
    }

    /**
     * 新增工作台账
     * 
     * @param zhscGztz 工作台账
     * @return 结果
     */
    @Override
    public int insertZhscGztz(ZhscGztz zhscGztz)
    {
        return zhscGztzMapper.insertZhscGztz(zhscGztz);
    }

    /**
     * 修改工作台账
     * 
     * @param zhscGztz 工作台账
     * @return 结果
     */
    @Override
    public int updateZhscGztz(ZhscGztz zhscGztz)
    {
        return zhscGztzMapper.updateZhscGztz(zhscGztz);
    }

    /**
     * 批量删除工作台账
     * 
     * @param ids 需要删除的工作台账ID
     * @return 结果
     */
    @Override
    public int deleteZhscGztzByIds(Long[] ids)
    {
        return zhscGztzMapper.deleteZhscGztzByIds(ids);
    }

    /**
     * 删除工作台账信息
     * 
     * @param id 工作台账ID
     * @return 结果
     */
    @Override
    public int deleteZhscGztzById(Long id)
    {
        return zhscGztzMapper.deleteZhscGztzById(id);
    }
}

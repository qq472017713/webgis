package com.jzsjcdlxxzx.camera.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jzsjcdlxxzx.camera.mapper.SysCameraMapper;
import com.jzsjcdlxxzx.camera.domain.SysCamera;
import com.jzsjcdlxxzx.camera.service.ISysCameraService;

/**
 * 监控管理Service业务层处理
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-18
 */
@Service
public class SysCameraServiceImpl implements ISysCameraService 
{
    @Autowired
    private SysCameraMapper sysCameraMapper;

    /**
     * 查询监控管理
     * 
     * @param cameraId 监控管理ID
     * @return 监控管理
     */
    @Override
    public SysCamera selectSysCameraById(Long cameraId)
    {
        return sysCameraMapper.selectSysCameraById(cameraId);
    }

    /**
     * 查询监控管理列表
     * 
     * @param sysCamera 监控管理
     * @return 监控管理
     */
    @Override
    public List<SysCamera> selectSysCameraList(SysCamera sysCamera)
    {
        return sysCameraMapper.selectSysCameraList(sysCamera);
    }

    /**
     * 新增监控管理
     * 
     * @param sysCamera 监控管理
     * @return 结果
     */
    @Override
    public int insertSysCamera(SysCamera sysCamera)
    {
        return sysCameraMapper.insertSysCamera(sysCamera);
    }

    /**
     * 修改监控管理
     * 
     * @param sysCamera 监控管理
     * @return 结果
     */
    @Override
    public int updateSysCamera(SysCamera sysCamera)
    {
        return sysCameraMapper.updateSysCamera(sysCamera);
    }

    /**
     * 批量删除监控管理
     * 
     * @param cameraIds 需要删除的监控管理ID
     * @return 结果
     */
    @Override
    public int deleteSysCameraByIds(Long[] cameraIds)
    {
        return sysCameraMapper.deleteSysCameraByIds(cameraIds);
    }

    /**
     * 删除监控管理信息
     * 
     * @param cameraId 监控管理ID
     * @return 结果
     */
    @Override
    public int deleteSysCameraById(Long cameraId)
    {
        return sysCameraMapper.deleteSysCameraById(cameraId);
    }
}

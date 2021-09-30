package com.jzsjcdlxxzx.camera.mapper;

import java.util.List;
import com.jzsjcdlxxzx.camera.domain.SysCamera;

/**
 * 监控管理Mapper接口
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-18
 */
public interface SysCameraMapper 
{
    /**
     * 查询监控管理
     * 
     * @param cameraId 监控管理ID
     * @return 监控管理
     */
    public SysCamera selectSysCameraById(Long cameraId);

    /**
     * 查询监控管理列表
     * 
     * @param sysCamera 监控管理
     * @return 监控管理集合
     */
    public List<SysCamera> selectSysCameraList(SysCamera sysCamera);

    /**
     * 新增监控管理
     * 
     * @param sysCamera 监控管理
     * @return 结果
     */
    public int insertSysCamera(SysCamera sysCamera);

    /**
     * 修改监控管理
     * 
     * @param sysCamera 监控管理
     * @return 结果
     */
    public int updateSysCamera(SysCamera sysCamera);

    /**
     * 删除监控管理
     * 
     * @param cameraId 监控管理ID
     * @return 结果
     */
    public int deleteSysCameraById(Long cameraId);

    /**
     * 批量删除监控管理
     * 
     * @param cameraIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysCameraByIds(Long[] cameraIds);
}

package com.jzsjcdlxxzx.camera.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jzsjcdlxxzx.common.annotation.Log;
import com.jzsjcdlxxzx.common.core.controller.BaseController;
import com.jzsjcdlxxzx.common.core.domain.AjaxResult;
import com.jzsjcdlxxzx.common.enums.BusinessType;
import com.jzsjcdlxxzx.camera.domain.SysCamera;
import com.jzsjcdlxxzx.camera.service.ISysCameraService;
import com.jzsjcdlxxzx.common.utils.poi.ExcelUtil;
import com.jzsjcdlxxzx.common.core.page.TableDataInfo;

/**
 * 监控管理Controller
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-18
 */
@RestController
@RequestMapping("/camera/camera")
public class SysCameraController extends BaseController
{
    @Autowired
    private ISysCameraService sysCameraService;

    /**
     * 查询监控管理列表
     */
    @PreAuthorize("@ss.hasPermi('camera:camera:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCamera sysCamera)
    {
        startPage();
        List<SysCamera> list = sysCameraService.selectSysCameraList(sysCamera);
        return getDataTable(list);
    }

    /**
     * 导出监控管理列表
     */
    @PreAuthorize("@ss.hasPermi('camera:camera:export')")
    @Log(title = "监控管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysCamera sysCamera)
    {
        List<SysCamera> list = sysCameraService.selectSysCameraList(sysCamera);
        ExcelUtil<SysCamera> util = new ExcelUtil<SysCamera>(SysCamera.class);
        return util.exportExcel(list, "camera");
    }

    /**
     * 获取监控管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('camera:camera:query')")
    @GetMapping(value = "/{cameraId}")
    public AjaxResult getInfo(@PathVariable("cameraId") Long cameraId)
    {
        return AjaxResult.success(sysCameraService.selectSysCameraById(cameraId));
    }

    /**
     * 新增监控管理
     */
    @PreAuthorize("@ss.hasPermi('camera:camera:add')")
    @Log(title = "监控管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCamera sysCamera)
    {
        return toAjax(sysCameraService.insertSysCamera(sysCamera));
    }

    /**
     * 修改监控管理
     */
    @PreAuthorize("@ss.hasPermi('camera:camera:edit')")
    @Log(title = "监控管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCamera sysCamera)
    {
        return toAjax(sysCameraService.updateSysCamera(sysCamera));
    }

    /**
     * 删除监控管理
     */
    @PreAuthorize("@ss.hasPermi('camera:camera:remove')")
    @Log(title = "监控管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cameraIds}")
    public AjaxResult remove(@PathVariable Long[] cameraIds)
    {
        return toAjax(sysCameraService.deleteSysCameraByIds(cameraIds));
    }
}

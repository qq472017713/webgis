package com.jzsjcdlxxzx.zhsc.controller;

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
import com.jzsjcdlxxzx.zhsc.domain.ZhscGztz;
import com.jzsjcdlxxzx.zhsc.service.IZhscGztzService;
import com.jzsjcdlxxzx.common.utils.poi.ExcelUtil;
import com.jzsjcdlxxzx.common.core.page.TableDataInfo;

/**
 * 工作台账Controller
 * 
 * @author jzsjcdlxxzx
 * @date 2021-09-03
 */
@RestController
@RequestMapping("/zhsc/gztz")
public class ZhscGztzController extends BaseController
{
    @Autowired
    private IZhscGztzService zhscGztzService;

    /**
     * 查询工作台账列表
     */
    @PreAuthorize("@ss.hasPermi('zhsc:gztz:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZhscGztz zhscGztz)
    {
        startPage();
        List<ZhscGztz> list = zhscGztzService.selectZhscGztzList(zhscGztz);
        return getDataTable(list);
    }

    /**
     * 导出工作台账列表
     */
    @PreAuthorize("@ss.hasPermi('zhsc:gztz:export')")
    @Log(title = "工作台账", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ZhscGztz zhscGztz)
    {
        List<ZhscGztz> list = zhscGztzService.selectZhscGztzList(zhscGztz);
        ExcelUtil<ZhscGztz> util = new ExcelUtil<ZhscGztz>(ZhscGztz.class);
        return util.exportExcel(list, "gztz");
    }

    /**
     * 获取工作台账详细信息
     */
    @PreAuthorize("@ss.hasPermi('zhsc:gztz:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(zhscGztzService.selectZhscGztzById(id));
    }

    /**
     * 新增工作台账
     */
    @PreAuthorize("@ss.hasPermi('zhsc:gztz:add')")
    @Log(title = "工作台账", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZhscGztz zhscGztz)
    {
        return toAjax(zhscGztzService.insertZhscGztz(zhscGztz));
    }

    /**
     * 修改工作台账
     */
    @PreAuthorize("@ss.hasPermi('zhsc:gztz:edit')")
    @Log(title = "工作台账", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZhscGztz zhscGztz)
    {
        return toAjax(zhscGztzService.updateZhscGztz(zhscGztz));
    }

    /**
     * 删除工作台账
     */
    @PreAuthorize("@ss.hasPermi('zhsc:gztz:remove')")
    @Log(title = "工作台账", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(zhscGztzService.deleteZhscGztzByIds(ids));
    }
}

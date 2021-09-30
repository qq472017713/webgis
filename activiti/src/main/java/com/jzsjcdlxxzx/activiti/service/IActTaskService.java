package com.jzsjcdlxxzx.activiti.service;

import com.github.pagehelper.Page;
import com.jzsjcdlxxzx.activiti.domain.dto.ActTaskDTO;
import com.jzsjcdlxxzx.activiti.domain.dto.ActWorkflowFormDataDTO;
import com.jzsjcdlxxzx.common.core.page.PageDomain;

import java.text.ParseException;
import java.util.List;

public interface IActTaskService {
    public Page<ActTaskDTO> selectProcessDefinitionList(PageDomain pageDomain);
    public List<String>formDataShow(String taskID);
    public int formDataSave(String taskID, List<ActWorkflowFormDataDTO> awfs) throws ParseException;
}

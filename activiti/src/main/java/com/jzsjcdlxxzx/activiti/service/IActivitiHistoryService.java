package com.jzsjcdlxxzx.activiti.service;

import com.jzsjcdlxxzx.activiti.domain.dto.ActivitiHighLineDTO;

public interface IActivitiHistoryService {
    public ActivitiHighLineDTO gethighLine(String instanceId);
}

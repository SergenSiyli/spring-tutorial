package com.service;

import com.dto.LogDto;

import java.util.List;

public interface ILogService {
    List<LogDto> getSearchResult(String searchKey);
    void save(LogDto logDto);
}

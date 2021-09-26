package com.service;

import com.dto.LogDto;
import com.entity.LogEntitiy;
import com.repository.ILogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class LogService implements  ILogService {

    private final ILogRepository logRepository;

    @Override
    public List<LogDto> getSearchResult(String searchKey) {
        List<LogEntitiy>  logEntitiys =  logRepository.getByCustomQuery(searchKey);
        List<LogDto> logDtos = new ArrayList<>();
        logEntitiys.forEach(it-> {
            LogDto logDto = new LogDto();
            logDto.setServiceName(it.getServiceName());
            logDto.setLogText(it.getLogText());
            logDto.setLogDate(new Date());
        });
        return logDtos;
    }

    @Override
    public void save(LogDto logDto) {
       LogEntitiy logEntitiy = new LogEntitiy();
       logEntitiy.setServiceName(logDto.getServiceName());
       logEntitiy.setLogText(logDto.getLogText());
       logEntitiy.setLogDate(new Date());
       logRepository.save(logEntitiy);
    }
}

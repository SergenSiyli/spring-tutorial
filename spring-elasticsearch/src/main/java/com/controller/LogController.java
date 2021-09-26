package com.controller;

import com.dto.LogDto;
import com.service.ILogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/log")
public class LogController {

    private final ILogService logService;

    @PostConstruct
    public void init() {
        LogDto logDto = new LogDto();
        logDto.setServiceName("ABC");
        logDto.setLogText("DummyForSearch");
        logService.save(logDto);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<LogDto>> getKisi(@PathVariable String search) {
        return ResponseEntity.ok(logService.getSearchResult(search));
    }


}

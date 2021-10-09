package com.controller;


import com.service.IMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {

    private final IMessageService messageService;

    @PostMapping
    public ResponseEntity<String> mesajMethod(@RequestBody String message) {
        messageService.mesajVer(message);
        return ResponseEntity.ok(messageService.mesajVer(message));
    }
}

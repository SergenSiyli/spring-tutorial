package com.controller;
import java.util.List;

import javax.validation.Valid;

import com.dto.AccountDto;
import com.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
@Api(value = "My Account Api Documentation")
public class AccountController {

    private final IAccountService accountService;

    @PostMapping("/setAccount")
    @ApiOperation(value = "Save All Account Method", notes = "Be Careful About This Method")
    public ResponseEntity<AccountDto> saveAll(@Valid @RequestBody @ApiParam(value = "Account") AccountDto accountDto) {
        return ResponseEntity.ok(accountService.save(accountDto));
    }

    @GetMapping("/getAccount")
    @ApiOperation(value = "Get All Account List Method", notes = "Be Careful About This Method")
    public ResponseEntity<List<AccountDto>> getListAll() {
        return ResponseEntity.ok(accountService.getAll());
    }

    @GetMapping("/getAccountWithAccountNumber/{id}")
    @ApiOperation(value = "Get All Account With Id  Method", notes = "Be Careful About This Method")
    public ResponseEntity<AccountDto> getAccountWithAccountNumber(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accountService.getAccountId(id));
    }

}

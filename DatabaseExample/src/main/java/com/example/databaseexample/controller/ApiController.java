package com.example.databaseexample.controller;

import com.example.databaseexample.dto.TestMapperDTO;
import com.example.databaseexample.repository.TestMapperRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * packageName    : com.example.databaseexample.controller
 * fileName       : ApiController
 * author         : Hosun
 * date           : 2022-09-22
 * description    : RestController return
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-09-22        Hosun              최초 생성
 */

@RestController
@RequiredArgsConstructor
@Slf4j
public class ApiController {
    private final TestMapperRepository mapper;

    @GetMapping(value = "/api-test")
    public ResponseEntity<List<?>> viewReturnValue(){
        List<TestMapperDTO> lists = mapper.findAll();

        log.info("List<TestMapperDTO> lists = mapper.findAll()\t:\t"+lists);

        return ResponseEntity.ok(lists);
        /*  ( return 이렇게 하면 405 발생...)
            "status": 405,
            "error": "Method Not Allowed"
        * */
    }
}

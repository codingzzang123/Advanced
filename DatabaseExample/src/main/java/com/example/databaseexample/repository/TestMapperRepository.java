package com.example.databaseexample.repository;

import com.example.databaseexample.dto.TestMapperDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName    : com.example.databaseexample.repository
 * fileName       : TestMapperRepository
 * author         : Hosun
 * date           : 2022-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-09-22        Hosun              최초 생성
 */
@Mapper
public interface TestMapperRepository {
    void save1(TestMapperDTO testMapperDTO);

    List<TestMapperDTO> findAll();
}

package com.example.databaseexample;

import com.example.databaseexample.dto.TestMapperDTO;
import com.example.databaseexample.repository.TestMapperRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
class DatabaseExampleApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Autowired
    TestMapperRepository repo;

    @Test
    @Transactional
    @Rollback
    @DisplayName("DB 연결 테스트")
    public void dbConnectTest(){
        repo.save1(
                new TestMapperDTO(2,"dog")
        );
    }

    @Test
    public void test(){
        String []lunch = new String[2];
        lunch[0] = "수누리";
        lunch[1] = "양꼬치";

        log.info(String.valueOf("랜덤 점심메뉴 : "+lunch[(int) (Math.random()%2)]));
    }
}

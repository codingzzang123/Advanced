package hello.hellospring.Controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll Annotation 호출");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll Annotation 호출");
    }

    @Test
    void test1(){
        System.out.println("test1 Started");
    }

    @Test
    @DisplayName("Test Case 2!!!")
    void test2(){
        System.out.println("test2 Started");
    }
}
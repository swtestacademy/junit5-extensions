package tests;

import org.junit.jupiter.api.*;

public class DefaultTestLifeCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach()");
    }

    @Test
    void firstTest() {
        System.out.println("firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("secondTest()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll()");
    }
}

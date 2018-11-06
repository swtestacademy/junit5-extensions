package tests;

import extensions.ExecutionConditionExtension;
import extensions.IgnoreStaleElementReferenceExceptionExtension;
import extensions.TestLifeCycleExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestLifeCycleExtension.class)
@ExtendWith(ExecutionConditionExtension.class)
@ExtendWith(IgnoreStaleElementReferenceExceptionExtension.class)
public class TestLifeCycleExtensionTest {
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

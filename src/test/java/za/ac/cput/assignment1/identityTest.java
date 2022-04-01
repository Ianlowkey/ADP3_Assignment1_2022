package za.ac.cput.assignment1;

/*
    Name: Ian Louw
    Student Number: 216250773
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class identityTest {

    private identityTest identity1;
    private identityTest identity2;
    private identityTest identity3;
    private identityTest identity4;

    @BeforeEach
    void setUp() {

        identity1 = new identityTest();
        identity2 = new identityTest();
        identity3 = new identityTest();
        identity4 = identity3;
    }

    @Test
    @DisplayName("This displays object equality")
    void objectEquality(){

        assertEquals(identity1, identity2);
        System.out.println("Objects are equal");
    }

    @Test
    @DisplayName("This displays object identity")
    void objectIdentity() {
        assertSame(identity3, identity4);
        System.out.println("Objects are identical");
    }

    @Test
    @DisplayName("This displays failed test")
    void failingTest() {
        fail("This is a failed test");
        assertNotSame(identity1, identity2);
    }

    @Test
    @DisplayName("This displays timeout")
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("Test timed out");
        });
    }

    @Test
    @Disabled("This displays a failed test")
    void disablingTest() {
        assertEquals(identity1, identity2);
        System.out.println("Not yet implemented");
    }
}
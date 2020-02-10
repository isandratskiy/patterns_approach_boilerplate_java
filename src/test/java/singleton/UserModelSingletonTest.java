package singleton;

import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static singleton.UserModelSingleton.*;

class UserModelSingletonTest {
    @SneakyThrows
    @BeforeEach
    void resetSingleton() {
        val instance = UserModelSingleton.class.getDeclaredField("ourInstance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    void shouldBeEqual() {
        val firstSingleton = getInstance();
        val secondSingleton = getInstance();
        assertEquals(firstSingleton, secondSingleton);
    }

    @Test
    void shouldBeNotEqual() {
        val firstSingleton = getInstance();
        ourInstance = null;
        val secondSingleton = getInstance();
        assertNotEquals(firstSingleton, secondSingleton);
    }
}

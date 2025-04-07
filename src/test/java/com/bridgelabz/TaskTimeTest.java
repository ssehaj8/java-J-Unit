package com.bridgelabz;

import com.bridgelabz.JUnit.TaskTimeTest.TaskTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskTimeTest {
    TaskTime t;

    @BeforeEach
    void setUp(){
        t=new TaskTime();
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)  // Fail if exceeds 2 seconds
    public void testLongRunningTaskTimeout() {
        String result = t.longRunningTask();
        Assertions.assertEquals("Task Complete", result);
    }
}

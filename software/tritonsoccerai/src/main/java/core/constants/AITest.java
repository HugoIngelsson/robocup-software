package main.java.core.constants;

import main.java.core.module.testModule.TestModule;
import main.java.core.module.testModule.MoveTestModule;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import main.java.core.module.testModule.ObstacleTestModule;

public enum AITest {
    MOVE(MoveTestModule.class, "Test the ability of robots to move a target location."),
    OBSTACLE(ObstacleTestModule.class, "Test robot obstacle avoidance.")
    ;

    private final Class<? extends TestModule> testClass;
    private final String desc;

    AITest(Class<? extends TestModule> testClass, String desc) {
        this.testClass = testClass;
        this.desc = desc;
    }

    public Class<? extends TestModule> getTestRunnerClass() {
        return testClass;
    }

    public String getDesc() {
        return desc;
    }

    public TestModule createNewTestModule(ScheduledThreadPoolExecutor executor) {
        try {
            System.out.println(executor);
            return testClass.getConstructor(ScheduledThreadPoolExecutor.class).newInstance(executor);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }
    
}

package com.we.scheduleCenter;

import org.springframework.context.ApplicationContext;

import com.site.spring.DefaultServiceLocator;

public class ScheduleCenterServiceLocator extends DefaultServiceLocator {

    /**
     * The context.
     */
    private static ApplicationContext context;

    static {
        try {
            context = getApplicationContext(ScheduleCenterServiceLocator.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the context.
     * 
     * @return the context
     */
    public static ApplicationContext getApplicationContext() {
        if (context == null) {
            throw new RuntimeException("Spring loading error!");
        }
        return context;
    }
}

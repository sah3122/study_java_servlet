package me.study;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
        sce.getServletContext().setAttribute("name", "dong");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet Destroyed");
    }
}

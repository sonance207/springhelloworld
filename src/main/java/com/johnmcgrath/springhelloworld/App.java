package com.johnmcgrath.springhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world! for spring
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /** ApplicationContext is a bean container,
         * It is a class that instantiate beans.
         *
         * Beans are java objects that are imported via
         * spring framework
         */


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NewRobot new_robot = (NewRobot)context.getBean("newRobot");

        new_robot.speak();



        /**
         * Closes Application context in case there is a memory leak
         */

        ((ClassPathXmlApplicationContext)context).close();

    }
}

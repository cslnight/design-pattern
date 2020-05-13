package com.cslnight.factory;

/**
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 *
 * Created by Tom.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}

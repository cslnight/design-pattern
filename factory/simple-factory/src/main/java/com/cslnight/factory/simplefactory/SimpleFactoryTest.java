package com.cslnight.factory.simplefactory;

import com.cslnight.factory.ICourse;
import com.cslnight.factory.JavaCourse;

/**
 * 小作坊式的工厂模型
 * 特点：
 * 它是一个具体的类，非接口 抽象类。有一个重要的create()方法，
 * 利用if或者 switch创建产品并返回。
 * create()方法通常是静态的，所以也称之为静态工厂。
 * 缺点：
 * 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）。
 * 不同的产品需要不同额外参数的时候 不支持。
 *
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }
}

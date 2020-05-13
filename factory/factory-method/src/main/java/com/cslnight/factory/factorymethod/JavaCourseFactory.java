package com.cslnight.factory.factorymethod;

import com.cslnight.factory.ICourse;
import com.cslnight.factory.JavaCourse;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}

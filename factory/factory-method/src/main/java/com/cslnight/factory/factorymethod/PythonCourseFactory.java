package com.cslnight.factory.factorymethod;

import com.cslnight.factory.ICourse;
import com.cslnight.factory.PythonCourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}

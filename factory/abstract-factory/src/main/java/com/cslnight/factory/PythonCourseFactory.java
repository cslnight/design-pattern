package com.cslnight.factory;

import com.cslnight.bean.INote;
import com.cslnight.bean.IVideo;
import com.cslnight.bean.PythonNote;
import com.cslnight.bean.PythonVideo;

/**
 * Created by Tom.
 */
public class PythonCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new PythonNote();
    }


    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}

package com.cslnight.factory;

import com.cslnight.bean.INote;
import com.cslnight.bean.IVideo;
import com.cslnight.bean.JavaNote;
import com.cslnight.bean.JavaVideo;

/**
 * Created by Tom.
 */
public class JavaCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}

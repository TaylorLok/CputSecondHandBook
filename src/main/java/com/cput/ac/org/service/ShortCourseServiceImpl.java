package com.cput.ac.org.service;

import com.cput.ac.org.Domain.ShortCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("ShortCourseServiceImpl")
public class ShortCourseServiceImpl implements ShortCourseService
{
    @Autowired
    @Qualifier("ShortCourseServiceImpl")
    private static ShortCourseServiceImpl service = null;
    private Map<String, ShortCourse> shortcourse;

    private ShortCourseServiceImpl()
    {
        this.shortcourse = new HashMap<>();
    }

    public static ShortCourseServiceImpl getRepository()
    {
        if(service == null) service = new ShortCourseServiceImpl();
        return service;

    }

    @Override
    public ShortCourse create(ShortCourse course)
    {
        this.shortcourse.put(course.getCcna1(),course);
        this.shortcourse.put(course.getCcna2(),course);
        this.shortcourse.put(course.getCcnp(),course);
        this.shortcourse.put(course.getCyberSecurity(),course);
        return course;
    }

    @Override
    public ShortCourse update(ShortCourse course)
    {
        this.shortcourse.replace(course.getCcna1(),course);
        this.shortcourse.replace(course.getCcna2(),course);
        this.shortcourse.replace(course.getCcnp(),course);
        this.shortcourse.replace(course.getCyberSecurity(),course);
        return course;
    }

    @Override
    public void delete(ShortCourse course)
    {
        this.shortcourse.remove(course);
    }

    @Override
    public ShortCourse read(ShortCourse course)
    {
        this.shortcourse.get(course);
        return course;
    }

    @Override
    public Set<ShortCourse> getAll() {
        Collection<ShortCourse> shortcourses = this.shortcourse.values();
        Set<ShortCourse> set = new HashSet<>();
        set.addAll(shortcourses);
        return set;
    }
}

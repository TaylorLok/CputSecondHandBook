package repository;

import Domain.ShortCourse;

import java.util.*;

public class ShortCourseRepositoryImpl implements ShortCourseRepository
{
    private static ShortCourseRepositoryImpl repository= null;
    private Map<String,ShortCourse> shortCourse;

    private ShortCourseRepositoryImpl() {
        this.shortCourse = new HashMap<>();
    }



    public static ShortCourseRepositoryImpl getRepository()
    {
        if (repository == null) repository = new ShortCourseRepositoryImpl();
        return repository;

    }



    @Override
    public ShortCourse create(ShortCourse course)
    {
        this.shortCourse.put(course.getCcna1(),course);
        this.shortCourse.put(course.getCcna2(),course);
        this.shortCourse.put(course.getCcnp(),course);
        this.shortCourse.put(course.getCyberSecurity(),course);
        return course;
    }

    @Override
    public ShortCourse update(ShortCourse course)
    {
        this.shortCourse.replace(course.getCcna1(),course);
        this.shortCourse.replace(course.getCcna2(),course);
        this.shortCourse.replace(course.getCcnp(),course);
        this.shortCourse.replace(course.getCyberSecurity(),course);
        return course;
    }

    @Override
    public void delete(ShortCourse course)
    {
       this.shortCourse.remove(course);
    }

    @Override
    public ShortCourse read(ShortCourse course)
    {
        this.shortCourse.get(course);
        return course;
    }

    @Override
    public Set<ShortCourse> getAll() {
        Collection<ShortCourse> shortCourses = this.shortCourse.values();
        Set<ShortCourse> set = new HashSet<>();
        set.addAll(shortCourses);
        return set;
    }
}

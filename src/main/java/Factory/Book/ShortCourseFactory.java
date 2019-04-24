package Factory.Book;


public class ShortCourseFactory
{
    public static ShortCourseFactory getShortCourse(String ccna1,String ccna2,String ccnp,String cyberSecurity)
    {
        return new ShortCourseFactory.Builder()
                                      .ccna1(ccna1)
                                       .ccna2(ccna2)
                                       .ccnp(ccnp)
                                       .cyberSecurity(cyberSecurity)
                                       .build();
    }
}

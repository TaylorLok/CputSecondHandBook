package repository;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SellerRatingRepositoryImplTest
{
   Set<String> values;

    SellerRatingRepository selrepo;


    @Before
    public void setUp() throws Exception
    {
        selrepo = SellerRatingRepositoryImpl.getRepository();

      // selrepo = new HashMap<String,String>();

        values.add("Taylor");
        values.add("Lokombe");
        values.add("*****");
        values.add("good");
        values.add("nice try");
    }




    @Test
    public void create()
    {
        //selrepo = SellerRatingFactory.getSellerRating(values,"lokombe","*****","30/04/2019","nice try");
        //selrepo.create(null);


        //Assert.assertEquals("Name",selrepo.getSurName(),"Taylor");
        System.out.println(selrepo.toString());
    }

    @Test
    public void update()
    {

    }

    @Test
    public void delete()
    {

    }

    @Test
    public void read()
    {
    }

    @Test
    public void getAll()
    {
    }
}

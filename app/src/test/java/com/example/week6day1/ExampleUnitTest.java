package com.example.week6day1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void getUserName(){
        User user = new User();
        user.setName("love");

        assertEquals("love", user.getName());
    }

    @Test
    public void getUserBook(){
        User user = new User();
        user.setFavBook("amor");
        assertEquals("amor", user.getFavBook());
    }

    @Test
    public void getUserMovie(){
        User user = new User();
        user.setFavMovie("little trees");
        assertEquals("little trees", user.getFavMovie());
    }
}
package com.udacity.gradle.builditbigger;

import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by redrose on 3/28/18.
 */

import org.junit.runners.JUnit4;


import static java.security.AccessController.getContext;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(JUnit4.class)

public class EndPointAsynkTaskTest {

    private static final String LOG_TAG = "NonEmptyStringTest";
@Test
    public void gettingJoke(){
 
        String check = EndPointAsynkTask.retrive;
        Log.i("value is null or not",check);
        assertNotNull(check);

}
}


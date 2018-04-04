package com.udacity.gradle.builditbigger;

import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by redrose on 3/28/18.
 */

import org.junit.runners.JUnit4;

import java.util.concurrent.TimeUnit;

import static android.content.ContentValues.TAG;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(JUnit4.class)

public class EndPointAsynkTaskTest {

@Test
    public void gettingJoke() {

    EndPointAsynkTask endPointAsynkTask = new EndPointAsynkTask();
    endPointAsynkTask.execute();

    try {
        String joke = endPointAsynkTask.get();
        Log.d(TAG, "checkIfEndPointAsynkTaskReturnsEmptyString: " + joke);
        System.out.println(joke);

        assertNotNull(joke);
        assertTrue(joke.length() > 0);
    } catch(Exception e) {
        e.printStackTrace();
    }
}


}







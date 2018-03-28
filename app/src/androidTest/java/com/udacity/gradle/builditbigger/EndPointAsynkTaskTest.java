package com.udacity.gradle.builditbigger;

//import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.content.ContentValues.TAG;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by redrose on 3/28/18.
 */
@RunWith(AndroidJUnit4.class)
public class EndPointAsynkTaskTest {

    @Test
    public void  fetchNonEmptyString(){
        EndPointAsynkTask task = new EndPointAsynkTask();
        task.execute();
        try {
            String joke = task.get();
            Log.d(TAG, "Joke text: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }


}


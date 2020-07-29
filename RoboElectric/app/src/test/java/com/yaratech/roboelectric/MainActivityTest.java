package com.yaratech.roboelectric;

import android.content.Intent;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;


import androidx.test.core.app.ApplicationProvider;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21)
public class MainActivityTest {


    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        TextView tv = activity.findViewById(R.id.textView);
        String text = tv.getText().toString();

        assertEquals(text , "Hello World");
    }
}
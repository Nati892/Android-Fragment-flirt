package com.learning.learn_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    Button b1;
    public static  int x = 0;
    boolean switch1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.Main_b1);
        Log.d(TAG, "onCreate: got here : x: "+x);
        setListeners();
        if (savedInstanceState == null)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("some_int", 0);
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.fragmentContainerView, FirstFragment.class, bundle).commit();
        } else
        {

            Log.d(TAG, "onCreate: is not null");
            Log.d(TAG, "onCreate: bundle " + savedInstanceState.toString());

        }

    }


    private void setListeners()
    {
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d(TAG, "onClick: started");
                Button tempB = (Button) view;
                x++;
                Log.d(TAG, "onClick: x: "+x);
                Log.d(TAG, "onClick: finished");

            }
        });


    }


}
package com.learning.learn_fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment
{
    private static final String TAG = "FirstFragment";
    public FirstFragment()
    {
        super(R.layout.first_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        int x =requireArguments().getInt("some_int");
        Log.d(TAG, "onViewCreated, x:"+x);

    }
}

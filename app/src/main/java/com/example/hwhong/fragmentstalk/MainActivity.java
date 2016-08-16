package com.example.hwhong.fragmentstalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hwhong.fragmentstalk.FragmentOne.OnNameSetListener;

public class MainActivity extends AppCompatActivity implements OnNameSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setName(String name) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager().
                findFragmentById(R.id.fragmentTwo);
        fragmentTwo.updateInfo(name);
    }
}

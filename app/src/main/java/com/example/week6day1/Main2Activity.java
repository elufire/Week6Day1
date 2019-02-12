package com.example.week6day1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.week6day1.databinding.ActivityMain2Binding;
import com.example.week6day1.databinding.ActivityMainBinding;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user");
        System.out.println("User Activity 2: " + user.getName());
        ActivityMain2Binding activityMain2Binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main2);
        activityMain2Binding.setViewModel(new UserViewModel());
        activityMain2Binding.setUser(user);
        activityMain2Binding.executePendingBindings();
    }
}

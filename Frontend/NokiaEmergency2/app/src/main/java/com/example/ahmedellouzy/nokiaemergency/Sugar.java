package com.example.ahmedellouzy.nokiaemergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar);
    }

    public void Main(View view)
    {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}

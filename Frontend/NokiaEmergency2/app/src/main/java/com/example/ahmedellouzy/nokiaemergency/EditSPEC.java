package com.example.ahmedellouzy.nokiaemergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EditSPEC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_spec);
    }

    public void Accident(View view)
    {
        Intent intent = new Intent(this , Accident.class);
        startActivity(intent);
    }

    public void Sugar(View view)
    {
        Intent intent = new Intent(this , Sugar.class);
        startActivity(intent);
    }
}

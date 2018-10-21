package com.example.ahmedellouzy.nokiaemergency;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }
    public void Fire(View view)
    {
        Intent intent = new Intent(this , Fire.class);
        startActivity(intent);
    }

    public void Medical(View view)
    {
        Intent intent = new Intent(this , Medical.class);
        startActivity(intent);
    }
    public void Police(View view)
    {
        Intent intent = new Intent(this , Police.class);
        startActivity(intent);
    }

    public void SpecialCases(View view) {
        Intent intent = new Intent(this, Special_Cases.class);
        startActivity(intent);
    }

}

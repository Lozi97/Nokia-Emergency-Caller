package com.example.ahmedellouzy.nokiaemergency;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class Special_Cases extends AppCompatActivity {
    private static final int REQUEST_PHONE_CALL = 1;
    private static final int PICK_CONTACT = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special__cases);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://1c18dbd2.ngrok.io/api/Emergency/getEmergencyCases";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        String currentString = response.toString();
                        String[] separated = currentString.split("data");
                        Log.d("part ONEEEEE",separated[0] );
                        Log.d("part TWWOOOO",separated[1].trim().trim() );

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }


    public void SugarDisorder(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0123456789"));
        if (ContextCompat.checkSelfPermission(Special_Cases.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Special_Cases.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
        } else {
            startActivity(callIntent);
        }

    }

    public void CarAccident(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0123456789"));
        if (ContextCompat.checkSelfPermission(Special_Cases.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Special_Cases.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
        } else {
            startActivity(callIntent);
        }

    }
    public void Addcasee(View view) {
        Intent intent = new Intent(this, AddCase.class);
        startActivity(intent);
    }
    public void EditSpec(View view) {
        Intent intent = new Intent(this, EditSPEC.class);
        startActivity(intent);
    }

}
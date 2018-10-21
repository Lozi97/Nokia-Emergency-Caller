package com.example.ahmedellouzy.nokiaemergency;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class Special_Cases extends AppCompatActivity {
    private static final int REQUEST_PHONE_CALL = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special__cases);
//
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url ="http://30b3c32c.ngrok.io/api/Emergency/getEmergencyCases";
//
//// Request a string response from the provided URL.
//        JsonObjectRequest JSONObjectRequest = new JsonObjectRequest(Request.Method.GET, url,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        try {
//                            Log.d("part Nourrrrrrraaaaaaaaa",response.getString("err"));
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
////                        String[] separated = response.split("data");
////
////                        String data= separated[1];
////                        data= data.substring(3);
////
////                        String[] separatedTwo = data.split("Numbers");
////
////                        Log.d("part ONEEEEE",separatedTwo[1]);
////                        Log.d("part TWWWWWWWWWWWOOOOOOOOOOOO",separatedTwo[2]);
////
////                        String[] separatedName = data.split("Numbers");
//
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//            }
//        });
//
//// Add the request to the RequestQueue.
//        queue.add(stringRequest);
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
        callIntent.setData(Uri.parse("tel:+358480786520"));
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
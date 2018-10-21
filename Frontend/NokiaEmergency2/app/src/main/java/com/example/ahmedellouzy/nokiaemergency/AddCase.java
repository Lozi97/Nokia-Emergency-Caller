package com.example.ahmedellouzy.nokiaemergency;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AddCase extends AppCompatActivity {
    TextView Casename;
    ImageButton Icon;
    TextView Desc;
    TextView ContactOne;
    TextView ContactTwo;
    TextView ContactThree;
    TextView ContactFour;
    ArrayList Numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_case);
    }
    public void AddCaseSpe(View view) {
//        Intent intent = new Intent(this, Special_Cases.class);
//        startActivity(intent);

        Numbers= new ArrayList(4);
        Casename= (TextView) findViewById(R.id.editText);
        Icon= (ImageButton) findViewById(R.id.imageButton);
        Desc= (TextView) findViewById(R.id.editText2);
        ContactOne= (TextView) findViewById(R.id.editText7);
        ContactTwo= (TextView) findViewById(R.id.editText5);
        ContactThree= (TextView) findViewById(R.id.editText8);
        ContactFour= (TextView) findViewById(R.id.editText6);

        if (!(ContactOne.equals(""))) {
            Numbers.add(ContactOne.toString());
        }
        if (!(ContactTwo.equals(""))) {
            Numbers.add(ContactTwo.toString());
        }
        if (!(ContactThree.equals(""))) {
            Numbers.add(ContactThree.toString());
        }
        if (!(ContactFour.equals(""))) {
            Numbers.add(ContactFour.toString());
        }
        try {
            String URL = "";
            JSONObject jsonBody = new JSONObject();

            jsonBody.put("name", Casename.toString());
            jsonBody.put("Icon", Icon.toString());
            jsonBody.put("Description", Desc.toString());
            jsonBody.put("Type", "Special");
            jsonBody.put("Numbers", Numbers);

            JsonObjectRequest jsonOblect = new JsonObjectRequest(Request.Method.POST, "http://1c18dbd2.ngrok.io/api/Emergency/createEmergencyCases", jsonBody, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    Log.d("PPPOOOOSSSSTTTEEEEDDDDDD", response.toString());                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    VolleyLog.d("NNOOOOTTT PPPOOOSSTTTEEDDDD", "Error: " + error.getMessage());
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    }


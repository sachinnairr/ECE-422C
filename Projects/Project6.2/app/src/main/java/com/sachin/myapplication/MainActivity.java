package com.sachin.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private final String HourlyURL = "https://api.openweathermap.org/data/2.5/onecall?lat=30.267153&lon=-97.743057&units=imperial&exclude=current,minutely,daily,alerts&appid=475e7772b64a6e8961b09f1e82723abd";
    private final String DailyURL = "https://api.openweathermap.org/data/2.5/onecall?lat=30.267153&lon=-97.743057&units=imperial&exclude=current,minutely,hourly,alerts&appid=475e7772b64a6e8961b09f1e82723abd";
    private final String WholeURl =  "https://api.openweathermap.org/data/2.5/weather?lat=30.267153&lon=-97.743057&units=imperial&exclude=alerts,minutely&appid=475e7772b64a6e8961b09f1e82723abd";
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
    }
    public void hourly(View view) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, HourlyURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    JSONArray jsonArray = jsonResponse.getJSONArray("hourly");
                    JSONObject jsonObjectHourly = jsonArray.getJSONObject(0);
                    int temp = jsonObjectHourly.getInt("temp");
                    jsonObjectHourly = jsonArray.getJSONObject(1);
                    int temp1 = jsonObjectHourly.getInt("temp");
                    jsonObjectHourly = jsonArray.getJSONObject(2);
                    int temp2 = jsonObjectHourly.getInt("temp");
                    jsonObjectHourly = jsonArray.getJSONObject(3);
                    int temp3 = jsonObjectHourly.getInt("temp");
                    jsonObjectHourly = jsonArray.getJSONObject(4);
                    int temp4 = jsonObjectHourly.getInt("temp");
                    jsonObjectHourly = jsonArray.getJSONObject(5);
                    int temp5 = jsonObjectHourly.getInt("temp");
                    text.setText("Current City: Austin" + "\n Current Temp: " + temp + " F" + "\n Hour 1 Temp: " + temp1 + " F"+ "\n Hour 2 Temp: " + temp2 + " F" + "\n Hour 3 Temp: " + temp3 + " F"+ "\n Hour 4 Temp: " + temp4 + " F" + "\n Hour 5 Temp: " + temp5 + " F");
                }  catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, error -> Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show());
        RequestQueue requestQueue = Volley.newRequestQueue((getApplicationContext()));
        requestQueue.add(stringRequest);

    }
    public void daily(View view) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, DailyURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    JSONArray jsonArray = jsonResponse.getJSONArray("daily");
                    JSONObject jsonObjectDaily = jsonArray.getJSONObject(0).getJSONObject("temp");
                    int temp = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(1).getJSONObject("temp");
                    int temp1 = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(2).getJSONObject("temp");
                    int temp2 = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(3).getJSONObject("temp");
                    int temp3 = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(4).getJSONObject("temp");
                    int temp4 = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(5).getJSONObject("temp");
                    int temp5 = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(6).getJSONObject("temp");
                    int temp6 = jsonObjectDaily.getInt("day");
                    jsonObjectDaily = jsonArray.getJSONObject(7).getJSONObject("temp");
                    int temp7 = jsonObjectDaily.getInt("day");
                    text.setText("Current City: Austin" + "\n Current Temp: " + temp + " F" + "\n Day 1 Temp: " + temp1 + " F" + "\n Day 2 Temp: " + temp2 + " F" + "\n Day 3 Temp: " + temp3 + " F" + "\n Day 4 Temp: " + temp4 + " F" + "\n Day 5 Temp: " + temp5 + " F" + "\n Day 6 Temp: " + temp6 + " F" + "\n Day 7 Temp: " + temp7 + " F");


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, error -> Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show());
        RequestQueue requestQueue = Volley.newRequestQueue((getApplicationContext()));
        requestQueue.add(stringRequest);
    }

    public void current(View view) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, WholeURl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    JSONObject jsonObjectMain = jsonResponse.getJSONObject("main");
                    int temp = jsonObjectMain.getInt("temp") ;
                    int pressure = jsonObjectMain.getInt("pressure");
                    int humidity = jsonObjectMain.getInt("humidity");
                    JSONObject jsonObjectWind = jsonResponse.getJSONObject("wind");
                    String wind = jsonObjectWind.getString("speed");
                    text.setText("Current City: Austin " + "\n Temp: " + temp +" F" + "\n Pressure: " + pressure + " hPa" + "\n Humidity: " + humidity + " %"+ "\n Wind Speed: " + wind + "mph");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, error -> Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show());
        RequestQueue requestQueue = Volley.newRequestQueue((getApplicationContext()));
        requestQueue.add(stringRequest);

    }




}

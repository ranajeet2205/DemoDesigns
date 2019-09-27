package com.cpgs.ouat.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /***
     * Declaring the view according to its view type e.g. Button , TextView , etc. ...
     * Even Layouts LinearLayout , RelativeLayouts etc.
     */
    Button birthDay,calculation,courtCounter,recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        birthDay = findViewById(R.id.birthday);
        calculation = findViewById(R.id.calculation);
        courtCounter = findViewById(R.id.court_counter);
        recyclerView = findViewById(R.id.recyclerView);

        birthDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /***
                 * Here Intent is used to transit from activity to activity
                 */
                Intent birthDayIntent = new Intent(MainActivity.this,BirthdayActivity.class);
                startActivity(birthDayIntent);
            }
        });

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent birthDayIntent = new Intent(MainActivity.this,CalculationActivity.class);
                startActivity(birthDayIntent);
            }
        });

        courtCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent courtCounterIntent = new Intent(MainActivity.this,PointGameActivity.class);
                startActivity(courtCounterIntent);
            }
        });

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recyclerViewIntent = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(recyclerViewIntent);
            }
        });
    }
}

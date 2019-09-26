package com.cpgs.ouat.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculationActivity extends AppCompatActivity {

    /***
     * Declaring The Views According To View Type
     */
    TextView answerTextView;
    EditText firstNumEditText,secondNumEditText;
    Button additionBtn,subtractionBtn,multiplicationBtn,divisionBtn;
    String firstNum,secondNum,resultValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        /***
         * Initialising The Views
         */
        answerTextView = findViewById(R.id.answer_txtView);
        firstNumEditText = findViewById(R.id.first_num_edit_txt);
        secondNumEditText = findViewById(R.id.second_num_edit_txt);
        additionBtn = findViewById(R.id.addition_btn);
        subtractionBtn = findViewById(R.id.subtraction_btn);
        multiplicationBtn = findViewById(R.id.multiply_btn);
        divisionBtn = findViewById(R.id.division_btn);

        /****
         * Performing Addition operation
         */
        additionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = firstNumEditText.getText().toString().trim();
                secondNum = secondNumEditText.getText().toString().trim();

                /***
                 * This Condition is just for checking nonempty values if edittext are left blank
                 * Otherwise It is going to through NullPointer Exception And The App Is going to Crash
                 */
                if (!TextUtils.isEmpty(firstNum) && !TextUtils.isEmpty(secondNum)){
                    resultValue = String.valueOf(Integer.parseInt(firstNum) + Integer.parseInt(secondNum));
                    answerTextView.setText(resultValue);
                }else{
                    Toast.makeText(CalculationActivity.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                }


            }
        });


        /***
         * Performing Subtraction operation
         */
        subtractionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = firstNumEditText.getText().toString().trim();
                secondNum = secondNumEditText.getText().toString().trim();

                /***
                 * This Condition is just for checking nonempty values if edittext are left blank
                 * Otherwise It is going to through NullPointer Exception And The App Is going to Crash
                 */
                if (!TextUtils.isEmpty(firstNum) && !TextUtils.isEmpty(secondNum)){
                    resultValue = String.valueOf(Integer.parseInt(firstNum) - Integer.parseInt(secondNum));
                    answerTextView.setText(resultValue);
                }else{
                    Toast.makeText(CalculationActivity.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });


        /***
         * performing Multiplication Division
         */
        multiplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = firstNumEditText.getText().toString().trim();
                secondNum = secondNumEditText.getText().toString().trim();


                /***
                 * This Condition is just for checking nonempty values if edittext are left blank
                 * Otherwise It is going to through NullPointer Exception And The App Is going to Crash
                 */
                if (!TextUtils.isEmpty(firstNum) && !TextUtils.isEmpty(secondNum)){
                    resultValue = String.valueOf(Integer.parseInt(firstNum) * Integer.parseInt(secondNum));
                    answerTextView.setText(resultValue);
                }else{
                    Toast.makeText(CalculationActivity.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });


        /***
         * Performing Division Operation
         */
        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = firstNumEditText.getText().toString().trim();
                secondNum = secondNumEditText.getText().toString().trim();


                /***
                 * This Condition is just for checking nonempty values if edittext are left blank
                 * Otherwise It is going to through NullPointer Exception And The App Is going to Crash
                 */
                if (!TextUtils.isEmpty(firstNum) && !TextUtils.isEmpty(secondNum)){
                    resultValue = String.valueOf(Integer.parseInt(firstNum) / Integer.parseInt(secondNum));
                    answerTextView.setText(resultValue);
                }else{
                    Toast.makeText(CalculationActivity.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

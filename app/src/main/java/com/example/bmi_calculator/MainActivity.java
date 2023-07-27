package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//ui is connected with ux with the help of this line
        EditText editWeight,editHeightFt,editHeightIn;
        TextView txtResult;
        Button btnCalculate;

        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightin);
        btnCalculate = findViewById(R.id.btnCalculate);

        txtResult = findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int wt = Integer.parseInt(editWeight.getText().toString());
              int ft = Integer.parseInt(editHeightFt.getText().toString());
              int in = Integer.parseInt(editHeightIn.getText().toString());
              int totalIn = ft*12 + in;
              double totalCm = totalIn*2.53;
              double totalM = totalCm/100;
              double bmi = wt/(totalM*totalM);
              if(bmi>25){
                  txtResult.setText("You are overweight");



              } else if (bmi<18) {
                  txtResult.setText("You are under weight");

              }
              else{
                  txtResult.setText("You are Healthy ");

              }


            }
        });






    }
}
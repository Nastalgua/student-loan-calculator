package com.example.student_loan_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  private Button calculateBtn;
  AlertDialog.Builder builder;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    calculateBtn = (Button) findViewById(R.id.calculate);
    builder = new AlertDialog.Builder(this);

    this.addListener();
  }

  protected void addListener() {
    this.calculateBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // get all the values and calculate
        Results res = Loan.calculate();

        String monthlyPayment = "Monthly Payment: " + res.getMonthlyPayment();
        String interestToPay = "Interest To Pay: " + res.getInterestToPay();

        builder.setMessage(monthlyPayment + "\n" + interestToPay)
          .setCancelable(true)
          .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { }
          });

        AlertDialog alert = builder.create();
        alert.setTitle("Results");
        alert.show();
      }
    });
  }
}
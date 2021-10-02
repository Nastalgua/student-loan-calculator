package com.example.student_loan_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;

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
        EditText loanAmount, interestRate, loanTerm, loanFees;
        loanAmount = findViewById(R.id.loanNumber);
        interestRate = findViewById(R.id.interestRate);
        loanTerm = findViewById(R.id.loanTerm);
        loanFees = findViewById(R.id.loanFees);

        double lA = Double.parseDouble(loanAmount.getText().toString());
        double iR = Double.parseDouble(interestRate.getText().toString());
        int lT = Integer.parseInt(loanTerm.getText().toString());
        double lF = Double.parseDouble(loanFees.getText().toString());

        Loan curL = new Loan(lA, iR, lT, lF);

        Results res = curL.calculate();

        String monthlyPayment = "Monthly Payment: $" + res.getMonthlyPayment();
        String interestToPay = "Interest To Pay: $" + res.getInterestToPay();

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
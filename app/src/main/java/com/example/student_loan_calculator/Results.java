package com.example.student_loan_calculator;

public class Results {
  private double mMonthlyPayment;
  private double mInterestToPay;

  public Results(double monthyPayment, double interestToPay) {
    this.mMonthlyPayment = Math.round(monthyPayment * 100.0) / 100.0;
    this.mInterestToPay = Math.round(interestToPay * 100.0) / 100.0;;
  }

  public double getMonthlyPayment() { return mMonthlyPayment; }

  public void setMonthlyPayment(double monthlyPayment) { mMonthlyPayment = monthlyPayment; }

  public double getInterestToPay() { return mInterestToPay; }

  public void setInterestToPay(double interestToPay) { mInterestToPay = interestToPay; }
}

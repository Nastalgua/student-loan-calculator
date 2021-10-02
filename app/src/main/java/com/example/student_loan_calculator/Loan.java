package com.example.student_loan_calculator;

public class Loan {
  private double mLoanAmount;
  private double mInterestRate;
  private int mLoanTerm;
  final double LOAN_FEES = 10.0;
  private double mMinimumPayment;

  public Loan(double loanAmount, double interestRate, int loanTerm, double minimumPayment) {
    this.mLoanAmount = loanAmount;
    this.mInterestRate = interestRate / 100;
    this.mLoanTerm = loanTerm * 12;
    this.mMinimumPayment = minimumPayment;
  }

  public Results calculate() {
      double rate = Math.pow((1 + this.mInterestRate), this.mLoanTerm);
      // using given formula given in class
      double numerator = (mLoanAmount + LOAN_FEES) * rate;
      double denominator = mLoanTerm;

      // (num / den) = monthly payment
      // num - principal = interested to be paid

      return new Results(numerator / denominator, numerator - mLoanAmount);
  }

  // stupid setters and getters
  public double getLoanAmount() { return mLoanAmount; }

  public void setLoanAmount(double loanAmount) { mLoanAmount = loanAmount; }

  public double getInterestRate() { return mInterestRate; }

  public void setInterestRate(double interestRate) { mInterestRate = interestRate; }

  public int getLoanTerm() { return mLoanTerm; }

  public void setLoanTerm(int loanTerm) { mLoanTerm = loanTerm; }

  public double getMinimumPayment() { return mMinimumPayment; }

  public void setMinimumPayment(double minimumPayment) { mMinimumPayment = minimumPayment; }
}

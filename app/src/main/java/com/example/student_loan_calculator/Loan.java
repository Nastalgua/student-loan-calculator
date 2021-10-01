package com.example.student_loan_calculator;

public class Loan {
  private double mLoanAmount;
  private double mInterestRate;
  private int mLoanTerm;
  final double LOAN_FEES = 10.0;
  private double mMinimumPayment;

  public Loan(double loanAmount, double interestRate, int loanTerm, double minimumPayment) {
    this.mLoanAmount = loanAmount;
    this.mInterestRate = interestRate;
    this.mLoanTerm = loanTerm;
    this.mMinimumPayment = minimumPayment;
  }

  public static Results calculate() {
//    double principal = this.mLoanAmount + this.mMinimumPayment;
//    double rate = Math.pow((1 + this.mInterestRate), this.mLoanTerm);
//    double numerator = principal * ;

    // placeholder
    return new Results(10, 500);
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

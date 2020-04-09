package edu.wpi.teamname.entity;

import javafx.beans.property.SimpleDoubleProperty;

// import lombok.Data;
//
// @Data
public class Mortgage {
  private double amount;
  private double rate;
  private int years;

  private SimpleDoubleProperty mortgage = new SimpleDoubleProperty();

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public int getYears() {
    return years;
  }

  public void setYears(int years) {
    this.years = years;
  }

  public void calcMortgage() {
    double monthlyRate = amount * Math.pow(1 + rate / 12, years * 12) / 12;
    mortgage.set(monthlyRate);
  }

  public double getMortgage() {
    return mortgage.get();
  }

  public SimpleDoubleProperty getMortgageProperty() {
    return mortgage;
  }
}

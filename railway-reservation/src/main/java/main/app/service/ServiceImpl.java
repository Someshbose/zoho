package main.app.service;

import java.util.Scanner;
import main.model.Booking;

public class ServiceImpl implements Services {
  private Booking bookingObject;

  private static Scanner sc = new Scanner(System.in);

  public ServiceImpl() {
    bookingObject = new Booking();
  }

  public void book() {
    System.out.println("Currently only one train available");
    bookingObject.book();
  }

  public String cancel() {
    return null;
  }

  public String printDetials(int pnr) {
    return null;
  }

  public String availability() {
    return "Available-";
  }

}

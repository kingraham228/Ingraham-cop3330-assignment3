package ex44;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class Products {
  private String name;
  private String price;
  private String quantity;

  public Products (String name, String price, String quantity){
      this.name = name;
      this.price = price;
      this.quantity = quantity;
  }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }
}

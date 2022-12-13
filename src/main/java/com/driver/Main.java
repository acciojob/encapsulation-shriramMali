package com.driver;

public class Main {
  public static void main( String [] args){
      RWOnly obj=new RWOnly();
     // obj.name="axe";
     // 'name' has private access in 'com.driver.RWOnly''

      obj.setName("Axe");
      obj.getName();
  }
}
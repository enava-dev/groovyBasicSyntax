package com.enh.learninggroovy.methods

class MethodsMain{

  public static void main(String[] args){

    Integer val1 = 1;
    Integer val2 = 1;

    Boolean val3 = val1.equals(val2) //groovy compara por valor y no por referencia

    print("equals: $val3")

  }
}

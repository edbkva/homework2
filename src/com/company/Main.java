package com.company;

public  class  Main {

//   public static int age = 25, in

    public static int age = 27;
    public static int temp = 19;

    public static void main(String[] args) {
        if (age > 10 && age > 45 && temp > -20 && temp < 30) {
            System.out.println("Можно идти гулять!");
        } else if (age < 10 && temp > 0) {
            System.out.println(" Можно идти гулять но не долго !");
        } else if (age > 65 && temp < -10) {
            System.out.println("лучше остаться дома !  ");
        } else {
            System.out.println("Почитай книгу ! ");
        }
    }
}
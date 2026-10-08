import java.util.Scanner; 

// class Calculator {

//     void add(int a, int b) {
//         System.out.println("sum = " +(a+b));
//     }
    
//     void add(int a, int b, int c) { 
//         System.out.println("Sum = " +(a + b + c));
//     }

//     void add(double a, double b){
//         System.out.println("Sum = " + (a + b));
//     }
//  }

// // ---- Polymorphisim Compile-time ----

// public class Polymorphisim {
//     public static void main (String[] args){

//         try (Scanner sc = new Scanner(System.in)) {
//             Calculator obj = new Calculator(); 

//             System.out.print("Enter first integer: " );
//             int a = sc.nextInt();

//             System.out.print("Enter second integer: ");
//             int b = sc.nextInt();

//             obj.add(a, b); 

//             System.out.print("Enter third integer: "); 
//             int c = sc.nextInt();

//             obj.add(a, b, c); 

//             System.out.println("Enter two decimal number: ");
//             double x =sc.nextDouble();
//             double y =sc.nextDouble();

//             obj.add(x, y);
//         }
//     }
// }



// // ---- Polymorphisim Run Time ---- 

// import java.util.Scanner;

// class Car {
//     void drive() {
//         System.out.println("Car is driving");
//     }
// }

// class PetrolCar extends Car {
//     @Override
//     void drive() {
//         System.out.println("Petrol car is driving");
//     }
// }

// class ElectricCar extends Car {
//     @Override
//     void drive() {
//         System.out.println("Electric car is driving silently");
//     }
// }

// public class Polymorphisim {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter car type:");
//         System.out.println("1. Petrol Car");
//         System.out.println("2. Electric Car");

//         int choice = sc.nextInt();

//         Car car;   // Parent class reference

//         if (choice == 1) {
//             car = new PetrolCar();
//         } else if (choice == 2) {
//             car = new ElectricCar();
//         } else {
//             System.out.println("Invalid choice");
//             return;
//         }

//         // Runtime polymorphism
//         car.drive();

//         sc.close();
//     }
// }


// // ---- Run Time Polymorphisim  With a Animal Example ---- 

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Polymorphism {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter animal type:");
//         System.out.println("1. Dog");
//         System.out.println("2. Cat");

//         int choice = sc.nextInt();

//         Animal animal;   // Parent class reference

//         if (choice == 1) {
//             animal = new Dog();
//         } else if (choice == 2) {
//             animal = new Cat();
//         } else {
//             System.out.println("Invalid choice");
//             return;
//         }

//         // Runtime polymorphism
//         animal.sound();

//         sc.close();
//     }
// }
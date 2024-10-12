package com.pluralsight.math;


public class MathApplication {
    public static void main(String[] args) {
        int bobSalary = 22222;
        int garySalary = 33333;

        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is..." + highestSalary);


        int carPrices; {
            int carPrice = 35000;
            int truckPrice = 43000;

            int minPrice = Math.min(carPrice, truckPrice);
            System.out.println("The lowest vehicle price is..." + minPrice);
        }

        double areaOfACircle; {
            double radius = 7.25;
            double area = (radius * radius) * Math.PI;
            System.out.println("The area of a circle whose radius is 7.25 is..." + area);
        }

        double squareRoot; {
            double value = 5.0;
            double result = Math.sqrt(value);
            System.out.println("The square root of 5.0 is..." + value);
        }

        double pointDistances; {
            double x1 = 5;
            double y1 = 10;
            double x2 = 85;
            double y2 = 50;

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("The distance between the points (5, 10) and (85, 50) is..." + distance);
        }

        double absoluteValue; {
            double variable = -3.8;
            double absolute = Math.abs(variable);
            System.out.println("The absolute (positive) value of -3.8 is..." + absolute);
        }

        double randomNumber; {
            double randomNum = Math.random();
            System.out.println("Random number between 0 and 1: " + randomNum);
        }

    }
}
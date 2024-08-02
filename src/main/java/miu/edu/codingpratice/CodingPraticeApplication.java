package miu.edu.codingpratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class CodingPraticeApplication {

        public static void main(String[] args) {
            int[] numbers = new int[]{ 1,2,3,4,5};
            printHelloWorld(numbers);
            System.out.println("Second Largest Number");
            System.out.println( findSecondBiggest(numbers));
        }

        public static void printHelloWorld(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 5 == 0 && numbers[i] % 7 == 0) {
                    System.out.println("HelloWorld");
                } else if (numbers[i] % 5 == 0) {
                    System.out.println("Hello");
                } else if (numbers[i] % 7 == 0) {
                    System.out.println("World");
                }
            }
        }

       public static int findSecondBiggest(int[] numbers) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }


    }


public class SumDivisibleBy5 {
    public static void main(String[] args) {
        int sum = 0;
        int currentNumber = 41;  // Start with the first number greater than 40

        while (currentNumber < 250) {
            if (currentNumber % 5 == 0) {
                sum += currentNumber;
            }
            currentNumber++;
        }

        System.out.println("Sum of all integers greater than 40 and less than 250 that are divisible by 5: " + sum);
        System.out.println("Name: SHEEBANAAZ MAKANDAR");
        System.out.println("SAP ID: 500117989");
    }


}
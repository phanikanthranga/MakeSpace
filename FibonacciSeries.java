public class FibonacciSeries {

    public static void main(String[] args) {
        printFibonacci(20); //prints the first 20 numbers of fibonacci series
    }

    public static void printFibonacci(int count) {
        int n1 = 0; //first number of fibonacci series
        int n2 = 1; //second number of fibonacci series

        System.out.print("Fibonacci series numbers are \n"+ n1 + " " + n2);

        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }
}

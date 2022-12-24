import java.util.Scanner;

public class PrimeNumber {
    static boolean prime(int number, int i) {

        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        else if (number == i) {
            return true;
        }
       else  if (number % i == 0) {
            return false;
        }
        return prime(number, i + 1);
    }


    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.println(prime(number, 2));
    }
}
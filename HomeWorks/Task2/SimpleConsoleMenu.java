import java.util.Scanner;

public class SimpleConsoleMenu{
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Show in range");
            System.out.println("2. Sum of numbers");
            System.out.println("3. Sum of digits");
            System.out.println("4. Exit");
            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    if (a > b) {
                        while (a != b - 1) {
                            if (a % 2 == 0) System.out.print(a + " ");
                            a--;
                        }
                    } else if (a < b) {
                        while (a != b + 1) {
                            if (a % 2 == 0) System.out.print(a + " ");
                            a++;
                        }
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    int n = scanner.nextInt();
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        int x = scanner.nextInt();
                        sum += x;
                    }
                    System.out.println(sum);
                    break;
                }
                case 3: {
                    int i = scanner.nextInt();
                    int sum = 0;
                    while (i / 10 > 0) {
                        sum += i % 10;
                        i = i / 10;
                    }
                    sum += i;
                    System.out.println(sum);
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println();
        }
    }
}
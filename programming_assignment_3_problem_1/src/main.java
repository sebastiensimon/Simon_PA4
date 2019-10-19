import java.util.Random;
import java.util.Scanner;

 class main {
    private static void multiplication() {

        int num1, c, num2, ans;
        System.out.println("Enter difficulty level(1/2)");
        c = STDIN_SCANNER.nextInt();
        if(c == 1) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            ans = STDIN_SCANNER.nextInt();
            while(ans != num1 * num2) {
                if(ans != num1 * num2) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + num1 + "*" + num2 + "?");
                    ans = STDIN_SCANNER.nextInt();
                }
            }
        } else if(c == 2) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            System.out.println("How much is " + num1 + "*" + num2 + "?");
            ans = STDIN_SCANNER.nextInt();
            while(ans != num1 * num2) {
                if(ans != num1 * num2) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + num1 + "*" + num2 + "?");
                    ans = STDIN_SCANNER.nextInt();
                }
            }
        }
    }


    private static void addition() {
        int num1, c, num2, ans;
        System.out.println("Enter difficulty level(1/2)");
        c = STDIN_SCANNER.nextInt();
        if(c == 1) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            System.out.println("How much is " + num1 + "+" + num2 + "?");
            ans = STDIN_SCANNER.nextInt();
            while(ans != num1 + num2) {
                if(ans != num1 + num2) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + num1 + "+" + num2 + "?");
                    ans = STDIN_SCANNER.nextInt();
                }
            }
        } else if(c == 2) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            System.out.println("How much is " + num1 + "+" + num2 + "?");
            ans = STDIN_SCANNER.nextInt();
            while(ans != num1 + num2) {
                if(ans != num1 + num2) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + num1 + "+" + num2 + "?");
                    ans = STDIN_SCANNER.nextInt();
                }
            }
        }
    }


    private static void subtraction() {
        int num1, c, num2, ans;
        System.out.println("Enter difficulty level(1/2)");
        c = STDIN_SCANNER.nextInt();
        if(c == 1) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            System.out.println("How much is " + num1 + "-" + num2 + "?");
            ans = STDIN_SCANNER.nextInt();
            while(ans != num1 - num2) {
                if(ans != num1 - num2) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + num1 + "-" + num2 + "?");
                    ans = STDIN_SCANNER.nextInt();
                }
            }
        } else if(c == 2) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            System.out.println("How much is " + num1 + "-" + num2 + "?");
            ans = STDIN_SCANNER.nextInt();
            while(ans != num1 - num2) {
                if(ans != num1 - num2) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + num1 + "-" + num2 + "?");
                    ans = STDIN_SCANNER.nextInt();
                }
            }
        }
    }

    private static void division() {
        float num1, num2,ans;
        int c;

        System.out.println("Enter difficulty level(1/2)");
        c = STDIN_SCANNER.nextInt();
        if(c == 1) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10;
            System.out.printf("How much is %f/%f?\n", num1, num2);
            ans = STDIN_SCANNER.nextFloat();
            while(ans != num1 / num2) {
                if(ans != num1 / num2) {
                    System.out.println("No. Please try again.");
                    System.out.printf("How much is %f/%f?\n", num1, num2);
                    ans = STDIN_SCANNER.nextFloat();
                }
            }
        } else if(c == 2) {
            num1 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            num2 = (RANDOM.nextInt() & Integer.MAX_VALUE) % 10 + 90;
            System.out.printf("How much is %f/%f?\n", num1, num2);
            ans = STDIN_SCANNER.nextFloat();
            while(ans != num1 / num2) {
                if(ans != num1 / num2) {
                    System.out.println("No. Please try again.");
                    System.out.printf("How much is %f/%f?\n", num1, num2);
                    ans = STDIN_SCANNER.nextFloat();
                }
            }
        }
    }


    private static int question() {
        int  o, i;
        System.out.println(" 1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division\n 5.Random \n Enter your choice");
        o = STDIN_SCANNER.nextInt();
        switch(o) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                i = (RANDOM.nextInt() & Integer.MAX_VALUE) % 4;
                if(i == 0) {
                    addition();
                    break;
                } else if(i == 1) {
                    subtraction();
                    break;
                } else if(i == 2) {
                    multiplication();
                    break;
                } else {
                    division();
                    break;
                }
        }
        return 1;
    }


    public static void main(String[] args) {
        RANDOM.setSeed(System.currentTimeMillis());
        int n;
        byte ch = 'y';
        while(ch == 'y') {
            n = question();
            if(n == 1) {
                System.out.println("Very good!");
            }
            System.out.println("Do you wish to continue(y/n)?");
            ch = (byte)nextChar(STDIN_SCANNER);
            ch = (byte)nextChar(STDIN_SCANNER);
        }
    }

    private final static Scanner STDIN_SCANNER = new Scanner(System.in);

    private final static int nextChar(Scanner scanner) {
        scanner.useDelimiter("");
        int ret = scanner.next().charAt(0);
        scanner.reset();
        return ret;
    }

    private final static Random RANDOM = new Random(1);
}
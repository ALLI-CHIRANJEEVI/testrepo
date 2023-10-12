import java.util.Scanner;

class grade {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int marks;
            System.out.print("\nEnter The Marks Between 0 To 100:");
            System.out.print("\nEnter The Mark: ");
            marks = sc.nextInt();

            if (marks > 100) {
                System.out.print("\n INVALID MARKS ENTER BELOW 100 \n");
            } else {
                switch (marks / 10) {
                    case 10:
                    case 9:
                        System.out.print("\nYour Grade is: S");
                        break;
                    case 8:
                        System.out.println("\nyour grade is:A+");
                        break;
                    case 7:
                        System.out.print("\nYour Grade is:A");
                        break;
                    case 6:
                        System.out.print("\nYour Grade is:B+");
                        break;
                    case 5:
                        System.out.println("\nyour grade is:B");
                        break;
                    case 4:
                        System.out.print("\nYour Grade is:P");
                        break;
                    default:
                        System.out.print("\nYou Grade is: F");

                }
            }

    }
}
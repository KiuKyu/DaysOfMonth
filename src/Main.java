import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = userInput.nextInt();
    
        String notice;
        switch (month) {
            case 2:
                notice = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                notice = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                notice = "30";
                break;
            default:
                notice = "";
        }

        if (!notice.equals("")) System.out.printf("The month '%d' has %s days!", month, notice);
        else System.out.print("Invalid input!");
        }
    }

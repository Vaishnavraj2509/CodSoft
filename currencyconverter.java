import java.util.*;
public class currencyconverter  {

    public static void currencyconverter(int choice, double dollar){

    switch (choice) {
        case 1:System.out.println("EURO VALUE OF DOLLAR IS="+dollar*0.99);

        break;
        case 2:System.out.println("POUND STERLING OF DOLLAR IS="+dollar*0.86);

        break;
        case 3:System.out.println("AUSTRALIAN DOLLAR OF DOLLAR IS="+dollar*1.53);

        break;
        case 4:System.out.println("CANADIAN DOLLAR OF DOLLAR IS="+dollar*1.34);

        break;
        case 5:System.out.println("SWISS FRANC OF DOLLAR IS="+dollar*0.98);

        break;
        case 6:System.out.println("INDIAN RUPEES OF DOLLAR IS="+dollar*81.31);

        break;
        case 7:System.out.println("CHINESE YUAN OF DOLLAR IS="+dollar*7.24);

        break;

        default:System.out.println("ENTER VALID INPUT ");
            break;
    }
    }

    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("SELECT OPTION.........");
    System.out.println("1.DOLLAR TO EURO");
    System.out.println("2.DOLLAR TO POUND STERLING");
    System.out.println("3.DOLLAR TO AUSTRALIAN DOLLAR");
    System.out.println("4.DOLLAR TO CANADIAN DOLLAR");
    System.out.println("5.DOLLAR TO SWISS FRANC");
    System.out.println("6.DOLLAR TO INDIAN RUPEES");
    System.out.println("7.DOLLAR TO CHINESE YUAN");

    System.out.println("ENTER YOUR CHOICE=");
    int choice=sc.nextInt();

    System.out.println("ENTER YOUR DOLLAR VALUE=");
    double dollar=sc.nextDouble();


    currencyconverter(choice,dollar);
    System.out.println();
    }

}

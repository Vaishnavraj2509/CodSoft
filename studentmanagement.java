import java.util.*;

public class studentmanagement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("ENTER NAME OF STUDENT IN CAPITAL : ");
String name=sc.nextLine();

double[] marks=new double[7];
String[] subjects={"MATHS :", "SCIENCE :" , "HISTORY :" , "GEOGRAPHY :" , "MARATHI :" , "HINDI :"  ,"ENGLISH : "};

System.out.println("ENTER MARKS OF SUBJECTS : ");

for(int i=0;i<marks.length;i++){                                                     //WE USE THIS LOOP FOR NUMBERING SUBJECTS IN RIGHT ORDER
    System.out.print((i+1) + "." + subjects[i]);
     marks[i] = sc.nextDouble();

     if(marks[i]<0 || marks[i]>100){                                                 //IF INPUT GO ABOVE 100 MARKS THEN THE MESSAGE IN CURLEY BRACKETS WILL APPEAR
        System.out.println("ENTER MARKS BETWEEN 0 TO 100");
     }
    }

double sum = calculateSum(marks);
     double average = calculateAverage(sum, marks.length);

     System.out.println("\nSUM OF " + name + "'S MARKS IS: " + sum);
         System.out.println("AVERAGE MARKS OF " + name + " IS: " + average);

         String grade = determineGrade(average);
         System.out.println("GRADE OF " + name + " IS: " + grade);
}

         public static double calculateSum(double[] marks) {                                              //FUNCTION OF SUM IS CREATED...........
                   double sum = 0.0;
                     for (double mark : marks) {

                          sum += mark;
                     }
                     return sum;
                 }
                 public static double calculateAverage(double sum, int count) {                            //FUNCTION OF AVERAGE IS CREATED................
                             return sum / count;


                 }



                  public static String determineGrade(double Average) {                                 //FUNCTION FOR GRADE MARKS IS CREATED...................

                 if(Average>=90){
                       return "A+";
                        }
                       else if(Average>=80){
                        return "A";
                    }
                           else if(Average>=70){
                            return "B+";
                        }
                                else if(Average>=60){
                                    return "B+";
                                }
                            else{
                                return "STUDENT IS FAILED.....";

                            }
                        }
                    }
















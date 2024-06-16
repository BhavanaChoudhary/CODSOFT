import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("********************************\nWelcome to Student Grade Calculator\n********************************");
        System.out.println("Enter your Name");
        String sname=sc.nextLine();
        System.out.println("Enter your USN");
        String usn=sc.nextLine();
        System.out.println("Enter the number of subjects");
        int num_of_subjects= sc.nextInt();
        int arr_of_marks[]=new int[num_of_subjects];
        int total=0;
        for(int i=0;i<num_of_subjects;i++) {
            System.out.println("\nEnter the marks in subject: "+ (i+1));
            arr_of_marks[i]=sc.nextInt();
            total+=arr_of_marks[i];
        }
        double percentage=total/num_of_subjects;
        String grade;
        if(percentage>=95){
            System.out.println(grade="A+");
        }
        else if(percentage>=85){
            System.out.println(grade="A");
        }
        else if(percentage>=70){
            System.out.println(grade="B");
        }
        else if(percentage>=60){
            System.out.println(grade="C");
        }
        else if(percentage>=45){
            System.out.println(grade="D");
        }
        else {
            System.out.println(grade="F");
        }

        System.out.println("~~~ RESULT of "+ sname + " bearing USN " + usn + " ~~~" );
        System.out.println("TOTAL MARKS SCORED: " + total);
        System.out.println("TOTAL PERCENTAGE: " + percentage);
        System.out.println("GRADE: "+ grade);


    }
}
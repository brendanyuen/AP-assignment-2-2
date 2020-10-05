import java.util.Scanner;

class GradeBot {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double mark = 0;
        int grade=0;
        //get user input

        System.out.print("What was the test out of? ");
        total = sc.nextDouble();
        System.out.print("What was your test mark? ");
        mark = sc.nextDouble();

        //calculations
        grade = (int)((mark/total)*100);
        if(mark<0||total<0){
            System.out.println("Invalid answer given");
        }
        else if(grade<=100 && grade>=86){
            System.out.println("Your percent is " + grade + "%");
            System.out.println("Congratulations, you got an A");
        }
        else if(grade<86 && grade>=73){
            System.out.println("Your percent is " + grade + "%");
            System.out.println("Good Job, you got a B");
        }
        else if(grade<73 && grade>=67){
            System.out.println("Your percent is " + grade + "%");
            System.out.println("That's okay, you got a C+");
        }
        else if(grade<67 && grade>=60){
            System.out.println("Your percent is " + grade + "%");
            System.out.println("Poor, you got a C");
        }
        else if(grade<60 && grade>=50){
            System.out.println("Your percent is " + grade + "%");
            System.out.println("You passed but, you got a C-");
        }
        else if(grade<50 && grade>=0){
            System.out.println("Your percent is " + grade + "%");
            System.out.println("Oh no you failed, you got an F");
        }

        else{
            System.out.println("Invalid answer given");   
        }
    }

}

import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        System.out.println("Enter the password");
        Scanner sc = new Scanner(System.in);
        String password= sc.next();
        if(password.equals("password")){
         System.out.println("Correct, the secret is that I'm Bob");   
            
        }
        else{
            System.out.println("Incorrect");
        }
       
    }

}

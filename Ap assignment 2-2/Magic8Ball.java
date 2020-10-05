import java.util.Scanner;

class Magic8Ball {

    public static void main (String[] args) {
        int ans=0;
        System.out.println("Ask your question");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        ans=(int)(Math.random()*20)+1;
        
        
        
        if(ans==1){
         System.out.println("Yes");   
        }
        if(ans==2){
         System.out.println("No");   
        }
        if(ans==3){
         System.out.println("Ask again later");   
        }
        if(ans==4){
         System.out.println("Cannot predict now");   
        }
        if(ans==5){
         System.out.println("It is certain");   
        }
        if(ans==6){
         System.out.println("Don't count on it");   
        }
        if(ans==7){
         System.out.println("Most likely");   
        }
        if(ans==8){
         System.out.println("Definitely");   
        }
        if(ans==9){
         System.out.println("I doubt it");   
        }
        if(ans==10){
         System.out.println("At this time, I cannot tell");   
        }if(ans==11){
         System.out.println("My sources say no");   
        }if(ans==12){
         System.out.println("Could not hear you, try again later");   
        }
        if(ans==13){
         System.out.println("Ask someone else");   
        }
        if(ans==14){
         System.out.println("Probably");   
        }if(ans==15){
         System.out.println("Probably not");   
        }if(ans==16){
         System.out.println("I would say yes");   
        }if(ans==17){
         System.out.println("I would say no");   
        }if(ans==18){
         System.out.println("I don't know");   
        }
        if(ans==19){
         System.out.println("Better not tell you now");   
        }
        if(ans==20){
         System.out.println("No, never");   
        }
    }
    
    
    
}
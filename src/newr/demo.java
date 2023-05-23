
package newr;

import java.util.Scanner;
public class demo {
    
    




    static Scanner input=new Scanner(System.in);
    public static void main(String args[]){
       int m=menu();
       if (m==2){
          int z= Package();
          if(z==1){
            int y=  forYourSelf();
            if (y==1){
                int x=voicePackage();
                if(x==1){
                    int j=Daily();
                    if(j==1){
                        System.out.println("Dear Customer,12 Min Daily Package is sucessfully provided to you");
                    }
                    else if (j==2){
                         System.out.println("Dear Customer,20 Min Daily Package is sucessfully provided to you");
                        
                    }
                    else if(j==3){
                         System.out.println("Dear Customer,45 Min Daily Package is sucessfully provided to you");
                    }
                    else {
                        System.out.println("wrong input");
                    }
                }
                
            }
          }
       }
        
    }
    public static int menu(){
         System.out.println("***********************************************");
        System.out.println("        Welcome to ethio gebeta      ");
        System.out.println("        1. Gena Holiday Package      ");
        System.out.println("        2. Packages                  ");
        System.out.println("        3. One Birr Package          ");
        System.out.println("        4. Additional Services       ");
        System.out.println("        5. Language change           ");
        System.out.println("        6. My Service                \n");
        System.out.print("Enter your choose:");
        int a=input.nextInt();
        System.out.print("\n");
       
       return a;
       
    }
    public static int Package(){
        System.out.println("Package");
        System.out.println("1.For Yourself");
        System.out.println("2.For gift");
        System.out.println("*.Back\n");
        System.out.print("Enter your choose:");
        int b=input.nextInt();
        System.out.print("\n");
        
    return b;}
    public static int forYourSelf(){
        System.out.println("For Yourself");
        System.out.println("1.voice Package");
        System.out.println("2.internet Package");
        System.out.println("3.Voice Plus Data");
        System.out.println("4.Flexi Package");
        System.out.println("5.Unlimited Premium Package");
        System.out.println("6.Unlimited Daily voice Package");
        System.out.println("#.Next page*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int c=input.nextInt();
        System.out.print("\n");
        return c;
         }
    public static int voicePackage(){
        System.out.println("Voice Package");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("4.Night");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int d=input.nextInt();
        System.out.print("\n");
        return d;
    }
    public static int Daily(){
        System.out.println("Daily");
        System.out.println("1.Birr 3 for 12 Min");
        System.out.println("2.Birr 5 for 20 Min");
        System.out.println("3.Birr 10 for 45 Min");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int e=input.nextInt();
        System.out.print("\n");
        return e;
    }
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


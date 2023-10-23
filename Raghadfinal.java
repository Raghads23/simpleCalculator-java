package com.mycompany.raghadfinal;
import java.util.Scanner;
import java.util.Locale;
/**                                                 
 *                                                 
 * @author USER                                    
 */                                                 
public class Raghadfinal {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in).useLocale(Locale.US);
    
    int choose;
    double first,second;
    boolean stop;
    
        do{
        System.out.println("enter the number of the operation:");
        System.out.println("1-<+>");
        System.out.println("2-<->");
        System.out.println("3-<x>");
        System.out.println("4-</>");
           choose=input.nextInt();
           
        switch (choose) {
            case 1:
                System.out.println("enter the first number:");
                first=input.nextDouble();
                System.out.println("enter the second number:");
                second=input.nextDouble();
                System.out.println("="+add(first,second));                     // call method add
                stop=false;
                break;
            case 2:
                System.out.println("enter the first number:");
                first=input.nextDouble();
                System.out.println("enter the second number:");
                second=input.nextDouble();
                System.out.println("="+sub(first,second));                     // call method sub
                stop=false;
                break;
            case 3:
                System.out.println("enter the first number:");
                first=input.nextDouble();
                System.out.println("enter the second number:");
                second=input.nextDouble();
                System.out.println("="+mul(first,second));                     // call method mul
                stop=false;
                break;
            case 4:
                System.out.println("enter the first number:");
                first=input.nextDouble();
                System.out.println("enter the second number(0 is not allowed):");
                second=input.nextDouble();
                    if (second==0)  {                                            // if he entered  0 
                        System.out.println("wrong\ntry again");            
                        second=input.nextDouble();
                    }System.out.println("="+div(first,second));                     // call method div
               stop=false;
                break;
            default:
                System.out.println("it's a wrong operation\ntry again");
                stop=true;
                break;
        }
       
    }while(stop);

    }
                    public static double add(double a,double b){
                       double result;
                       result=a+b;
                        return result;
                    }
                    
                    public static double sub(double a,double b){
                       double result;
                       result=a-b;
                        return result;
                    }
                    public static double mul(double a,double b){
                       double result;
                       result=a*b;
                        return result;
                    }
                    public static double div(double a,double b){
                       double result;
                       result=a/b;
                        return result;
                    }
}

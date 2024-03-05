
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Utility {

    public Utility() {
    }
    
    public int InputInt(String messeage , String error, int min , int max){
   Scanner scanner = new Scanner(System.in);
       while (true) {           
           try {
               System.out.print(messeage);
               String input = scanner.nextLine();
               int inputNumber = Integer.parseInt(input);
               if(inputNumber>=min && inputNumber<=max)
               {
                   return inputNumber;
               }else{
               System.out.print("pls, enter the number less than max and more than min :");
               }
           } catch (Exception e) {
               System.out.print(error);
           }
       }
       
   }
       public double Inputdopuble(String messeage , String error, double min , double max){
   Scanner scanner = new Scanner(System.in);
       while (true) {           
           try {
               System.out.print(messeage);
               String input = scanner.nextLine();
               double inputNumber = Double.parseDouble(input);
               if(inputNumber>=min && inputNumber<=max)
               {
                   return inputNumber;
               }else{
               System.out.print("pls, enter the number less than max and more than min :");
               }
           } catch (Exception e) {
               System.out.print(error);
           }
       }
       
   }
        public double InputDiff0(String messeage , String error, double min , double max){
   Scanner scanner = new Scanner(System.in);
       while (true) {           
           try {
               System.out.print(messeage);
               String input = scanner.nextLine();
                             double inputNumber = Double.parseDouble(input);
               if(inputNumber>=min && inputNumber<=max&&inputNumber!=0)
               {
                   return inputNumber;
               }else{
               System.out.print("pls, enter the number illgal :");
               }
           } catch (Exception e) {
               System.out.print(error);
           }
       }
       
   }
}

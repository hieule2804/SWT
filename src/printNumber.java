
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class printNumber {

    public printNumber() {
    }
    
    public void printOdd(String string,List listOdd)
    {
      
       
                 System.out.print(string);

        if (listOdd.size() == 0) {
            System.out.print("Don't have number");
        } else {
           
            for (int i = 0; i < listOdd.size()-1; i++) {
                Object get = listOdd.get(i);
                System.out.print(get +", ");
            }
            System.out.print(listOdd.get(listOdd.size()-1));
        }
    }
}

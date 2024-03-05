/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManegeCal maneger = new ManegeCal();
        Utility utility = new Utility();
        while (true) {            
            maneger.menu();
            int choose = utility.InputInt("Enter Your choose:", "must be integer", 1, 3);
            switch(choose)
            {
                    case 1:
                        maneger.superLaTive();
                        break;
                    case 2:
                        maneger.Quadratic();
                        break;
                    case 3:
                        return;
            }
        }
    }
    
}

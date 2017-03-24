/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hurricane;
import java.util.Scanner;
import java.util.Random;
//import java.util.*

/**
 *
 * @author WeSon8840
 */
public class Hurricane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int category,randomNumber;
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        /* Obtain hurrican category */
        System.out.print("Enter the hurricane category: ");
        category = input.nextInt();
        randomNumber = r.nextInt(10)+1;
        input.close();
        
        switch(category){
            case 1: System.out.println("Category 1: " 
                    + "74-95 mph or 64-82 kt or 119-153 km/hr");break;
            case 2: System.out.println("Category 2: "
                    + "96-110 mph or 83-95 kt or 154-177 km/hr");break;
            case 3: System.out.println("Category 3: "
                    + "111-130 mph or 96-113 kt o 178-209 km/hr");break;
            case 4: System.out.println("Category 4: "
                    + "131-155 mph r 96-113 kt or 178-249 km/hr");break;
            case 5: System.out.println("Category 5: "
                    + "greater than 155 mph or 135 kt or 249 km/hr");break;
        }
        System.out.println(randomNumber);
    }
    
}

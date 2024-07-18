/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing_game;
import java.util.*;
public class Guessing_Game {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tWELCOME TO GUESSING GAME\n");
        Random r=new Random();
        boolean num=true;
        while(num){
            int random = r.nextInt(100);
            //System.out.println(random);
            System.out.print("\nENTER THE GUESSING NUMBER:");
            int guess=sc.nextInt();
            if(guess==random){
                System.out.println("\n\t\tCONGRATULATIONS YOUR GUESS IS CORRECT");
                break;
            }
            else if(random+9<guess)
                System.out.println("\tYOUR GUESS IS TOO HIGH");
            else if(random<guess)
                System.out.println("\tYOUR GUESS IS HIGH");
            else if(random-9>guess)
                System.out.println("\tYOUR GUESS IS TOO LOW");
            else if(random>guess)
                System.out.println("\tYOUR GUESS IS LOW");
        }
    }
    
}

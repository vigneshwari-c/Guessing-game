/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temparature_converter;

import java.util.*;
public class Temparature_Converter {
    public static void main(String[] args) {
     float cel=0.0f;
     float fah=0.0f;
     float kel=0.0f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of:\n1.Fahrenheit(F)\n2.Celsius(C)\n3.Kelvin(K)");
        String unit=sc.nextLine();
        if(unit.equals("F")||unit.equals("f")||unit.equals("1")){
         System.out.print("Enter the value of Fahrenheit:");
         fah=sc.nextFloat();
         cel=((fah-32)*5)/9;
         System.out.printf("Celsius Value:%.2fC\n",cel);
         kel=(float) ((((fah-32)*5)/9)+273.15);
         System.out.printf("Kelvin Value:%.2fK\n",kel);
        }
        else if(unit.equals("C")||unit.equals("c")||unit.equals("2")){
         System.out.print("Enter the value of Celsius:");
         cel=sc.nextFloat();
         fah=((cel*9)/5)+32;
         System.out.printf("Fahrenheit Value:%.2fF\n",fah);
         kel=(float)(cel+273.15);
         System.out.printf("Kelvin Value:%.2fK\n",kel);
        }

        else if(unit.equals("K")||unit.equals("k")||unit.equals("3")){
         System.out.print("Enter the value of Kelvin:");
         kel=sc.nextFloat();
         fah=(float)((((kel-273.15)*9)/5)+32);
         System.out.printf("Fahrenheit Value:%.2fF\n",fah);
         cel=(float)(kel-273.15);
         System.out.printf("Celsius Value:%.2fC\n",cel);
        }
    }
    
}

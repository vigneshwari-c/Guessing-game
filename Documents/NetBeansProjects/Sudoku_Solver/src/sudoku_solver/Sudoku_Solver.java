/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku_solver;
import java.util.*;
public class Sudoku_Solver {
  static Scanner sc=new Scanner(System.in);
  static int n,c;
  static int input,row,col;
  static public void display(int arr[][]){
      int k=0;
      System.out.println();
      while(k<n){
            System.out.print("---");
            k++;
            }
      System.out.print("-\n");
      for(int i=0;i<n;i++){
           k=0;
            for(int j=0;j<n;j++){
                System.out.print("| "+arr[i][j]);
            }
            System.out.print("|\n");
            while(k<n){
            System.out.print("---");
            k++;
            }
            System.out.print("-");
           System.out.println();
        }
      System.out.println();
  }
    public static void main(String[] args) {
        
        System.out.println("\n\t\t\tWELCOME TO SUDOKU GAME\n");
        System.out.print("ENTER THE CROSS:");
        n=sc.nextInt();
        System.out.println();
        System.out.println("\t"+n+" x "+n+" SUDOKU");
        int arr[][]=new int[n][n];
        display(arr);
        int flag=0;
      while(c<(n*n)){
      System.out.print("ENTER THE ROW:");
      row=sc.nextInt();
      System.out.print("ENTER THE COLUMN:");
      col=sc.nextInt();
      System.out.print("ENTER THE INPUT VALUE FROM (1 TO "+n+"):");
      input=sc.nextInt();
      
      if(arr[row][col]!=0){
          --c;
      }
      arr[row][col]=input;
 //ROW CHECK
          for(int j=0;j<n;j++){
              if((arr[row][j]==input && arr[row][j]!=0)&& j!=col){
                  arr[row][col]=0;
                  --c;
              }
      }
          //COLUMN CHECK
           for(int j=0;j<n;j++){
              if((arr[j][col]==input && arr[j][col]!=0)&& j!=row){
                  arr[row][col]=0;
                  --c;
              }
      } 
       c++;   
      display(arr);
      }
      System.out.println("\t\t\tPUZZLE SOLVED");
      System.out.println("\n\tCONGRATULATIONS,THIS IS THE CORRECT SOLUTION!");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact_management_system1;
import java.util.*;
public class Contact_Management_System1 {
    private String name="";
    private String phone_num="";
    static ArrayList<String> namee=new ArrayList();
    static ArrayList<String> no=new ArrayList();
    static Scanner sc=new Scanner(System.in);
    public void createContact(){
        sc.nextLine();
        System.out.print("\nNAME:");
        name=sc.nextLine();
        namee.add(name);
        System.out.print("\nMOBILE NUMBER:");
        phone_num=sc.nextLine();
        no.add(phone_num);
        int f1=0,f2=0;
        for(int i=0;i<namee.size()-1;i++){
            if(name.equals(namee.get(i))){
                System.out.println("\n\tName is already exist");f1=1;
                break;
            }
            if(phone_num.equals(no.get(i))){
                System.out.println("\n\tMobile number is already exist");f2=1;
                break;
            }
        }
        if(f1!=1 && f2!=1 && phone_num.length()!=0 && name.length()!=0)
            System.out.println("\n\tNEW CONTACT HAS BEEN CREATED");
    }
   public void search_contact(String search){
       int f=0;
       for(int i=0;i<namee.size();i++){
           if(search.equals(namee.get(i))){
            System.out.println("\n\tYOUR SEARCH IS FOUND\n");
            System.out.println(search+"\t"+no.get(i));
            f=1;
            break;
           }
       }
       if(f!=1)
         System.out.println("\n\tYOUR SEARCH IS NOT FOUND");  
   }
   public void show(){
       sc.nextLine();
       if(no.size()<1)
           System.out.println("\n\tCONTACT IS EMPTY");
       for(int i=0;i<no.size();i++)
           System.out.println("\nNAME:"+namee.get(i)+"\nMOBILE NUMBER:"+no.get(i));
   }
   public void delete(String del){
       int f=0;
       for(int i=0;i<namee.size();i++)
       {
           if(del.equals(namee.get(i))){
               namee.remove(i);
               no.remove(i);
               System.out.println("\n\tSUCCESSFULLY DELETED");
               f=1;
               break;
           }
       }
       if(f!=1)
           System.out.println("\n\tTHIS CONTACT IS NOT PRESENT");
   }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\t\tCONTACT MANAGEMENT SYSTEM");
        //System.out.println("\n1.CREATE CONTACT\n2.SEARCH CONTACT\n3.SHOW ALL CONTACT\n4.DELETE CONTACT\n5.EXIT");
        Contact_Management_System1 obj=new Contact_Management_System1();
        String repeat="";
        do{
             System.out.println("\n1.CREATE CONTACT\n2.SEARCH CONTACT\n3.SHOW ALL CONTACT\n4.DELETE CONTACT\n5.EXIT");
        System.out.print("\nENTER YOUR OPTION:");
        int option=sc.nextInt();
        if(option==1){
        obj.createContact();
        }
        else if(option==2){
            sc.nextLine();
        System.out.print("\nENTER THE SEARCH NAME:");
        String search=sc.nextLine();
        obj.search_contact(search);    
        }
        else if(option==3){
            obj.show();
        }
        else if(option==4){
            sc.nextLine();
            System.out.print("\nENTER THE DELETING NAME:");
            String del=sc.nextLine();
            obj.delete(del);
        }
        else 
            System.exit(0);
        System.out.print("\nDO YOU WANT TO CONTINUE:");
        repeat=sc.nextLine();
        sc.nextLine();
        }while(repeat.equals("y")|| repeat.equals("Y") || repeat.equals("yes"));
    }  
}

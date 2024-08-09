/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author PROJET NDAGANO
 */
package bd.coursework;
import java.util.Scanner;

public class balex_company1 {
public static void main(String[] args){
    
    int hoursworked;
    double basepay;
    String name;
    int employeenum=1;
    Scanner n= new Scanner(System.in);
    String answer;
    
    do{
        name="employee"+employeenum;
        System.out.println(name);
        System.out.println(" Enter the basepay: ");
        basepay=n.nextDouble();
        System.out.println("$"+ basepay);
        System.out.println();
        System.out.println(" Enter the hoursworked: ");
        hoursworked=n.nextInt();
        
        if(hoursworked<=40){
            System.out.println(" The pay is:"+ (basepay*hoursworked)+"$");
            }
        else if(hoursworked<=59)
        {System.out.println(" The total pay is:" +basepay*1.5+"$");}
        else if(hoursworked>60)
        {System.out.println("error message");}
         if(basepay<8)
        {System.out.println("message error");}
        else
            System.out.println();
       
        
        System.out.println("do you want to calculate for another employee?");
    System.out.println("enter yes or no");
    answer=n.next();
    employeenum++;
    }
    while(answer.equalsIgnoreCase("yes"));
       n.close();
    
}}
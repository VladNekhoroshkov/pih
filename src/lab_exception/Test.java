/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exception;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Test {
    
    
    public static void main(String[] args) {

       
                Scanner in = new Scanner(System.in); 
                String sruki;
                String[] Stroka;
                Shket[] spisok_shketov;
                spisok_shketov = new Shket[2];

                
                spisok_shketov[0] = new Shket("Joshua", 21); //создаем школьника
                //вбиваем данные о предмете студенту
                spisok_shketov[0].addRating("eng", 5); 
                spisok_shketov[0].addRating("math", 5);
                spisok_shketov[0].addRating("rus", 5); 
                spisok_shketov[0].addRating("history", 5);
                spisok_shketov[0].addRating("chemistry", 4);
                spisok_shketov[0].addOlympiadRating("school", 3); 
                spisok_shketov[0].addOlympiadRating("region", 6); 
                
                System.out.println(spisok_shketov[0].getName());
                System.out.println(spisok_shketov[0].getAge());
                System.out.println(spisok_shketov[0].getRating());
    
                System.out.println(spisok_shketov[0].SpecialGrant());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exception;
import java.util.Scanner;

/**
 *
 * @author nekhoroshkov
 */
public class Proverki {
    
    //    Прверка на имя, проверяет, большая ли первая буква. на цифры проверки нет
    static void isAnyUpperCase(String s) {
    String s2 = s.toUpperCase();
    if(s.charAt(0)==s2.charAt(0)){
    }        
    else{
        System.out.println("Ошибка ввода имени, пожалуйста повторите попытку");
        System.exit(0);
        }
    }
//    тут просто проверяет, чтобы возраст было в рамках [6,99]
    static void isVozrast(String v) {
            int v1 = Integer.parseInt(v);
            if (v1 >= 6 && v1 <=99){
//                System.out.println(v1);        
            }
            else {
                System.out.println("Ошибка ввода возраста, пожалуйста повторите попытку");
                System.exit(0);
            }        
        }
    
//    тут просто проверяем кол-во предметов
    static void isPredmet(String p) {
            int p1 = Integer.parseInt(p);
            if (p1 >0 && p1 <=20){
//                System.out.println(p1);        
            }
            else {
                System.out.println("Ошибка ввода кол-ва предметов, пожалуйста повторите попытку");
                System.exit(0);
            }        
        }
//    тут проверяем кол-во олимпиад
    static void isOlimp(String p) {
            int p1 = Integer.parseInt(p);
            if (p1 >0 && p1 <=99){
//                System.out.println(p1);        
            }
            else {
                System.out.println("Ошибка ввода кол-ва олимпиад, пожалуйста повторите попытку");
                System.exit(0);
            }        
        }
    
    static void isOlimpLevel(String l) {
            String l1 = l;
            if ("School".equals(l1) || "school".equals(l1) || "city".equals(l1) || "City".equals(l1) || "region".equals(l1) || "Region".equals(l1)){
            }
            else {
                System.out.println("Ошибка ввода Уровня олимпиады, пожалуйста повторите попытку");
                System.exit(0);
            }        
        }
    
    static void isOlimpPlase(String p) {
            int p1 = Integer.parseInt(p);
            if (p1 >0 && p1 <=100){
//                System.out.println(p1);        
            }
            else {
                System.out.println("Ошибка ввода места занятого на олимпиаде, пожалуйста повторите попытку");
                System.exit(0);
            }        
        }
    
//    static void isVvodDannih(String l) {
//        String l1 = l;
//        if (l1.length != 4){
//        }
//        else {
//            System.out.println("Ошибка ввода Уровня олимпиады, пожалуйста повторите попытку");
//            System.exit(0);
//        }        
//    }
    
//    проверка- подали на ввод число или нет, да надо было в одном методе, но соре, говнокод.
    static void isDigit(String d) throws NumberFormatException {
    try {
        Integer.parseInt(d);
//        return true;
    } catch (NumberFormatException e) {
        System.out.println("Ошибка ввода числового параметра, пожалуйста повторите попытку");
//        return false;
        System.exit(0);
    }
}    
// не уверен что он работает    
//    static void isStroka(String s) throws StringFormatException {
//    try {
//        String.parseString(s);
////        JOptionPane.showInputDialog(s);
////        return true;
//        } 
//    catch (StringFormatException e) {
//        System.out.println("Ошибка ввода строкового параметра, пожалуйста повторите попытку");
////        return false;
//        System.exit(0);
//        }      
//    }
    
   static void isOcenka(String o) {
            int o1 = Integer.parseInt(o);
            if (o1==2 || o1==3 || o1==4 || o1==5){
//                System.out.println(p1);        
            }
            else {
                System.out.println("Ошибка ввода оценки за предмет, пожалуйста повторите попытку");
                System.exit(0);
            }        
        }
}
    
    
        
        
//        String nameN = Character.toString(name.charAt(0));
//        System.out.println(nameN);
//        System.out.println(nameN.matches("[A-Z]+"));
//        return nameN.matches("[A-Z]+");
//        }
//    
//    
//}

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
public class Lab_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);       
        int num_of_students;
        int num_of_subjects=0;
        int num_of_olimpiad=0;
        
        String sruki;
        String[] Stroka;
//        String[] StrokaT;
        Shket[] spisok_shketov;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Укажите количество вводимых студентов");
        
//        не доделанная проверка на ввод числа- кол-ва студентов.
//        if (!sc.hasNextInt()) { 
//            System.out.println("Ошибка ввода данных, пожалуйста повторите попытку");
//            System.exit(0);
//        }
//        in.nextLine();//для корректной работы

        num_of_students = in.nextInt();
        in.nextLine();//для корректной работы
        spisok_shketov = new Shket[num_of_students]; //выделяем место под всех студентов
        
        System.out.println();
        //ввод данных о всех студентах
        for(int i=0;i<num_of_students;i++){
            System.out.println();
            System.out.println("Укажите имя, возраст, количество предметов, количество олимпиад у "+ i +" студента, через пробелы");
            //получение с руки всего, что вбито до ентера
            sruki = in.nextLine();
            //in Stroka: 0 - name, 1 - age, 2 - количество предметов
            Stroka = sruki.split(" ");
            
            if (Stroka.length == 4){
//                System.out.println(p1);        
            }
            else {
                System.out.println("Ошибка ввода данных, пожалуйста повторите попытку");
                System.exit(0);
            }   
            
            //здесь БУДУТ проверки на вводимые данные методами класса Proverki.java
//            System.out.println(Stroka.length);
            Proverki.isAnyUpperCase(Stroka[0]);
            Proverki.isDigit(Stroka[1]); //соре, но только говнокод
            Proverki.isDigit(Stroka[2]);
            Proverki.isDigit(Stroka[3]);
            Proverki.isVozrast(Stroka[1]);
            Proverki.isPredmet(Stroka[2]);
            Proverki.isPredmet(Stroka[3]);

            num_of_subjects=Integer.parseInt(Stroka[2]); //интуем количество предметов
            num_of_olimpiad=Integer.parseInt(Stroka[3]);
            spisok_shketov[i] = new Shket(Stroka[0], Integer.parseInt(Stroka[1])); //создаем школьника
            
            
            

            
            //вбиваем инфу о всех предметах
            for(int j=0;j<num_of_subjects;j++){
                System.out.println("Введите название и оценку за " +j+ " предмет, через пробел");
                sruki = in.nextLine();
                Stroka = sruki.split(" ");
                
                if (Stroka.length == 2){
//                System.out.println(p1);        
                }
                else {
                    System.out.println("Ошибка ввода данных по предмету, пожалуйста повторите попытку");
                    System.exit(0);
                }
                 //здесь БУДУТ проверки на вводимые данные методами класса Proverki.java
//                Proverki.isStroka(Stroka1[0]);
//                Proverki.isAnyUpperCase(Stroka1[0]);
                Proverki.isOcenka(Stroka[1]);
                 
                
                //вбиваем данные о предмете студенту
                spisok_shketov[i].addRating(Stroka[0].toLowerCase(), Integer.parseInt(Stroka[1]));
            }
            //вбиваем инфу обо всех олимпиадах и занятых местах
            for(int j=0;j<num_of_olimpiad;j++){
                System.out.println("Введите уровень олимпиады (school, city, region) и занятое место за " +j+ " олимпиаду, через пробел");
                sruki = in.nextLine();
                Stroka = sruki.split(" ");
                
                if (Stroka.length == 2){
//                System.out.println(p1);        
                }
                else {
                    System.out.println("Ошибка ввода данных по олимпиаде, пожалуйста повторите попытку");
                    System.exit(0);
                }
                 //здесь БУДУТ проверки на вводимые данные методами класса Proverki.java
                Proverki.isOlimpLevel(Stroka[0]);
                Proverki.isOlimpPlase(Stroka[1]);
                 
                 
                //вбиваем данные об олимпиаде студенту
                spisok_shketov[i].addOlympiadRating(Stroka[0].toLowerCase(), Integer.parseInt(Stroka[1]));
            }            
        }//ввод данных о студентах завершен
        System.out.println(spisok_shketov.length);
        String a = spisok_shketov[0].getName();
        String b = spisok_shketov[1].getName();
        if (a.equals(b)){
            System.out.println(spisok_shketov[2].getName());
        }
        else{
            System.out.println(spisok_shketov[0].getName());
            System.out.println(spisok_shketov[1].getName());
        }
        
        System.out.println(spisok_shketov[0].getName() + spisok_shketov[0].getAge());
        System.out.println(spisok_shketov[1].getName());
        System.out.println(spisok_shketov[2].getName());
        
        System.out.println();
        System.out.println("-----Расчет специальных стипендий-----");
//        проверка на специальную стипендию для каждого студента
        for(int i=0;i<num_of_students;i++){
            System.out.println("Студент "+spisok_shketov[i].getName()+": "+ spisok_shketov[i].SpecialGrant());
        }
        



        //tests
        System.out.println();
        System.out.println();
        System.out.println("TESTS");
        System.out.println(spisok_shketov[0].getName());
        System.out.println(spisok_shketov[0].getAge());
        System.out.println(spisok_shketov[0].getRating());
        System.out.println(spisok_shketov[0].getOlympiadRating());
        //System.out.println(spisok_shketov[0].SpecialGrant());
        
    }
    
}

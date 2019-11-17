/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exception;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author nekhoroshkov
 */
public class Shket {
    
    private String name;
    private int age;
    private HashMap<String, Integer> rating = new HashMap<String, Integer>();
    private HashMap<String, Integer> olympiad_rating = new HashMap<String, Integer>();
    //private HashMap<String, Integer> rating = new HashMap<String, Integer>();
    //private int[] rating;
    
    //конструктор по умолчанию
    public Shket(){
        name="";
        age=0;
        //rating = null;
    }
    
    //конструктор с параметрами
    public Shket(String n, int a){
        this.name = n;
        this.age = a;
        rating.put("eng",-1);
        rating.put("rus",-1);
        rating.put("math",-1);
        rating.put("history",-1);
//        olympiad_rating.put("school",-1);
//        olympiad_rating.put("city",-1);
//        olympiad_rating.put("region",-1);
        //обнуляем оценки/призовые места по ключевым предметам/олимпиадам
    }
    
    public void setName(String nm){
        this.name=nm;
    }
    public void setAge(int ag){
        this.age=ag;
    }
    //вбивает в рейтинг студенту новую связку предмет/оценка
    public void addRating(String subject, int score){
        if(this.rating.containsKey(subject)){
            this.rating.remove(subject);
        }
        this.rating.put(subject, score);
    }
    //вбивает в рейтинг студенту новую связку олимпиада/место
    public void addOlympiadRating(String subject, int place){
        if(this.olympiad_rating.containsKey(subject)){
            if(this.olympiad_rating.get(subject)>place){
                this.olympiad_rating.remove(subject);
                this.olympiad_rating.put(subject, place);
                //если новое место лучше прошлого, то перезаписать рекорд
            }       
        }else{this.olympiad_rating.put(subject, place);}      
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getRating(){
        return this.rating.toString();
    }
    public String getOlympiadRating(){
        return this.olympiad_rating.toString();
    }
    //полуучение сырого словаря успеваемости, для тестов
    public HashMap<String, Integer> getRawRating(){
        return this.rating;
        //пример просмотра оценки за Eng: Rating().get("Eng"));
    }
    
    //определение, получит ли студент специальную стипендию
    public boolean SpecialGrant(){
        int mainSum=rating.get("eng")+rating.get("rus")+rating.get("math")+rating.get("history");
        int count =0;//счетчик оценок выше 4
        
        //подсчитываем количество оценок, которые >=4. Если их столько же, сколько и предметов в словаре, то все четко
        for (int value : rating.values()) {
                if(value>=4){
                    count+=1;
                }
            }
        
        //если есть четыре основные пятерки и все оценки не ниже четырех, то проверяй олимпиады
        if(mainSum==20 & count==rating.size()){
            if(olympiad_rating.containsKey("region")){return true;}//участие в областной
            if(olympiad_rating.containsKey("city")){
                if(olympiad_rating.get("city")<=3){return true;}//призовое место в городской
            }
            if(olympiad_rating.containsKey("school")){
                if(olympiad_rating.get("school")==1){return true;}//первое место в школьной
            }
            return false;
        }else{return false;}
    }
    
}

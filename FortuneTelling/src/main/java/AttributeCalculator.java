/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */

import java.util.*;
import java.util.HashMap;
public class AttributeCalculator {
    /*
    我剋為財
    剋我為官
    生我為印
    我生為食
    同我為比
    */
public static HashMap<String, String> lifeCycle(){
    HashMap<String, String> life_cycle = new HashMap<String, String>();
    life_cycle.put("木", "火");
    life_cycle.put("火", "土");
    life_cycle.put("土", "金");
    life_cycle.put("金", "水");
    life_cycle.put("水", "木");
    
    return life_cycle;
}
public static HashMap<String, String> deCycle(){
    HashMap<String, String> de_cycle = new HashMap<String, String>();
    de_cycle.put("水", "火");
    de_cycle.put("火", "金");
    de_cycle.put("金", "木");
    de_cycle.put("木", "土");
    de_cycle.put("土", "水");
    
    return de_cycle;
}
public static ArrayList<String> attList(Attribute attribute){
    ArrayList<String> att_list = new ArrayList<String>();
    att_list.add(attribute.get_sky_att());
    att_list.add(attribute.get_ground_att());
    att_list.add(attribute.get_out_att());
    att_list.add(attribute.get_total_att());
    return att_list;
}
//財官印
public static Set<String> standard_form(){
    Set<String> standard = new HashSet<String>(); 
    standard.add("財");
    standard.add("官");
    standard.add("印");
    standard.add("食");
    standard.add("比");
    return standard;
}
public static Set<String> nature_fortune(Attribute attribute){
    String key = attribute.get_people_att();
    Set<String> nature = new HashSet<String>();
    ArrayList<String> att_list = attList(attribute);
    for(String att : att_list){
    //財
    if(att == deCycle().get(key)){
        nature.add("財");
    }
    //官
    if(key == deCycle().get(att)){
        nature.add("官");
    }
    //印
    if(key == lifeCycle().get(att)){
        nature.add("印");
    }
    //食
    if(att == lifeCycle().get(key)){
        nature.add("食");
    }
    //比
    if(att == key){
        nature.add("比");
    }
    }
    return nature;
}
public static Set<String> abs_fortune(Set<String> nature){
    Set<String> absent = standard_form();
    absent.removeAll(nature);
    return absent;
}
//來電
public static HashMap<String, String> lover_match(Attribute name1, Attribute name2){
    HashMap<String, String> matching = new HashMap<String, String>();
    //甲對乙
    if(lifeCycle().get(name1.get_sky_att()) == name2.get_people_att() && lifeCycle().get(name1.get_people_att()) == name2.get_ground_att()){
        matching.put("甲對乙", "雙生關係");
    }else if(deCycle().get(name1.get_sky_att()) == name2.get_people_att() && deCycle().get(name1.get_people_att()) == name2.get_ground_att()){
        matching.put("甲對乙", "雙剋關係");
    }
    //乙對甲
     if(lifeCycle().get(name2.get_sky_att()) == name1.get_people_att() && lifeCycle().get(name2.get_people_att()) == name1.get_ground_att()){
        matching.put("乙對甲", "雙生關係");
    }else if(deCycle().get(name2.get_sky_att()) == name1.get_people_att() && deCycle().get(name2.get_people_att()) == name1.get_ground_att()){
        matching.put("乙對甲", "雙剋關係");
    }
    if(matching.isEmpty()){
    matching.put("甲跟乙", "沒戲笑尼~=)");
    }
    return matching;
}
//貴小人
public  static HashMap<String, String> noble_person(NameSeeker name1,NameSeeker name2){
    //直接貴小人 && 間接貴小人
    HashMap<String, String> connection = new HashMap<String, String>();
    int name1_people_num = (name1.getPeopleBlock()/10) + (name1.getPeopleBlock()%10);
    int name1_ground_num = (name1.getGroundBlock()/10) + (name1.getGroundBlock()%10);
    int name1_total_num = (name1.getTotalBlock()/10) + (name1.getTotalBlock()%10);
    int name2_people_num = (name2.getPeopleBlock()/10) + (name2.getPeopleBlock()%10);
    int name2_ground_num = (name2.getGroundBlock()/10) + (name2.getGroundBlock()%10);
    int name2_total_num = (name2.getTotalBlock()/10) + (name2.getTotalBlock()%10);
    //直接貴人
    if(name1.getPeopleBlock() == name2.getGroundBlock()){
        connection.put("甲對乙來說(人對地)", "直接貴人");
    }
    if(name1.getGroundBlock() == name2.getTotalBlock()){
        connection.put("甲對乙來說(地對總)", "直接貴人");
    }
    if(name2.getPeopleBlock() == name1.getGroundBlock()){
        connection.put("乙對甲來說(人對地)", "直接貴人");
    }
    if(name2.getGroundBlock() == name1.getTotalBlock()){
        connection.put("乙對甲來說(地對總)", "直接貴人");
    }
    //間接貴人
    if(name1_people_num == name2_ground_num){
        connection.put("甲對乙來說(人對地)", "間接貴人");
    }
    if(name1_ground_num == name2_total_num){
        connection.put("甲對乙來說(地對總)", "間接貴人");
    }
    if(name2_people_num == name1_ground_num){
        connection.put("乙對甲來說(人對地)", "間接貴人");
    }
    if(name2_ground_num == name1_total_num){
        connection.put("乙對甲來說(地對總)", "間接貴人");
    }
    if(connection.isEmpty()){
        connection.put("甲跟乙", "沒搞頭");
    }
    return connection;
}


}

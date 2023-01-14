/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.HashMap;
/**
 *
 * @author USER
 */
public class HeavenlyStems {
    private String sky_stem;
    private String people_stem;
    private String ground_stem;
    private String out_stem;
    private String total_stem;
    
    public HeavenlyStems(NameSeeker name){
    HashMap<Integer, String> heavenly_map = create_map();
    int sky_key = name.getSkyBlock()%10;
    int people_key = name.getPeopleBlock()%10;
    int ground_key = name.getGroundBlock()%10;
    int out_key = name.getOutBlock()%10;
    int total_key = name.getTotalBlock()%10;
    String sky_val = heavenly_map.get(sky_key);
    String people_val = heavenly_map.get(people_key);
    String ground_val = heavenly_map.get(ground_key);
    String out_val = heavenly_map.get(out_key);
    String total_val = heavenly_map.get(total_key);     
    this.sky_stem = sky_val;
    this.people_stem = people_val;
    this.ground_stem = ground_val;
    this.out_stem =out_val;
    this.total_stem = total_val;
    }
   public HashMap<Integer, String> create_map(){
    HashMap<Integer, String> heavenly_map = new HashMap<Integer, String>();
    heavenly_map.put(1, "甲");
    heavenly_map.put(2, "乙");
    heavenly_map.put(3, "丙");
    heavenly_map.put(4, "丁");
    heavenly_map.put(5, "戊");
    heavenly_map.put(6, "己");
    heavenly_map.put(7, "庚");
    heavenly_map.put(8, "辛");
    heavenly_map.put(9, "壬");
    heavenly_map.put(0, "癸");
    return heavenly_map;
    }
   
public String get_sky_stem(){
    return sky_stem;
}
public String get_people_stem(){
    return people_stem;
}
public String get_ground_stem(){
    return ground_stem;
}
public String get_out_stem(){
    return out_stem;
}
public String get_total_stem(){
    return total_stem;
}
}

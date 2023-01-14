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
public class TerrestrialBranch {
    private String sky_branch;
    private String people_branch;
    private String ground_branch;
    private String out_branch;
    private String total_branch;
    
    public TerrestrialBranch(NameSeeker name){
    HashMap<Integer, String> terrestrial_map = create_map();
    int sky_key = name.getSkyBlock()%12;
    int people_key = name.getPeopleBlock()%12;
    int ground_key = name.getGroundBlock()%12;
    int out_key = name.getOutBlock()%12;
    int total_key = name.getTotalBlock()%12;
    String sky_val = terrestrial_map.get(sky_key);
    String people_val = terrestrial_map.get(people_key);
    String ground_val = terrestrial_map.get(ground_key);
    String out_val = terrestrial_map.get(out_key);
    String total_val = terrestrial_map.get(total_key);     
    this.sky_branch = sky_val;
    this.people_branch = people_val;
    this.ground_branch = ground_val;
    this.out_branch =out_val;
    this.total_branch = total_val;
    }
   public HashMap<Integer, String> create_map(){
    HashMap<Integer, String> terrestrial_map = new HashMap<Integer, String>();
    terrestrial_map.put(1, "子");
    terrestrial_map.put(2, "丑");
    terrestrial_map.put(3, "寅");
    terrestrial_map.put(4, "卯");
    terrestrial_map.put(5, "辰");
    terrestrial_map.put(6, "巳");
    terrestrial_map.put(7, "午");
    terrestrial_map.put(8, "未");
    terrestrial_map.put(9, "申");
    terrestrial_map.put(10, "酉");
    terrestrial_map.put(11, "戌");
    terrestrial_map.put(0, "亥");
    return terrestrial_map;
    }
   
public String get_sky_branch(){
    return sky_branch;
}
public String get_people_branch(){
    return people_branch;
}
public String get_ground_branch(){
    return ground_branch;
}
public String get_out_branch(){
    return out_branch;
}
public String get_total_branch(){
    return total_branch;
}    
}

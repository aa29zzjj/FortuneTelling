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
public class Attribute {
    private String sky_att;
    private String people_att;
    private String ground_att;
    private String out_att;
    private String total_att;
    
    public Attribute(NameSeeker name){
       HashMap<Integer, String> att_map = create_map();
       int sky_key = name.getSkyBlock()%10;
       int people_key = name.getPeopleBlock()%10;
       int ground_key = name.getGroundBlock()%10;
       int out_key = name.getOutBlock()%10;
       int total_key = name.getTotalBlock()%10;
       String sky_val = att_map.get(sky_key);
       String people_val = att_map.get(people_key);
       String ground_val = att_map.get(ground_key);
       String out_val = att_map.get(out_key);
       String total_val = att_map.get(total_key);     
        this.sky_att = sky_val;
        this.people_att = people_val;
        this.ground_att = ground_val;
        this.out_att =out_val;
        this.total_att = total_val;
    }
    public HashMap<Integer, String> create_map(){
    HashMap<Integer, String> att_map = new HashMap<Integer, String>();
    att_map.put(1, "木");
    att_map.put(2, "木");
    att_map.put(3, "火");
    att_map.put(4, "火");
    att_map.put(5, "土");
    att_map.put(6, "土");
    att_map.put(7, "金");
    att_map.put(8, "金");
    att_map.put(9, "水");
    att_map.put(0, "水");
    return att_map;
    }
    public String get_sky_att(){
        return sky_att;
    }
    public String get_people_att(){
        return people_att;
    }
      public String get_ground_att(){
        return ground_att;
    }
    public String get_out_att(){
        return out_att;
    }
    public String get_total_att(){
        return total_att;
    }

    
    
}

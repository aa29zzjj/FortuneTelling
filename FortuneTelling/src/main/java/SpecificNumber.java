
import java.util.HashMap;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SpecificNumber {
    //孤數
public  static HashMap<Integer, String> categories(){
     HashMap<Integer, String> cate = new  HashMap<Integer, String>();
     cate.put(7, "孤數");
     cate.put(17, "孤數");
     cate.put(27, "孤數(化氣加強)");
     cate.put(37, "孤數 理財數 白手起家");
     cate.put(47, "孤數");
     cate.put(28, "寡數");
     cate.put(39, "寡數");
     cate.put(12, "桃花數");
     cate.put(21, "桃花數 白手起家");
     cate.put(22, "桃花數");
     cate.put(24, "口舌星 白手起家");
     cate.put(25, "溫和星");
     cate.put(26, "暗黑星");
     cate.put(44, "死亡星");
     cate.put(32, "軍師數 財運 白手起家");
     cate.put(41, "領導數 白手起家");
     cate.put(16, "財運");
     cate.put(29, "白手起家");
     cate.put(33, "白手起家");
     
     return cate;
}
public  static HashMap<String, String> natureFortune(NameSeeker name){
    HashMap<String, String> nature_fortune = new HashMap<String, String>();
    if(categories().containsKey(name.getSkyBlock())){
        nature_fortune.put("天格", categories().get(name.getSkyBlock()));
    }else{
        nature_fortune.put("天格", "無");
    }
    if(categories().containsKey(name.getPeopleBlock())){
        nature_fortune.put("人格", categories().get(name.getPeopleBlock()));
    }else{
        nature_fortune.put("人格", "無");
    }
    if(categories().containsKey(name.getGroundBlock())){
        nature_fortune.put("地格", categories().get(name.getGroundBlock()));
    }else{
        nature_fortune.put("地格", "無");
    }
    if(categories().containsKey(name.getOutBlock())){
        nature_fortune.put("外格", categories().get(name.getOutBlock()));
    }else{
         nature_fortune.put("外格", "無");
    }
    if(categories().containsKey(name.getTotalBlock())){
        nature_fortune.put("總格", categories().get(name.getTotalBlock()));
    }else{
        nature_fortune.put("總格", "無");
    }
    
    return nature_fortune;
}
}

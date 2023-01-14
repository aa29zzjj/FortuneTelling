/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NameSeeker {
    private int sky_block;
    private int people_block;
    private int ground_block;
    private int out_block;
    private int total_block;
    
    
    public NameSeeker(int first_char, int sec_char, int third_char){
    this.sky_block = first_char + 1;
    this.people_block = first_char + sec_char;
    this.ground_block = sec_char + third_char;
    this.out_block = third_char +1;
    this.total_block = first_char + sec_char + third_char;
    }
    public int getSkyBlock(){
        return sky_block;
    }
    public int getPeopleBlock(){
        return people_block;
    }
    public int getGroundBlock(){
        return ground_block;
    }
    public int getOutBlock(){
        return out_block;
    }
    public int getTotalBlock(){
        return total_block;
    }
       
}

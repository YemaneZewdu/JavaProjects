/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udc.javadbmain;

/**
 *
 * @author yemane   
 * 
 */
public class PersonalInfo {
    // atteibutes for name and birth country
    private String name, country;
    PersonalInfo(String n, String c){
        name = n;
        country = c;
    }
    /**
     * 
     *  toString method for returning the name and country 
     */
    public String toString(){
        return name + " is originally from " + country;
    }
    
    
}

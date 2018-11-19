/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.UUID;

/**
 *
 * @author rodsur
 */
class Actuator {
    
    private UUID id;
    private int value;
    public Actuator(){
        id = UUID.randomUUID();
        value = 0;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        return id + ": " + getValue();
    }
}

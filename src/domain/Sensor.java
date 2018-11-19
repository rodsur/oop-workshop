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
class Sensor {
    
    private UUID id;
    public Sensor(){
        id = UUID.randomUUID();
    }
    
    public int getValue(){
        return 0;
    }
    
    @Override
    public String toString(){
        return id + ": " + getValue();
    }
    
}

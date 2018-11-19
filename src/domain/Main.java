/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author rodsur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildingDatabase database = new BuildingDatabase();
        
        Building kurt = new Building("Kurt","Tokyo");
        Sensor sensor1 = new Sensor();
        kurt.addSensor(sensor1);
        
        database.addBuilding(kurt);
        
        System.out.println(database.toString());
        
    }
    
}

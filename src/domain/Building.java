/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author rodsur
 */
class Building {
    
    private UUID id;
    private String name;
    private String address;
    private ArrayList<Sensor> sensorList;
    private ArrayList<Actuator> actuatorList;
    
    
    public Building(String name, String address) {
        id = UUID.randomUUID();
        this.name = name;
        this.address = address;
        sensorList = new ArrayList<>();
        actuatorList = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor) {
        sensorList.add(sensor);
    }
    
    public void addActuator(Actuator actuator) {
        actuatorList.add(actuator);
    }
    
    public ArrayList getSensorList(){
        return sensorList;
    }
    
    public ArrayList getActuatorList(){
        return actuatorList;
    }
    
    
    public String getSensors(){
        String sensorString = "";
        for (int i=0; i<sensorList.size();i++){
            sensorString = sensorList.get(i).toString() + "\n";
        }
        return sensorString;
    }
    
    public String getActuators(){
        String actuatorString = "";
        for (int i=0; i<sensorList.size();i++){
            actuatorString = sensorList.get(i).toString() + "\n";
        }
        return actuatorString;
    }
}

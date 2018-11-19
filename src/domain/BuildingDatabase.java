/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author rodsur
 */
public class BuildingDatabase {
    
    private ArrayList<Building> buildingDatabase ;
    
    public BuildingDatabase() {
        buildingDatabase = new ArrayList<>();
    }
    
    public void addBuilding(Building building) {
        buildingDatabase.add(building);
    }
    
    @Override
    public String toString(){
        String returnString = "";
        for (int i=0; i<buildingDatabase.size();i++){
            returnString = buildingDatabase.get(i).getSensors() + "\n";
            returnString = buildingDatabase.get(i).getActuators()+ "\n";
        }
        return returnString;
    }
}

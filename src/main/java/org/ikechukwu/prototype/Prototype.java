package org.ikechukwu.prototype;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable {
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle(List<String> list) {
        this.vehicleList = list;
    }

    public void insertData() {
        vehicleList.add("Car");
        vehicleList.add("Bike");
        vehicleList.add("Bus");
        vehicleList.add("Train");
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getVehicleList()) {
            temp.add(s);
        }
        return new Vehicle(temp);
    }
}


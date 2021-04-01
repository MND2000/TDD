/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

/**
 *
 * @author 216040566 Waseem Dollie
 * 
 * This is a simple POJO for account domain
 */
public class Cars {
    
    private String id, name, carType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Cars{" + "id=" + id + ", name=" + name + ", carType=" + carType + '}';
    }
    
}



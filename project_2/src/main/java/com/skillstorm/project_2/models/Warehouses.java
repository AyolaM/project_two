package com.skillstorm.project_2.models;

import java.util.List;

public class Warehouses {

    private int capacity;
    private int locationId;
    private String name;
    @OneToMany
    private List <Products> product;
    private String info; //info about ware house, quantity, id, capacity, productlist
//LOGIC for which warehouse holds products..by catergory? 
    public Warehouses(){}
    public Warehouses( int locationId, String name, int maxCapacity){
        this.locationId = locationId;
        this.capacity = maxCapacity;
        this.name = name;

    }

    
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Products> getProduct() {
        return product;
    }
    public void setProduct(List<Products> product) {
        this.product = product;
    }
    @Override
    public String toString() {
        return "Warehouse [capacity=" + capacity + ", locationId=" + locationId + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacity;
        result = prime * result + locationId;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Warehouses other = (Warehouses) obj;
        if (capacity != other.capacity)
            return false;
        if (locationId != other.locationId)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

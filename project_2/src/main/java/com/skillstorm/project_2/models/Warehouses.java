
package com.skillstorm.project_2.models;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Warehouses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;
    private Integer capacity;

    @OneToMany(mappedBy = "locationId")
    @JsonIgnore
    private List<Products> product;
    private String info;

    public Warehouses() {
    }

    public Warehouses(Integer locationId, Integer capacity, List<Products> product, String info) {
        this.locationId = locationId;
        this.capacity = capacity;
        this.product = product;
        this.info = info;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Products> getProduct() {
        return product;
    }

    public void setProduct(List<Products> product) {
        this.product = product;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Warehouses [locationId=" + locationId + ", capacity=" + capacity + ", product=" + product + ", info="
                + info + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + locationId;
        result = prime * result + capacity;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + ((info == null) ? 0 : info.hashCode());
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
        if (locationId != other.locationId)
            return false;
        if (capacity != other.capacity)
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (info == null) {
            if (other.info != null)
                return false;
        } else if (!info.equals(other.info))
            return false;
        return true;
    }

}
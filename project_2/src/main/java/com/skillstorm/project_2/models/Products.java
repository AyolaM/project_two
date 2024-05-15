
package com.skillstorm.project_2.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private Integer quantity;

    @NotNull
    @Min(value = 1)
    private Double price;

    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Warehouses locationId;
    private String description;

    @Enumerated(EnumType.STRING)
    private ProductType shoeType;

    public Products() {
    }

    public Products(Integer productId, Integer quantity, Double price, Warehouses locationId, String description,
            ProductType shoeType) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.locationId = locationId;
        this.description = description;
        this.shoeType = shoeType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Warehouses getLocationId() {
        return locationId;
    }

    public void setLocationId(Warehouses locationId) {
        this.locationId = locationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ProductType shoeType) {
        this.shoeType = shoeType;
    }

    @Override
    public String toString() {
        return "Products [productId=" + productId + ", quantity=" + quantity + ", price=" + price + ", locationId="
                + locationId + ", description=" + description + ", shoeType=" + shoeType + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((shoeType == null) ? 0 : shoeType.hashCode());
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
        Products other = (Products) obj;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        } else if (!quantity.equals(other.quantity))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (locationId == null) {
            if (other.locationId != null)
                return false;
        } else if (!locationId.equals(other.locationId))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (shoeType != other.shoeType)
            return false;
        return true;
    }

}
package org.cccc.examples.springdatajpa;

import java.math.BigDecimal;

public class Product {

    private String id;
    private String name;
    private BigDecimal productionCosts;
    private BigDecimal retailPrice;

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

    public BigDecimal getProductionCosts() {
        return productionCosts;
    }

    public void setProductionCosts(BigDecimal productionCosts) {
        this.productionCosts = productionCosts;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (productionCosts != null ? !productionCosts.equals(product.productionCosts) : product.productionCosts != null)
            return false;
        if (retailPrice != null ? !retailPrice.equals(product.retailPrice) : product.retailPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (productionCosts != null ? productionCosts.hashCode() : 0);
        result = 31 * result + (retailPrice != null ? retailPrice.hashCode() : 0);
        return result;
    }
}

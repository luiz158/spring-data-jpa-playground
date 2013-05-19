package org.cccc.examples.springdatajpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private String id;
    private List<OrderPosition> positions;

    public Order() {
        positions = new ArrayList<OrderPosition>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OrderPosition> getPositions() {
        return Collections.unmodifiableList(positions);
    }

    public void setPositions(List<OrderPosition> positions) {
        this.positions = new ArrayList<OrderPosition>(positions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (positions != null ? !positions.equals(order.positions) : order.positions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (positions != null ? positions.hashCode() : 0);
        return result;
    }
}

package org.cccc.examples.springdatajpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private List<Order> orders;

    public Customer() {
        orders = new ArrayList<Order>();
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    public void setOrders(List<Order> orders) {
        this.orders = new ArrayList<Order>(orders);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!firstName.equals(customer.firstName)) return false;
        if (!id.equals(customer.id)) return false;
        if (!lastName.equals(customer.lastName)) return false;
        if (!orders.equals(customer.orders)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + orders.hashCode();
        return result;
    }
}

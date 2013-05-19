/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

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

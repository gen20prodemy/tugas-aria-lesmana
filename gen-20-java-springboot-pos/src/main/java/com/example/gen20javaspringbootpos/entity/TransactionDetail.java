package com.example.gen20javaspringbootpos.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;


@Entity
@Table(name="transactiondetail")
@Immutable
public class TransactionDetail {
    @Id
    int invoice_id;
    String name;
    int quantity;
    int total_price;

    public TransactionDetail(){}

    public TransactionDetail(int invoice_id, String name, int quantity, int total_price) {
        this.invoice_id = invoice_id;
        this.name = name;
        this.quantity = quantity;
        this.total_price = total_price;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return total_price;
    }

    public void setPrice(int total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "TransactionDetail{" +
                "invoice_id=" + invoice_id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + total_price +
                '}';
    }
}

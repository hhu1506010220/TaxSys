package com.taxsys.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "income")

public class Income {

    @Id
    @GeneratedValue(generator="sid")
    @GenericGenerator(name="sid",strategy="assigned")
    @Column(length = 32)
    private String id;

    @Column(length = 32)
    private String taxId;

    @Column(length = 32)
    private String inType;

    @Column(length = 16)
    private float money;

    @Column(length = 16)
    private String taxDate;

    @Column(length = 32)
    private String uid;

    @Column(length = 16)
    private String created_at;

    @Column(length = 16)
    private String updated_at;

    public Income() {
    }

    public Income(String taxId, String inType, float money, String taxDate) {
        this.taxId = taxId;
        this.inType = inType;
        this.money = money;
        this.taxDate = taxDate;
    }

    public Income(String inType, float money, String taxDate) {
        this.inType = inType;
        this.money = money;
        this.taxDate = taxDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "商品：" + inType + "， 进项额： " + money + ", 日期： " + String.valueOf(created_at) + ", 发票号： " +  taxId + '\n';
    }
}

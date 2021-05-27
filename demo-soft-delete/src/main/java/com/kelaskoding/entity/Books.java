package com.kelaskoding.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name= "tbl_books")
@SQLDelete(sql = "UPDATE tbl_books SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")
@FilterDef(name="deletedBookFilter", parameters= @ParamDef(name = "isDeleted", type = "boolean"))
@Filter(name="deletedBookFilter", condition = "deleted = :isDeleted")
public class Books {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private double price;

    private boolean deleted = Boolean.FALSE;  //FALSE = not deleted, TRUE = deleted

    public Long getId() {
        return id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}

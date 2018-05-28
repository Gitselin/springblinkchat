package com.hellokoding.auth.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "location")
public class Location {
    private Long id;
    private Long X;
    private Long Y;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    
    public Long getX() {
        return X;
    }
    
    public Long getY() {
        return Y;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setX(Long x) {
        this.X = x;
    }
    
    public void setY(Long y) {
        this.Y = y;
    }
}

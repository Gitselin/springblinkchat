package com.hellokoding.auth.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "post")
public class Post {
    private Long id;
    private Long UserID;
    private Long LocationID;
    private String Message;
    private Long X;
    private Long Y;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    
    public Long getUserId() {
        return UserID;
    }
    
    public Long getLocationId() {
        return LocationID;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setLocationId(Long id) {
        this.LocationID = id;
    }
    
    public void setUserId(Long id) {
        this.UserID = id;
    }
    
    public String getMessage() {
        return Message;
    }
    
    public void setMessage(String message) {
        this.Message = message;
    }
    
    
    
    public Long getX() {
        return X;
    }

    public void setX(Long x) {
        this.X = x;
    }
    public Long getY() {
        return Y;
    }

    public void setY(Long y) {
        this.Y = y;
    }


}

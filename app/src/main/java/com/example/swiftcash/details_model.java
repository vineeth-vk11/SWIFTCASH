package com.example.swiftcash;

public class details_model {
    private String username;
    private String distance;

    public details_model() {
    }

    public details_model(String username, String distance) {
        this.username = username;
        this.distance = distance;
    }

    public String getUsername() {
        return username;
    }

    public String getDistance() {
        return distance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}

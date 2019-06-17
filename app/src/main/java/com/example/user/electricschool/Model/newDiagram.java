package com.example.user.electricschool.Model;

public class newDiagram {
    private  String Time;
    private  String Material;
    private  String Location;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public newDiagram(String time, String material, String location) {
        Time = time;
        Material = material;
        Location = location;
    }
}

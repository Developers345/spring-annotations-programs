package com.spring.annotations.javaconfig.profiles;

//No Source Code
public class Robot {
    private String robotType;
    private int version;
    private ISensor sensor;

    public void setRobotType(String robotType) {
        this.robotType = robotType;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setSensor(ISensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotType='" + robotType + '\'' +
                ", version=" + version +
                ", sensor=" + sensor +
                '}';
    }
}

package com.cydeo;

public enum ProjectStatus {
    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }
    ProjectStatus() {
    }// two constructors are not normally used. This is just to demonstarte that such a status(in progress) can be implemented
}

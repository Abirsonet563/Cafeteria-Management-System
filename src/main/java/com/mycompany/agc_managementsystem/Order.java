package com.mycompany.agc_managementsystem;

import java.util.ArrayList;

public abstract class Order {
    private String id;
    private String category;
    private String date;

    // Category Description Here
    // 1) Service
    // 2) Facility
    // 3) trainer
    // 4) Others
    
    
    public Order(){}

    public abstract ArrayList<String> getLatestFeedbacks1();
    
    public abstract void sendFeedback1(String feedbackDataLine);

    
}

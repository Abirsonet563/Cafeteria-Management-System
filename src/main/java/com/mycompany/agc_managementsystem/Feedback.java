package com.mycompany.agc_managementsystem;

import java.util.ArrayList;

public abstract class Feedback {
    private String id;
    private String category;
    private String date;

    // Category Description Here
    // 1) Service
    // 2) Facility
    // 3) trainer
    // 4) Others
    
    
    public Feedback(){}

    public abstract ArrayList<String> getLatestFeedbacks();
    
    public abstract void sendFeedback(String feedbackDataLine);

    
}

package com.mycompany.agc_managementsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Feedback_TrainerCustomer extends Feedback {
    
    @Override
    public void sendFeedback(String feedbackDataLine) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FilePath.getPath(FilePath.FEEDBACK), true));
            bw.write(feedbackDataLine);
            bw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"File input or output error.");
        } 
    }

    @Override
    public ArrayList<String> getLatestFeedbacks() {return null;}
}

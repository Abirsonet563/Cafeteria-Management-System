package com.mycompany.agc_managementsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Feedback_Manager extends Feedback {

    public Feedback_Manager() {}
    
    @Override
    public ArrayList<String> getLatestFeedbacks(){
        
        ArrayList<String> Feedbacks = new ArrayList<String>();
        BufferedReader br = null;
        String dataLine = null;
        String[] data = null;
        try {
            br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.FEEDBACK)));
            
            while((dataLine = br.readLine())!=null){
                data = dataLine.split(";");
                data[1] = switchCategory(data[1]);
                Feedbacks.add(String.join(";", data)+";");
            }
            br.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not Found!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File Input or Output Exception Error!");
        }
        return Feedbacks;
    }


    //// Category Description Here
    // 1) Service
    // 2) Food
    // 3) Other
   
    private String switchCategory(String data){
        switch(Integer.parseInt(data))
        {
            case 1:
                return "Service";
            case 2:
                return "Facility";
            case 3:
                return "Trainer";
            case 4:
                return "Others";
            default:
                JOptionPane.showMessageDialog(null, "Categorising Error! Changed to default value: Others");
                return "Others";
        }
    }
    
    // Not Supported in manager side
    @Override
    public void sendFeedback(String feedbackDataLine) {}
}

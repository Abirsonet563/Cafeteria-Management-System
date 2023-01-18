package com.mycompany.agc_managementsystem;

import java.nio.file.Paths;

public class FilePath {
    private final static String CURDIR = Paths.get("").toAbsolutePath().toString(); // Current Directory
    private final static String DATA_DESTINATION = "\\src\\main\\java\\agc_managementsystem\\Data\\";
    
    // Date File Name
    public final static String USER_DETAILS = "UserDetails.txt";
    public final static String LOGIN_RECORDS = "LoginRecords.txt";
    public final static String FEEDBACK = "Feedback.txt";
    public final static String ORDER = "Order.txt";
    public final static String MENU = "Menu.txt";
    public final static String SCHEDULE = "Schedule.txt";
    public final static String ID_CHANGE_LOG = "IdChangeLog.txt";

            
    public static String getPath(String TextFileName) {
        return CURDIR + DATA_DESTINATION + TextFileName;
    }


    
    
}

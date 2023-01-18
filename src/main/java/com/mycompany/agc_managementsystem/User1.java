package com.mycompany.agc_managementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.max;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.regex.*;
import javax.swing.JOptionPane;

public class User1 {

    private String FullName;
    private String Username;
    private String Email;
    private String ContactNo;
    private String DOB;
    private String Password;
    private UserType Usertype;
    private String ID;
    
    // Constructor Use for registration
    public User1(String FullName, String Username, String Email, String ContactNo, String DOB, String Password, UserType UserType) {
        this.FullName = FullName;
        this.Username = Username;
        this.Email = Email;
        this.ContactNo = ContactNo;
        this.DOB = DOB;
        this.Password = Password;
        this.Usertype = UserType;
    }    

    // For manager to update the information
    public User1(String FullName, String Username, String Email, String ContactNo, String DOB, UserType UserType, String UID) {
        this.FullName = FullName;
        this.Username = Username;
        this.Email = Email;
        this.ContactNo = ContactNo;
        this.DOB = DOB;
        this.Usertype = UserType;
        this.ID = UID;
    } 
    
    // Overload Constructor: temporary use for authentication
    public User1(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    
    // Overload Constructor: use to pass through among pages
    public User1(String ID) {
        this.ID = ID;
    }    
    
    public User1(){}
    
    public boolean Validate(){
  
        // Read file
        boolean result = false;
        try {
            File f = new File(FilePath.getPath(FilePath.MENU));
            Scanner fileReader = new Scanner(f);
            while(fileReader.hasNextLine())
            {
                String dataLine = fileReader.nextLine();
                if(dataLine.length()==0)continue;
                // Split data line into array  
                String[] dataArr = dataLine.split(";");
                
                
                String fn = dataArr[0];
                String un = dataArr[1];
                String em = dataArr[2];
                String cn = dataArr[3];
                
                // Validate if any repetition
                if(fn.equals(FullName)||un.equals(Username)||em.equals(Email)||cn.equals(ContactNo)) return false;

                // Validate Characters in details
                String[] details = {FullName, Username, Email, ContactNo, DOB, Password};
                result = Subvalidate(details);

            }
            fileReader.close();
        }
        catch(FileNotFoundException e)
        {
          return false;  
        }   
        
        return result;
    }
    
    // 0: Fullname, 1: Username, 2: Email, 3: ContactNo, 4: DOB, 5: Password.
    private boolean Subvalidate(String[] str)
    {
        return Pattern.matches("[a-zA-Z ]{3,50}", str[0]) &&
                Pattern.matches("[a-zA-Z0-9_]{3,50}", str[1]) &&
                Pattern.matches("^[A-Za-z0-9._-]+@[A-Za-z0-9-.]+\\.[A-Za-z]{2,63}$",str[2]) &&
                Pattern.matches("^[0-9]{7,15}$", str[3]) &&
                Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", str[4]) &&
                Pattern.matches("^[A-Za-z0-9+-_)(*&^%$#@!]{5,50}$", str[5]);
    }
    
    public String validateFullname(String str){
        if(Pattern.matches("[a-zA-Z ]{3,50}", str)) return "";
        return "Fullname's format is wrong. Only alphabets and space are allowed.\n The length of fullname should not be more than 50.\n";
    }
    
    public String validateUsername(String str) {
        if(Pattern.matches("[a-zA-Z0-9_]{3,50}", str)) return "";
        return "Username's format is wrong. Only alphabets, numbers and underscore(_) are allowed.\n The length of username should not be more than 50.\n";
    }

    public String validateEmail(String str) {
        if(Pattern.matches("^[A-Za-z0-9._-]+@[A-Za-z0-9-.]+\\.[A-Za-z]{2,63}$",str)) return "";
        return "Email's format is wrong. Please check your email carefully.\n";
    }
        
    public String validateContactNo (String str) {
        if(Pattern.matches("^[0-9]{7,15}$", str)) return "";
        return "Contact Numbers' format is wrong. Only numbers are allowed.\n";
    }
    
    public String validatePassword(String str) {
        if(Pattern.matches("^[A-Za-z0-9+-_)(*&^%$#@!]{5,50}$", str)) return "";
        return "Password's format is wrong. Only alphabets, numbers and these symbols +-_)(*&^%$#@! are allowed.\nThe length of password should not be more than 50.";
    }
    
    public boolean Register(){
        
        // Check one more time in case
        if(!this.Validate()){
            return false;
        }
        
        // Create registration String
        String RegistrationStr = "";
        String[] temp = {FullName, Username, Email, ContactNo, DOB, Password, Usertype.toString(), GenerateNewID()};
        Path RegistrationTargetPath = Paths.get(FilePath.getPath(FilePath.MENU));
        
        for(String str:temp) RegistrationStr += str + ";";

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(FilePath.getPath(FilePath.MENU), true));
            bw.write(RegistrationStr+"\n");
            bw.close();
            //Files.write(RegistrationTargetPath, RegistrationStr.getBytes(), StandardOpenOption.APPEND);     
        } catch(IOException e){
            return false;
        }
            
        return true;
    }
    
    private String GenerateNewID()
    {
        String newID = "";
        String type = "";
        try {          
            switch (this.Usertype) {
                case MANAGER:
                    type = "M";
                    break;
                case TRAINER:
                    type = "T";
                    break;
                case CUSTOMER:
                    type = "C";
                    break;
            }
            
            File f = new File(FilePath.getPath(FilePath.MENU));
            Scanner fileReader = new Scanner(f);
            int MaxNumber = 0;
            
            while (fileReader.hasNextLine()) {
                String dataLine = fileReader.nextLine();
                if(dataLine.length()==0)continue;
                
                // Split data line into array
                String[] dataArr = dataLine.split(";");
                
                // Length = 8, ID => 7
                String tempID = dataArr[7];
                String Number = "";
                
                if (Character.toString(tempID.charAt(0)).equals(type)) {
                    for (int i = 1; i < tempID.length(); i++) {
                        Number = Character.toString(tempID.charAt(i));
                    }
                    MaxNumber = max(MaxNumber, Integer.parseInt(Number));
                }
            }
            fileReader.close();
            
            // Transforming newID to [Type][number]
            newID = Integer.toString(MaxNumber+1);
            newID = type + newID;

        } catch (FileNotFoundException ex) {;}
        
        return newID;
    }
    
    public static String GenerateNewID(UserType ut)
    {
        String newID = "";
        String type = "";
        try {          
            switch (ut) {
                case MANAGER:
                    type = "M";
                    break;
                case TRAINER:
                    type = "T";
                    break;
                case CUSTOMER:
                    type = "C";
                    break;
            }
            
            File f = new File(FilePath.getPath(FilePath.MENU));
            Scanner fileReader = new Scanner(f);
            int MaxNumber = 0;
            
            while (fileReader.hasNextLine()) {
                String dataLine = fileReader.nextLine();
                if(dataLine.length()==0)continue;
                
                // Split data line into array
                String[] dataArr = dataLine.split(";");
                
                // Length = 8, ID => 7
                String tempID = dataArr[7];
                String Number = "";
                
                if (Character.toString(tempID.charAt(0)).equals(type)) {
                    for (int i = 1; i < tempID.length(); i++) {
                        Number = Character.toString(tempID.charAt(i));
                    }
                    MaxNumber = max(MaxNumber, Integer.parseInt(Number));
                }
            }
            fileReader.close();
            
            // Transforming newID to [Type][number]
            newID = type + Integer.toString(MaxNumber+1);

        } catch (FileNotFoundException ex) {;}
        
        return newID;
    }

    public UserType getUsertype() {
        return Usertype;
    }
    

    public String getFullName() {
        return FullName;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public String getDOB() {
        return DOB;
    }

    public String getID() {
        return ID;
    }
    
    private static int getFileRows(){
        int row = 0;
        try {
            BufferedReader rd = new BufferedReader(new FileReader(FilePath.getPath(FilePath.MENU)));
            while(rd.readLine() != null) row++;
            rd.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File Not Found.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Input or Output Error.");
        }
        return row;
    }
    
    public static String[] getManagableUserDetails(){
        String foo;
        String[] UserDetailsArr = new String[getFileRows()];
        int curPos = 0;
        try {
            BufferedReader rd = new BufferedReader(new FileReader(FilePath.getPath(FilePath.MENU)));
            while ((foo = rd.readLine()) != null) {
                UserDetailsArr[curPos] = foo;
                curPos++;

            }
            rd.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File Not Found.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Input or Output Error.");
        }

        // Filter and get out password string from the detail string
        final int invisibleContentIndex = 5;
        for (int i = 0; i < UserDetailsArr.length; i++) {
            String latestString = "";
            String[] temp = UserDetailsArr[i].split(";");
            for (int j = 0; j < temp.length; j++) {
                if (j != invisibleContentIndex) {
                    latestString += temp[j] + ";";
                }
            }
            UserDetailsArr[i] = latestString;
        }

        return UserDetailsArr;
    }
    
    
    
    
    public boolean Login()
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.MENU)));
            String dataLine = null;
            String[] dataArr = null;
            
            while((dataLine = br.readLine())!=null&&dataLine.length()!=0)
            {

                // Split data line into array  
                dataArr = dataLine.split(";");
                
                String un = dataArr[1];
                String pw = dataArr[5];
                
                // Validate if it is matched
                if(un.equals(Username) && pw.equals(Password)) {
                    this.Usertype = UserType.getUserType(dataArr[6]);
                    this.ID = dataArr[7];
                    return true;
                }
                

            }
            br.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
        
        
        return false;
    }
}

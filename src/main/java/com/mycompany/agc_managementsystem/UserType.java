package com.mycompany.agc_managementsystem;

public enum UserType {
    MANAGER,
    TRAINER,
    CUSTOMER;
    
    public static UserType getUserType(String str)
    {
        switch(str)
        {
            case "MANAGER":
                return MANAGER;
            case "TRAINER":
                return TRAINER;
            case "CUSTOMER":
                return CUSTOMER;
            default:
                return null;
        }
    }
}

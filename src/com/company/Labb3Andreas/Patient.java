package com.company.Labb3Andreas;

public class Patient {
    private String name;
    private String sickness;


    // konstruktorer

    public Patient(String inputName, String inputSickness) {
        this.name = inputName;
        this.sickness = inputSickness;



    }
    public Patient(String inputName){
        this (inputName, "");
    }

    //metoder

    public boolean isSick(){
        return this.sickness != null && !this.sickness.equals("");
    }

    public String getSickness(){
        return  this.sickness;
    }

    public String getName(){
        return this.name;
    }

    public void takeMedication(Medicine med){
        if (this.sickness.equals(med.getTreatmentName())){
            this.sickness = null;

        }

    }
}

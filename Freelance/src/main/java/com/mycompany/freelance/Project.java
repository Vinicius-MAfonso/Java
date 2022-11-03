package com.mycompany.freelance;

import java.io.Serializable;

public class Project implements Serializable{
    private static int totalIds = 0;
    private int personalId;
    private String name;
    private String contractor;
    private String description;
    private double valuePerHour;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Project(String _name, String _contractor, double _valuePerHour,String _description){
        if(isValidate(_name))
            throw new IllegalArgumentException("Campo nome não pode estar vázio");
        this.name = _name;
        
        if(isValidate(_contractor))
            throw new IllegalArgumentException("Campo contratante não pode estar vázio");
        this.contractor = _contractor;
        
        if(isValidate(Double.toString(_valuePerHour)))
            throw new IllegalArgumentException("Campo valor por hora não pode estar vázio");
        this.valuePerHour = _valuePerHour;
        
        if(isValidate(_description))
            throw new IllegalArgumentException("Campo descrição não pode estar vázio");
        this.description = _description;
        personalId = totalIds;
        totalIds++;
        System.out.println(toString());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String _name) {
        if(isValidate(_name))
            throw new IllegalArgumentException("Campo nome não pode estar vázio");
        this.name = _name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String _description) {
        if(isValidate(_description))
            throw new IllegalArgumentException("Campo descrição não pode estar vázio");
        this.description = _description;
    }
    
    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double _valuePerHour) {
        if(isValidate(Double.toString(_valuePerHour)))
            throw new IllegalArgumentException("Campo valor por hora não pode estar vázio");
        this.valuePerHour = _valuePerHour;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String _contractor) {
        if(isValidate(_contractor))
            throw new IllegalArgumentException("Campo contratante não pode estar vázio");
        this.contractor = _contractor;
    }
    
    private boolean isValidate(String s){
        return s.isBlank() || s.isEmpty();
    }
    
    public static int getTotalIds() {
        return totalIds;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    @Override
    public String toString(){
        return String.format("Id: %d Nome: %s Contratante: %s Valor/Hora: %.2f Descrição: %s",
                getPersonalId(),getName(),getContractor(),getValuePerHour(),getDescription());
    }
    
}

package com.mycompany.freelance;

public class Project {
    private int id;
    private String name;
    private String description;
    private int valuePerHour;
    public Project(int _id, String _name, String _description, in){
        this.id = _id;
        this.name = _name;
        this.description = _description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        return String.format("Id: %d%nNome: %s%nDescrição: %s",getId(),getName(),getDescription());
    }
}

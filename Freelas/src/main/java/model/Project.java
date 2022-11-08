package model;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable{
    private int id;
    private String name;
    private String contractor;
    private double valuePerHour;
    private String description;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;

    public Project(int id, String name, String contractor, double valuePerHour, String description, boolean status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.contractor = contractor;
        this.valuePerHour = valuePerHour;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", contractor=" + contractor + ", valuePerHour=" + valuePerHour + ", description=" + description + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
}

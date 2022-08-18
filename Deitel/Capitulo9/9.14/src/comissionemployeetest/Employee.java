package comissionemployeetest;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final int socialSecurityNumber;
    public Employee(String firstName,String lastName,int socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public String toString(){
        return String.format("Primeiro nome: %s%nUltimo nome: %s%n"
                + "Número de segurança social: %d", 
                getFirstName(),getLastName(),getSocialSecurityNumber());
    }
}

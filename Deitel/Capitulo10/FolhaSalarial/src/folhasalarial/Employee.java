package folhasalarial;

public abstract class Employee extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    //Construtor
    public Employee(String firstName, String lastName, 
            String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    //Retorna a representação String do objeto
    @Override
    public String toString(){
        return String.format("%s %s%nNúmero de segurança: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();//Método abstrato, nenhuma implementação
}

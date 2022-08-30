package folhasalarial;

public abstract class Employee implements Payable{
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    //Construtor
    public Employee(String firstName, String lastName, 
            String socialSecurityNumber)
    {
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
    //Não foi implementado o método getPaymentAmount,
    //Assim a classe deve ser declarada abstrata
}

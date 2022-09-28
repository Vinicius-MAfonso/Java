package pkg14.pkg20;

public abstract class ValidateInput {
    //Valida nome
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
    //Valida sobrenome
    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }
    //Valida endereço
    public static boolean validateAddress(String address){
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    //Valida cidade
    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    //Valida estado
    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    //Valida CEP
    public static boolean validateZip(String zip){
        return zip.matches("\\d{5}");
    }
    //Valida telefone
    public static boolean validatePhone(String phone){
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}

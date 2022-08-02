package pkg7.pkg19;

public class Assento {
    public enum classe{
        PRIMEIRA, ECONOMICA
    }
    private final classe tipoClasse; 
    private boolean disponibilidade;
    
    public Assento(classe tipoClasse){
        this.tipoClasse = tipoClasse;
        this.disponibilidade = true;
    }

    public classe getTipoClasse() {
        return tipoClasse;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}

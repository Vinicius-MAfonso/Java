package pkg7.pkg19;

public class Assento {
    public enum classe{
        PRIMEIRA, ECONOMICA
    }
    private classe tipoClasse; 
    private boolean disponibilidade;
    
    public Assento(classe tipoClasse){
        this.tipoClasse = tipoClasse;
        this.disponibilidade = true;
    }

    public classe getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(classe tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}

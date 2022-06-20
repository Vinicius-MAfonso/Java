package HeartRates;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaAni;
    private int mesAni;
    private int anoAni;
    private String aniversario;
    
    public HeartRates(String nome, String sobrenome, int diaAni, int mesAni, int anoAni){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaAni = diaAni;
        this.mesAni = mesAni;
        this.anoAni = anoAni;
        this.aniversario = String.format("%d/%d/%d",diaAni,mesAni,anoAni);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDiaAni() {
        return diaAni;
    }

    public void setDiaAni(int diaAni) {
        this.diaAni = diaAni;
    }

    public int getMesAni() {
        return mesAni;
    }

    public void setMesAni(int mesAni) {
        this.mesAni = mesAni;
    }

    public int getAnoAni() {
        return anoAni;
    }

    public void setAnoAni(int anoAni) {
        this.anoAni = anoAni;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
}

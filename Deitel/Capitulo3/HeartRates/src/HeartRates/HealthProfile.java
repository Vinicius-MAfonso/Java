package HeartRates;


public class HealthProfile {
    private String nome;
    private String sobrenome;
    private int diaAni;
    private int mesAni;
    private int anoAni;
    private String aniversario;
    private double altura;
    private double peso;
    
    public HealthProfile(String nome, String sobrenome, int diaAni, int mesAni, int anoAni, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaAni = diaAni;
        this.mesAni = mesAni;
        this.anoAni = anoAni;
        this.aniversario = String.format("%d/%d/%d",diaAni,mesAni,anoAni);
        this.altura = altura;
        this.peso = peso;
    }
    public String getNomeInteiro() {
        return String.format("%s %s",nome,sobrenome);
    }
    public int getIdade(){
        return 2022 - getAnoAni();
    }
    public double frqMax(){
        return 220-getIdade();
    }
    public String frqAlvo(){
        String frqAlvo = String.format("entre %.0f e %.0f", (frqMax()/2),(frqMax()*0.85));
        return frqAlvo;
    }
    public String imc(){
        double imc = peso/(altura*altura);
        if(imc < 18.5){
            return String.format("Abaixo do peso(%.1f)",imc);
        }else if(imc >= 18.5 && imc <= 24.9){
            return String.format("No peso ideal(%.1f)",imc);
        }
        else if(imc >= 25 && imc <= 29.9) {
            return String.format("Acima do peso(%.1f)",imc);
        }else{
            return String.format("Obeso(%.1f)",imc);
        }
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

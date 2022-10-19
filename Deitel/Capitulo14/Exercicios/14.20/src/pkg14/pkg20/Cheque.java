package pkg14.pkg20;

public class Cheque {
    private final int SPACES = 9;
    private final StringBuilder valor;
    
    public Cheque(double _valor){
        this.valor = new StringBuilder(String.format("%,.2f", _valor));
        int blankSpaces = 0;
        if(this.valor.length() > 9){
            throw new IllegalArgumentException("Apenas números até 10.000 R$ são válidos");
        }else{
            if(this.valor.length() < this.SPACES){
                blankSpaces = this.SPACES - valor.length();
            }
            for(int i = 0;i < blankSpaces;i++){
                this.valor.insert(0,"*");
            }
        }
        
    }
    
    @Override
    public String toString(){
        return this.valor.toString();
    }
}

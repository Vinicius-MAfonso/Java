package projeto.pizzaria;

public class Pizza {
    public enum sabores{
        MUSSARELA, MARGUERITA, CALABRESA, BACON, ESPECIAL
    }
    private boolean queijoExtra;
    private boolean molhoExtra;
    private final sabores sabor;
    public Pizza(boolean queijoExtra, boolean molhoExtra, sabores sabor){
        this.molhoExtra = molhoExtra;
        this.queijoExtra = queijoExtra;
        this.sabor = sabor;
    }
    public boolean isQueijoExtra() {
        return queijoExtra;
    }
    
    public void setQueijoExtra(boolean queijoExtra) {
        this.queijoExtra = queijoExtra;
    }

    public boolean isMolhoExtra() {
        return molhoExtra;
    }

    public void setMolhoExtra(boolean molhoExtra) {
        this.molhoExtra = molhoExtra;
    }
    public double getPreco() {
        double preco = 0;
        if(null != sabor)
            switch (sabor) {
            case MUSSARELA -> preco =+ 30;
            case MARGUERITA -> preco =+ 30;
            case CALABRESA -> preco =+ 40;
            case BACON -> preco =+ 45;
            case ESPECIAL -> preco =+ 50;
            default -> {
            }
        }
        if(isMolhoExtra())
            preco += 5;
        if(isQueijoExtra())
            preco+=10;
        return preco;
    }
    @Override
    public String toString(){
        switch(sabor){
            case MUSSARELA ->{
                if(isMolhoExtra() || isQueijoExtra()){
                    if(isMolhoExtra() && isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Mussarela + Queijo extra + Molho extra",getPreco());
                    else if(isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Mussarela + Queijo extra",getPreco());
                    else if(isMolhoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Mussarela + Molho extra",getPreco());
                }else
                    return String.format("%s R$ %.2f","Pizza Mussarela",getPreco());
            }
            case MARGUERITA ->{
                if(isMolhoExtra() || isQueijoExtra()){
                    if(isMolhoExtra() && isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Marguerita + Queijo extra + Molho extra",getPreco());
                    else if(isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Marguerita + Queijo extra",getPreco());
                    else if(isMolhoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Marguerita + Molho extra",getPreco());
                }else
                    return String.format("%s R$ %.2f","Pizza Marguerita",getPreco());
            }
            case CALABRESA ->{
                if(isMolhoExtra() || isQueijoExtra()){
                    if(isMolhoExtra() && isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Calabresa + Queijo extra + Molho extra",getPreco());
                    else if(isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Calabresa + Queijo extra",getPreco());
                    else if(isMolhoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Calabresa + Molho extra",getPreco());
                }else
                    return String.format("%s R$ %.2f","Pizza Calabresa",getPreco());
            }
            case BACON ->{
                if(isMolhoExtra() || isQueijoExtra()){
                    if(isMolhoExtra() && isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Bacon + Queijo extra + Molho extra",getPreco());
                    else if(isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Bacon + Queijo extra",getPreco());
                    else if(isMolhoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza Bacon + Molho extra",getPreco());
                }else
                    return String.format("%s R$ %.2f","Pizza Bacon",getPreco());
            }
            case ESPECIAL ->{
                if(isMolhoExtra() || isQueijoExtra()){
                    if(isMolhoExtra() && isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza especial da casa + Queijo extra + Molho extra",getPreco());
                    else if(isQueijoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza especial da casa + Queijo extra",getPreco());
                    else if(isMolhoExtra())
                        return  String.format("%s R$ %.2f",
                                "Pizza especial da casa + Molho extra",getPreco());
                }else
                    return String.format("%s R$ .2f","especial da casa",getPreco());
            }
        }
        return null;
    }
}

public class Tesoura {
    public String marca;
    public double compr;
    public String tipoPonta;
    public String cor;    

    public Tesoura(String marca, double compr, String tipoPonta, String cor){
        this.marca=marca;
        this.compr=compr;
        this.tipoPonta=tipoPonta;
        this.cor=cor;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public double getCompr(){
        return compr;
    }public void setCompr(double compr){
        this.compr=compr;
    }public String getTipoPonta(){
        return tipoPonta;
    }public void setTipoPonta(String tipoPonta){
        this.tipoPonta=tipoPonta;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }
    public String cortar(){
        return "Cortar coisas.";
    }    
}
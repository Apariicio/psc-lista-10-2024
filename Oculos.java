public class Oculos {
    public String marca;
    public String modelo;
    public String tipoLente;
    public String cor;

    public Oculos(String marca, String modelo, String tipoLente, String cor){
        this.marca=marca;
        this.modelo=modelo;
        this.tipoLente=tipoLente;
        this.cor=cor;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getModelo(){
        return modelo;
    }public void setModelo(String modelo){
        this.modelo=modelo;
    }public String getTipoLente(){
        return tipoLente;
    }public void setTipoPonta(String tipoLente){
        this.tipoLente=tipoLente;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }
    public String ajustar(){
        return "encaixa perfeitamente no rosto.";
    }    
}
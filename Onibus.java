public class Onibus {
    String empresa;
    int qntPessoa;
    String fabricante;
    String cor;
    String rota;

    public Onibus(String empresa, int qntPessoa, String fabricante, String cor, String rota){
        this.empresa=empresa;
        this.qntPessoa=qntPessoa;
        this.fabricante=fabricante;
        this.cor=cor;
        this.rota=rota;
    }public String getEmpresa(){
        return empresa;
    }public void setEmpresa(String empresa){
        this.empresa=empresa;
    }public int getQntPessoa(){
        return qntPessoa;
    }public void setQntPessoa(int qntPessoa){
        this.qntPessoa=qntPessoa;
    }public String getFabricante(){
        return fabricante;
    }public void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public String getRota(){
        return rota;
    }public void setRota(String rota){
        this.rota=rota;
    }
    public String embarcar(){
        return "embarcar pessoas";
    }public String desembarcar(){
        return "desembarcar pessoas";
    }public String iniciar(){
        return "um ponto de controle de inicio de rota";
    }public void parada(){
        System.out.println("A cada sinal dado na rua por um passageiro, o onibus para.");
    }
}
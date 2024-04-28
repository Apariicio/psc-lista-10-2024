public class Aviao {
    String empresa;    
    String modelo;
    String cor;
    int qntPessoa;

    public Aviao(String empresa, String modelo, String cor, int qntPessoa){
        this.empresa=empresa;        
        this.modelo=modelo;
        this.cor=cor;
        this.qntPessoa=qntPessoa;
    }public String getEmpresa(){
        return empresa;
    }public void setEmpresa(String empresa){
        this.empresa=empresa;
    }public String getModelo(){
        return modelo;
    }public void setModelo(String modelo){
        this.modelo=modelo;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public int getQntPessoa(){
        return qntPessoa;
    }public void setQntPessoa(int qntPessoa){
        this.qntPessoa=qntPessoa;
    }
    public String decolar(){
        return "sair do chao e iniciar seu vôo.";
    }public void aterrizar(){
        System.out.println("Tem excelentes pilotos que conseguem realizar a aterrissagem com perfeição.");
    }
}
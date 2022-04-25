package atividadelojajava;

public class Mercadoria {
    
    String nomeMercadoria;
    int qntMaxima;
    int qntMinima;
    int qntAtual;
    double valorUnitario;
    double valorTotal; 
    boolean reposicao; 

    public Mercadoria(){
    }
    
    public Mercadoria(String nomeMercadoria, int qntMaxima, int qntMinima, int qntAtual, double valorUnitario) {
        this.nomeMercadoria = nomeMercadoria;
        this.qntMaxima = qntMaxima;
        this.qntMinima = qntMinima;
        this.qntAtual = qntAtual;
        this.valorUnitario = valorUnitario;
        this.valorTotal = this.valorUnitario * this.qntAtual;
    }

    
    public void calcularValorTotalMercadoria()
    {    
        this.valorTotal = this.valorUnitario * this.qntAtual;          
    }
    
    public void calcularReposicao()
    {
        if(this.qntMinima > this.qntAtual)
        {
            this.reposicao = true;
        }
        else
        {
            this.reposicao = false;
        }
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }

    public int getQntMaxima() {
        return qntMaxima;
    }

    public void setQntMaxima(int qntMaxima) {
        this.qntMaxima = qntMaxima;
    }

    public int getQntMinima() {
        return qntMinima;
    }

    public void setQntMinima(int qntMinima) {
        this.qntMinima = qntMinima;
    }

    public int getQntAtual() {
        return qntAtual;
    }

    public void setQntAtual(int qntAtual) {
        this.qntAtual = qntAtual;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isReposicao() {
        return reposicao;
    }

    public void setReposicao(boolean reposicao) {
        this.reposicao = reposicao;
    }
    
}

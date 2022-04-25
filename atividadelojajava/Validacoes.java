package atividadelojajava;

public class Validacoes {
    int qntMaxima, qntMinima, qntAtual;
    double valorUnitario;

    public Validacoes() {
    }
    
    public static boolean verificarQntMaxima(int qntMaxima)
    {
        if(qntMaxima > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean verificarQntMinima(int qntMinima, int qntMaxima)
    {
        if(qntMinima > 0 && qntMinima <= qntMaxima)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean verificarQntAtual (int qntAtual, int qntMaxima)
    {
        if(qntAtual <= qntMaxima && qntAtual >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}

package atividadelojajava;

import java.io.IOException;
import java.util.ArrayList;

public class Impressao {
    public static void impirmirMenu()
    {
        System.out.println("Bem-vindo! Digite o número correspondente a operação: ");
        System.out.println("1 - Adicionar novos produtos");
        System.out.println("2 - Imprimir todos os produtos");
        System.out.println("3 - Sair!");
    }
    
    public static void inprimirMercadorias(ArrayList<Mercadoria> mercadorias)
    {
        for(Mercadoria mercadoria : mercadorias)
        {
            System.out.println("");
            System.out.print("Nome do Produto: ");
            System.out.println(mercadoria.getNomeMercadoria());
            
            System.out.print("Quantidade mínima: ");
            System.out.println(mercadoria.getQntMinima());
            
            System.out.print("Quantidade atual: ");
            System.out.println(mercadoria.getQntAtual());
            
            System.out.print("Valor Unitário: ");
            System.out.println(mercadoria.getValorUnitario());
            
            System.out.print("Vator Total: ");
            System.out.println(mercadoria.getValorTotal());
            
            System.out.print("Precisa Repor?: ");
            if(mercadoria.isReposicao())
            {
                System.out.println("Sim");
            }
            else
            {
                System.out.println("Não");
            }
            
            System.out.println("");
        }
    }
}

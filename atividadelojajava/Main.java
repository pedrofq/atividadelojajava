package atividadelojajava;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int escolhaUsuario;
        boolean userCheck;
        String nomeMercadoria;
        int qntMaxima, qntMinima, qntAtual;
        double valorUnitario;
        int userCheckInt = 0;
        boolean testeValidacao = false;
        
        Estoque estoque = new Estoque();
      
        while(true)
        {
            Impressao.impirmirMenu();
            userCheck = true;
            escolhaUsuario = sc.nextInt();
            if(escolhaUsuario == 1)
            {
                while(userCheck == true)
                { 
                    System.out.println("");
                    
                    //Receber nome da mercadoria
                    System.out.print("Digite o nome da mercadoria: ");     
                    nomeMercadoria = sc.next();
               
                    //Receber quantidade máxima
                    System.out.print("Digite a quantidade MÁXIMA dessa mercadoria: ");                
                    qntMaxima = sc.nextInt();
                    testeValidacao = Validacoes.verificarQntMaxima(qntMaxima);
                    while(testeValidacao == false)
                    {
                        System.out.print("Quantidade máxima inválida. Digite novamente: ");              
                        qntMaxima = sc.nextInt();
                        testeValidacao = Validacoes.verificarQntMaxima(qntMaxima);  
                    }
                    testeValidacao = false;
                    
                    
                    //Receber quantidade mínima          
                    System.out.print("Digite a quantidade MÍNIMA dessa mercadoria: ");                
                    qntMinima = sc.nextInt();
                    testeValidacao = Validacoes.verificarQntMinima(qntMinima, qntMaxima);
                    while(testeValidacao == false)
                    {
                        System.out.print("Digite valor maior que 0 e menor ou igual a quantidade máxima " + qntMaxima + ". Digite novamente a quantidade mínima: ");
                        qntMinima = sc.nextInt();
                        testeValidacao = Validacoes.verificarQntMinima(qntMinima, qntMaxima); 
                    }
                    testeValidacao = false;
                    
                    
                    //Receber quantidade atual       
                    System.out.print("Digite a quantidade ATUAL dessa mercadoria: ");                
                    qntAtual = sc.nextInt();
                    testeValidacao = Validacoes.verificarQntAtual(qntAtual, qntMaxima);
                    while(testeValidacao == false)
                    {
                        System.out.print("Digite valor maior que 0 e menor ou igual a quantidade máxima " + qntMaxima + ". Digite novamente a quantidade atual: ");
                        qntAtual = sc.nextInt();
                        testeValidacao = Validacoes.verificarQntAtual(qntAtual, qntMaxima);
                    }
                    testeValidacao = false;
                    
                    
                    //Receber valor unitário
                    System.out.print("Digite o valor unitário da mercadoria: ");
                    valorUnitario = sc.nextDouble();
                    
                    
                    //Criar uma nova mercadoria
                    Mercadoria mercadoria = new Mercadoria(nomeMercadoria, qntMaxima, qntMinima, qntAtual, valorUnitario);
                    mercadoria.calcularValorTotalMercadoria();
                    mercadoria.calcularReposicao();
                    
                    
                    //Adicionar a mercadoria ao estoque
                    estoque.adicionarMercadoriaEstoque(mercadoria);
                    
   
                    while(true)
                    {
                        System.out.print("Deseja adicionar novas mercadorias? 1 - Sim / 2 - Não: ");
                        userCheckInt = sc.nextInt();
                        
                        if(userCheckInt == 1 || userCheckInt == 2)
                        {
                            break;
                        }
                    }
 
                    if(userCheckInt == 2)
                    {
                        userCheck = false;
                    }
                }          
            }
            else if(escolhaUsuario == 2)
            {
                Impressao.inprimirMercadorias(estoque.getMercadorias());
            }
            else if(escolhaUsuario == 3)
            {
                break;
            }
            else
            {
                System.out.println("Digite um valor válido! 1, 2 ou 3!");
            }
        }   
    }    
}

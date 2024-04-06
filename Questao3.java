import java.util.Scanner;
public class Questao3
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
    
         int escolha = 0;
        while(true){
            System.out.println("Gostaria de converter para 1-celsius ou 2-fahrenheint?\nSelecione 3 para sair");
             escolha = ler.nextInt();
             if(escolha==3){
                 break;
             }
            System.out.println("Qual a temperatura?");
            int temp = ler.nextInt();
             if (escolha==1){
                 double celsius = (temp-32)/1.8;
                 System.out.println("Sua temperatura em celsius é: "+celsius);
             }
             else if(escolha==2){
                 double fahrenheint = (1.8*temp)+32;
                 System.out.println("Sua temperatura em fahrenheint é: "+fahrenheint);
             }
        }
        System.out.println("Adeus");
    }
}

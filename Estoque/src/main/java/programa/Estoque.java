package programa;

import java.util.Scanner;
import Entidade.Produto;

public class Estoque {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Produto x, y, z;
        x = new Produto();
        y = new Produto();
        z = new Produto();
        
        char prod;
        
        System.out.println("Insira os dados do produto X");
        x.nome = sc.next();
        x.preco = sc.nextDouble();
        x.quantidade = sc.nextInt();
        
        System.out.println("Insira os dados do produto Y");
        y.nome = sc.next();
        y.preco = sc.nextDouble();
        y.quantidade = sc.nextInt();
        
        System.out.println("Insira os dados do produto Z");
        z.nome = sc.next();
        z.preco = sc.nextDouble();
        z.quantidade = sc.nextInt();
        
        
    }
}

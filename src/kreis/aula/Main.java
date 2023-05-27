package kreis.aula;
import br.edu.fateczl.arvoreint.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criação da árvore
       Arvore arvore = new Arvore();
        arvore.insert(30);
        arvore.insert(15);
        arvore.insert(60);
        arvore.insert(10);
        arvore.insert(20);
        arvore.insert(40);
        arvore.insert(80);

        // Traversal pré-ordem
        System.out.println("Traversal pré-ordem:");
        arvore.infixSearch();

        // Traversal em ordem (ordem crescente)
        System.out.println("\nTraversal em ordem:");
        arvore.infixSearch();

        // Traversal pós-ordem
        System.out.println("\nTraversal pós-ordem:");
        arvore.postfixSearch();
    }
}

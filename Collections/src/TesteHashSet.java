import java.util.*;

class TesteHashSet {
    public static void main(String[] args) {
        HashSet<String> carros = new HashSet<String>();

        // adicionado em ordem diversa
        carros.add("BMW");
        carros.add("Ferrari");
        carros.add("Porshe");
        carros.add("Corvete");
        System.out.println("Meus carros:"+carros);

        /*Tentando adicionar elementos iguais*/
        carros.add("Ferrari");
        carros.add("Corvete");
        System.out.println("Meus carros:"+carros);

        /*Removendo element de um determinado índice*/
        carros.remove("Porshe");

        System.out.println("Meus carros:"+carros);
    }
}
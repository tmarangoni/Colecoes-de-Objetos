import java.util.*;

class TesteHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> numberList = new HashMap<String, Integer>();
        numberList.put("one", 1);
        numberList.put("two", 2);
        numberList.put("three", 3);
        numberList.put("four", 4);
        System.out.println(numberList);

        //HashMap permite chaves nulas mas somente uma chave por valor
        numberList.put(null, 8);
        numberList.put(null, 9);// sobrescreve o anterior
        System.out.println("Size : " + numberList.size());

        //HashMap method usaga
        if (numberList.containsKey(null)) {
            System.out.println("Contem chave null, value=" + numberList.get(null));
        } else {
            System.out.println("Nao contem chave null");
        }

        if (numberList.containsValue(4)) {
            System.out.println("4 esta na colecao");
        } else {
            System.out.println("4 não está na colecao");
        }

        //keyset() retorna coleção (conjunto) das chaves
        System.out.println(numberList.keySet());

        //Itera sobre os pares de chave e valor da coleção
        for (Map.Entry<String, Integer> entry : numberList.entrySet()) {
            System.out.println("key : " + entry.getKey() + "       value : " + entry.getValue());
        }

        //entrySet : retorna conjunto com todas as entradas no mapa
        Iterator it = numberList.entrySet().iterator();

        //itera sobre os pares de chave e valor do mapa
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
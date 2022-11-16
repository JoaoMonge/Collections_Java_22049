import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Uma lista no java pode conter qualquer tipo de objecto.
        List<String>  palavras = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        List<Double> decimais = new ArrayList<>();
        List<Object> qualquerCoisa = new ArrayList<>();

        //Operações importantes das listas:

        //Adicionar um elemento
        palavras.add("Nova palavra");
        numeros.add(10);
        decimais.add(23.0);
        qualquerCoisa.add("sfv");
        qualquerCoisa.add(10);

        //Adicionar um elemento na posição
        palavras.add(1,"palavra");
        numeros.add(0,200);

        //Trocar elemento na posição
        palavras.set(0,"troquei");

        //Remover um objecto da lista
        palavras.remove("troquei");

        //Remover na posição
        palavras.remove(0);
        numeros.remove(0);

        //Apagar os elementos da lista
        numeros.clear();

        //Obter um elemento da lista que se encontre numa posição
        //palavras.get(0);

        //Encontrar um elemento na lista
        int index = palavras.indexOf("Olá");

        //Saber se a lista está vazia
        if( palavras.isEmpty() ){
            //Lista vazia
        }

        //Saber quantos elementos temos na lista
        palavras.size();

        //Dado  o array inverta os valores do mesmo

        List<String> ola = new ArrayList<>();
        ola.add("O");
        ola.add("L");
        ola.add("A");
        ola.add(" ");
        ola.add("T");
        ola.add("U");
        ola.add("R");
        ola.add("M");
        ola.add("A");

        for (int i = 0; i < ola.size()/2; i++) {
            String troca = ola.get(i);
            ola.set(i,ola.get(ola.size()-i-1));
            ola.set(ola.size()-i-1,troca);
        }

        System.out.println(ola);
    }
}
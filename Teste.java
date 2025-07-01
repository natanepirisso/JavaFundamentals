

import java.util.ArrayList;


//Tipos primitivos: 
//Inteiros: byte, short, int, long => Cada um depende do tamanho do inteiro que comporta (tamanho da memória)
//float e double: Precisão simples e dupla respectivamente
// String, char, 
//Boolean
//While é a mesma pegada que C
// Casting : Passar um tipo pra outro pra outro
public class Teste {
    public static void main(String[] args) {
        ArrayList<String> namesArray= new ArrayList<>();
        namesArray.add("Naythan");
        namesArray.add("Thalyta");
        namesArray.add("Ben");
        namesArray.add("Negão");
        namesArray.add("Pandora");
        namesArray.add("Suzy");
        for (int i = 0; i < namesArray.size(); i++ ){
            System.out.println(namesArray.get(i));
        }
       int c = 0;
       while (c < 10){
        System.out.println(namesArray.get(1) + " " + "Te amo!!!!");
        c++;
       }
    }
}
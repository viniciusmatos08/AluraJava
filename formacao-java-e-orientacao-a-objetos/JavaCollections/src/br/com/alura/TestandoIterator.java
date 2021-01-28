package br.com.alura;

import java.util.*;

public class TestandoIterator {
    public static void main(String[] args) {

        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        Iterator<String> iterador = letras.iterator();
        
        while(iterador.hasNext()) {
        	System.out.println(iterador.next());
        }
    }
}
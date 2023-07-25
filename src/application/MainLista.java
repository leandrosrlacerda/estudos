package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainLista {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Leandro");
        list.add("Arthur");
        list.add("Rosane");
        list.add("Jose Mauro");
        list.add("Bruno");
        list.add("Hugo");
        list.add("Ana Luiza");

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        list.removeIf(x -> x.charAt(0) == 'H');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        System.out.println("Index of Rosane: " + list.indexOf("Rosane"));
        System.out.println("Index of Hugo: " + list.indexOf("Hugo"));

        System.out.println("-------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'O').findFirst().orElse(null);
        System.out.println(name);
    }
}

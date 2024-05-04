package edu.bruno.classes;

public class AnatomiaClasse {
    public static void main (String [] args) {
        String firstName = "Bruno";
        String lastName = "Macedo";

        System.out.println(nomeCompleto(firstName, lastName));
    } 

    public static String nomeCompleto(String firstName, String lastName) {
        return "Nome completo: " + firstName + " " + lastName;
    }
}

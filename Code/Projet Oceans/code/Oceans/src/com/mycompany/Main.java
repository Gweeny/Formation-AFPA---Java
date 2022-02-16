package com.mycompany;

public class Main {

    public static void main(String[] args) {

        int nbEspecesEn2018 = 182854;
        int ndEspecesQuidisparait = 26000;
        int nbEspecesEn2019 = nbEspecesEn2018 - ndEspecesQuidisparait;
        int valeurActuelle;

        String texteAAfficher;
        texteAAfficher = "Chaque année, 26000 espèces disparaissent de la surface de la planète.";
        System.out.println(texteAAfficher);

        texteAAfficher = "En 2018, elles étaient au nombre de ";
        System.out.println(texteAAfficher + nbEspecesEn2018 + ".");

        valeurActuelle = nbEspecesEn2018 - ndEspecesQuidisparait;
        texteAAfficher = "En 2019 elles n’étaient plus que ";
        System.out.println(texteAAfficher + valeurActuelle + ".");

        texteAAfficher = "En une journée, elles sont peut être passée de " + valeurActuelle + " à " + --valeurActuelle;
        System.out.println(texteAAfficher);

        if (valeurActuelle <= 156854) {
            System.out.println("ça craint");
            System.out.println("ddd");
        } else {
            System.out.println(" On est sauvés");
            System.out.println("toto");
        }
    }
}

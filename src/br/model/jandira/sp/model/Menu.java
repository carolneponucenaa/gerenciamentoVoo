package br.model.jandira.sp.model;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Gol gol = new Gol("Porto Seguro - BA","Gol", "Guarulhos - SP", "2:00", "19/12/2023", "14:00","16:00", 100, 456);
        Azul azul = new Azul("Gramado - RS", "Azul","Guarulhos - SP","2 horas","10/02/2023","15:45","17:45",70,432);
        Latam latam = new Latam("Fortaleza - CE", "Latam","Guarulhos - SP","3 horas","10/07/2023","17:45","20:45",70,342);

        boolean continuar = true;
        while (continuar){
            System.out.println("Insira qual deseja acessar:");
            System.out.println("1-  Voos Gol");
            System.out.println("2-  Voos Azul");
            System.out.println("3-  Voos Latam");

            int opcoes = scanner.nextInt();

            switch (opcoes){
                case 1:

            }
        }
    }
}

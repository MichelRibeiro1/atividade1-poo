
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michel
 */
public class Teste {
    static double[] angulos = {0, 15, 30 ,45, 60, 75, 90};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite a velocidade inicial: ");
        double vel = Double.parseDouble(scanner.nextLine());
        scanner.close();
        
        Morteiro morteiro = new Morteiro(vel);

        for (double angulo : angulos ) {
            morteiro.setAngulo(angulo);
            System.out.println(" " + morteiro.range());
          }
    }
}

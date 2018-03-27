/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michel
 */
public class Morteiro {
    double velocidadeInicial, angulo;
    final double gravidade  = 10;

    public Morteiro(double velI) {
        this.velocidadeInicial = velI;
    }

    public double getVelocidadeInicial() {
        return velocidadeInicial;
    }

    public void setVelocidadeInicial(double velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }


    public double range() {
        double range = (Math.pow(velocidadeInicial, 2) * Math.sin(2 * Math.toRadians(angulo)))/gravidade;
        return Math.floor(range);
    }
    
}

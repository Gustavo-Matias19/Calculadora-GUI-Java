/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Divisao extends OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        if(x == 0||y == 0){
            return 0;
        }else {
            return x / y;
        }
    }
}


package Trabalho;

import br.com.unisep.luiz.MyRunTimeException;
import java.util.Scanner;

public class Calculadora {

   protected double v1, v2;

    @Override
    public String toString() {
        return "Calculadora{" + "v1=" + v1 + ", v2=" + v2 + '}';
    }

    public Calculadora(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    Scanner en = new Scanner(System.in);

    public Calculadora() {
    }

    public double soma() {
        return v1 + v2;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double sub() {
        return v1 - v2;
    }

    public double mult() {
        return v1 * v2;
    }

    public double div() {
        if (v2 != 0) {
            return v1 / v2;
        } else {
            throw new MyRunTimeException("Nao pode dividir por ZERO - 0");
        }
    }

    public void entrada() {
        System.out.println("Digite o Primeiro numero: ");
        v1 = en.nextInt();
        System.out.println("Digite o Segundo número");
        v2 = en.nextInt();
    }
}

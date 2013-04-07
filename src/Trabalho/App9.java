package Trabalho;

import br.com.unisep.luiz.io.Console;
import java.lang.reflect.Method;
import java.util.Scanner;

public class App9 {

    public static void main(String[] args) {
        @SuppressWarnings("empty-statement")
        int op = 1;

        String escolha;
            Scanner en = new Scanner(System.in);
            Calculadora ca = new Calculadora();
            Console.escreverln("1 - Soma");
            Console.escreverln("2 - Divizão");
            Console.escreverln("3 - Subtraçao");
            Console.escreverln("4 - Multiplicaçao");
            op = en.nextInt();
           
            while (op != 0) {

                switch (op) {
                    case 1:ca.entrada();
                        try {
                            
                            Class c = Class.forName("Trabalho.Calculadora");
                            Object obj = c.newInstance();

                            Method set = c.getDeclaredMethod("setV1", Double.TYPE);
                            set.invoke(obj, ca.v1);
                            set = c.getDeclaredMethod("setV2", Double.TYPE);
                            set.invoke(obj, ca.v2);

                            Method get = c.getDeclaredMethod("soma");
                            get.invoke(obj);

                            System.out.println("O valor é: "+get.invoke(obj));                           
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }   
                        break;                       

                    case 2:ca.entrada();                        
                        try {
                            Class c = Class.forName("Trabalho.Calculadora");
                            Object obj = c.newInstance();

                            Method set = c.getDeclaredMethod("setV1", Double.TYPE);
                            set.invoke(obj, ca.v1);
                            set = c.getDeclaredMethod("setV2", Double.TYPE);
                            set.invoke(obj, ca.v2);

                            Method get = c.getDeclaredMethod("div");
                            get.invoke(obj);

                            System.out.println("O valor é: "+get.invoke(obj));                            
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                    case 3:ca.entrada();                        
                        try {
                            Class c = Class.forName("Trabalho.Calculadora");
                            Object obj = c.newInstance();

                            Method set = c.getDeclaredMethod("setV1", Double.TYPE);
                            set.invoke(obj, ca.v1);
                            set = c.getDeclaredMethod("setV2", Double.TYPE);
                            set.invoke(obj, ca.v2);

                            Method get = c.getDeclaredMethod("sub");
                            get.invoke(obj);

                            System.out.println("O valor é: "+get.invoke(obj));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                    case 4:ca.entrada();                        
                        try {
                            Class c = Class.forName("Trabalho.Calculadora");
                            Object obj = c.newInstance();

                            Method set = c.getDeclaredMethod("setV1", Double.TYPE);
                            set.invoke(obj, ca.v1);
                            set = c.getDeclaredMethod("setV2", Double.TYPE);
                            set.invoke(obj, ca.v2);

                            Method get = c.getDeclaredMethod("mult");
                            get.invoke(obj);

                            System.out.println("O valor é: "+get.invoke(obj));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                }
            }
        }
    
    }

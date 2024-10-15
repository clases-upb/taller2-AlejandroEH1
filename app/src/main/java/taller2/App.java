/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
        
            System.out.println(Calcular_saldo(1500000, 500000, 1000000));
            System.out.println(Calcular_tip((float)-50));
            System.out.println(Obtener_puntos(-1, 2, 1));
            System.out.println(Calcular_definitiva(4, 4, 4, 4, 4, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f));
            System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f));
            System.out.println(Calcular_salario(200, 50, 30, -150.0f));
            System.out.println(Calcular_area_triangulo(-10, 5));
            System.out.println(Calcular_perimetro_cuadrado(-5));
            System.out.println(Calcular_area_circulo(-5));
            System.out.println(Calcular_volumen_cilindro(5, -10));

            
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */


        public static int Calcular_saldo (int Base_Dinero_taquilla, int Total_recaudos, int Total_retiros){

            final int a = 2000000;
            int saldo_taquilla = 0;

                try {
                    
                    if (Base_Dinero_taquilla > a || Base_Dinero_taquilla < a) {
                        return -1;
                    }

                    saldo_taquilla = Base_Dinero_taquilla + Total_recaudos - Total_retiros;

                    return saldo_taquilla;


                } catch (Exception e) {
                    return -1;
                }
              

        }





    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */

     public static String Calcular_tip (float Consumo_cliente){

        final float Propina = (float)0.10, Consumo = (float)0.08, a = 0;
        float impuesto_propina = 0, impuesto_consumo = 0, Valor_total = 0;
        
        
            try {
                
                if (Consumo_cliente <= a) {
                    return "Error calculando consumo";
                }


                impuesto_propina = Consumo_cliente * Propina;
                impuesto_consumo = Consumo_cliente * Consumo;
                Valor_total = Consumo_cliente + impuesto_consumo + impuesto_propina;

                String Factura = "valor comida: $" + Consumo_cliente + " - " + "valor propina: $" + impuesto_propina + " - " + "valor impoconsumo: $" + impuesto_consumo + " - " + "total a pagar: $" + Valor_total;

                return Factura;

            } catch (Exception e) {
                return "Error calculando consumo";
            }

     }


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */


     public static int Obtener_puntos(int Partidos_ganados, int partidos_perdidos, int partidos_empatados){

        final short PPG = 3, PPE = 1, PPP = 0, a = 0;
        int PG = 0, PE = 0, PP = 0, Puntos_totales = 0;
        try {
            
            if (partidos_empatados < a || partidos_perdidos < a || Partidos_ganados < a) {
                return -1;
            }
            
            PG = Partidos_ganados * PPG;
            PE = partidos_empatados * PPE;
            PP = partidos_perdidos * PPP;

            Puntos_totales = PG + PE + PP; 

            return Puntos_totales;


        } catch (Exception e) {
            return -1;
        }
     }



    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

     public static float Calcular_definitiva(float nota1, float nota2, float nota3, float nota4, float nota5, float valor_nota1, float valor_nota2, float valor_nota3, float valor_nota4, float valor_nota5){

        
        float Nota_final = 0;
        final byte a = 0, b = 5;

        try {
            
            if (nota1 <a || nota1 >b || nota2 <a || nota2 >b || nota3 <a || nota3 >b || nota4 <a || nota4 >b || nota5 <a || nota5 >b) {
                return -1;
             }

             if ( (valor_nota1 + valor_nota2 + valor_nota3 + valor_nota4 + valor_nota5) < 1 || (valor_nota1 + valor_nota2 + valor_nota3 + valor_nota4 + valor_nota5) > 1) {
                return -1;
             }

             Nota_final = (nota1*valor_nota1)+(nota2*valor_nota2)+(nota3*valor_nota3)+(nota4*valor_nota4)+(nota5*valor_nota5);

             return Nota_final;
            
        } catch (Exception e) {
            return -1;
        }
            

     }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

     public static float Calcular_para_ganar(float nota1, float nota2, float nota3, float nota4, float valor_nota1, float valor_nota2, float valor_nota3, float valor_nota4, float valor_nota5){

        
        float suma_notas = 0;
        final byte a = 0, b = 5, nota_minimaG = 3;
        float nota5 = 0;

        try {
            
            if (nota1 <a || nota1 >b || nota2 <a || nota2 >b || nota3 <a || nota3 >b || nota4 <a || nota4 >b) {
                return -1;
             } else

            if ( (valor_nota1 + valor_nota2 + valor_nota3 + valor_nota4 + valor_nota5) < 1 || (valor_nota1 + valor_nota2 + valor_nota3 + valor_nota4 + valor_nota5) > 1) {
                return -1;
             } 

                suma_notas = (nota1*valor_nota1) + (nota2*valor_nota2) + (nota3*valor_nota3) + (nota4*valor_nota4);

                nota5 = (nota_minimaG - suma_notas)/valor_nota5;

            

             return nota5;
            
        } catch (Exception e) {
            return -1;
        }
            

     }


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_salario(int HorasN_laboradas, int HorasED_laboradas, int HorasEN_laboradas, float valor_horaN){

        float PhorasD = 0, PhorasN = 0;
        final float RhorasD = 0.15f, RhorasN = 0.35f, a=0;

            try {
                
                if (HorasN_laboradas <= a || valor_horaN <=a) {
                    return -1;
                }

                PhorasD = HorasED_laboradas * RhorasD * valor_horaN;
                PhorasN = HorasEN_laboradas * RhorasN * valor_horaN;

                return HorasN_laboradas * valor_horaN + PhorasD + PhorasN;

            } catch (Exception e) {
                return -1;
            }

     }


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_area_triangulo(float base, float altura){

        try {
            final byte minimo = 0;
            final float cons = 0.50f;
            float area = 0f;
    
            if (base>minimo && altura>minimo) {
            area =  cons*altura*base;
            }
            else
            area = -1;
    
            return area;
        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_perimetro_cuadrado(float Lado_cuadrado){

            final byte a = 4, b = 0;
            float perimetro = 0;

            try {

                if (Lado_cuadrado <=b) {
                    return -1;
                }

                perimetro = Lado_cuadrado * a;

                return perimetro;

            } catch (Exception e) {
               return -1;
            }
            
     }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_volumen_cilindro(float Rbase, float altura){

        final float pi = 3.1415927f, a = 0;
        float volumen = 0;
            try {
                
                if (Rbase <= a || altura <=a) {
                    return -1;
                }

                volumen = pi * Rbase * Rbase * altura;

                return volumen;
                
            } catch (Exception e) {
                return -1;
            }
     }


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_area_circulo(float Radio_circulo){

        final float pi = 3.1415927f, a = 0;
        float area = 0;

            try {
            
                if (Radio_circulo <= a) {
                    return -1;
                }

                area = pi*Radio_circulo*Radio_circulo;

                return area;
            
            } catch (Exception e) {
             return -1;
            }

     }



}

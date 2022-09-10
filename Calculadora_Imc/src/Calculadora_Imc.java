 import java.util.Scanner;
   public class Main Calculadora_Imc {
     public static double calculadora_Imc(double peso, double estatura){
         return peso/ Math.pow(estatura, 2);
     }
     public static String nivelDePeso(double IMC){
         if (IMC < 18.5)
             return "Bajo peso";
         else if(IMC > 18.5 && IMC <= 24.9)
             return "Normal";
         else if (IMC >= 25 && IMC <=29.9)
             return "Sobrepeso";
         else if (IMC >= 30 && IMC <= 34.9)
             return "Obesidad 1";
         else if (IMC >= 35 && IMC <= 39.9)
             return "obesidad 2";
         else if (IMC >= 40 && IMC <= 49.9)
             return "Obesidad 3";
         else
             return "Obesidad 4";


     }

     public static void main(String[] args) {

         Scanner lector = new Scanner( System.in);

         double peso, estatura;

         System.out.println("Ingrese su peso (Km): ");
         peso = lector.nextDouble();
         System.out.println("Ingrese su estatura (M): ");
         estatura = lector.nextDouble();

         System.out.println("Su nivel de peso es: "+nivelDePeso(calculadora_Imc(peso, estatura)));






     }
 }









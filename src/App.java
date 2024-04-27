import java.util.Scanner;

public class App {

    public static int num1;
    public static int num2;
    public static int num3;
    public static int sumademen;
    public static int restadmay; 
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
               
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);


        //Suma de los numeros menores 

        if (num1>num2 && num1>num3) {
            sumademen= Math.addExact(num2, num3) ;
            System.out.print("La suma de los numeros menores es: ");
            System.out.println(sumademen);
        }
        if (num2>num3 && num2>num1) {
            sumademen= Math.addExact(num1, num3) ;
            System.out.print("La suma de los numeros menores es: ");
            System.out.println(sumademen);
        }
        if (num3>num1 && num3>num2) {
            sumademen= Math.addExact(num1, num2) ;
            System.out.print("La suma de los numeros menores es: ");
            System.out.println(sumademen);
        }

        //Resta de los numeros mayores 

        if (num1>num3 && num2>num3) {
            restadmay= Math.subtractExact(num1, num2) ;
            System.out.print("La resta de los numeros mayores mayores es: " );
            System.out.println(restadmay);  
        }
        if (num2>num1 && num3>num1) {
            restadmay= Math.subtractExact(num2, num3) ;
            System.out.print("La resta de los numeros mayores mayores es: " );
            System.out.println(restadmay);  
        }
        if (num3>num2 && num1>num2) {
            restadmay= Math.subtractExact(num3, num1) ;
            System.out.print("La resta de los numeros mayores mayores es: " );
            System.out.println(restadmay);  
        }
        
        // Mostrar el numero mayor de los 3 ingresados

        if (num1>num2 && num1>num3) {
            System.out.print("El numero mayor de los 3 ingresados es: " +num1);
        }
        if (num2>num1 && num2>num3) {
            System.out.print("El numero mayor de los 3 ingresados es: "  +num2);
        }
        if (num3>num2 && num3>num1) {
            System.out.print("El numero mayor de los 3 ingresados es: " +num3);
        }
        
        leer.close();


    }
}
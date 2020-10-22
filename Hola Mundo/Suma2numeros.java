import  java.util.Scanner ;

class  Suma2numeros {

    // metodo principal
    public  static  void  main ( String [] args ) {
        / *
        Vamos a crear un programa que se encargue de sumar dos numero
        y como tarea que sume n numeros wiiiii que todos sean positivos 
        y sino que imprima mensaje "numero negativo no se acepta"
        y vuelva a pedir un numero positivo>: v
        * / 

        // objeto para poder leer los numeros
        Entrada del escáner =  nuevo  escáner ( System . In);

        // variables
        int num1;
        
        int resultado = 0 ;

        hacer {
            // hacer la accion
            Sistema . fuera . println ( " Ingresa el numero a sumar: " );
            num1 = entrada . nextInt ();  // leer el siguiente entero
            resultado = resultado + num1;
        } while (num1 ! = 0 );

        // mientras no sea cero   
       

        // instrucciones del programa
       
        // System.out.println ("Ingresa el segundo numero a sumar:");
        // num2 = entrada.nextInt (); // leer el siguiente entero

        // operacion
        // resultado = num1 + num2;

        Sistema . fuera . println ( " La suma de los números es de: " + resultado);


    }
}
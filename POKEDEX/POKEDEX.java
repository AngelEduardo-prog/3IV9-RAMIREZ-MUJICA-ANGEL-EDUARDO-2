import java.util.Scanner;
class POKEDEX {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
            do{
                System.out.println("Elija una opcion para iniciar");
                System.out.println("1. Squirtle");
                System.out.println("2. Charmander");
                System.out.println("3. Bulbasur");
                System.out.println("4. Batalla");
                System.out.println("5. Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                    System.out.println ("Squirtle");
                    int opcionap;
                    do{
                        System.out.println("Squirtle el pokemon tortuga, para salir introdusca 0");
                            System.out.println("1 Descripcion");
                            opcionap = entrada.nextInt();
                              while (opcionap!=1);
                                 System.out.println ( "Tipo:Agua Vida:120 Ataque:20;");  
                               while (opcionap!=0);
                               break;
                               case 2:
                               System.out.println ("Charmander");
                               int opcioncb;
                               do{
                                   System.out.println("Charmander, el pokemon dragon de fuego, para salir introdusca 0");
                                       System.out.println("1 Descripcion");
                                         while (opcioncb!=1) 
                                            System.out.println ( "Tipo:Fuego Vida:110 Ataque:30;"); } 
                                          while (opcioncb!=0);
                                          break;
                        case 3:
                                          System.out.println ("Bulbasur");
                                          int opcionap;
                                          do{
                                              System.out.println("Bulbasur el pokemon planta, para salir introdusca 0");
                                                  System.out.println("1 Descripcion");
                                                  opcionap = entrada.nextInt();
                                                    while (opcionap!=1);
                                                       System.out.println ( "Tipo:Planta Vida:100 Ataque:40;");  
                                                     while (opcionap!=0);
                                                     break;
                        case 4:          
                                               System.out.println("Elige el primer pokemon para combatir.");
                                               int pa;
                                               do{
                                                System.out.println("1. Squirtle");
                                                System.out.println("2. Charmander");
                                                System.out.println("3. Bulbasur");
                                                pa = entrada.nextInt;
                                                System.out.println("Elige el segundo pokemon para combatir.");
                                                int pb;
                                                do{
                                                 System.out.println("1. Squirtle");
                                                 System.out.println("2. Charmander");
                                                 System.out.println("3. Bulbasur");
                                                 pb = entrada.nextInt;
                                                while pa=1 pa=ps psv=120 psa=20 
                                   
                                               }
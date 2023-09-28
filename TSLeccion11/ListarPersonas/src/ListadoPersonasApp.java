import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir =false;
        while (!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){ //Final del Try comienzo del Catch
                System.out.println("Ocurrio un error: "+e.getMessage());
            }//Final del Catch
            System.out.println();
        }//Fin Ciclo While
        }//Fin Metodo Main

        private static void mostrarMenu(){
            //mostramos las opciones
            System.out.print("""
                    ******* Listado de Personas *******
                    1. Agregar
                    2. Listar
                    3. Salir
                    """);
            System.out.print("Digite una de las opciones");
        }//Fin del Metodo mostrarMenu

        private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
            var opcion = Integer.parseInt(entrada.nextLine());
            var salir = false;
            //Revisamos la opcion digitada a traves de un switch
            switch (opcion){
                case 1 ->{//Agregar una persona a ala lista
                    System.out.print("Digite el nombre: ");
                    var nombre = entrada.nextLine();
                    System.out.print("Digite el telefono: ");
                    var tel = entrada.nextLine();
                    System.out.print("Digite elcorreo: ");
                    var email = entrada.nextLine();
                    //Creamos el objeto persona
                    var persona = new Persona(nombre, tel, email);
                    //Agregamos la persona a la lista
                    personas.add(persona);
                    System.out.println("La lista tiene: "+personas.size()+" elementoos");
                }//Fin caso 1
                case 2->{//Listar a las personas
                    System.out.println("Listado de personas: ");
                    //Mejoras con lamda yel metodo de referencia
                    //personas.forEach((persona) -> System.out.println(persona));
                    personas.forEach(System.out::println);
                }//Fin caso 2
                case 3 ->{//Salir del Ciclo
                    System.out.println("Hasta pronto: ");
                    salir = true;
                }//Fin caso 3
                default -> System.out.println("Opcion incorrecta: "+opcion);
            }//Final de switch
            return salir;
        }//Fin del Metodo ejecutarOperacion
    }//Fin de la clase ListadoPersonasApp

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    public ArrayList<Persona> Users = new ArrayList<Persona>();
    Scanner teclado = new Scanner(System.in);
    Clinica c = new Clinica();
    Cita cita[] = new Cita[20];
    int opcion, opcion2, seleccion1, contador, iddoctor, id;
    String idpaciente, fecha, hora;
    String nombre, apellido, telefono, usuario, contrasenia;
    int perfil, iddoc;
    String us, contra;
    String nombrepa, apellidopa;
    int bandera;
    boolean sn;
    int tamanio = 4;
    int otrous = 5;

        public Usuario() {
        }

        public void menu() {

            Persona p1 = new Doctor(1, "Javier", "Barahona", "4698-8762", "bjavier", "javier02", 1);
            Persona p2 = new Doctor(2, "Juan", "Rivera", "4885-8122", "jrivera", "riverajn", 1);
            Persona d1 = new Paciente(3, "Antony", "Barrera", "8720-8762", "abarrera", "tonybarrera", 2);
            Persona d2 = new Paciente(4, "Angel", "Lopez", "4321-8762", "alopez", "lopez01", 2);

            Users.add(p1);
            Users.add(p2);
            Users.add(d1);
            Users.add(d2);

            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.println("\t \t        Hospital San Juan Pablo II \n-----------------------------------------------------------------------------\n"
                    + "Bienvenido al sistema de generacion de citas al Hospital \n \n"
                    + "Seleccione una opcion. \n "
                    + "\t 1. Iniciar Sesion \n"
                    + "\t 2. Salir. \n");
            if (teclado.hasNextInt()) {
                seleccion1 = teclado.nextInt();
                teclado.nextLine();
            } else {
                System.out.println("\n_____________________________________________________________________________");
                System.out.println("Debes colocar un numero");
                teclado.nextLine();
                menu();
            }
            System.out.println("\n_____________________________________________________________________________");
            switch (seleccion1) {
                case 1:
                    System.out.println("Iniciar Sesion \n");
                    System.out.println("Ingrese su usuario:");
                    us = teclado.nextLine();
                    System.out.println("Ingrese su contrasenia:");
                    contra = teclado.nextLine();
                        for (int i = 0; i < tamanio; i++) {
                                if (us.equals(Users.get(i).getUsuario()) && contra.equals(Users.get(i).getContrasenia())) {
                                    if (Users.get(i).getPerfil() == 1) {
                                        System.out.println("\n_____________________________________________________________________________");
                                        System.out.println(" \t \tBienvenido Doctor " + Users.get(i).getNombre() + " " + Users.get(i).getApellido() + " \t ID: " + Users.get(i).getId() + "\n");
                                        System.out.println("_____________________________________________________________________________");
                                        bandera = 1;
                                        sn = true;
                                        iddoc = Users.get(i).getId();
                                    } else if (Users.get(i).getPerfil() == 2) {
                                        System.out.println("\n_____________________________________________________________________________");
                                        System.out.println(" \t \tBienvenido Paciente " + Users.get(i).getNombre() + " " + Users.get(i).getApellido() + " \t ID: " + Users.get(i).getId() + "\n");
                                        System.out.println("_____________________________________________________________________________");
                                        bandera = 2;
                                        sn = true;
                                        nombrepa = Users.get(i).getNombre();
                                        apellidopa = Users.get(i).getApellido();
                                    } else {
                                        sn = false;
                                    }
                                }
                            }
                    if (sn == true) {
                        if (bandera == 2) {
                            do {
                                menuPaciente();
                                if (teclado.hasNextInt()) {
                                    opcion = teclado.nextInt();

                                } else {
                                    System.out.println("\n_____________________________________________________________________________");
                                    System.out.println("Debes colocar un numero");
                                        }
                                
                                switch (opcion) {
                                    case 1:
                                        teclado.nextLine();
                                        System.out.println("_____________________________________________________________________________");
                                        System.out.println("Boleta para Ingresar Cita \n");
                                        System.out.println("Ingrese su Numero  de Id:");
                                        idpaciente = teclado.nextLine();
                                        for (int a = 0; a < tamanio; a++) {
                                            if (Users.get(a).getPerfil() == 1) {
                                                System.out.println("\n" + Users.get(a).getId() + "." + Users.get(a).getNombre() + " " + Users.get(a).getApellido() + "\n");
                                                }
                                            }

                                        System.out.println("Ingrese el Id de su doctor:");
                                        iddoctor = teclado.nextInt();
                                        teclado.nextLine();
                                        System.out.println("Ingrese la fecha de la cita dd/mm/AA ");
                                        fecha = teclado.nextLine();
                                        System.out.println("Ingrese la hora de la cita 00:00 ");
                                        hora = teclado.nextLine();
                                        int cli = c.ran();
                                        cita[contador] = new Cita(nombrepa, apellidopa, idpaciente, iddoctor, fecha, hora, cli);
                                        contador = contador + 1;
                                        System.out.println("Debe ir a la clinica " + cli);
                                        System.out.println(" \t \t \t CITA INGRESADA CON EXITO!");
                                        System.out.println("\n_____________________________________________________________________________");
                                        opcion = 0;
                                        break;

                                    case 2:
                                        System.out.println("Saliendo...");
                                        menu();
                                        break;
                                    default:
                                        System.out.println("Esta Opcion no existe");
                                        System.out.println("_____________________________________________________________________________ \n");
                                        teclado.nextLine();
                                        break;
                                }
                            } while (opcion >= 0);

                        } else if (bandera == 1) {
                            do {
                                menuDoctor();
                                if (teclado.hasNextInt()) {
                                    opcion2 = teclado.nextInt();
                                    teclado.nextLine();
                                        } else {
                                         System.out.println("\n_____________________________________________________________________________");
                                         System.out.println("Debes colocar un cumero");
                                        }
                                
                                switch (opcion2) {
                                    case 1:

                                        System.out.println("\n_____________________________________________________________________________");
                                        System.out.println("\n \tLista de citas Hospital San Juan Pablo II \n");
                                        for (int i = 0; i < contador; i++) {
                                            if (iddoc == cita[i].getIdDoctor()) {
                                                System.out.println("Cita " + (i + 1) + " \t Clinica " + cita[i].getnumCli());
                                                System.out.println("El paciente es: " + cita[i].getNombrePa() + " " + cita[i].getApellidoPa() + "\t Id Paciente: " + cita[i].getIdPaciente() + " \n Fecha de la Cita: " + cita[i].getFecha() + "\t Hora de la Cita: " + cita[i].getHora() + "\n");
                                                System.out.println("\n_____________________________________________________________________________");
                                            }
                                        }

                                        break;

                                    case 2:

                                        System.out.println("_____________________________________________________________________________");
                                        System.out.println("Creando Usuario\n");
                                        System.out.println("Ingrese su nombre:");
                                        nombre = teclado.nextLine();
                                        System.out.println("Ingrese su apellido:");
                                        apellido = teclado.nextLine();
                                        System.out.println("Ingrese su numero de telefono:");
                                        telefono = teclado.nextLine();
                                        System.out.println("Ingrese su usuario:");
                                        usuario = teclado.nextLine();
                                        System.out.println("Ingrese su contrasenia");
                                        contrasenia = teclado.nextLine();
                                        System.out.println("Ingrese su perfil (1.Doctor / 2.Paciente)");
                                        perfil = teclado.nextInt();
                                        teclado.nextLine();
                                       
                                        switch (perfil) {
                                            case 1:
                                                Persona d3 = new Doctor(otrous, nombre, apellido, telefono, usuario, contrasenia, perfil);
                                                Users.add(d3);
                                                tamanio = tamanio + 1;
                                                otrous = otrous + 1;

                                                break;
                                            case 2:
                                                Persona p3 = new Paciente(otrous, nombre, apellido, telefono, usuario, contrasenia, perfil);
                                                Users.add(p3);
                                                tamanio = tamanio + 1;
                                                otrous = otrous + 1;
                                                break;
                                            }

                                        System.out.println(" \t \t \t USUARIO INGRESADO CON EXITO!");
                                        System.out.println("\n_____________________________________________________________________________");

                                        break;
                                    case 3:
                                        System.out.println("Saliendo...");
                                        menu();
                                        break;
                                    default:
                                        System.out.println("Esta Opcion no existe");
                                        System.out.println("_____________________________________________________________________________ \n");

                                        teclado.nextLine();
                                        break;
                                }
                            } while (opcion2 >= 0);

                        } else {
                            System.out.println("\n_____________________________________________________________________________");
                            System.out.println("Credenciales incorrectas \n");
                            menu();
                            }
                    } else {
                        System.out.println("Los datos introducidos son incorrectos \n");
                        menu();
                        }
                    break;

                case 2:
                    System.out.println("Esperamos que tenga un excelente dia");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingresa una opcion correcta!");
                    menu();
                    break;

            }//cierro el primer switch

        }//cierro el metodo menu

        public void menuPaciente() {
            System.out.println("Seleccione una opcion. \n "
                    + "\t 1. Programar Una cita \n"
                    + "\t 2. Salir \n");
        }

        public void menuDoctor() {
            System.out.println("Seleccione una opcion. \n "
                    + "\t 1. Ver Agenda de Citas \n"
                    + "\t 2. Agregar Usuario (Doctor/Paciente) \n"
                    + "\t 3. Salir \n");
        }

}

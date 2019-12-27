package univercidad;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Univercidad {

    public static void main(String[] args) throws InterruptedException {
        Scanner lb = new Scanner(System.in);
        /*Consola.texto("SISTEMA DE REGISTRO DE CURSOS:", true);
        Consola.texto("Introducir la cantidad de cursos:....", false);
        int cant = lb.nextInt();
        Curso cursos[] = new Curso[2];
        for (int i = 0; i < cant; i++) {
            Thread.sleep(100);
            Consola.texto("Introducir curso: ", false);
            String nombre = lb.next();
            Consola.texto("Clave del curso: ", false);
            String clave = lb.next();
            Consola.texto("Docente del curso: ", false);
            String docente = lb.next();
            cursos[i] = new Curso(nombre, clave, docente);
        }
        Consola.texto("Existen Los siguentes cursos", true);
        for (int i = 0; i < cant; i++) {
            Consola.texto(" -> " + cursos[i].getNombre() + " " + cursos[i].getCurso() + " Docente: " + cursos[i].getDocente(), true);
        }*/
        int menu = 0;
        ArrayList<Alumno> datos = new ArrayList<Alumno>();
        for (int i = 0; i < 2000; i++) {
            try {
                final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
                } else {
                    Runtime.getRuntime().exec("clear");
                }
            } catch (final Exception e) {
            }
            Consola.texto("SELECCIONAR El MENU | 1 = SALIR | 2 = AGREGAR | 3 = ELIMINAR | 4 = MODIFICAR | 5 = LISTAR | 6 = BUSCAR ", true);
            menu = lb.nextInt();
            if (menu == 1) {
                break;
            }
            switch (menu) {
                case 2:
                    Alumno datosx = new Alumno("Veronica", "Chavez", 30, "A");
                    datos.add(datosx);
                    Alumno datosxx = new Alumno("miguel", "Huaycho", 32, "A");
                    datos.add(datosxx);
                    break;
                case 3:
                    datos.remove(1);
                    break;
                case 4:
                    Alumno datosxxx = new Alumno("Maria", "Malendes", 32, "A");
                    datos.set(1, datosxxx);
                    break;
                case 5:
                    for (int x = 0; x < datos.size(); x++) {
                        System.out.println(datos.get(x).getNombre() + " " + datos.get(x).getApellido());
                    }
                    break;
                case 6:
                    int xs = 0;
                    for (int x = 0; x < datos.size(); x++) {
                        if (datos.get(x).getNombre().equals("Maria")) {
                            xs = datos.indexOf(datos.get(x));
                        }
                    }
                    Consola.texto("RESULTADOS:", true);
                    System.out.println(datos.get(xs).getNombre() + " " + datos.get(xs).getApellido());
                    break;
            }
        }

    }

}

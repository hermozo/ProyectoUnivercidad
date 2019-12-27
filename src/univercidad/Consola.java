package univercidad;

class Consola {

    public static void numero(int data, boolean x) {
        Consola.run(Integer.toString(data), x);
    }

    public static void decimal(double data, boolean x) {
        Consola.run(Double.toString(data), x);
    }

    public static void texto(String data, boolean x) {
        Consola.run(data, x);
    }

    public static void run(String data, boolean x) {
        if (x) {
            System.out.println(data);
        } else {
            System.out.print(data);
        }
    }
}

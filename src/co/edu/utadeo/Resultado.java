package co.edu.utadeo;

public class Resultado {

    public static int resultado(String operacion) {

        int salida = 0;
        String[] o = operacion.split(" ");

        for (int i = 0; i < o.length; i++) {

            if ((o[i].equals("+")) || (o[i].equals("-")) || (o[i].equals("*")) || (o[i].equals("/"))) {

                if (o[i].equals("+")) {
                    salida = salida + Integer.parseInt(o[i + 1]);
                    o[i + 1] = salida + "";
                } else if (o[i].equals("-")) {
                    salida = salida - Integer.parseInt(o[i + 1]);
                    o[i + 1] = salida + "";
                } else if (o[i].equals("*")) {
                    salida = salida * Integer.parseInt(o[i + 1]);
                    o[i + 1] = salida + "";
                } else if (o[i].equals("/")) {
                    salida = salida / Integer.parseInt(o[i + 1]);
                    o[i + 1] = salida + "";
                }
            } else {
                salida = Integer.parseInt(o[i]);
            }
        }

        return salida;

    }

}

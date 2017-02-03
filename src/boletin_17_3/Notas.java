package boletin_17_3;

import javax.swing.JOptionPane;

public class Notas {

    int[] notas = new int[3];
    String[] nombres = new String[3];

    public void cargarArray() {
        for (int i = 0; i < notas.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Inserte nombre de alumno");
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserte notas de los alumnos"));
        }
    }

    public void visualizarArray() {
        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(nombres[i] + ": " + notas[i]);
        }
    }

    public void calculaNotas() {

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                pos++;
            } else if (notas[i] < 5) {
                neg++;
            }
        }
        System.out.println("Aprobados: " + pos);
        System.out.println("Suspensos: " + neg);
    }

    public void calculaMedia() {

        int z = 0;

        for (int i = 0; i < notas.length; i++) {
            z = z + notas[i];
        }
        System.out.println("La nota media de la clase es de: " + (z / notas.length));
    }

    public void notaMaxima() {

        int notaM = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notaM < notas[i]) {
                notaM = notas[i];
            }
        }
        System.out.println("La nota más alta es: " + notaM);
    }

    public void buscarAlumno() {

        String busq = JOptionPane.showInputDialog("Inserte nombre de alumno para visualizar su información");
        boolean enc = false;

        for (int i = 0; i < nombres.length; i++) {
            if (busq.equals(nombres[i])) {
                System.out.println("La nota de " + nombres[i] + " es un:" + notas[i]);
                enc = true;
            }
        }
    }

    public void alumnosAprobados() {
        System.out.println("Alumnos aprobados:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + " un: " + notas[i]);
            }
        }
    }

    public void ordenaNotas() {
        int aux = 0;
        String aux1 = "";
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    
                    aux1 = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = aux1;
                }
            }
        }
    }
}
//Arturo Cascallar Expósito
package boletin_17_2;

import javax.swing.JOptionPane;

public class Notas {

    int[] notas = new int[5];

    public void cargarArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserte notas de los alumnos"));
        }
    }

    public void visualizarArray() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
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
        System.out.println("La nota más alta es: "+notaM);
    }

}

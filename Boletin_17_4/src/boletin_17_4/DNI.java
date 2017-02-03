package boletin_17_4;

import javax.swing.JOptionPane;

public class DNI {

    char[] dni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public void calculaDNI() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Inserte número de DNI"));
        int res = num%23;
        System.out.println(num+""+dni[res]);
        
    }
    

}

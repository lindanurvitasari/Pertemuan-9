/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lindanurpertemuan9;

import javax.swing.*;

/**
 *
 * @author ACER
 */
public class InputMerk2 {
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        input=JOptionPane.showInputDialog("Masukan Harga   :");
        long harga = Integer.valueOf(input).intValue();
        JOptionPane.showMessageDialog(null,harga);
    }   
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author valy
 */
public class Dialog extends JOptionPane{

    public Dialog(){}
    public void Enregistrement()
    {
           
        JFrame fenetre=new JFrame();
        fenetre.setSize(340, 200);
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showMessageDialog(fenetre,"INFORMATION ENREGISTRER","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }
      public void Modification()
    {
           
        JFrame fenetre=new JFrame();
        fenetre.setSize(340, 200);
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showMessageDialog(fenetre,"MODIFICATION EFFECTUER","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }
}

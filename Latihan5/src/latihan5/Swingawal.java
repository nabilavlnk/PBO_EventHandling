/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Swingawal extends JFrame {
    
    String nama, kel,agama,hobby; 
    JLabel tulisnama = new JLabel(" Nama Lengkap: ");
    JLabel tuliskel = new JLabel(" Jenis Kelamin: ");
    JLabel tulisagama = new JLabel(" Agama: ");
    JLabel tulishobby = new JLabel(" Hobby: ");
    
    JLabel hasilNama = new JLabel();
    JLabel hasilJenKel = new JLabel();
    JLabel hasilAgama = new JLabel();
    JLabel hasilHobby = new JLabel();
    
    JButton btnSave = new JButton("OK");
     
   public Swingawal(String nama,String kel, String agama, String hobby){
        
        setTitle("HASIL FORM");
	setDefaultCloseOperation(3);
	setSize(350,500);

        this.nama= nama;
        this.kel=kel;
        this.agama=agama;
        this.hobby=hobby;
        hasilNama.setText(nama);
        hasilJenKel.setText(kel);    
        hasilAgama.setText(agama); 
        hasilHobby.setText(hobby);
        
        setLayout(null);
        add(tulisnama);
        add(tuliskel);
        add(tulisagama);
        add(tulishobby);
        add(hasilNama);
        add(hasilJenKel);
        add(hasilAgama);
        add(hasilHobby);
        add(btnSave);
        
        tulisnama.setBounds(10,10,120,20);
        hasilNama.setBounds(130,10,150,20);
        tuliskel.setBounds(10,35,120,20);
        hasilJenKel.setBounds(130,35,100,20);
        tulisagama.setBounds(10,60,150,20);
        hasilAgama.setBounds(130,60,150,20);
        tulishobby.setBounds(10,85,120,20);
        hasilHobby.setBounds(130,85,100,20);
        btnSave.setBounds(100,130,120,20);
        
        btnSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
    dispose();

        }
   });
        
        setVisible(true);
    
   }
}

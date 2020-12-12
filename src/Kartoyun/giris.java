package Kartoyun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class giris extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris frame = new giris();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public giris() {
		setTitle("Kart Oyunu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(686, 287, 399, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.menuText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			Kullanici kullanici=new Kullanici();
		kullanici.setOyuncuAdi(textField.getText());
				Test form=new Test();
				form.oyuncuAdi.setText(textField.getText());
				form.oyuncuisim.setText(textField.getText());
				form.setVisible(true);
			
			}
		});
		btnNewButton.setBounds(800, 380, 194, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image pic=new ImageIcon(this.getClass().getResource("/giris.png")).getImage();	
		lblNewLabel_1.setIcon(new ImageIcon(pic));
		lblNewLabel_1.setBounds(-13, -170, 2132, 1026);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}

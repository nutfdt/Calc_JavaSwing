import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculatrice extends JFrame implements ActionListener {
	
	
	
	private JLabel lbTitre = new JLabel("Ma Calculatrice 2023 CFA Insta");
	private JButton btPourcentage = new JButton("%");
	private JButton btRacine = new JButton("√");
	private JButton btCarree = new JButton("x²");
	private JButton btUnX = new JButton("1/x");
	private JButton btCE = new JButton("CE");
	private JButton btC = new JButton("C");
	private JButton btDiv = new JButton("÷");
	private JButton btMult = new JButton("x");
	private JButton btSous = new JButton("-");
	private JButton btPlus = new JButton("+");
	private JButton bt0 = new JButton("0");
	private JButton bt1 = new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton bt7 = new JButton("7");
	private JButton bt8 = new JButton("8");
	private JButton bt9 = new JButton("9");
	private JButton btPosNeg = new JButton("±");
	private JButton btPoint = new JButton(".");
	private JButton btEgal = new JButton("=");
	private JButton btEffCara = new JButton("⌫");
	private JTextField txtCalc = new JTextField();
	private float Result,Chiffre1, Chiffre2;
	private int Operateur;
	
	public Calculatrice () {
		this.setTitle("Ma Calculatrice 2023");
		this.setBounds(300, 20, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		
		//placements des objets graphiques
		//Mise en place du titre
		this.lbTitre.setBounds(100, 10, 200, 20);
		this.add(this.lbTitre);
		
		//Mise en place du champs texte 
		//Mise en place du bouton quitter
			this.txtCalc.setBounds(0, 30, 400, 70);
			this.add(this.txtCalc);
		//Mise en place de la première ligne de boutons et leurs positions 4bt sur 400
			this.btPourcentage.setBounds(0, 100, 100, 40);
			this.add(this.btPourcentage);
			this.btRacine.setBounds(100, 100, 100, 40);
			this.add(this.btRacine);
			this.btCarree.setBounds(200, 100, 100, 40);
			this.add(this.btCarree);
			this.btUnX.setBounds(300, 100, 100, 40);
			this.add(this.btUnX);
		
		//Mise en place de la deuxieme ligne de boutons et leurs positions 4bt sur 400
			this.btCE.setBounds(0, 140, 100, 40);
			this.add(this.btCE);
			this.btC.setBounds(100, 140, 100, 40);
			this.add(this.btC);
			this.btEffCara.setBounds(200, 140, 100, 40);
			this.add(this.btEffCara);
			this.btDiv.setBounds(300, 140, 100, 40);
			this.add(this.btDiv);
			
			//Mise en place de la Troisieme ligne de boutons et leurs positions 4bt sur 400
			this.bt7.setBounds(0, 180, 100, 40);
			this.add(this.bt7);
			this.bt8.setBounds(100, 180, 100, 40);
			this.add(this.bt8);
			this.bt9.setBounds(200, 180, 100, 40);
			this.add(this.bt9);
			this.btMult.setBounds(300, 180, 100, 40);
			this.add(this.btMult);
			
			//Mise en place de la quatrieme ligne de boutons et leurs positions 4bt sur 400
			this.bt6.setBounds(0, 220, 100, 40);
			this.add(this.bt6);
			this.bt5.setBounds(100, 220, 100, 40);
			this.add(this.bt5);
			this.bt4.setBounds(200, 220, 100, 40);
			this.add(this.bt4);
			this.btSous.setBounds(300, 220, 100, 40);
			this.add(this.btSous);
			
			//Mise en place de la cinquieme ligne de boutons et leurs positions 4bt sur 400
			this.bt3.setBounds(0, 260, 100, 40);
			this.add(this.bt3);
			this.bt2.setBounds(100, 260, 100, 40);
			this.add(this.bt2);
			this.bt1.setBounds(200, 260, 100, 40);
			this.add(this.bt1);
			this.btPlus.setBounds(300, 260, 100, 40);
			this.add(this.btPlus);
			
			//Mise en place de la sixieme ligne de boutons et leurs positions 4bt sur 400
			this.btPosNeg.setBounds(0, 300, 100, 40);
			this.add(this.btPosNeg);
			this.bt0.setBounds(100, 300, 100, 40);
			this.add(this.bt0);
			this.btPoint.setBounds(200, 300, 100, 40);
			this.add(this.btPoint);
			this.btEgal.setBounds(300, 300, 100, 40);
			this.add(this.btEgal);
			
			//rendre les boutons cliquables
			this.btPourcentage.addActionListener(this);
			this.btRacine.addActionListener(this);
			this.btCarree.addActionListener(this);
			this.btUnX.addActionListener(this);
			this.btCE.addActionListener(this);
			this.btC.addActionListener(this);
			this.btEffCara.addActionListener(this);
			this.btDiv.addActionListener(this);
			this.bt7.addActionListener(this);
			this.bt8.addActionListener(this);
			this.bt9.addActionListener(this);
			this.btMult.addActionListener(this);
			this.bt6.addActionListener(this);
			this.bt5.addActionListener(this);
			this.bt4.addActionListener(this);
			this.btSous.addActionListener(this);
			this.bt3.addActionListener(this);
			this.bt2.addActionListener(this);
			this.bt1.addActionListener(this);
			this.btPlus.addActionListener(this);
			this.btPosNeg.addActionListener(this);
			this.bt0.addActionListener(this);
			this.btPoint.addActionListener(this);
			this.btEgal.addActionListener(this);
		
	}
	public static void main (String args[]) {
		Calculatrice maCalc = new Calculatrice();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.btC) {
			this.txtCalc.setText("");
		}else if(e.getSource()==this.bt0) {
			this.txtCalc.setText(txtCalc.getText()+this.bt0.getText());
		}else if(e.getSource()==this.bt1) {
			this.txtCalc.setText(txtCalc.getText()+this.bt1.getText());
		}else if(e.getSource()==this.bt2) {
			this.txtCalc.setText(txtCalc.getText()+this.bt2.getText());
		}else if(e.getSource()==this.bt3) {
			this.txtCalc.setText(txtCalc.getText()+this.bt3.getText());
		}else if(e.getSource()==this.bt4) {
			this.txtCalc.setText(txtCalc.getText()+this.bt4.getText());
		}else if(e.getSource()==this.bt5) {
			this.txtCalc.setText(txtCalc.getText()+this.bt5.getText());
		}else if(e.getSource()==this.bt6) {
			this.txtCalc.setText(txtCalc.getText()+this.bt6.getText());
		}else if(e.getSource()==this.bt7) {
			this.txtCalc.setText(txtCalc.getText()+this.bt7.getText());
		}else if(e.getSource()==this.bt8) {
			this.txtCalc.setText(txtCalc.getText()+this.bt8.getText());
		}else if(e.getSource()==this.bt9) {
			this.txtCalc.setText(txtCalc.getText()+this.bt9.getText());
		}else if(e.getSource()==this.btPoint) {
			if (this.txtCalc.getText().indexOf(".") < 0) {
	            this.txtCalc.setText(this.txtCalc.getText() + ".");
	            }else {
	            	JOptionPane.showMessageDialog(this, 
								"Impossible de mettre deux virgule", 
								"Erreur", 
								JOptionPane.ERROR_MESSAGE);
	            }
		}
		else if(e.getSource()==this.btPlus)
		{
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.txtCalc.setText("");
			this.Operateur=1;
		}else if(e.getSource()==this.btSous) {
			
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.txtCalc.setText("");
			this.Operateur=2;
		}else if(e.getSource()==this.btMult) {
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.txtCalc.setText("");
			this.Operateur=3;
		}else if(e.getSource()==this.btDiv) {
			
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.txtCalc.setText("");
			this.Operateur=4;
		}else if(e.getSource()==this.btPourcentage) {
			
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.txtCalc.setText("");
			this.Operateur=5;
		}else	if (e.getSource()==this.btEgal) {
			
			if (this.Operateur==1){
				this.Chiffre2= Float.parseFloat(this.txtCalc.getText());
				this.Result=Chiffre1+Chiffre2;
			}else if (this.Operateur==2) {
				this.Chiffre2= Float.parseFloat(this.txtCalc.getText());
				this.Result=Chiffre1-Chiffre2;
			}else if (this.Operateur==3) {
				this.Chiffre2= Float.parseFloat(this.txtCalc.getText());
				this.Result=Chiffre1*Chiffre2;
			}else if (this.Operateur==4) {
				this.Chiffre2= Float.parseFloat(this.txtCalc.getText());
				if(this.Chiffre2!=0){
					this.Result=Chiffre1/Chiffre2;
				}else {
					JOptionPane.showMessageDialog(this, 
							"Erreur on ne divise pas par 0 !", 
							"Erreur", 
							JOptionPane.ERROR_MESSAGE);
					this.txtCalc.setText("");
				}
				
			}else if(this.Operateur==5) {
				this.Chiffre2= Float.parseFloat(this.txtCalc.getText());
				this.Result=(Chiffre2/Chiffre1)*100;
			}
				
			this.txtCalc.setText(Result+"");		
		}
		else if (e.getSource()==this.btRacine) {
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.Chiffre1=(float) Math.sqrt(this.Chiffre1);
			this.txtCalc.setText(Chiffre1+"");
		}else if (e.getSource()==this.btRacine) {
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.Result=(float) Math.sqrt(this.Chiffre1);
			this.txtCalc.setText(Result+"");
		}else if (e.getSource()==this.btCarree) {
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.Result=Chiffre1*Chiffre1;
			this.txtCalc.setText(Result+"");
		}else if (e.getSource()==this.btUnX) {
			this.Chiffre1=Float.parseFloat(this.txtCalc.getText());
			if(this.Chiffre1!=0) {
			this.Result=1/Chiffre1;
			this.txtCalc.setText(Result+"");
			}else {
				JOptionPane.showMessageDialog(this, 
						"Erreur Pas d'inverse à 0 !", 
						"Erreur", 
						JOptionPane.ERROR_MESSAGE);
				this.txtCalc.setText("");
			}
		}else if (e.getSource()==this.btPosNeg) {
			this.Chiffre1= Float.parseFloat(this.txtCalc.getText());
			this.Chiffre1=Chiffre1*-1;
			this.txtCalc.setText(Chiffre1+"");
		}else if (e.getSource()==this.btCE) {
			this.Chiffre1=0;
			this.txtCalc.setText("");
			this.Result=0;
			this.Chiffre2=0;
		}
		
	}

}

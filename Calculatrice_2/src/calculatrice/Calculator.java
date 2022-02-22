/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import com.sun.prism.paint.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.*;
import static java.awt.Label.CENTER;

import javax.swing.JPanel;


/**
 *
 * @author rabah
 */
public class Calculator extends javax.swing.JFrame {
    
    /**
     * Creates new form Calculator
     */
    
    

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(operation); 
    }
    
    JPanel p = new JPanel();
    JLabel calcul = new JLabel();
    JLabel j = new JLabel();
    JLabel rien = new JLabel();
    JLabel w = new JLabel();
    JLabel l = new JLabel();
    JLabel perdu = new JLabel();
    
    int vie=4;
    int nombreAleatoire;//on initialise une variable nombreAleatoire qui est un nombre aléatoire entre 0 et 9
    int nombreAleatoire2;// on créer une nouvelle variable nombreAleatoie2
    int nombreAleatoire3= (int) (Math.random() * (2 ));
    int nombreProposer;
    int nombreBon;
    
    String resultat;
    String operateur;
    String Calcul2;
    
    
    boolean signe;
    
    URL url20 = ClassLoader.getSystemClassLoader().getResource("images/vie2.png");
    ImageIcon image_vie2 = new ImageIcon(new ImageIcon(url20).getImage().getScaledInstance(225, 45, 225));
    
    URL url21 = ClassLoader.getSystemClassLoader().getResource("images/vie4.png");
    ImageIcon image_vie3 = new ImageIcon(new ImageIcon(url21).getImage().getScaledInstance(225, 45, 225));
    
    URL url22 = ClassLoader.getSystemClassLoader().getResource("images/vie3.png");
    ImageIcon image_vie4 = new ImageIcon(new ImageIcon(url22).getImage().getScaledInstance(225, 45, 225));
    
    public Calculator() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//pour ne plus pouvoir fermer la fenêtre

        
        
        URL url1 = ClassLoader.getSystemClassLoader().getResource("images/0.jpg");//on enregistre l'image qui est sur le bouton 0
        ImageIcon icon = new ImageIcon(new ImageIcon(url1).getImage().getScaledInstance(100, 100, 100));//on créer un icone et on met l'image dans l'icone et on défini la taille
        jButton12.setIcon(icon);//on ajoute l'icon au bouton
        
        
        URL url2 = ClassLoader.getSystemClassLoader().getResource("images/1.jpg");
        ImageIcon icon1 = new ImageIcon (new ImageIcon(url2).getImage().getScaledInstance(100, 100, 100));
        jButton9.setIcon(icon1);
        
       
        URL url3 = ClassLoader.getSystemClassLoader().getResource("images/2.jpg");
         ImageIcon icon2 = new ImageIcon(new ImageIcon(url3).getImage().getScaledInstance(100, 100, 100));
        jButton8.setIcon(icon2);
        
        
        URL url4 = ClassLoader.getSystemClassLoader().getResource("images/3.jpg");
        ImageIcon icon3 = new ImageIcon(new ImageIcon(url4).getImage().getScaledInstance(100, 100, 100));
        jButton16.setIcon(icon3);
        
        URL url5 = ClassLoader.getSystemClassLoader().getResource("images/4.jpg");
        ImageIcon icon4 = new ImageIcon(new ImageIcon(url5).getImage().getScaledInstance(100, 100, 100));
        
        
        jButton5.setIcon(icon4);
        
        URL url6 = ClassLoader.getSystemClassLoader().getResource("images/5.jpg");
        ImageIcon icon5 = new ImageIcon(new ImageIcon(url6).getImage().getScaledInstance(100, 100, 100));
       
        
        jButton4.setIcon(icon5);
        
        URL url7 = ClassLoader.getSystemClassLoader().getResource("images/6.jpg");
        ImageIcon icon6 = new ImageIcon(new ImageIcon(url7).getImage().getScaledInstance(100, 100, 100));
        
        
        jButton15.setIcon(icon6);
        
        URL url8 = ClassLoader.getSystemClassLoader().getResource("images/7.jpg");
        ImageIcon icon7 = new ImageIcon(new ImageIcon(url8).getImage().getScaledInstance(100, 100, 100));
        
        jButton14.setIcon(icon7);
        
        URL url9 = ClassLoader.getSystemClassLoader().getResource("images/8.jpg");
        ImageIcon icon8 = new ImageIcon(new ImageIcon(url9).getImage().getScaledInstance(100, 100, 100));
        
        jButton13.setIcon(icon8);
        
        URL url10 = ClassLoader.getSystemClassLoader().getResource("images/9.jpg");
        ImageIcon icon9 = new ImageIcon(new ImageIcon(url10).getImage().getScaledInstance(100, 100, 100));
        
        jButton18.setIcon(icon9);
        
        URL url11 = ClassLoader.getSystemClassLoader().getResource("images/banniere.png");
        ImageIcon iconLogo = new ImageIcon(new ImageIcon(url11).getImage().getScaledInstance(277, 97, 277)); 
        
        jLabel1.setIcon(iconLogo);
        
        URL url16 = ClassLoader.getSystemClassLoader().getResource("images/vie1.png");
        ImageIcon image_vie = new ImageIcon(new ImageIcon(url16).getImage().getScaledInstance(225, 45, 225));
        
        jLabel2.setIcon(image_vie);
        
        URL url = ClassLoader.getSystemClassLoader().getResource("images/logo_null.jpg");//chargmenent de l'image
        ImageIcon zero = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(40, 40, 40));//nouvelle icon, initialisation de l'image dans l'icon et définition de sa taille
        
        rien.setIcon(zero);
        
        URL url12 = ClassLoader.getSystemClassLoader().getResource("images/10.png");
        ImageIcon icon10 = new ImageIcon(new ImageIcon(url12).getImage().getScaledInstance(100, 100, 100));
        
        jButton2.setIcon(icon10);
        
        URL url13 = ClassLoader.getSystemClassLoader().getResource("images/film.jpeg");
        ImageIcon film = new ImageIcon(new ImageIcon(url13).getImage().getScaledInstance(412, 743, 412));
        
        j.setIcon(film);
                
        URL url28 = ClassLoader.getSystemClassLoader().getResource("images/win.gif");
        ImageIcon win = new ImageIcon(new ImageIcon(url28).getImage().getScaledInstance(512, 743, 512));
        
        w.setIcon(win);
        
        URL url26 = ClassLoader.getSystemClassLoader().getResource("images/loose.gif");
        ImageIcon loose = new ImageIcon(new ImageIcon(url26).getImage().getScaledInstance(512, 743, 512));
        
        l.setIcon(loose);
                
        jPanel3.setLayout(new GridLayout(1,1));//on initialise une grille de 1 sur 1 pour le Jpanel qui affiche le résultat
        jPanel3.setSize(358,93);
        
        JLabel Hello = new JLabel(" ");//nouveau JLabel
        Hello.setFont(new Font("Impact", Font.PLAIN, 72));//on intialise la police à 110
        
        jPanel3.add(Hello);//ajout du JLabel dans le JPanel qui affiche le résultat
        
        calcul.setSize(358,93);
        calcul.setFont(new Font("Impact", Font.PLAIN, 72));
        calcul.setForeground(java.awt.Color.red);
        calcul.setHorizontalAlignment(JLabel.CENTER); 
        
        perdu.setSize(358,93);
        perdu.setFont(new Font("Impact", Font.PLAIN, 72));
        perdu.setForeground(java.awt.Color.red);
        perdu.setHorizontalAlignment(JLabel.CENTER); 
        
        j.setSize(412,743);
        
        p.setSize(412,743);
        
        w.setSize(412,713);
        
        rien.setSize(358,93);
        rien.setFont(new Font("Impact", Font.PLAIN, 72));
        rien.setForeground(java.awt.Color.red);
        rien.setHorizontalAlignment(JLabel.CENTER); 
        
        l.setSize(412,743);
        
        jLabel2.setSize(225,45);
    }
    
    
    @Override
    public void enable(){ //fonction pour débloquer tout les boutons
        jPanel3.setEnabled(true);
       
         
        jRadioButton2.setEnabled(true);

        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton2.setEnabled(true); 

       
        

    }
        

    @Override
    public void disable(){ //Fonction pour bloquer tout les boutons
        jPanel3.setEnabled(false);
        

        jRadioButton2.setEnabled(false); 
        
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton2.setEnabled(false);
        
    }
      public void affichage_calcul(int nb)
      { //Fonction pour afficher le résultat avec des images
          
       for(int i=1;i<=nb;i++) //Boucle selon nb = nombre sur lequel on a cliqué
       {
            URL url = ClassLoader.getSystemClassLoader().getResource("images/spiderman.png");//chargement de l'image
            ImageIcon test = new ImageIcon(new ImageIcon(url).getImage());//nouvelle icon et initialisation de l'image dans l'icon
       
            jPanel3.add(new JLabel(test));//nouveau Label dans le Panel qui sert à afficher le résultat 
       }
            jPanel3.repaint();//remplace le JPanel vide par les images
            jPanel3.validate();//validation du remplacement
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculatrice");
        setLocation(new java.awt.Point(520, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jRadioButton2.setBackground(java.awt.Color.red);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Jouer");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setEnabled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 0, 0));
        jButton17.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("OK");
        jButton17.setActionCommand("");
        jButton17.setEnabled(false);
        jButton17.setMaximumSize(new java.awt.Dimension(37, 67));
        jButton17.setMinimumSize(new java.awt.Dimension(37, 67));
        jButton17.setPreferredSize(new java.awt.Dimension(37, 67));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setEnabled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        jRadioButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Quitter");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(7);
        
        nombreProposer=7;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(4);
        
        nombreProposer=4;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(5);
        
        nombreProposer=5;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(3);
        
        nombreProposer=3;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(2);
        
        nombreProposer=2;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(6);
        
        nombreProposer=6;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(1);
        
        nombreProposer=1;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jPanel3.removeAll();//efface tout ce qu'il y a dans le JPanel
        
        affichage_calcul(0);
        
        jPanel3.add(rien);//nouveau JLabel dans le JPanel qui sert à l'écriture du résultat
        jPanel3.repaint();//remplacement du JPanel vide par l'image
        jPanel3.validate();//validation du changement
        
        nombreProposer=0;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        jRadioButton1.setEnabled(true);
        
        if(signe==false)
        {
            if(nombreAleatoire-nombreAleatoire2==nombreProposer || nombreAleatoire2-nombreAleatoire==nombreProposer)
            {
                
                
                
                p.add(w);
                
                this.setContentPane(p);
                
                ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();//fonction qui permet aux tâches de s'éxecuter avec du délais
                
                s.schedule(new Runnable()
                {//on initialise le timer à 0
                    @Override
                    public void run(){
                        
                            disable();
                            
                            jRadioButton2.setEnabled(true); 
                            jRadioButton2.setText("Rejouer");
                            jRadioButton2.setSelected(false);
                            
                            jRadioButton1.setEnabled(true);
                            
                            calcul.setText("GAGNER");
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(calcul);
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            w.setVisible(false);//rend invisible l'image de la pub 

                    }

                },(long) 2.8, TimeUnit.SECONDS);//timer en seconde, initialiser à 10 secondes
                
                this.setVisible(true);//on met le JFrame en visible
                
                w.setVisible(true);
                jPanel2.setVisible(false);
                
                p.add(jPanel2);//on ajoute le JPanel de la pub dans le JPanel de la calculatrice
                
                
            }
            else
            {
                vie=vie-1;                
                
                p.add(l);
                
                this.setContentPane(p);
                
                ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();//fonction qui permet aux tâches de s'éxecuter avec du délais
                
                s.schedule(new Runnable()
                {//on initialise le timer à 0
                    @Override
                    public void run(){

                        if(vie==3)
                        {
                            calcul.setText(Calcul2);
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(calcul);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                            jPanel3.repaint();//on remplace 
                            jPanel3.validate();//on valide le remplacement
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            l.setVisible(false);//rend invisible l'image de la pub 
                            
                            jLabel2.removeAll();
                            
                            jLabel2.setIcon(image_vie2);
                            jLabel2.repaint();
                            jLabel2.validate();
                                                    
                            
                        }
                        if(vie==2)
                        {
                            calcul.setText(Calcul2);//on initialise la police à 100
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(calcul);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                            jPanel3.repaint();//on remplace 
                            jPanel3.validate();//on valide le remplacement
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            l.setVisible(false);//rend invisible l'image de la pub 
                            
                            jLabel2.removeAll();
                            
                            jLabel2.setIcon(image_vie3);
                            jLabel2.repaint();
                            jLabel2.validate();
                            
                            
                            
                        }
                        if(vie==1)
                        {
                            if(nombreAleatoire>=nombreAleatoire2)
                            {
                                nombreBon=(nombreAleatoire-nombreAleatoire2);
                            }
                            else
                            {
                                nombreBon=(nombreAleatoire2-nombreAleatoire);
                            }
                                                     
                            
                            resultat=("PERDU : "+nombreBon);
                            
                            perdu.setText(resultat);
                            
                            disable();
                            
                            
                            jRadioButton2.setText("Rejouer");
                            
                            jRadioButton2.setEnabled(true);
                            jRadioButton1.setEnabled(true);
                            
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(perdu);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                            jPanel3.repaint();//on remplace 
                            jPanel3.validate();//on valide le remplacement
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            l.setVisible(false);//rend invisible l'image de la pub 
                            
                            jLabel2.removeAll();
                            
                            jLabel2.setIcon(image_vie4);
                            jLabel2.repaint();
                            jLabel2.validate();
                            
                        }
                        
                    }

                },(long) 2.95, TimeUnit.SECONDS);//timer en seconde, initialiser à 10 secondes
                
                this.setVisible(true);//on met le JFrame en visible
                
                l.setVisible(true);
                
                jPanel2.setVisible(false);
                
                p.add(jPanel2);//on ajoute le JPanel de la pub dans le JPanel de la calculatrice
                                
                
            }
        }
        if(signe==true)
        {
            if(nombreAleatoire+nombreAleatoire2==nombreProposer)
            {
                
                
                p.add(w);
                
                this.setContentPane(p);
                
                ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();//fonction qui permet aux tâches de s'éxecuter avec du délais
                
                s.schedule(new Runnable()
                {//on initialise le timer à 0
                    @Override
                    public void run()
                    {
                            disable();
                            
                            jRadioButton2.setEnabled(true);
                            jRadioButton2.setSelected(false);
                            jRadioButton2.setText("Rejouer");
                            
                            jRadioButton2.setEnabled(true);
                            
                            calcul.setText("GAGNER");
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(calcul);
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            w.setVisible(false);//rend invisible l'image de la pub 

                    }

                },(long) 2.8, TimeUnit.SECONDS);//timer en seconde, initialiser à 10 secondes
                
                this.setVisible(true);//on met le JFrame en visible
                
                w.setVisible(true);
                jPanel2.setVisible(false);
                
                p.add(jPanel2);//on ajoute le JPanel de la pub dans le JPanel de la calculatrice
                                
            }
            else
            {
                vie=vie-1;
                
                    
                
                p.add(l);
                
                this.setContentPane(p);
                
                ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();//fonction qui permet aux tâches de s'éxecuter avec du délais
                
                s.schedule(new Runnable()
                {//on initialise le timer à 0
                    @Override
                    public void run()
                    {
                        
                        if(vie==3)
                        {
                            calcul.setText(Calcul2);
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(calcul);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                            jPanel3.repaint();//on remplace 
                            jPanel3.validate();//on valide le remplacement
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            l.setVisible(false);//rend invisible l'image de la pub 
                            
                            jLabel2.removeAll();
                            
                            jLabel2.setIcon(image_vie2);
                            jLabel2.repaint();
                            jLabel2.validate();
                            
                        }
                        if(vie==2)
                        {
                            calcul.setText(Calcul2);
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(calcul);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                            jPanel3.repaint();//on remplace 
                            jPanel3.validate();//on valide le remplacement
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            l.setVisible(false);//rend invisible l'image de la pub 
                            
                            jLabel2.removeAll();
                            
                            jLabel2.setIcon(image_vie3);
                            jLabel2.repaint();
                            jLabel2.validate();
                            
                        }
                        if(vie==1)
                        {
                            nombreBon=(nombreAleatoire+nombreAleatoire2);
                            
                            resultat=("PERDU : "+nombreBon);
                                
                            disable();
                            
                            jRadioButton2.setEnabled(true);
                            jRadioButton1.setEnabled(true);
                            
                            jRadioButton2.setText("Rejouer");
                            

                            jRadioButton1.setEnabled(true);
                            
                            perdu.setText(resultat);
                            
                            jPanel3.removeAll();
                            
                            jPanel3.add(perdu);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                            jPanel3.repaint();//on remplace 
                            jPanel3.validate();//on valide le remplacement
                            
                            jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                            l.setVisible(false);//rend invisible l'image de la pub 
                            
                            jLabel2.removeAll();
                            
                            jLabel2.setIcon(image_vie4);
                            jLabel2.repaint();
                            jLabel2.validate();
                            
                        }
                        
                        
                    }

                }, (long) 2.95, TimeUnit.SECONDS);//timer en seconde, initialiser à 10 secondes
                
                this.setVisible(true);//on met le JFrame en visible
                
                l.setVisible(true);
                
                jPanel2.setVisible(false);
                
                p.add(jPanel2);//on ajoute le JPanel de la pub dans le JPanel de la calculatrice
                
            }
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(9);
        
        nombreProposer=9;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       jPanel3.removeAll();
        
        affichage_calcul(8);
        
        nombreProposer=8;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        enable(); //permet de débloquer tout les boutons
        
        
        jRadioButton2.setEnabled(false);
        jRadioButton1.setEnabled(false);
        
        
        
        
        //on enregistre et met l'image de la pub dans un nouveau JLabel puis on initialise se JLabel dans un nouveau JPanel que l'on a créer précédement dans le code
        p.add(j);
        
        URL url29 = ClassLoader.getSystemClassLoader().getResource("images/vie1.png");
        ImageIcon image_vie = new ImageIcon(new ImageIcon(url29).getImage().getScaledInstance(225, 45, 225));
           
        jLabel2.setIcon(image_vie);
        
        URL url30 = ClassLoader.getSystemClassLoader().getResource("images/loose.gif");
        ImageIcon loose1 = new ImageIcon(new ImageIcon(url30).getImage().getScaledInstance(512, 743, 512));
        
        l.setIcon(loose1);
        
        URL url31 = ClassLoader.getSystemClassLoader().getResource("images/win.gif");
        ImageIcon win = new ImageIcon(new ImageIcon(url31).getImage().getScaledInstance(512, 743, 512));
        
        w.setIcon(win);
        
        vie=4;
        
        this.setContentPane(p);
        
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();//fonction qui permet aux tâches de s'éxecuter avec du délais
        
        s.schedule(new Runnable()
        {
            @Override
            
            public void run()
            {
                nombreAleatoire = (int) (Math.random() * ( 10 ));

                if(nombreAleatoire == 9)//on test si nombreAleatoire est égale à 9
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 2 ));//si il est égale à 9 on initialise nombreAleatoire entre 0 et 1
                }
                else if(nombreAleatoire == 8)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 3 ));
                }
                else if(nombreAleatoire == 7)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 4 ));
                }
                else if(nombreAleatoire == 6)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 5 ));
                }
                else if(nombreAleatoire == 5)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 6 ));
                }
                else if(nombreAleatoire == 4)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 7 ));
                }
                else if(nombreAleatoire == 3)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 8 ));
                }
                else if(nombreAleatoire == 2)
                {
                    nombreAleatoire2 = (int) (Math.random() * ( 9 ));
                }
                else {
                    nombreAleatoire2 = (int) (Math.random() * ( 10 ));
                }
                
                jPanel3.removeAll();//effacer tout ce qu'il y a dans le JPanel
                
                if(nombreAleatoire3<1){
                   //on ajout le calcul dans un nouveau JLabel
                   if(nombreAleatoire<nombreAleatoire2)
                   {
                        operateur="-";
                        signe=false;
                        Calcul2=(nombreAleatoire2+operateur+nombreAleatoire+" = ");
                   }
                   else
                   {    
                        operateur="-";
                        signe=false;
                        Calcul2=(nombreAleatoire+operateur+nombreAleatoire2+" = ");
                   }
                }
                else{
                    operateur="+";
                    signe=true;
                    Calcul2=(nombreAleatoire+operateur+nombreAleatoire2+" = ");//on ajout le calcul dans un nouveau JLabel
                }

                calcul.setText(Calcul2);
                
                jPanel3.add(calcul);//on ajout le JLabel calcul dans le JPanel qui sert à l'écriture
                jPanel3.repaint();//on remplace 
                jPanel3.validate();//on valide le remplacement
                
                jPanel2.setVisible(true);//met visible le JPanel qui affiche la calculatrice
                j.setVisible(false);//rend invisible l'image de la pub 

            }
            
            
        },10, TimeUnit.SECONDS);//timer de 10 secondes
        
        this.setVisible(true);//on met le JFrame en visible
        
        j.setVisible(true);
        jPanel2.setVisible(false);//on rend invisible l'affichage de la calculatrice
        
        p.add(jPanel2);//on ajoute le JPanel de la pub dans le JPanel de la calculatrice
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel3.removeAll();
        
        affichage_calcul(10);
        
        nombreProposer=10;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        disable();//désactivation de tout les boutons
        
        p.add(j);
        
        this.setContentPane(p);
        
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();//fonction qui permet aux tâches de s'éxecuter avec du délais
        
        s.schedule(new Runnable()
        {//on initialise le timer à 0
            @Override
            public void run()
            {
                System.exit(0);//fermeture de l'application
            }

        },5, TimeUnit.SECONDS);//timer en seconde, initialiser à 10 secondes
        
        this.setVisible(true);//on met le JFrame en visible
        
        j.setVisible(true);
        
        p.add(jPanel2);//on ajoute le JPanel de la pub dans le JPanel de la calculatrice
        
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Frame
                Calculator c = new Calculator();
                c.setVisible(true);

            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}

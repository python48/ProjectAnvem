package ui;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import logic.Control;

/**
 *
 * @author Alan Moreno
 */
public class VendingGUI extends javax.swing.JFrame {

    Control c = new Control();
    Integer selected = 3;
    Integer cambio = 0;
    Integer credito = 0;
    /**
     * Creates new form VendingGUI
     */
    public VendingGUI() {
        initComponents();
        Imagen Imagen = new Imagen();
        jPanel3.add(Imagen);
        jPanel3.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/resources" + "/coinIco.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mensajes del programa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Junks Machine");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jToggleButton10.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton10.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/coin.png"))); // NOI18N
        jToggleButton10.setText("1 peso");
        jToggleButton10.setBorderPainted(false);
        jToggleButton10.setContentAreaFilled(false);
        jToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton14.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton14.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/coin.png"))); // NOI18N
        jToggleButton14.setText("5 pesos");
        jToggleButton14.setBorderPainted(false);
        jToggleButton14.setContentAreaFilled(false);
        jToggleButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton15.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/coin.png"))); // NOI18N
        jToggleButton15.setText("2 pesos");
        jToggleButton15.setBorderPainted(false);
        jToggleButton15.setContentAreaFilled(false);
        jToggleButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton17.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton17.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/coin.png"))); // NOI18N
        jToggleButton17.setText("10 pesos");
        jToggleButton17.setBorderPainted(false);
        jToggleButton17.setContentAreaFilled(false);
        jToggleButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(193, Short.MAX_VALUE)
                    .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton15))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton14)
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(97, Short.MAX_VALUE)
                    .addComponent(jToggleButton17)
                    .addGap(51, 51, 51)))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Hola soy la Junks Machine");
        jTextArea1.setCaretColor(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jToggleButton16.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton16.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/jello.png"))); // NOI18N
        jToggleButton16.setBorderPainted(false);
        jToggleButton16.setContentAreaFilled(false);
        jToggleButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton18.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton18.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/yogurt.png"))); // NOI18N
        jToggleButton18.setBorderPainted(false);
        jToggleButton18.setContentAreaFilled(false);
        jToggleButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton19.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/applejuice.png"))); // NOI18N
        jToggleButton19.setBorderPainted(false);
        jToggleButton19.setContentAreaFilled(false);
        jToggleButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton20.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/donas.png"))); // NOI18N
        jToggleButton20.setBorderPainted(false);
        jToggleButton20.setContentAreaFilled(false);
        jToggleButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton21.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/croissant.png"))); // NOI18N
        jToggleButton21.setBorderPainted(false);
        jToggleButton21.setContentAreaFilled(false);
        jToggleButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton22.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/milk.png"))); // NOI18N
        jToggleButton22.setBorderPainted(false);
        jToggleButton22.setContentAreaFilled(false);
        jToggleButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton21))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton22)
                    .addComponent(jToggleButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton20)
                    .addComponent(jToggleButton21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Comprar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecciona un producto");
        jLabel4.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Presionas boton de un peso*/
    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        int option = 0;
        String message = c.mainMenu(option);
        jTextArea1.setText("Crédito: "+message);
        credito+=1;
    }//GEN-LAST:event_jToggleButton10ActionPerformed
    /*Presionas boton de dos peso*/
    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        int option = 1;
        String message = c.mainMenu(option);
        jTextArea1.setText("Crédito: "+message);
        credito+=2;
    }//GEN-LAST:event_jToggleButton15ActionPerformed
    /*Presionas boton de cinco peso*/
    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        int option = 2;
        String message = c.mainMenu(option);
        jTextArea1.setText("Crédito: "+message);
        credito+=5;
    }//GEN-LAST:event_jToggleButton14ActionPerformed
    /*jello button*/
    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        String message = "Cuesta 3 pesos";
        this.selected = 3;
        jLabel4.setText("Gelatina");
        jLabel2.setText(message);
    }//GEN-LAST:event_jToggleButton16ActionPerformed
    /*Presionas boton de diez peso*/
    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        int option = 3;
        String message = c.mainMenu(option);
        jTextArea1.setText("Crédito: "+message);
        credito=Integer.parseInt(message);
    }//GEN-LAST:event_jToggleButton17ActionPerformed
    /*youghrt button*/
    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        String message = "Cuesta 6 pesos";
        this.selected=6;
                jLabel4.setText("Yoghurt");
        jLabel2.setText(message);
    }//GEN-LAST:event_jToggleButton18ActionPerformed
    /*jugo button*/
    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        String message = "Cuesta 4 pesos";
        this.selected=4;
                jLabel4.setText("Jugo");
        jLabel2.setText(message);
    }//GEN-LAST:event_jToggleButton19ActionPerformed
    /*donas button*/
    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        String message = "Cuesta 7 pesos";
        this.selected=7;
                jLabel4.setText("Donas");
        jLabel2.setText(message);
    }//GEN-LAST:event_jToggleButton20ActionPerformed
    /*croissaint button*/
    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        String message = "Cuesta 9 pesos";
        this.selected=9;
                jLabel4.setText("Croissant");
        jLabel2.setText(message);
    }//GEN-LAST:event_jToggleButton21ActionPerformed
    /*milk button*/
    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        String message = "Cuesta 6 pesos";
        this.selected=6;
                jLabel4.setText("Leche");
        jLabel2.setText(message);
    }//GEN-LAST:event_jToggleButton22ActionPerformed
    /*boton de comprar*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (c.getMaquinaDeEstados().getEstadoActual().getTag()>=selected) {
            cambio = credito-selected;
            jLabel2.setText("Compra realizada con éxito");
            jTextArea1.setText("Compra realizada con éxito " + "\nCambio: " + cambio);
            this.selected=3;
            credito=0;
            cambio=0;
            c.getMaquinaDeEstados().setEstadoActual(c.getMaquinaDeEstados().getEstadoInicial());
            jLabel4.setText("Selecciona un producto");
        }else
        {
            jLabel2.setText("Crédito insuficiente");
            jTextArea1.append("\nCrédito insuficiente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    // End of variables declaration//GEN-END:variables
    /**
     * NESTED CLASS FOR ADDING IMG to panel ////
     */
    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(400, 650); //se selecciona el tamaño del panel
        }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/resources/anvemMachine.png"));

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

}

package com.mycompany.loterynumber;

import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        numbersLabel = new javax.swing.JLabel();
        randomButton = new javax.swing.JButton();
        numbersField = new javax.swing.JTextField();
        generatedNumbersField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteador");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        mainTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(0, 0, 0));
        mainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitle.setText("Sorteador de números para loteria");

        numbersLabel.setForeground(new java.awt.Color(0, 0, 0));
        numbersLabel.setText("Quantidade de números:");

        randomButton.setBackground(new java.awt.Color(51, 51, 51));
        randomButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        randomButton.setForeground(new java.awt.Color(255, 255, 255));
        randomButton.setText("Sortear");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        numbersField.setColumns(10);
        numbersField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        numbersField.setToolTipText("Digite um número entre 1 e 10!");

        generatedNumbersField.setEditable(false);
        generatedNumbersField.setBackground(new java.awt.Color(255, 255, 255));
        generatedNumbersField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        generatedNumbersField.setForeground(new java.awt.Color(0, 0, 0));
        generatedNumbersField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numbersLabel)
                .addGap(19, 19, 19)
                .addComponent(numbersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(generatedNumbersField)
                    .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainTitle))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numbersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numbersLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(generatedNumbersField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        try{
            String generatedNumbers = 
            RandomNumbers.genNumbers(Integer.parseInt(numbersField.getText()));
            generatedNumbersField.setText(generatedNumbers);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Digite um número por favor!","Erro",JOptionPane.ERROR_MESSAGE);
        }catch(IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null,"O número deve estar entre 1 e 10!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_randomButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField generatedNumbersField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JTextField numbersField;
    private javax.swing.JLabel numbersLabel;
    private javax.swing.JButton randomButton;
    // End of variables declaration//GEN-END:variables
}

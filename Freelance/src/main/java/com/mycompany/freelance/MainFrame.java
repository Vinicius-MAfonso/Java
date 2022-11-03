package com.mycompany.freelance;
import javax.swing.DefaultListModel;

public class MainFrame extends javax.swing.JFrame {
private DefaultListModel modelo = new DefaultListModel();
    public MainFrame() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deleteProjectButton = new javax.swing.JButton();
        renameProjectButton = new javax.swing.JButton();
        createProjectButton = new javax.swing.JButton();
        openProjectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FreeLas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 41, 46));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        deleteProjectButton.setBackground(new java.awt.Color(36, 41, 46));
        deleteProjectButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteProjectButton.setText("Excluir");
        deleteProjectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteProjectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProjectButtonMouseClicked(evt);
            }
        });

        renameProjectButton.setBackground(new java.awt.Color(36, 41, 46));
        renameProjectButton.setForeground(new java.awt.Color(255, 255, 255));
        renameProjectButton.setText("Renomear");

        createProjectButton.setBackground(new java.awt.Color(21, 83, 153));
        createProjectButton.setForeground(new java.awt.Color(255, 255, 255));
        createProjectButton.setText("Criar projeto");
        createProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProjectButtonActionPerformed(evt);
            }
        });

        openProjectButton.setBackground(new java.awt.Color(21, 83, 153));
        openProjectButton.setForeground(new java.awt.Color(255, 255, 255));
        openProjectButton.setText("Abrir projeto");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("FreeLas");

        projectList.setBackground(new java.awt.Color(36, 41, 46));
        projectList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        projectList.setForeground(new java.awt.Color(144, 152, 160));
        projectList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Projeto 1", "Projeto 2", "Projeto 3", "Projeto 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        projectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectList.setToolTipText("Selecione o projeto e pressione o botão para uma ação");
        projectList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        projectList.setSelectionBackground(new java.awt.Color(3, 102, 214));
        projectList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(projectList);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Projeto Java");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteProjectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renameProjectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createProjectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openProjectButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(createProjectButton)
                    .addComponent(renameProjectButton)
                    .addComponent(deleteProjectButton)
                    .addComponent(openProjectButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProjectButtonActionPerformed
        CreateProjectFrame cpf = new CreateProjectFrame(this);
    }//GEN-LAST:event_createProjectButtonActionPerformed

    private void deleteProjectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProjectButtonMouseClicked
        modelo.remove(projectList.getSelectedIndex());
    }//GEN-LAST:event_deleteProjectButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createProjectButton;
    private javax.swing.JButton deleteProjectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openProjectButton;
    private javax.swing.JList<String> projectList;
    private javax.swing.JButton renameProjectButton;
    // End of variables declaration//GEN-END:variables
}

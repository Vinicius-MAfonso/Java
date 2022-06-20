import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Produtos extends javax.swing.JInternalFrame {
    dbConnector myConnector = new dbConnector();
    public Produtos() {
        initComponents();
        this.ListarProdutos();
        this.ajustarBotoesLimparCampos();
    }
    public void ListarProdutos(){
        DefaultTableModel modelClear = (DefaultTableModel) tableProdutos.getModel();
        modelClear.setRowCount(0);
        String query = "SELECT * FROM produtos";
        try {
            //Estabelecer conexão
             // Criando o objeto statement - usado para executar consultas
            Statement st = myConnector.myCon().createStatement();
            // O método executeQuery retorna um objeto ResultSet object o qual
            //representa o resultado da consulta.
            ResultSet rs = st.executeQuery(query);
            
            DefaultTableModel modelAlunos = (DefaultTableModel) tableProdutos.getModel();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colNum = rs.getMetaData().getColumnCount();
            String[] colsNames = new String[colNum];
            for(int i = 0; i < colNum; i++ ){
                colsNames[i] = rsmd.getColumnName(i+1);
            }
            modelAlunos.setColumnIdentifiers(colsNames);
            String nomeProduto, tipoProduto;
            int codProduto;
            double preco;
            while (rs.next()) {
                codProduto = Integer.parseInt(rs.getString(1));
                nomeProduto = rs.getString(2);
                preco = Double.parseDouble(rs.getString(3));
                tipoProduto = rs.getString(4);
                String[] row = {String.valueOf(codProduto), nomeProduto, String.valueOf(preco), tipoProduto};
                modelAlunos.addRow(row);
            }
            rs.close();
            st.close();
            myConnector.myCon().close();
        } catch (SQLException e) {
            System.out.println(e);
        } 
        
    }
    public void CadastrarProduto(){
        String codProduto = tfCodProduto.getText();
        String nomeProduto = tfNomeProduto.getText();
        String mediaAluno = tfPrecoProduto.getText();
        String tipoProduto = comboTipo.getSelectedItem().toString();
        String query = "INSERT INTO produtos VALUES ("+ Integer.parseInt(codProduto)
                +",'" + nomeProduto + "'"
                + "," + Double.parseDouble(mediaAluno) 
                +",'" + tipoProduto + "' );";
        try {
            //Estabelecer conexão
             // Criando o objeto statement - usado para executar consultas
            Statement st = myConnector.myCon().createStatement();
            // O método executeQuery retorna um objeto ResultSet object o qual
            //representa o resultado da consulta.
            //ResultSet rs = st.executeQuery(query);
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(rootPane, "Produto ADICIONADO Com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            //rs.close();
            st.close();
            myConnector.myCon().close();
        } catch (SQLException e) {
            System.out.println(e);
        } 
        this.limparCampos();
        this.ListarProdutos();
    }
    public void RemoverProduto(){
        String codProduto = tfCodProduto.getText();
        String query = "DELETE FROM produtos WHERE idprodutos = '"+ Integer.parseInt(codProduto) +"'";
        try {
            //Estabelecer conexão
             // Criando o objeto statement - usado para executar consultas
            Statement st = myConnector.myCon().createStatement();
            // O método executeQuery retorna um objeto ResultSet object o qual
            //representa o resultado da consulta.
            //ResultSet rs = st.executeQuery(query);
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(rootPane, "Produto REMOVIDO Com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            //rs.close();
            st.close();
            myConnector.myCon().close();
        } catch (SQLException e) {
            System.out.println(e);
        } 
        this.limparCampos();
        this.ListarProdutos();
    }
    public void AtualizarProduto(){
        String codProduto = tfCodProduto.getText();
        String nomeProduto = tfNomeProduto.getText();
        String mediaAluno = tfPrecoProduto.getText();
        String tipoProduto = comboTipo.getSelectedItem().toString();
        String query = "UPDATE produtos SET "
                + "idprodutos=" + Integer.parseInt(codProduto)
                + ",nome='" + nomeProduto + "'" 
                + ",preco=" + Double.parseDouble(mediaAluno)
                + ",tipo='" + tipoProduto + "' WHERE idprodutos = '"+ Integer.parseInt(codProduto) +"'";
         try {
            //Estabelecer conexão
             // Criando o objeto statement - usado para executar consultas
            Statement st = myConnector.myCon().createStatement();
            // O método executeQuery retorna um objeto ResultSet object o qual
            //representa o resultado da consulta.
            //ResultSet rs = st.executeQuery(query);
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(rootPane, "Produto ATUALIZADO Com Sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            //rs.close();
            st.close();
            myConnector.myCon().close();
        } catch (SQLException e) {
            System.out.println(e);
        } 
        this.limparCampos();
        this.ListarProdutos();
    }
    public void limparCampos(){
        tfCodProduto.setText("");
        tfNomeProduto.setText("");
        tfPrecoProduto.setText("");
        comboTipo.setSelectedIndex(0);
        tfCodProduto.requestFocus();
    }
    public void ajustarBotoesAlunoSelecionado(){
        btnAdicionarProduto.setEnabled(false);
        btnAtualizarProduto.setEnabled(true);
        btnRemoverProduto.setEnabled(true);
    }
    public void ajustarBotoesLimparCampos(){
        btnAdicionarProduto.setEnabled(true);
        btnAtualizarProduto.setEnabled(false);
        btnRemoverProduto.setEnabled(false);
        tfCodProduto.setText("");
        tfNomeProduto.setText("");
        tfPrecoProduto.setText("");
        comboTipo.setSelectedIndex(0);
        tfCodProduto.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdicionarProduto = new javax.swing.JButton();
        btnAtualizarProduto = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodProduto = new javax.swing.JTextField();
        tfNomeProduto = new javax.swing.JTextField();
        tfPrecoProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnLimparCampos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Menu Produtos");

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnAtualizarProduto.setText("Atualizar Produto");
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });

        btnRemoverProduto.setText("Remover Produto");
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Menu Produtos");

        jLabel2.setText("Código do Produto:");

        jLabel3.setText("Nome Produto:");

        jLabel5.setText("Preço:");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProdutos);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Bebida", "Frios", "Utilitários", "Outros" }));

        jLabel6.setText("Tipo:");

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane2))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarProduto)
                    .addComponent(btnAtualizarProduto)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnRemoverProduto))
                .addGap(129, 129, 129))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        
        this.CadastrarProduto();
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
        
        String codProduto = tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0).toString();
        String nomeProduto = tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 1).toString();
        String precoProduto = tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 2).toString();
        String tipoProduto = tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 3).toString();
        
        
        tfCodProduto.setText(codProduto);
        tfNomeProduto.setText(nomeProduto);
        tfPrecoProduto.setText(precoProduto);
        comboTipo.setSelectedItem(tipoProduto);
        this.ajustarBotoesAlunoSelecionado();
    }//GEN-LAST:event_tableProdutosMouseClicked

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:
        this.ajustarBotoesLimparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
        // TODO add your handling code here:
        this.AtualizarProduto();
    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        // TODO add your handling code here:
        this.RemoverProduto();
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField tfCodProduto;
    private javax.swing.JTextField tfNomeProduto;
    private javax.swing.JTextField tfPrecoProduto;
    // End of variables declaration//GEN-END:variables
}

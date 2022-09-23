package projeto.pizzaria;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import projeto.pizzaria.Pizza.sabores;
import javax.swing.JOptionPane;

public class CalculatorFrame extends javax.swing.JFrame {
    private int pedidos = 0;
    DefaultListModel modelo = new DefaultListModel();
    
    public CalculatorFrame() {
        super("Conta Bill");
        initComponents();
        nPedidoTextField.setText(Integer.toString(pedidos));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel2 = new javax.swing.JLabel();
        nPedidoLabel = new javax.swing.JLabel();
        nPedidoTextField = new javax.swing.JTextField();
        nomeClienteLabel = new javax.swing.JLabel();
        nomeClienteTextField = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPedido = new javax.swing.JList<>();
        descricaoPedidoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        adicionarPizzaButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPizzas = new javax.swing.JList<>();
        adicionaisLabel = new javax.swing.JLabel();
        queijoExtraRadioButton = new javax.swing.JRadioButton();
        molhoExtraRadioButton = new javax.swing.JRadioButton();
        enderecoLabel = new javax.swing.JLabel();
        removerProdutoButton = new javax.swing.JButton();
        finalizarProdutoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enderecoTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pizzaria do Bill");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nPedidoLabel.setText("Pedido Nº:");

        nPedidoTextField.setEditable(false);
        nPedidoTextField.setColumns(5);

        nomeClienteLabel.setText("Nome do Cliente:");

        nomeClienteTextField.setColumns(15);

        telefoneLabel.setText("Telefone:");

        telefoneTextField.setColumns(10);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setViewportView(listaPedido);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        descricaoPedidoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descricaoPedidoLabel.setText("Descrição do pedido");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adicionarPizzaButton.setForeground(new java.awt.Color(0, 0, 0));
        adicionarPizzaButton.setText("Adicionar");
        adicionarPizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPizzaButtonActionPerformed(evt);
            }
        });

        listaPizzas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pizza Mussarela", "Pizza Marguerita", "Pizza Calabresa", "Pizza Bacon", "Pizza especial da casa" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPizzas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(listaPizzas);

        adicionaisLabel.setText("Adicionais");

        queijoExtraRadioButton.setText("Queijo Extra");

        molhoExtraRadioButton.setText("Molho Extra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(adicionaisLabel)
                    .addComponent(queijoExtraRadioButton)
                    .addComponent(molhoExtraRadioButton)
                    .addComponent(adicionarPizzaButton))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionaisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queijoExtraRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(molhoExtraRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionarPizzaButton)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        enderecoLabel.setText("Endereço:");

        removerProdutoButton.setText("Remover Produto");
        removerProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProdutoButtonActionPerformed(evt);
            }
        });

        finalizarProdutoButton.setText("Finalizar Pedido");
        finalizarProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarProdutoButtonActionPerformed(evt);
            }
        });

        enderecoTextArea.setColumns(20);
        enderecoTextArea.setRows(5);
        jScrollPane1.setViewportView(enderecoTextArea);

        jLabel1.setText("Sabor pizza");

        jLabel3.setText("Preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removerProdutoButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(finalizarProdutoButton)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoPedidoLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneLabel)
                                    .addComponent(nomeClienteLabel)
                                    .addComponent(nPedidoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enderecoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nPedidoLabel)
                                .addComponent(nPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(enderecoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeClienteLabel)
                            .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneLabel)
                            .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(descricaoPedidoLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalizarProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerProdutoButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarProdutoButtonActionPerformed
        Cliente cliente = new Cliente(nomeClienteTextField.getText(), 
                telefoneTextField.getText(), enderecoTextArea.getText(), pedidos);
        int confirmarPedido = JOptionPane.showConfirmDialog
        (null, "Confirmar pedido?", "Finalizar pedido", JOptionPane.YES_NO_OPTION);
        System.out.println(confirmarPedido);
        if(confirmarPedido == 0){
            try {
                System.out.println("Gerando relatório...");
                cliente.gerarRelatorio(modelo.toString());
            } catch (IOException ex) {
                ex.getStackTrace();
            }
            pedidos++;
            nPedidoTextField.setText(Integer.toString(pedidos));
            modelo.clear();
            listaPedido.setModel(modelo);
            nomeClienteTextField.setText(null);
            telefoneTextField.setText(null);
            enderecoTextArea.setText(null); 
        }
        
    }//GEN-LAST:event_finalizarProdutoButtonActionPerformed

    private void adicionarPizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPizzaButtonActionPerformed
        sabores sabor = switch(listaPizzas.getSelectedIndex()){
            case 0 -> {
                yield sabores.MUSSARELA;
            }
            case 1 -> {
                yield sabores.MARGUERITA;
            }
            case 2 -> {
                yield sabores.CALABRESA;
            }
            case 3 -> {
                yield sabores.BACON;
            }
            case 4 -> {
                yield sabores.ESPECIAL;
            }
            default ->{
                yield null;
            }
        };
        Pizza pizza = 
                new Pizza(queijoExtraRadioButton.isSelected(), molhoExtraRadioButton.isSelected(), 
                        sabor);
        modelo.addElement(pizza);
        listaPedido.setModel(modelo);
        
        
    }//GEN-LAST:event_adicionarPizzaButtonActionPerformed

    private void removerProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProdutoButtonActionPerformed
        modelo.remove(listaPedido.getSelectedIndex());
    }//GEN-LAST:event_removerProdutoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adicionaisLabel;
    private javax.swing.JButton adicionarPizzaButton;
    private javax.swing.JLabel descricaoPedidoLabel;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTextArea enderecoTextArea;
    private javax.swing.JButton finalizarProdutoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaPedido;
    private javax.swing.JList<String> listaPizzas;
    private javax.swing.JRadioButton molhoExtraRadioButton;
    private javax.swing.JLabel nPedidoLabel;
    private javax.swing.JTextField nPedidoTextField;
    private javax.swing.JLabel nomeClienteLabel;
    private javax.swing.JTextField nomeClienteTextField;
    private javax.swing.JRadioButton queijoExtraRadioButton;
    private javax.swing.JButton removerProdutoButton;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}

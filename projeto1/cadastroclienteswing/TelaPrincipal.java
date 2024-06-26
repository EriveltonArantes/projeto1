package cadastroclienteswing;

import cadastroclienteswing.dao.ClienteMapDAO;
import cadastroclienteswing.dao.IClienteDAO;
import cadastroclienteswing.domain.Cliente;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {
    
     private DefaultTableModel modelo = new DefaultTableModel();
     private IClienteDAO clienteDAO = new ClienteMapDAO();
     
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jLabelCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setText("Nome:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabelCpf.setText("CPF:");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        jButtonDelete.setText("Excluir");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClean.setText("Limpar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Atualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonSave)
                            .addGap(101, 101, 101)
                            .addComponent(jButtonClean)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonUpdate)
                            .addGap(91, 91, 91)
                            .addComponent(jButtonDelete))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean)
                    .addComponent(jButtonUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?", "Sair",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String name = txtName.getText();
        String cpf = txtCpf.getText();
        if (!isCamposValidos(name, cpf)){
           JOptionPane.showMessageDialog(null, "Favor preencher todos os campos", "Atenção", JOptionPane.INFORMATION_MESSAGE);
           return;
        }
        cpf = cpf.replaceAll("[^0-9]", "");
        if (!isValidCpf(cpf)){
            return;
        }
        Cliente cliente = new Cliente (name, cpf, 1L, null, 1, null, null);
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
        if (isCadastrado){
            Object[] rowData = new Object[]{cliente.getNome(),cliente.getCpf()};
            modelo.addRow(rowData);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Este CPF já está cadastrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        int rowIndex = tabelaClientes.getSelectedRow();
        String cpf = (String) tabelaClientes.getValueAt(rowIndex, 1);
        Cliente cliente = this.clienteDAO.consultar(cpf);
        txtName.setText(cliente.getNome());
        txtCpf.setText(cliente.getCpf().toString());
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int rowIndex = tabelaClientes.getSelectedRow();
        if (rowIndex >=0){
            int result = JOptionPane.showConfirmDialog(this,"Deseja excluir o cliente selecionado?", "Exclusão de cliente",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                String cpf = (String) tabelaClientes.getValueAt(rowIndex, 1);
                String name = (String) tabelaClientes.getValueAt(rowIndex, 0);
                clienteDAO.excluir(cpf);
                modelo.removeRow(rowIndex);
                limparCampos();
                JOptionPane.showMessageDialog(null, "Cliente " + name.toUpperCase() + " excluído com sucesso!", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente preservado", "Infomação",JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (tabelaClientes.getRowCount() > 0){
                JOptionPane.showMessageDialog(null, "É preciso selecionar na tabela o cliente a ser excluído!", "Informação",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não há registros para excluir!", "Informação",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
              
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int rowIndex = tabelaClientes.getSelectedRow();
        if (rowIndex >=0){
            String name = txtName.getText();
            String cpf = txtCpf.getText();
            if (!isCamposValidos(name, cpf)){
                JOptionPane.showMessageDialog(null, "Não há dados para atualizar", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            cpf = cpf.replaceAll("[^0-9]", "");
            if (!isValidCpf(cpf)){
                return;
            }
            if (!isExistClient(cpf)){
                return;
            }
            Cliente cliente = new Cliente (name, cpf, 1L, null, 1, null, null);
            clienteDAO.alterar(cliente);
            modelo.removeRow(rowIndex);
            Object[] rowData = new Object[]{cliente.getNome(),cliente.getCpf()};
            modelo.addRow(rowData);
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        }else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar na tabela o cliente a ser atualizado!", "Informação",JOptionPane.INFORMATION_MESSAGE);
        }
        
               
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campo == null || "".equals(campo)){
                return false;
            }
        }
        return true;
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        
        tabelaClientes.setModel(modelo);
    }

    private void limparCampos() {
        txtName.setText("");
        txtCpf.setText("");
    }

    private Boolean isValidCpf(String cpf) {
        if (cpf.length() != 11){
           JOptionPane.showMessageDialog(null, "CPF inválido!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
           return false; 
        } 
        return true;
    }

    private boolean isExistClient(String cpf) {
        Cliente cliente = clienteDAO.consultar(cpf);
        if (cliente != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "CPF não localizado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
}
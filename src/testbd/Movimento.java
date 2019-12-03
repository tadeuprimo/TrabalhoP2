package testbd;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Movimento extends javax.swing.JFrame {

    CRUD controle = new CRUD();

    public Movimento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("CadastroPU").createEntityManager();
        cadastroQuery = java.beans.Beans.isDesignTime() ? null : CadastroPUEntityManager.createQuery("SELECT c FROM Cadastro c");
        cadastroList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroQuery.getResultList();
        cadastroQuery1 = java.beans.Beans.isDesignTime() ? null : CadastroPUEntityManager.createQuery("SELECT c FROM Cadastro c");
        cadastroList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroQuery1.getResultList();
        cadastroQuery2 = java.beans.Beans.isDesignTime() ? null : CadastroPUEntityManager.createQuery("SELECT c FROM Cadastro c");
        cadastroList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroQuery2.getResultList();
        lblID = new javax.swing.JLabel();
        lblDecolagem = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblComandante = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtDecolagem = new javax.swing.JTextField();
        txtPouso = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lblTipo = new javax.swing.JLabel();
        txtDesembarque = new javax.swing.JTextField();
        txtComandante = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblDesembarque = new javax.swing.JLabel();
        lblAnac = new javax.swing.JLabel();
        lblEmbarque = new javax.swing.JLabel();
        lblCarga = new javax.swing.JLabel();
        txtAnac = new javax.swing.JTextField();
        txtEmbarque = new javax.swing.JTextField();
        txtCarga = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);

        lblID.setText("ID");

        lblDecolagem.setText("ORIGEM");

        lblNome.setText("DESTINO");

        lblComandante.setText("COMANDANTE");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtDecolagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecolagemActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ORIGEM", "DESTINO", "TIPO", "DESEMBARQUE", "EMBARQUE", "CARGA", "COMANDANTE", "ANAC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(40);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(120);
            tabela.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        lblTipo.setText("TIPO");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\istockphoto-614716542-1024x1024.jpg")); // NOI18N
        lblTitulo.setText("CONTROLE AEROPORTUÁRIO");

        lblDesembarque.setText("DESEMBARQUE");

        lblAnac.setText("ANAC");

        lblEmbarque.setText("EMBARQUE");

        lblCarga.setText("CARGA");

        jButton1.setText("CONSULTA AERONAVE");
        jButton1.setActionCommand("CONSULTA AERONAVE");

        jButton2.setText("CONSULTA PILOTO");

        jButton3.setText("ANAC");

        jButton4.setText("TARIFAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(btnInserir)
                                .addGap(30, 30, 30)
                                .addComponent(btnAlterar)
                                .addGap(34, 34, 34)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDecolagem)
                                    .addComponent(txtDecolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(txtPouso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesembarque)
                                    .addComponent(txtDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmbarque))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCarga)
                                        .addGap(34, 34, 34)
                                        .addComponent(lblComandante))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComandante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnac)
                            .addComponent(txtAnac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNome)
                                        .addComponent(lblTipo))
                                    .addComponent(lblID)
                                    .addComponent(lblDecolagem))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAnac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDecolagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPouso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComandante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDesembarque)
                        .addComponent(lblEmbarque)
                        .addComponent(lblCarga)
                        .addComponent(lblComandante)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

         controle.cadastrarMovimento(Integer.parseInt(txtId.getText()),
                Integer.parseInt(txtComandante.getText()),
                txtCarga.getText(), 
                txtEmbarque.getText());
        carregarDados();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        controle.atualizarMovimento(Integer.parseInt(txtId.getText()),
                Integer.parseInt(txtDecolagem.getText()),
                txtPouso.getText(), txtTipo.getText());
        carregarDados();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        controle.excluirMovimento(Integer.parseInt(txtId.getText()));
        carregarDados();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtDecolagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecolagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecolagemActionPerformed

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
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimento().setVisible(true);
            }
        });

    }

    private void carregarDados() {
        //preencher depois
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel(); //objeto novo
        modelo.setNumRows(0);
        try {
            ResultSet dados = controle.carregarMovimento();
            while (dados.next()) {
                int id = dados.getInt("id");
                int nivel = dados.getInt("nivel");
                String nome = dados.getString("nome");
                String sobrenome = dados.getString("sobrenome");
                modelo.addRow(new Object[]{new Integer(id), new Integer(nivel), nome, sobrenome});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager CadastroPUEntityManager;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private java.util.List<testbd.Cadastro> cadastroList;
    private java.util.List<testbd.Cadastro> cadastroList1;
    private java.util.List<testbd.Cadastro> cadastroList2;
    private javax.persistence.Query cadastroQuery;
    private javax.persistence.Query cadastroQuery1;
    private javax.persistence.Query cadastroQuery2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblAnac;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblComandante;
    private javax.swing.JLabel lblDecolagem;
    private javax.swing.JLabel lblDesembarque;
    private javax.swing.JLabel lblEmbarque;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtAnac;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtComandante;
    private javax.swing.JTextField txtDecolagem;
    private javax.swing.JTextField txtDesembarque;
    private javax.swing.JTextField txtEmbarque;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPouso;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

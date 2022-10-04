/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 * @author guilh
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastrarExame = new javax.swing.JMenuItem();
        CadastrarPlanos = new javax.swing.JMenuItem();
        CadastrarFuncionarios = new javax.swing.JMenuItem();
        CadastrarPaciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-clinic-physician-medicine-specialty-computer-icons-5b0d0b9a1814b2.0269865615275815940987.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CLINICA MÉDICA GUI'S, aqui todo funcionário é um Guilherme");

        jMenu1.setText("Options");

        CadastrarExame.setText("Cadastrar Exame");
        CadastrarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarExameActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarExame);

        CadastrarPlanos.setText("Cadastrar Plano de Saúde");
        CadastrarPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarPlanosActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarPlanos);

        CadastrarFuncionarios.setText("Cadastrar Funcionário");
        CadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFuncionariosActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarFuncionarios);

        CadastrarPaciente.setText("Cadastrar Paciente");
        jMenu1.add(CadastrarPaciente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarExameActionPerformed
        CadastroExame exam=new CadastroExame();
        exam.setVisible(true);        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CadastrarExameActionPerformed

    private void CadastrarPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarPlanosActionPerformed
        CadastroPlanoDeSaude plan=new CadastroPlanoDeSaude();
        plan.setVisible(true);        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CadastrarPlanosActionPerformed

    private void CadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFuncionariosActionPerformed
        CadastroFuncionario fun=new CadastroFuncionario();
        fun.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastrarFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarExame;
    private javax.swing.JMenuItem CadastrarFuncionarios;
    private javax.swing.JMenuItem CadastrarPaciente;
    private javax.swing.JMenuItem CadastrarPlanos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

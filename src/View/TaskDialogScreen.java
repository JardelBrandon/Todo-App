/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TaskController;
import Model.Project;
import Model.Task;
import static View.TaskDialogScreen.ControllerOperation.UPDATE;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JB
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    public enum ControllerOperation {
        SAVE, UPDATE;            
    };
    private ControllerOperation controllerOperation;
    private TaskController controller;
    private Project project;
    private Task task;
    
    
    /**
     * Creates new form TaskDialogScreen
     */
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();        
        
        controller = new TaskController();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSave = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jLabelTaskName = new javax.swing.JLabel();
        jTextFieldTaskName = new javax.swing.JTextField();
        jLabelTaskDescripiton = new javax.swing.JLabel();
        jScrollPaneTaskDescription = new javax.swing.JScrollPane();
        jTextAreaTaskDescription = new javax.swing.JTextArea();
        jLabelTaskDeadLine = new javax.swing.JLabel();
        jLabelTaskNotes = new javax.swing.JLabel();
        jScrollPaneTaskNotes = new javax.swing.JScrollPane();
        jTextAreaTaskNotes = new javax.swing.JTextArea();
        jFormattedTextFieldDeadLine = new javax.swing.JFormattedTextField();
        jLabelNameError = new javax.swing.JLabel();
        jLabelDeadLineError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        jPanelToolBar.setBackground(new java.awt.Color(0, 150, 102));

        jLabelToolBarTitle.setBackground(new java.awt.Color(0, 150, 102));
        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolBarTitle.setForeground(java.awt.Color.white);
        jLabelToolBarTitle.setText("Tarefa");

        jLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check.png"))); // NOI18N
        jLabelToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTask.setBackground(java.awt.Color.white);

        jLabelTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskName.setText("Nome");

        jTextFieldTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaskNameActionPerformed(evt);
            }
        });

        jLabelTaskDescripiton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskDescripiton.setText("Descrição");

        jTextAreaTaskDescription.setColumns(20);
        jTextAreaTaskDescription.setRows(5);
        jScrollPaneTaskDescription.setViewportView(jTextAreaTaskDescription);

        jLabelTaskDeadLine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskDeadLine.setText("Prazo");

        jLabelTaskNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskNotes.setText("Notas");

        jTextAreaTaskNotes.setColumns(20);
        jTextAreaTaskNotes.setRows(5);
        jScrollPaneTaskNotes.setViewportView(jTextAreaTaskNotes);

        jFormattedTextFieldDeadLine.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabelNameError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNameError.setForeground(new java.awt.Color(153, 0, 0));
        jLabelNameError.setText("Campo de nome obrigatório ");

        jLabelDeadLineError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDeadLineError.setForeground(new java.awt.Color(153, 0, 0));
        jLabelDeadLineError.setText("Campo de prazo obrigatório");

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTaskName)
                    .addComponent(jLabelTaskName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskDescripiton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(jLabelTaskDeadLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTaskNotes)
                    .addComponent(jFormattedTextFieldDeadLine)
                    .addComponent(jLabelNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadLineError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskDescripiton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTaskDescription)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskDeadLine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeadLineError)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTaskNotes)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaskNameActionPerformed

    private void jLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarSaveMouseClicked
        // TODO add your handling code here:
        try {
            if(isFieldsValid()) {                        
                switch(getControllerOperation()) {
                    case SAVE:                                            
                        controller.save(inputFieldsTAsk(new Task()));

                        JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
                        break;
                    case UPDATE:
                        getTask().setUpdatedAt(new Date());
                        controller.update(inputFieldsTAsk(getTask()));       
                        
                        JOptionPane.showMessageDialog(rootPane, "Tarefa atualizada com sucesso!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(rootPane, "Erro ao configurar operação!");
                }
                this.dispose();
            } else {
                hideErrorFields();
                
                if(jTextFieldTaskName.getText().isEmpty()) {
                    jLabelNameError.setVisible(true);
                }
                if(jFormattedTextFieldDeadLine.getText().isEmpty()) {
                    jLabelDeadLineError.setVisible(true);
                }
//            JOptionPane.showMessageDialog(rootPane, "A tarefa não foi salva "
//                        + "pois existem campos obrigatórios a serem preenchidos");
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(rootPane, error.getMessage());
        }        
    }//GEN-LAST:event_jLabelToolBarSaveMouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>                

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);                        
                    }                    
                });
                dialog.setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadLine;
    private javax.swing.JLabel jLabelDeadLineError;
    private javax.swing.JLabel jLabelNameError;
    private javax.swing.JLabel jLabelTaskDeadLine;
    private javax.swing.JLabel jLabelTaskDescripiton;
    private javax.swing.JLabel jLabelTaskName;
    private javax.swing.JLabel jLabelTaskNotes;
    private javax.swing.JLabel jLabelToolBarSave;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneTaskDescription;
    private javax.swing.JScrollPane jScrollPaneTaskNotes;
    private javax.swing.JTextArea jTextAreaTaskDescription;
    private javax.swing.JTextArea jTextAreaTaskNotes;
    private javax.swing.JTextField jTextFieldTaskName;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

    public ControllerOperation getControllerOperation() {
        return controllerOperation;
    }

    public void setControllerOperation(ControllerOperation controllerOperation) {
        this.controllerOperation = controllerOperation;
    }   

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
        
        insertSelectedDataTask();
    }        
    
    public Task inputFieldsTAsk(Task task) {              
        task.setIdProject(project.getId());
        task.setName(jTextFieldTaskName.getText());
        task.setDescription(jTextAreaTaskDescription.getText());
        task.setNotes(jTextAreaTaskNotes.getText());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date deadline = null;

        try {
            deadline = dateFormat.parse(jFormattedTextFieldDeadLine.getText());
        } catch (ParseException ex) {
            Logger.getLogger(TaskDialogScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        task.setDeadline(deadline);
        task.setIsCompleted(false);
        
        return task;
    }
    
    public void insertSelectedDataTask() {
        jTextFieldTaskName.setText(getTask().getName());
        jTextAreaTaskDescription.setText(getTask().getDescription());
        jTextAreaTaskNotes.setText(getTask().getNotes());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jFormattedTextFieldDeadLine.setText(dateFormat.format(getTask().getDeadline()));
    }
    
    public void hideErrorFields() {
        jLabelNameError.setVisible(false);
        jLabelDeadLineError.setVisible(false);
    }

    private boolean isFieldsValid() {
        return !(jTextFieldTaskName.getText().isEmpty()
                    || jFormattedTextFieldDeadLine.getText().isEmpty());
    }
    
}

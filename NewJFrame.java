
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;


public class NewJFrame extends javax.swing.JFrame {
    DefaultListModel<String> listModel = new DefaultListModel<String>();
    boolean editing = false;
    int Step=0;
    String ItemName, ItemID, ItemAddress, ItemPass;
    String [] s = new String[LogicClass.items.size()];
  int count;
    public NewJFrame() {
       int size = LogicClass.items.size();
       for (int i=0;i<size;i++)
       {
           s[i]=LogicClass.items.get(i).Name;
       }
      
        for (int i=0;i<size;i++)
        {
            listModel.addElement(LogicClass.items.get(i).Name);
        }
        
       initComponents();
       jPanel_info.setVisible(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextSearch = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPassCodes = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel_info = new javax.swing.JPanel();
        txtEntry = new javax.swing.JTextField();
        labelInfo = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnCopyID = new javax.swing.JButton();
        btnCopyPassword = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCopyAddress = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabelInfo1 = new javax.swing.JLabel();
        jLabelInfo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 30));

        jTextSearch.setMargin(new java.awt.Insets(0, 2, 4, 2));
        jTextSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextSearchMouseClicked(evt);
            }
        });
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSearchKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchKeyReleased(evt);
            }
        });

        jButtonClear.setText("C");
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClear))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear)))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(189, 235));

        jListPassCodes.setModel(listModel);
        jListPassCodes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPassCodesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListPassCodes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setPreferredSize(new java.awt.Dimension(211, 288));

        jPanel_info.setEnabled(false);

        labelInfo.setText("Info: Add the Name");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Back");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_infoLayout = new javax.swing.GroupLayout(jPanel_info);
        jPanel_info.setLayout(jPanel_infoLayout);
        jPanel_infoLayout.setHorizontalGroup(
            jPanel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEntry)
            .addComponent(labelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoLayout.createSequentialGroup()
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave))
        );
        jPanel_infoLayout.setVerticalGroup(
            jPanel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoLayout.createSequentialGroup()
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCopyID.setBackground(new java.awt.Color(255, 204, 204));
        btnCopyID.setText("Copy ID");
        btnCopyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyIDActionPerformed(evt);
            }
        });

        btnCopyPassword.setBackground(new java.awt.Color(255, 204, 204));
        btnCopyPassword.setText("Copy Password");
        btnCopyPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyPasswordActionPerformed(evt);
            }
        });

        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit PassCode");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Entry");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCopyAddress.setText("Copy Address");

        jLabelInfo1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelInfo1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelInfo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelInfo1.setPreferredSize(new java.awt.Dimension(100, 17));

        jLabelInfo2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelInfo2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelInfo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelInfo2.setPreferredSize(new java.awt.Dimension(100, 18));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCopyID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCopyPassword))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAddNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(btnEdit))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnCopyAddress))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopyID)
                    .addComponent(btnCopyPassword))
                .addGap(5, 5, 5)
                .addComponent(btnCopyAddress)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnAddNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JRootPane rootPane = SwingUtilities.getRootPane(btnSave);
        rootPane.setDefaultButton(btnSave);
        pack();
    }// </editor-fold>                        

    private void btnCopyIDActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        StringSelection s = new StringSelection(LogicClass.getId(jListPassCodes.getSelectedIndex()));
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        c.setContents(s, s);
    }                                         

    private void btnCopyPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        StringSelection s = new StringSelection(LogicClass.getPass(jListPassCodes.getSelectedIndex()));
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        c.setContents(s, s);
    }                                               

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jPanel_info.setVisible(true);
        btnAddNew.setEnabled(false);
    }                                         

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        txtEntry.setText(jListPassCodes.getSelectedValue());
        editing = true;
        jPanel_info.setVisible(true);
        btnAddNew.setEnabled(false);
    }                                       

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (Step < 3) {            
            if (Step==0) {
                ItemName=txtEntry.getText(); 
                if (editing){
                    txtEntry.setText(LogicClass.items.get(jListPassCodes.getSelectedIndex()).Id);
                    labelInfo.setText("Info: Edit the ID");
                }else {
                    txtEntry.setText("");
                    labelInfo.setText("Info: Add the ID");
                } 
            }
            else if (Step==1){
                ItemID=txtEntry.getText(); 
                if (editing){
                    txtEntry.setText(LogicClass.items.get(jListPassCodes.getSelectedIndex()).PassCode);
                    labelInfo.setText("Info: Edit the PassCode");
                }else {
                    txtEntry.setText("");
                    labelInfo.setText("Info: Add the PassCode");
                } 
            }
            else if (Step==2){
                ItemPass=txtEntry.getText(); 
                if (editing){
                    txtEntry.setText(LogicClass.items.get(jListPassCodes.getSelectedIndex()).Address);
                    labelInfo.setText("Info: Edit the Address");
                }else {
                    txtEntry.setText("");
                    labelInfo.setText("Info: Add the Address");
                } 
            }
            Step+=1;
        }
        else {
            Step=0;
            ItemAddress=txtEntry.getText(); 
            labelInfo.setText("Info: Add the Name");
            txtEntry.setText("");
            
             if (editing){                    
                editing = false;
                LogicClass.Replace(jListPassCodes.getSelectedIndex(),
                        new Item(ItemName, ItemPass, ItemID, ItemAddress));
                listModel.setElementAt(ItemName, jListPassCodes.getSelectedIndex()); 
            }else {                    
                 LogicClass.AddEntry(ItemName, ItemPass, ItemID, ItemAddress);
                 listModel.addElement(ItemName);
            } 
           
            jPanel_info.setVisible(false);
            btnAddNew.setEnabled(true);
        }
        
    }                                       

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        // TODO add your handling code here:
        LogicClass.WriteXml();
    }                                  

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int output = JOptionPane.showConfirmDialog(this
                , "You are about to delete '" + 
    	LogicClass.items.get(jListPassCodes.getSelectedIndex()).Name +"' \r\n proceed?"
                ,"JavaXPass:"
                ,JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

             if(output == JOptionPane.YES_OPTION){
            	 LogicClass.RemoveEntry(jListPassCodes.getSelectedIndex());
             	listModel.removeElement(jListPassCodes.getSelectedValue());
             } 
    }                                         

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jPanel_info.setVisible(false);
         btnAddNew.setEnabled(true);
    }                                         

    private void jTextSearchKeyReleased(java.awt.event.KeyEvent evt) {                                        
        //jListPassCodes.clearSelection();
        listModel = new DefaultListModel();
        
        
        if (jTextSearch.getText().length() > 0) {
            count = jTextSearch.getText().length();
            //ArrayList<Item> list = LogicClass.items;
            ArrayList<Item> newlist = new ArrayList();
            for (Item pass: LogicClass.items) {
                if ((pass.Name).length() >= count){
                    if ((pass.Name).toLowerCase().substring(0, count).equals(jTextSearch.getText().toLowerCase()))  {
                        if (!LogicClass.ListContains(newlist, pass.Name))
                            newlist.add(pass); 
                        else if ((pass.Id).toLowerCase().contains(jTextSearch.getText()))
                            newlist.add(pass);
                    }
                } 
            }
            for (Item pass: newlist) {
                listModel.addElement(pass.Name);
            } 
        } else {
            listModel = new DefaultListModel(); 
         for (Item pass: LogicClass.items){
                listModel.addElement(pass.Name);
         } 
         
        }
        jListPassCodes.setModel(listModel);
    }                                       

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {                                          
        jTextSearch.setText("");
        listModel = new DefaultListModel();        
         for (Item pass: LogicClass.items){
                listModel.addElement(pass.Name);
         }
         jListPassCodes.setModel(listModel);
    }                                         

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
       
    }                                    

    private void jListPassCodesValueChanged(javax.swing.event.ListSelectionEvent evt) {                                            
        int i = jListPassCodes.getSelectedIndex();
        String id = LogicClass.items.get(i).Id;
        String pass = LogicClass.items.get(i).PassCode;
        jLabelInfo1.setText(id);
        jLabelInfo2.setText( pass);
    }                                           

    private void jTextSearchMouseClicked(java.awt.event.MouseEvent evt) {                                         
        jListPassCodes.setSelectedIndex(-1);
        
    }                                        

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    private void jTextSearchKeyTyped(java.awt.event.KeyEvent evt) {                                     

    }                                    

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCopyAddress;
    private javax.swing.JButton btnCopyID;
    private javax.swing.JButton btnCopyPassword;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabelInfo1;
    private javax.swing.JLabel jLabelInfo2;
    private javax.swing.JList<String> jListPassCodes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel_info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JTextField txtEntry;
    // End of variables declaration                   
}

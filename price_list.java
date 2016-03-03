
import java.lang.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csl
 */
public class price_list extends javax.swing.JFrame {
  Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
     DefaultTableModel model;
    
    public price_list() {
        initComponents();
        conn = connection.javaConnect();
        
        show_table();
        update_table();
        inventory_table();
       final_table();
        model=(DefaultTableModel)tb.getModel();
    }
    private void show_table()
    {
        try{
        String sql="SELECT * FROM goods";
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery();
       Table_list.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     private void update_table()
    {
        try{
        String sql="SELECT s_id,s_name,s_address,s_type,s_phone FROM seller";
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery();
         sellerTable_list.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     private void inventory_table()
    {
        try{
        String sql="SELECT * FROM sell";
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery();
        invntryTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     
     
     
     private void final_table()
    {
        try{
        String sql="SELECT g_id,g_name,size,quantity,rate,detail FROM goods";
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery();
         mTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        updatallButton = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        dltButton = new javax.swing.JButton();
        clrButton = new javax.swing.JButton();
        printButton1 = new javax.swing.JButton();
        seller_info = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        taka1Text2 = new javax.swing.JTextField();
        quantity1Text2 = new javax.swing.JTextField();
        type1Text2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalText1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        size1Text2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        g_name1Text2 = new javax.swing.JTextField();
        g_id1Text2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_list = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s_name1Text2 = new javax.swing.JTextField();
        s_add1Text2 = new javax.swing.JTextField();
        s_id1Text2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        s_typ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        s_phone = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        sellerTable_list = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        sumButton = new javax.swing.JButton();
        noftrnsctionButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        highstslButton = new javax.swing.JButton();
        lwstslButton = new javax.swing.JButton();
        soldButton = new javax.swing.JButton();
        noftrnsctionText = new javax.swing.JTextField();
        highstText = new javax.swing.JTextField();
        avgText = new javax.swing.JTextField();
        totalText = new javax.swing.JTextField();
        lwstText = new javax.swing.JTextField();
        nofslditmText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        ivDateChooser = new com.toedter.calendar.JDateChooser();
        back = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        invntryTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        priceText = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        mqnttyText = new javax.swing.JTextField();
        gnam2ComboBox = new javax.swing.JComboBox();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        rtTextf = new javax.swing.JTextField();
        g_idmText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        msizText = new javax.swing.JTextField();
        mg_dtailText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mg_namText = new javax.swing.JTextField();
        mstockText = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        mc_nam = new javax.swing.JTextField();
        mc_idText = new javax.swing.JTextField();
        ms_idText = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        finlsvButton = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        wbMenu = new javax.swing.JMenu();
        gowbMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar2.setRollover(true);

        updatallButton.setBackground(new java.awt.Color(255, 255, 255));
        updatallButton.setText("update");
        updatallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatallButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(updatallButton);

        saveButton1.setBackground(new java.awt.Color(255, 255, 255));
        saveButton1.setText("save");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(saveButton1);

        dltButton.setBackground(new java.awt.Color(255, 255, 255));
        dltButton.setText("delete");
        dltButton.setToolTipText("delet the selected item all data");
        dltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(dltButton);

        clrButton.setText("clear");
        clrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(clrButton);

        printButton1.setText("print");
        printButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(printButton1);

        seller_info.setText("seller_info");
        seller_info.setFocusable(false);
        seller_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seller_info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        seller_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_infoActionPerformed(evt);
            }
        });
        jToolBar2.add(seller_info);

        jButton2.setText("inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jButton1.setText("close");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        okButton.setText("ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        quantity1Text2.setText("              pices");

        jLabel7.setText("total");

        jLabel8.setText("name");

        id1.setText("id");

        jLabel9.setText("type");

        jLabel10.setText("taka");

        jLabel11.setText("stock");

        jLabel12.setText("size");

        g_id1Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_id1Text2ActionPerformed(evt);
            }
        });

        Table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(g_id1Text2)
                        .addComponent(taka1Text2)
                        .addComponent(g_name1Text2)
                        .addComponent(size1Text2)
                        .addComponent(quantity1Text2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addComponent(type1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jLabel7)
                    .addGap(8, 8, 8)
                    .addComponent(totalText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(492, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id1)
                            .addComponent(g_id1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(g_name1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(size1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(quantity1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(taka1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(type1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(313, 313, 313)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(totalText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 310, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("product entry", jPanel2);

        jLabel5.setText("password");

        jLabel6.setText("s_phone");

        jLabel2.setText("s_name");

        jLabel3.setText("s_address");

        jLabel4.setText("s_type");

        jLabel1.setText("s_id");

        password.setText("jPasswordField1");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        sellerTable_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sellerTable_list.setToolTipText("item detail");
        sellerTable_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerTable_listMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(sellerTable_list);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(s_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(s_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s_add1Text2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s_id1Text2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(s_name1Text2))))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(194, 194, 194))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_id1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(s_name1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(s_add1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(s_typ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(s_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("seller_info", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("customer_info", jPanel3);

        sumButton.setText("total");
        sumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumButtonActionPerformed(evt);
            }
        });

        noftrnsctionButton.setText("how many transactions");
        noftrnsctionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noftrnsctionButtonActionPerformed(evt);
            }
        });

        jButton5.setText("average sell");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        highstslButton.setText("highest sell");
        highstslButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highstslButtonActionPerformed(evt);
            }
        });

        lwstslButton.setText("lowest sell");
        lwstslButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lwstslButtonActionPerformed(evt);
            }
        });

        soldButton.setText(" number of sold items");
        soldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldButtonActionPerformed(evt);
            }
        });

        jButton3.setText("today's sale");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ivDateChooser.setDateFormatString(" yyyy-MM-dd");

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        invntryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(invntryTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noftrnsctionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(highstslButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lwstslButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soldButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ivDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nofslditmText)
                            .addComponent(avgText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalText, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(noftrnsctionText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(highstText)
                            .addComponent(lwstText))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ivDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sumButton)
                                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(noftrnsctionButton)
                                    .addComponent(noftrnsctionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(highstslButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lwstslButton)
                                    .addComponent(lwstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(101, 101, 101)
                                .addComponent(avgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(highstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soldButton)
                            .addComponent(nofslditmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(783, 783, 783))
        );

        jTabbedPane1.addTab("inventory & verification", jPanel5);

        jLabel13.setText("SEARCH");

        jLabel14.setText("date");

        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mTable);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "date", "g_id", "g_name", "size", "rate", "c_quantity", "price", "c_id", "c_name", "s_id", "phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tb);

        jButton6.setText("discount");

        gnam2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnam2ComboBoxActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel23.setText("given");

        jButton7.setText("jButton7");

        jLabel24.setText("back");

        jButton4.setText("jButton4");

        jLabel22.setText("discount");

        jLabel21.setText("price");

        jLabel31.setText("c_quantity");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(gnam2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mqnttyText))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mqnttyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gnam2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap())
        );

        jLabel18.setText("size");

        jLabel16.setText("g_name");

        jLabel15.setText("g_id");

        jLabel17.setText("g_type");

        jLabel20.setText("available");

        jLabel19.setText("rate");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mg_namText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mg_dtailText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msizText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtTextf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mstockText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g_idmText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(g_idmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(mg_namText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(mg_dtailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(msizText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(rtTextf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(mstockText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel28.setText("jLabel28");

        jLabel27.setText("jLabel27");

        jLabel29.setText("jLabel29");

        jLabel25.setText("c_id");

        jLabel26.setText("c_name");

        jLabel30.setText("s_id");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ms_idText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mc_idText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mc_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mc_idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(mc_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(ms_idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        finlsvButton.setText("final_save");
        finlsvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finlsvButtonActionPerformed(evt);
            }
        });

        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");

        jButton10.setText("isuue memo");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finlsvButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(show)
                    .addComponent(finlsvButton)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchText, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("inventory & memo", jPanel6);

        exitButton1.setBackground(new java.awt.Color(255, 255, 204));
        exitButton1.setText("log_out");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("new");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("detail");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);
        jMenu3.add(jSeparator2);

        jMenuBar1.add(jMenu3);

        wbMenu.setText("website");
        wbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbMenuActionPerformed(evt);
            }
        });

        gowbMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        gowbMenuItem.setText("go to my website");
        gowbMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gowbMenuItemActionPerformed(evt);
            }
        });
        wbMenu.add(gowbMenuItem);
        wbMenu.add(jSeparator3);

        jMenuBar1.add(wbMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(okButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltButtonActionPerformed
        int p=JOptionPane.showConfirmDialog(null, "do u really want to delete this","deleted",JOptionPane.YES_NO_OPTION);
         if(jTabbedPane1.getSelectedIndex()==0)
        {
        if(p==0){
          String sql="DELETE  FROM goods WHERE g_id=?";
        try {
           
         pst = conn.prepareStatement(sql);
         pst.setString(1,g_id1Text2.getText());
         pst.execute();
         
         JOptionPane.showMessageDialog(null, "deleted");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          show_table();
        }
        }
        else if(jTabbedPane1.getSelectedIndex()==1)
        {
            
        if(p==0){
            String sql="DELETE  FROM seller WHERE s_id=?";
            try {

                pst = conn.prepareStatement(sql);
                pst.setString(1,s_id1Text2.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null, "deleted");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            update_table();
        }
        }
    }//GEN-LAST:event_dltButtonActionPerformed

    private void clrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrButtonActionPerformed
         if(jTabbedPane1.getSelectedIndex()==0)
        {
         g_id1Text2.setText("");
         g_name1Text2.setText("");
         size1Text2.setText("");
         quantity1Text2.setText("");
         taka1Text2.setText("");
          type1Text2.setText("");
        }
         else if(jTabbedPane1.getSelectedIndex()==1)
         {
              s_id1Text2.setText("");
        s_name1Text2.setText("");
        s_add1Text2.setText("");
        s_typ.setText("");
        //taka1Text2.setText("");
        s_phone .setText("");
         }
    }//GEN-LAST:event_clrButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    //   close();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   //     close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"F:\\prjctfile\\sales monitoring report org.docx");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void gowbMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gowbMenuItemActionPerformed
        
        try {
             String URL="file:///F:/prjctfile/web/index.html";
             java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_gowbMenuItemActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void wbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wbMenuActionPerformed

    private void seller_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_infoActionPerformed
       // privateaccess pa=new privateaccess();
       // pa.setVisible(true);
        
         seller s=new seller();
                s.setVisible(true);
    }//GEN-LAST:event_seller_infoActionPerformed

    private void updatallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatallButtonActionPerformed
        if(jTabbedPane1.getSelectedIndex()==0)
        {
        try {
            
            String valu1=g_id1Text2.getText();
             String valu2=g_name1Text2.getText();
            String valu3=size1Text2.getText();
            String valu4=  quantity1Text2.getText();
            String valu5=taka1Text2.getText();
            String valu6=type1Text2.getText();
            
            
            String sql="UPDATE goods set g_id='"+valu1+"',g_name='"+valu2+"',size='"+valu3+"',quantity='"+valu4+"',rate='"+valu5+"',detail='"+valu6+"'  WHERE g_id='"+valu1+"'  ";
             pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "updated");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        show_table();
        }
        else if(jTabbedPane1.getSelectedIndex()==1)
        {
             try {
            
            String valu1=s_id1Text2.getText();
             String valu2=s_name1Text2.getText();
            String valu3=s_add1Text2.getText();
            String valu4=  s_typ.getText();
            String valu5=s_phone.getText();
            //String valu6=type1Text2.getText();
            
            
            String sql="UPDATE seller set s_id='"+valu1+"',s_name='"+valu2+"',s_address='"+valu3+"',s_type='"+valu4+"',s_phone='"+valu5+"'  WHERE s_id='"+valu1+"'  ";
             pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "updated");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        update_table();
        }
    }//GEN-LAST:event_updatallButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
   // if(jTabbedPane1.getSelectedIndex()==0)
    //{
        /*  
        try{
            String v=g_id1Text2.getText();
            String f=quantity1Text2.getText();
             String g=taka1Text2.getText();
             Double i=(Double.valueOf(f));
             Double j=(Double.valueOf(g));
            
            
           String sql="INSERT INTO sell (g_id, price) value('"+v+"',@m_price:=i*@n_pricej )";
               // + "WHERE price= (SELECT rate*quantity FROM goods WHERE g_id='"+v+"' )"
           
           pst = conn.prepareStatement(sql);
           pst.execute();
        }*/
        
        
      //  try{
            
            
           //String v=g_id1Text2.getText();
            
            
          //  String val=quantity1Text2.getText();
         //   Integer I = Integer.ValueOf(String val);
      // String sql="INSERT INTO sell(price)  VALUE   (SELECT rate*'"+val+"' FROM goods WHERE g_id='"+v+"'  )";
           //  String sql="INSERT INTO sell(price)  VALUE   (SELECT rate*quantity FROM goods WHERE g_id='"+v+"'  )";
            //String sql="INSERT INTO goods(rate)  VALUE   (rate*quantity )WHERE g_id='"+v+"'";
           // String sql="SELECT  rate*'"+val+"' FROM goods WHERE g_id='"+v+"'";
            
             //String sql="INSERT INTO sell SET VALUE price"
             //   + "WHERE price= (SELECT rate*quantity FROM goods WHERE g_id='"+v+"' )";
          //pst = conn.prepareStatement(sql);
         //pst.setString(1,totalText.getText());
        // pst.execute();
        // rs=pst.executeQuery();
         
        /* if(rs.next())
         {
             
            // String sql="SELECT price FROM seller";
             String sumation=rs.getString("price");
             totalText.setText(sumation);
         }*/
       // }
       // catch(Exception e)
       // {
         //   JOptionPane.showMessageDialog(null, e);
        //}
   // }
    }//GEN-LAST:event_okButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //  privateaccess pa=new privateaccess();
     //   pa.setVisible(true);
        inventory i=new inventory();
        i.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
       if(jTabbedPane1.getSelectedIndex()==0){
         try {
            String sql = "Insert into goods(g_id,g_name,size,quantity,rate,detail) values (?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, g_id1Text2.getText());
            pst.setString(2, g_name1Text2.getText());
            pst.setString(3, size1Text2.getText());
            pst.setString(4, quantity1Text2.getText());
            pst.setString(5, taka1Text2.getText());
            pst.setString(6, type1Text2.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Added");

            /* if (rs.next())
            {
                input s=new input();
                s.setVisible(true);

            }*/

        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        show_table();
        final_table();
       }
       if(jTabbedPane1.getSelectedIndex()==1)
       {
          try {
            String sql = "Insert into seller(s_id,s_name,s_address,s_type,s_phone) values (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, s_id1Text2.getText());
            pst.setString(2, s_name1Text2.getText());
            pst.setString(3, s_add1Text2.getText());
            pst.setString(4, s_typ.getText());
            // pst.setString(5, taka1Text2.getText());
            pst.setString(5, s_phone.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Added");

            /* if (rs.next())
            {
                input s=new input();
                s.setVisible(true);

            }*/

        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        update_table(); 
       }
        /* finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }*/
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void printButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButton1ActionPerformed
        if(jTabbedPane1.getSelectedIndex()==0)
        {
             MessageFormat header=new MessageFormat("Rport Print");
          
          MessageFormat footer=new MessageFormat("page{0,number,integer}");
          
          try {
            Table_list.print(JTable.PrintMode.NORMAL,header,footer);
        } 
          catch (Exception e)
          {
              System.err.format("cannot print %s %n",e.getMessage() );
              
        }
        }
else if(jTabbedPane1.getSelectedIndex()==1){
        MessageFormat header=new MessageFormat("Rport Print");

        MessageFormat footer=new MessageFormat("page{0,number,integer}");

        try {
            sellerTable_list.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch (Exception e)
        {
            System.err.format("cannot print %s %n",e.getMessage() );

        }
}
    }//GEN-LAST:event_printButton1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        inventory_table();
    }//GEN-LAST:event_backActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //  todayssale t=new todayssale();
        // t.setVisible(true);
        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();
        try{

            String sql="SELECT distinct(g_name) FROM sell,goods WHERE date='"+val+"' AND sell.g_id=goods.g_id ORDER BY date";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            invntryTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        // inventory_table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void soldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldButtonActionPerformed

        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();
        try {
            // String sql="SELECT count(distinct g_name)  FROM sell";
            String sql="SELECT count(distinct g_name)  FROM goods,sell WHERE  date='"+val+"'AND goods.g_id=sell.g_id";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String d=rs.getString("count(distinct g_name)");
                nofslditmText.setText(d);
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        inventory_table();
    }//GEN-LAST:event_soldButtonActionPerformed

    private void lwstslButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lwstslButtonActionPerformed
        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();

        try {
            String sql="SELECT min(price) FROM sell WHERE date='"+val+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String av=rs.getString("min(price)");
                lwstText.setText(av);
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        inventory_table();
    }//GEN-LAST:event_lwstslButtonActionPerformed

    private void highstslButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highstslButtonActionPerformed
        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();
        try {
            String sql="SELECT max(price) FROM sell WHERE date='"+val+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //  invntryTable.setModel(DbUtils.resultSetToTableModel(rs));

            if(rs.next())
            {

                String av=rs.getString("max(price)");
                highstText.setText(av);
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //  inventory_table();
    }//GEN-LAST:event_highstslButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();
        try {
            String sql="SELECT avg(price) FROM sell  WHERE date='"+val+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String av=rs.getString("avg(price)");
                avgText.setText(av);
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        inventory_table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void noftrnsctionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noftrnsctionButtonActionPerformed
        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();

        try {
            String sql="SELECT count(*) FROM sell  WHERE date='"+val+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String summ=rs.getString("count(*)");
                noftrnsctionText.setText(summ);
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        inventory_table();
    }//GEN-LAST:event_noftrnsctionButtonActionPerformed

    private void sumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumButtonActionPerformed
        String val=((JTextField)ivDateChooser.getDateEditor().getUiComponent()).getText();
        try {
            String sql="SELECT sum(price) FROM sell WHERE date='"+val+"' ORDER BY date";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String summ=rs.getString("sum(price)");
                totalText.setText(summ);
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        inventory_table();
    }//GEN-LAST:event_sumButtonActionPerformed

    private void sellerTable_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTable_listMouseClicked
        // TODO add your handling code here:
        try {
            int row=sellerTable_list.getSelectedRow();
            String click=(sellerTable_list.getModel().getValueAt(row,0).toString());

            String sql="SELECT * FROM seller WHERE s_id='"+click+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                String add1=rs.getString("s_id");
                s_id1Text2.setText(add1);
                String add2=rs.getString("s_name");
                s_name1Text2.setText(add2);
                String add3=rs.getString("s_address");
                s_add1Text2.setText(add3);
                String add4=rs.getString("s_type");
                s_typ.setText(add4);
                // String add5=rs.getString("password");
                //password.setText(add5);
                String add6=rs.getString("s_phone");
                s_phone.setText(add6);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sellerTable_listMouseClicked

    private void Table_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_listMouseClicked

        try {
            int row=Table_list.getSelectedRow();
            String click=(Table_list.getModel().getValueAt(row,0).toString());

            String sql="SELECT * FROM goods WHERE g_id='"+click+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                String add1=rs.getString("g_id");
                g_id1Text2.setText(add1);
                String add2=rs.getString("g_name");
                g_name1Text2.setText(add2);
                String add3=rs.getString("size");
                size1Text2.setText(add3);
                String add4=rs.getString("quantity");
                quantity1Text2.setText(add4);
                String add5=rs.getString("rate");
                taka1Text2.setText(add5);
                String add6=rs.getString("detail");
                type1Text2.setText(add6);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Table_listMouseClicked

    private void g_id1Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_id1Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_id1Text2ActionPerformed

    private void gnam2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnam2ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gnam2ComboBoxActionPerformed

    private void finlsvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finlsvButtonActionPerformed
          if ((((!"".equals(g_idmText.getText()) && !"".equals(mqnttyText.getText())) && !"".equals(ms_idText.getText())) && !"".equals(mc_idText.getText())) &&!"".equals(((JTextField)DateChooser.getDateEditor().getUiComponent()).getText()))
        //  || mqnttyText != "" || ms_idText.Text.getText != "" || mc_idText.Text != "" )
        {
            try
            {
                int stock=Integer.parseInt(this.mstockText.getText());
                int rate=Integer.parseInt(this.rtTextf.getText());
                int qntty=Integer.parseInt(this.mqnttyText.getText());
                if(qntty<stock)
                {

                    try{

                        int price=rate*qntty;
                        this.priceText.setText(""+price);
                        String valu20=priceText.getText();

                        String valu1=g_idmText.getText();
                        String valu2=mqnttyText.getText();
                        // String valu20=priceText.getText();
                        String valu30= ms_idText.getText();
                        String valu40= mc_idText.getText();
                        //String valu10=g_idmText.getText();

                        String val=((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();

                        // Date val=(Date) jDateChooser1.getDate();

                        //String sql = "INSERT INTO sale (date,s_id,product_id,c_id,c_quantity,price) VALUES ('" + @date + "','" + @s_id + "','" + textBox4.Text + "','" + @c_id + "','" + textBox5.Text + "','" + @price + "')";
                        //String sql2 = "INSERT INTO sell (price) VALUE ('"+price+"')";
                        //  pst = conn.prepareStatement(sql2);
                        // String s="INSERT into sell(date) value(?)   set g_id='"+valu1+"',c_id='"+valu40+"',s_id='"+valu30+"',price='"+valu20+"',c_quantity='"+valu2+"'";
                        String sql="INSERT into sell set date='"+val+"',g_id='"+valu1+"',c_id='"+valu40+"',s_id='"+valu30+"',price='"+valu20+"',c_quantity='"+valu2+"'";
                        // String sql="INSERT into sell set g_id='"+valu1+"',c_id='"+valu40+"',s_id='"+valu30+"',price='"+valu20+"',c_quantity='"+valu2+"'";
                        // String sql = "INSERT INTO sell (price) VALUE ('"+valu20+"'))";

                        //  Date val=((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();
                        // pst.setString(1,((JTextField)DateChooser.getDateEditor().getUiComponent()).getText());

                        pst = conn.prepareStatement(sql);
                        // pst.setString(1,((JTextField)DateChooser.getDateEditor().getUiComponent()).getText());

                        //pst.setString(1,g_idmText.getText());
                        pst.execute();

                        String sql1="UPDATE goods SET quantity=quantity - '"+valu2+"' WHERE g_id='"+valu1+"'";

                        pst = conn.prepareStatement(sql1);
                        pst.execute();
                        // JOptionPane.showMessageDialog(null, "updated");

                        // lastsave l=new lastsave();
                        //l.setVisible(true);
                        JOptionPane.showMessageDialog(null,"done");
                        // }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"quantity is greater than available stock");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        show_table();
        final_table();
        inventory_table();
        
        
        
        
        
        
        
        
         model.insertRow(
                model.getRowCount(),new Object[]{((JTextField)DateChooser.getDateEditor().getUiComponent()).getText(),
                                                  g_idmText.getText(),
                                                   mg_namText.getText(),
                                                   msizText.getText(),
                                                   rtTextf.getText(),
                                                   mqnttyText.getText(),
                                                   priceText.getText(),
                                                   mc_idText.getText(),
                                                   mc_nam.getText(),
                                                   ms_idText.getText(),
                                                  // msizText.getText(),
                                                  // msizText.getText(),
                                                  // msizText.getText(),
                                                  // msizText.getText(),
                                                   "01736775426"});
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"fullfill date,g_id,c_id,s_id,quantity textfields");
        }
    }//GEN-LAST:event_finlsvButtonActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
         try{
            String sql="SELECT* FROM goods WHERE g_name=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,searchText.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("g_id");
                g_idmText.setText(add1);
                String add2=rs.getString("g_name");
                mg_namText.setText(add2);
                String add3=rs.getString("size");
                msizText.setText(add3);
                String add4=rs.getString("quantity");
                mstockText.setText(add4);
                String add5=rs.getString("rate");
                rtTextf.setText(add5);
                String add6=rs.getString("detail");
                mg_dtailText.setText(add6);

            }
            //else
            //  {
                //      JOptionPane.showMessageDialog(null,"jaita nai haida bechbar chan killaiga??");
                //  }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchTextKeyReleased

    private void mTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTableMouseClicked
       try {
            int row=mTable.getSelectedRow();
            String click=(mTable.getModel().getValueAt(row,0).toString());

            String sql="SELECT * FROM goods WHERE g_id='"+click+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                String add1=rs.getString("g_id");
                g_idmText.setText(add1);
                String add2=rs.getString("g_name");
                mg_namText.setText(add2);
                String add3=rs.getString("size");
                msizText.setText(add3);
                String add4=rs.getString("quantity");
                mstockText.setText(add4);
                String add5=rs.getString("rate");
                rtTextf.setText(add5);
                String add6=rs.getString("detail");
                mg_dtailText.setText(add6);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_mTableMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
   /*     model.insertRow(
                model.getRowCount(),new Object[]{((JTextField)DateChooser.getDateEditor().getUiComponent()).getText(),
                                                  g_idmText.getText(),
                                                   mg_namText.getText(),
                                                   msizText.getText(),
                                                   rtTextf.getText(),
                                                   mqnttyText.getText(),
                                                   priceText.getText(),
                                                   mc_idText.getText(),
                                                   mc_nam.getText(),
                                                   ms_idText.getText(),
                                                  // msizText.getText(),
                                                  // msizText.getText(),
                                                  // msizText.getText(),
                                                  // msizText.getText(),
                                                   "01736775426"});*/
    }//GEN-LAST:event_showActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         MessageFormat header=new MessageFormat("COREi-3 Super Shop:memo");
          //  MessageFormat =new MessageFormat("COREi-3 Super Shop:memo");

           // MessageFormat footer=new MessageFormat("page{0,number,integer}");
             MessageFormat footer=new MessageFormat("THANK YOU");

            try {
                tb.print(JTable.PrintMode.NORMAL,header,footer);
                
            }
            catch (Exception e)
            {
                System.err.format("cannot print %s %n",e.getMessage() );

            }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(price_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(price_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(price_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(price_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new price_list().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTable Table_list;
    private javax.swing.JTextField avgText;
    private javax.swing.JButton back;
    private javax.swing.JButton clrButton;
    private javax.swing.JButton dltButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton finlsvButton;
    private javax.swing.JTextField g_id1Text2;
    private javax.swing.JTextField g_idmText;
    private javax.swing.JTextField g_name1Text2;
    private javax.swing.JComboBox gnam2ComboBox;
    private javax.swing.JMenuItem gowbMenuItem;
    private javax.swing.JTextField highstText;
    private javax.swing.JButton highstslButton;
    private javax.swing.JLabel id1;
    private javax.swing.JTable invntryTable;
    private com.toedter.calendar.JDateChooser ivDateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField lwstText;
    private javax.swing.JButton lwstslButton;
    private javax.swing.JTable mTable;
    private javax.swing.JTextField mc_idText;
    private javax.swing.JTextField mc_nam;
    private javax.swing.JTextField mg_dtailText;
    private javax.swing.JTextField mg_namText;
    private javax.swing.JTextField mqnttyText;
    private javax.swing.JTextField ms_idText;
    private javax.swing.JTextField msizText;
    private javax.swing.JTextField mstockText;
    private javax.swing.JTextField nofslditmText;
    private javax.swing.JButton noftrnsctionButton;
    private javax.swing.JTextField noftrnsctionText;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton printButton1;
    private javax.swing.JTextField quantity1Text2;
    private javax.swing.JTextField rtTextf;
    private javax.swing.JTextField s_add1Text2;
    private javax.swing.JTextField s_id1Text2;
    private javax.swing.JTextField s_name1Text2;
    private javax.swing.JTextField s_phone;
    private javax.swing.JTextField s_typ;
    private javax.swing.JButton saveButton1;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable sellerTable_list;
    private javax.swing.JButton seller_info;
    private javax.swing.JButton show;
    private javax.swing.JTextField size1Text2;
    private javax.swing.JButton soldButton;
    private javax.swing.JButton sumButton;
    private javax.swing.JTextField taka1Text2;
    private javax.swing.JTable tb;
    private javax.swing.JTextField totalText;
    private javax.swing.JTextField totalText1;
    private javax.swing.JTextField type1Text2;
    private javax.swing.JButton updatallButton;
    private javax.swing.JMenu wbMenu;
    // End of variables declaration//GEN-END:variables
}

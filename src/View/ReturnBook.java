/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AllController;
import Model.DBSearch;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;






/**
 *
 * @author manoj aberathna
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lid = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        course1 = new javax.swing.JTextField();
        branch2 = new javax.swing.JTextField();
        bid1 = new javax.swing.JTextField();
        bname1 = new javax.swing.JTextField();
        edi1 = new javax.swing.JTextField();
        pub1 = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        pg1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sem = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        bid = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        gname = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        edi = new javax.swing.JTextField();
        pub = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        pg = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Return Books");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Lecturer ID :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 62, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Lecturer Name :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 212, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("Course :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 465, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("Branch :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 551, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("Telephone :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 305, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Address :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 383, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Issue Date :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 642, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setText("Book ID :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 62, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setText("Book Name :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 200, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setText("Edition :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 286, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Price :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 465, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setText("Pages :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 551, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setText("Return Date :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 642, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setText("Publisher :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 372, -1, -1));

        lid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(lid, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 58, 212, 40));

        lname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 208, 228, 40));

        tel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 301, 196, 40));

        add.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 379, 301, 40));

        course1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(course1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 461, 165, 40));

        branch2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(branch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 547, 185, 40));

        bid1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(bid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 58, 202, 40));

        bname1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(bname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 196, 245, 40));

        edi1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(edi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 282, 187, 40));

        pub1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(pub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 368, 206, 40));

        price1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 461, 160, 40));

        pg1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(pg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 547, 160, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 748, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("More");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 748, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Ok");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 748, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 129, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 648, -1, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 642, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/85feb5cd68997d763a9447868ac80745.jpg"))); // NOI18N
        jLabel31.setText("jLabel31");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -190, 2900, 1980));

        jTabbedPane1.addTab("Lecturer", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Student ID :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 56, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Full Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 205, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Guidance Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 301, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Course :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 382, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Branch :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 477, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Year :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 563, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Semester :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 658, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Book ID :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 47, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Book Name :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 205, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Edition :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 301, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Publisher :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 382, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Price :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 477, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Pages :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 563, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Issue Date :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 736, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Return Date :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 658, -1, -1));

        sem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 654, 200, 40));

        branch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 473, 200, 40));

        bid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 43, 245, 40));

        sid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 43, 223, 40));

        year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 559, 200, 40));

        course.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 378, 218, 40));

        gname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(gname, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 297, 240, 40));

        bname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 191, 253, 40));

        edi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(edi, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 297, 241, 40));

        pub.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 378, 241, 40));

        price.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 473, 213, 40));

        pg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 559, 198, 40));

        fname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 201, 259, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 124, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 746, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("More");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 746, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 746, -1, -1));
        jPanel2.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 742, -1, -1));
        jPanel2.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 664, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/85feb5cd68997d763a9447868ac80745.jpg"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -60, 2890, 1720));

        jTabbedPane1.addTab("Student", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       ReturnBook.getFrames()[0].dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    
        try{
           
            ResultSet rs = new DBSearch().SearchCode("SELECT Fname, Gname, Course, Branch, Year, Semester, IssueDate, Bname, Edition, Publisher, Price, Pages from returnbook where SID ='"+sid.getText()+"' AND BID ='"+bid.getText()+"'");
            //("SELECT Password from NewAccount where SQuestion ='"+sq.getSelectedItem()+"' AND Answer = '"+answer.getSelectedItem()+"'")
            while(rs.next()) {
                
              fname.setText(rs.getString("Fname"));
              gname.setText(rs.getString("Gname")); 
              course.setText(rs.getString("Course"));
              branch.setText(rs.getString("Branch"));
              year.setText(rs.getString("Year"));
              sem.setText(rs.getString("Semester"));
              jDateChooser1.setDate(rs.getDate("IssueDate"));
              bname.setText(rs.getString("Bname"));
              edi.setText(rs.getString("Edition")); 
              pub.setText(rs.getString("Publisher"));
              price.setText(rs.getString("Price"));
              pg.setText(rs.getString("Pages"));
              
              
        } 
            
            
    }                                         
            catch(Exception e){
                e.printStackTrace();
        }
        
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ReturnBook.getFrames()[0].dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ReturnBook.getFrames()[0].dispose();
        new More().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String IssueDate = dateFormat.format(jDateChooser3.getDate());
        String ReturnDate = dateFormat.format(jDateChooser4.getDate());
      AllController.ReturnBook(sid.getText(), fname.getText(), gname.getText(), course.getText(), branch.getText(), year.getText(), sem.getText(), IssueDate, 
              bid.getText(), bname.getText(), edi.getText(), pub.getText(), price.getText(), pg.getText(), ReturnDate);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
       try{
           
            ResultSet rs = new DBSearch().SearchCode("SELECT Lecturer_Name, Telephone, Address, Course, Branch, IssueDate, Bname, Edition, Publisher, Price, Pages from returnbook1 where Lecturer_ID ='"+lid.getText()+"' AND BID ='"+bid1.getText()+"'");
            //("SELECT Password from NewAccount where SQuestion ='"+sq.getSelectedItem()+"' AND Answer = '"+answer.getSelectedItem()+"'")
            while(rs.next()) {
                
              lname.setText(rs.getString("Lecturer_Name"));
              tel.setText(rs.getString("Telephone")); 
              add.setText(rs.getString("Address"));
              course1.setText(rs.getString("Course"));
              branch2.setText(rs.getString("Branch"));
              jDateChooser1.setDate(rs.getDate("IssueDate"));
              bname1.setText(rs.getString("Bname"));
              edi1.setText(rs.getString("Edition")); 
              pub1.setText(rs.getString("Publisher"));
              price1.setText(rs.getString("Price"));
              pg1.setText(rs.getString("Pages"));
             
        } 
            
            
    }                                         
            catch(Exception e){
                e.printStackTrace();
        }
        
        
     
  

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         ReturnBook.getFrames()[0].dispose();
        new More().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String IssueDate1 = dateFormat.format(jDateChooser1.getDate());
        String ReturnDate1 = dateFormat.format(jDateChooser2.getDate());
      AllController.ReturnBook1(lid.getText(), lname.getText(), tel.getText(), add.getText(), course1.getText(), branch2.getText(), IssueDate1,
              bid1.getText(), bname1.getText(), edi1.getText(), pub1.getText(), price1.getText(), pg1.getText(), ReturnDate1);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bid1;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bname1;
    private javax.swing.JTextField branch;
    private javax.swing.JTextField branch2;
    private javax.swing.JTextField course;
    private javax.swing.JTextField course1;
    private javax.swing.JTextField edi;
    private javax.swing.JTextField edi1;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lid;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField pg;
    private javax.swing.JTextField pg1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField pub;
    private javax.swing.JTextField pub1;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}

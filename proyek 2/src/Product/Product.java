package Product;

import Com.Config.DatabaseConnection;
import Com.Config.MyConfig;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Product extends javax.swing.JFrame { 
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql = "";
    private DefaultTableModel model;
    
public void clear(){
        TextFieldNama.setText("");
        TextFieldHarga.setText("");
        TextFieldJumlah.setText("");
        TextFieldNama.requestFocus();
    }

public  void insertData(){
        DefaultTableModel model = (DefaultTableModel) EvaTable.getModel();
        int row = EvaTable.getRowCount();
        model.addRow(new Object[]{
            row += 1,
            TextFieldNama.getText(),
            TextFieldHarga.getText(),
            TextFieldJumlah.getText()
        });
    }

 public double hitungTotal(){
        DefaultTableModel model = (DefaultTableModel) EvaTable.getModel();
//        int[] selectedRows = TblBarang.getSelectedRows();
        int rowCount = model.getRowCount();
        double total = 0.0;
        
//        double total = 0.0;
//        for(int row : selectedRows){
//            double harga = Double.parseDouble(model.getValueAt(row, 2).toString());
//            int jumlah = Integer.parseInt(model.getValueAt(row, 3).toString());
//            total += harga*jumlah;
//        }
         for(int i = 0; i < rowCount; i++){
            double harga = Double.parseDouble(model.getValueAt(i, 2).toString());
            int jumlah = Integer.parseInt(model.getValueAt(i, 3).toString());
            total += harga*jumlah;
        }
        return total;
    }
    public void Show(){
        MyConfig connect = new MyConfig();
        try{
            Con = connect.getConnect();
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM utils");
            int i = 1;
            while(Rs.next()){
                String[] row = {Integer.toString(i), Rs.getString(2), Rs.getString(3), Rs.getString(4)};
                model.addRow(row);
                i++;
            }
         }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }
    
    public Product() {
        initComponents();
        String [] header = {"ID", "Name", "Price", "Stock"};
        model = new DefaultTableModel (header,0);
        Show();
//        KoneksiDatabase();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        TextFieldNama = new javax.swing.JTextField();
        ButtonTambah = new javax.swing.JButton();
        LabelJumlah = new javax.swing.JLabel();
        LabelHarga = new javax.swing.JLabel();
        TextFieldJumlah = new javax.swing.JTextField();
        TextFieldHarga = new javax.swing.JTextField();
        ButtonClear = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelTotal = new javax.swing.JLabel();
        LabelTunai = new javax.swing.JLabel();
        LabelKembalian = new javax.swing.JLabel();
        TextFieldTotal = new javax.swing.JTextField();
        TextFieldTunai = new javax.swing.JTextField();
        TextFieldKembalian = new javax.swing.JTextField();
        ButtonBayar = new javax.swing.JButton();
        ButtonSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EvaTable = new javax.swing.JTable();
        ButtonDelete = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 35)); // NOI18N
        jLabel4.setText("Chinggu_Store");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        LabelNama.setBackground(new java.awt.Color(153, 153, 153));
        LabelNama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelNama.setText("Nama");

        TextFieldNama.setBackground(new java.awt.Color(0, 153, 153));
        TextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaActionPerformed(evt);
            }
        });

        ButtonTambah.setBackground(new java.awt.Color(0, 255, 0));
        ButtonTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        LabelJumlah.setBackground(new java.awt.Color(51, 51, 51));
        LabelJumlah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelJumlah.setText("Jumlah");

        LabelHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelHarga.setText("Harga");

        TextFieldJumlah.setBackground(new java.awt.Color(0, 153, 153));
        TextFieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldJumlahActionPerformed(evt);
            }
        });

        TextFieldHarga.setBackground(new java.awt.Color(0, 153, 153));

        ButtonClear.setBackground(new java.awt.Color(0, 153, 255));
        ButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonClear.setText("Clear");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonEdit.setBackground(new java.awt.Color(255, 102, 51));
        ButtonEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEdit.setText("Edit");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        LabelTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTotal.setText("Total");

        LabelTunai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTunai.setText("Tunai");

        LabelKembalian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelKembalian.setText("Kembalian");

        TextFieldTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextFieldTotal.setText(": Rp");
        TextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTotalActionPerformed(evt);
            }
        });

        TextFieldTunai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextFieldTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTunaiActionPerformed(evt);
            }
        });

        TextFieldKembalian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextFieldKembalian.setText(": Rp");

        ButtonBayar.setBackground(new java.awt.Color(0, 51, 255));
        ButtonBayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonBayar.setText("Bayar");
        ButtonBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBayarActionPerformed(evt);
            }
        });

        ButtonSimpan.setBackground(new java.awt.Color(51, 255, 51));
        ButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSimpan.setText("Simpan");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotal)
                    .addComponent(LabelTunai)
                    .addComponent(LabelKembalian)
                    .addComponent(ButtonBayar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextFieldKembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(TextFieldTunai)
                            .addComponent(TextFieldTotal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ButtonSimpan)))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(TextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTunai)
                    .addComponent(TextFieldTunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKembalian)
                    .addComponent(TextFieldKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBayar)
                    .addComponent(ButtonSimpan))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        EvaTable.setBackground(new java.awt.Color(0, 204, 153));
        EvaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(EvaTable);

        ButtonDelete.setBackground(new java.awt.Color(255, 0, 51));
        ButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelJumlah)
                                            .addComponent(LabelHarga)
                                            .addComponent(LabelNama))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextFieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                            .addComponent(TextFieldJumlah)
                                            .addComponent(TextFieldHarga)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ButtonTambah)
                                        .addGap(37, 37, 37)
                                        .addComponent(ButtonClear)
                                        .addGap(38, 38, 38)
                                        .addComponent(ButtonEdit)
                                        .addGap(42, 42, 42)
                                        .addComponent(ButtonDelete))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNama)
                            .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJumlah))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelHarga)
                            .addComponent(TextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonTambah)
                            .addComponent(ButtonClear)
                            .addComponent(ButtonEdit)
                            .addComponent(ButtonDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EvaTable.getModel ();
        int rowSelect = EvaTable.getSelectedRow();
        
        if(ButtonEdit.getText()=="Edit"){
            ButtonTambah.setEnabled(false);
            ButtonDelete.setEnabled(false);
            ButtonEdit.setText("Update");

            TextFieldNama.setText(model.getValueAt(rowSelect, 1).toString());
            TextFieldHarga.setText(model.getValueAt(rowSelect, 2).toString());
                TextFieldJumlah.setText(model.getValueAt(rowSelect, 3).toString());
        }else {
            ButtonTambah.setEnabled(true);
            ButtonDelete.setEnabled(true);
            ButtonEdit.setText("Edit");
            
            String name = TextFieldNama.getText();
            String price = TextFieldHarga.getText();
            String stock = TextFieldJumlah.getText();
            
            model.setValueAt(name, rowSelect, 1);
            model.setValueAt(price, rowSelect, 2);
            model.setValueAt(stock, rowSelect, 3);
         }
  
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void TextFieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldJumlahActionPerformed

    private void TextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTotalActionPerformed

    private void TextFieldTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTunaiActionPerformed

    private void TextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNamaActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
        if(TextFieldNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Barang Belum di Masukan");
             }else if(TextFieldHarga.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga Barang Belum di Masukan");
             }else if(TextFieldJumlah.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah Barang Belum di Masukan");
              }else{
            insertData();
            clear();
        }                                     
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EvaTable.getModel();
        int rowSelect = EvaTable.getSelectedRow();
        
        if(rowSelect == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
          int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin menghapus data ini?", 
                  "Konfirmasi Pengahapusan Data",JOptionPane.YES_NO_OPTION);
          if(confirm == JOptionPane.YES_OPTION){
              model.removeRow(rowSelect);
          }
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        // TODO add your handling code here:
        try{
           Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/produk","root","");
           
           int rowCount = EvaTable.getRowCount();
           for(int i = 0; i < rowCount; i++){
               String Column1 = EvaTable.getValueAt(i, 1).toString();
               String Column2 = EvaTable.getValueAt(i, 2).toString();
               String Column3 = EvaTable.getValueAt(i, 3).toString();
               
               String sql = "INSERT INTO EvaTable (Nama, Harga, Stok) VALUES (?,?,?)";
               PreparedStatement statement = Con.prepareStatement(sql);
               
               statement.setString(1, Column1);
               statement.setString(2, Column2);
               statement.setString(3, Column3);
               
               statement.executeUpdate();
           }   
           
           JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke database.");
           Con.close();
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data ke database.");
        }
    }//GEN-LAST:event_ButtonSimpanActionPerformed

    private void ButtonBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBayarActionPerformed
        // TODO add your handling code here:
        double total = hitungTotal();
        TextFieldTotal.setText("Rp." + String.valueOf(total));
        
        try {
            String totalText = TextFieldTotal.getText().substring(3);
            double total1 = Double.parseDouble(totalText);
            double bayar = Double.parseDouble(TextFieldTunai.getText());
            double kembali = bayar - total1;
            TextFieldKembalian.setText("Rp." + String.valueOf(kembali));
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Input tidak Valid");
        }
    }//GEN-LAST:event_ButtonBayarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Product().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBayar;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JTable EvaTable;
    private javax.swing.JLabel LabelHarga;
    private javax.swing.JLabel LabelJumlah;
    private javax.swing.JLabel LabelKembalian;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelTunai;
    private javax.swing.JTextField TextFieldHarga;
    private javax.swing.JTextField TextFieldJumlah;
    private javax.swing.JTextField TextFieldKembalian;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JTextField TextFieldTotal;
    private javax.swing.JTextField TextFieldTunai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

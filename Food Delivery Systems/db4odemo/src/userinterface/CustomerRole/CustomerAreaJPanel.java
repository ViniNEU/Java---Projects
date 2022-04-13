/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Order.OrderItem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Order.OrderRequestJPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final CustomerDirectory customerDirectory;
    private final RestaurantDirectory restaurantDirectory;
    private final DeliveryManDirectory deliveryManDirectory;
    private final Menu menuDirectory;
    private final OrderDirectory orderDirectory;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, Menu menuDirectory,OrderDirectory orderDirectory) {
        initComponents();
      
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.customerDirectory = customerDirectory;
        this.restaurantDirectory = restaurantDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.menuDirectory = menuDirectory;
        this.orderDirectory = orderDirectory;
        populateMenuTable();
    }
    public void populateMenuTable() {
        DefaultTableModel model = (DefaultTableModel) tblRestaurantList.getModel();
        model.setRowCount(0);
        for (OrderItem item : menuDirectory.getMenuList()) {
            Object[] row = new Object[3];
            row[0] = restaurantDirectory.getRestName(item.getRestaurantNo());
            row[1] = item.getItemName();
            row[2] = item.getPrice();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restaurantlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantList = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        cmboxQtyCount = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 204));

        restaurantlbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restaurantlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurantlbl.setText("Restaurant");

        tblRestaurantList.setBackground(new java.awt.Color(255, 255, 204));
        tblRestaurantList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblRestaurantList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant", "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantList);

        lblQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblQuantity.setText("Quantity:");

        btnOrder.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        cmboxQtyCount.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        cmboxQtyCount.setForeground(new java.awt.Color(0, 51, 51));
        cmboxQtyCount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        cmboxQtyCount.setToolTipText("");
        cmboxQtyCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxQtyCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(restaurantlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder)
                    .addComponent(cmboxQtyCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(restaurantlbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(cmboxQtyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmboxQtyCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxQtyCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxQtyCountActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        int row = tblRestaurantList.getSelectedRow();
        int count = tblRestaurantList.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                int quantity = Integer.parseInt(cmboxQtyCount.getSelectedItem().toString());
                Restaurant restaurant = restaurantDirectory.getRestaurant(menuDirectory.getOrderItemByKey(row).getRestaurantNo());
                Customer customer = customerDirectory.getCustomer(userAccount.getEmployee().getName());
                OrderItem item = menuDirectory.getOrderItemByKey(row);
                String status = "Awaiting Order Confirmation";

                Order orderRequest = orderDirectory.add();
                orderRequest.setOrderNo("Order " + (orderDirectory.getOrderDir().size()));
                orderRequest.setOrderItem(item);
                orderRequest.setRestaurant(restaurant);
                orderRequest.setCustomer(customer);
                orderRequest.setQuantity(quantity);
                orderRequest.setMessage("Order Placed");
                orderRequest.setSender(userAccount);
                orderRequest.setStatus(status);
                system.setOrderDirectory(orderDirectory);
                system.getWorkQueue().getWorkRequestList().add(orderRequest);
                JOptionPane.showMessageDialog(null, "Your Order has been sucessfully placed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        OrderRequestJPanel orderRequest = new OrderRequestJPanel(userProcessContainer, userAccount, system, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory,orderDirectory);
        userProcessContainer.add(orderRequest);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cmboxQtyCount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel restaurantlbl;
    private javax.swing.JTable tblRestaurantList;
    // End of variables declaration//GEN-END:variables
}
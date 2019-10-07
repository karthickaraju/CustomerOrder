package CustomerOrder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
public class CustomerApplication {
    private JFrame frame;
    private JTextField textField_Name;
    private JTextField textField_Date;
    private JTextField textField_ArticleId;
    private JTextField textField_ArticleName;
    private JTextField textField_Price;
    private JTextField textField_Qty;
    private Controller controller;
    private OrderRegister orderRegister;
    private JTextField textField_Address;
    private JTextField textField_Phone;
    //Order order = new Order();
//  Article article;
    Customer tmpCust;
    OrderLine ol = new OrderLine();
    CustomerReg custReg;
    ArticleReg artReg = new ArticleReg();
    private JTable table_1;
    List<Article> articleInventory = new ArrayList<>(Arrays.asList(new Article("1", "Potatoes", 10.00),
            new Article("2", "Onions", 20.00), new Article("3", "Tomatoes", 30.00), new Article("4", "Bread", 15.00),
            new Article("5", "1 Doz Eggs", 40.00), new Article("6", "Perfume", 100.00),
            new Article("7", "Chicken", 50.00), new Article("8", "Lamb", 120.00), new Article("9", "Fish", 300.00),
            new Article("10", "Ice Cream", 50.00)));
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerApplication window = new CustomerApplication();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the application.
     */
    public CustomerApplication() {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        controller = new Controller();
        frame.setBounds(100, 100, 811, 518);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JLabel lblCustomerName = new JLabel("Customer Name");
        lblCustomerName.setBounds(22, 27, 110, 16);
        frame.getContentPane().add(lblCustomerName);
        textField_Name = new JTextField();
        textField_Name.setBounds(155, 22, 130, 26);
        frame.getContentPane().add(textField_Name);
        textField_Name.setColumns(10);
        JLabel lblDateOfPurchase = new JLabel("Date of Purchase");
        lblDateOfPurchase.setBounds(22, 65, 136, 16);
        frame.getContentPane().add(lblDateOfPurchase);
        textField_Date = new JTextField();
        textField_Date.setBounds(155, 60, 130, 26);
        frame.getContentPane().add(textField_Date);
        textField_Date.setColumns(10);
        JLabel lblArticle = new JLabel("Article Id");
        lblArticle.setBounds(22, 93, 61, 16);
        frame.getContentPane().add(lblArticle);
        textField_ArticleId = new JTextField();
        textField_ArticleId.setBounds(155, 88, 130, 26);
        frame.getContentPane().add(textField_ArticleId);
        textField_ArticleId.setColumns(10);
        JLabel lblQuantity = new JLabel("Quantity");
        lblQuantity.setBounds(22, 177, 61, 16);
        frame.getContentPane().add(lblQuantity);
        JLabel lblArticleName = new JLabel("Article Name");
        lblArticleName.setBounds(22, 121, 116, 16);
        frame.getContentPane().add(lblArticleName);
        textField_ArticleName = new JTextField();
        textField_ArticleName.setBounds(155, 116, 130, 26);
        frame.getContentPane().add(textField_ArticleName);
        textField_ArticleName.setColumns(10);
        JLabel lblNewLabel = new JLabel("Article Price");
        lblNewLabel.setBounds(22, 149, 96, 16);
        frame.getContentPane().add(lblNewLabel);
        textField_Price = new JTextField();
        textField_Price.setBounds(155, 144, 130, 26);
        frame.getContentPane().add(textField_Price);
        textField_Price.setColumns(10);
        textField_Qty = new JTextField();
        textField_Qty.setBounds(155, 172, 130, 26);
        frame.getContentPane().add(textField_Qty);
        textField_Qty.setColumns(10);
//      JButton btnCreateOrder = new JButton("Create Order");
//      btnCreateOrder.addActionListener(new ActionListener() {
//          public void actionPerformed(ActionEvent e) {
//
//              String custName = textField_Name.getText();
//              System.out.println(custName);
//              String custAddress = textField_Address.getText();
//              String custPhone = textField_Phone.getText();
//              Date df = new Date();
//              SimpleDateFormat ft = new SimpleDateFormat(" yyyy.MM.dd ");
//              String reportDate = ft.format(df);
//              textField_Date.setText(reportDate);
//              String articleId = textField_ArticleId.getText();
//              String articleName = textField_ArticleName.getText();
//              double articlePrice = Double.parseDouble(textField_Price.getText());
//              int qty = Integer.parseInt(textField_Qty.getText());
//              textArea.setText(articleName);
//              textArea.setText(articleId);
//              textArea.setText(String.valueOf(articlePrice));
//              textArea.append(custName);
        // controller.createOrder(custName, custAddress, custPhone, reportDate,
        // articleId, articleName,
        // articlePrice, qty);
//              JOptionPane.showMessageDialog(null, "Customer Added");
//          }
//      });
//      btnCreateOrder.setBounds(82, 444, 110, 29);
//      frame.getContentPane().add(btnCreateOrder);
        JLabel lblCustomerAddress = new JLabel("Address");
        lblCustomerAddress.setBounds(308, 27, 101, 16);
        frame.getContentPane().add(lblCustomerAddress);
        textField_Address = new JTextField();
        textField_Address.setBounds(392, 22, 130, 26);
        frame.getContentPane().add(textField_Address);
        textField_Address.setColumns(10);
        JLabel lblCustomerPhone = new JLabel("Phone");
        lblCustomerPhone.setBounds(564, 27, 61, 16);
        frame.getContentPane().add(lblCustomerPhone);
        textField_Phone = new JTextField();
        textField_Phone.setBounds(637, 22, 130, 26);
        frame.getContentPane().add(textField_Phone);
        textField_Phone.setColumns(10);
        JButton btnAdd = new JButton("Add Articles");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // String id = textField_ArticleId.getText();
                String articleName = textField_ArticleName.getText();
                // double price = Double.parseDouble(textField_Price.getText());
                int articleQty = Integer.parseInt(textField_Qty.getText());
                for (Article article : articleInventory) {
                    if (article.getarticleName().toLowerCase().equals(articleName.toLowerCase())) {
                        controller.addArticleToShoppingList(article, articleQty);
                        JOptionPane.showMessageDialog(null, "Article Added successfully to shopping list!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Article not found in Inventory!");
            }
        });
        btnAdd.setBounds(6, 444, 110, 29);
        frame.getContentPane().add(btnAdd);
        JButton btnDel = new JButton("Delete Articles");
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String articleName = textField_ArticleName.getText();
                List<OrderLine> shoppingList = controller.getArticlesForShoppingList();
                for (OrderLine orderLine : shoppingList) {
                    if (orderLine.getArticle().getarticleName().toLowerCase().equals(articleName.toLowerCase())) {
                        controller.removeArticleFromShoppingList(orderLine.getArticle());
                        JOptionPane.showMessageDialog(null, "Article Removed successfully from shopping list!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Article has never been added to Shopping List!");
            }
        });
        btnDel.setBounds(220, 444, 117, 29);
        frame.getContentPane().add(btnDel);
        JButton btnListArticles = new JButton("List Articles");
        btnListArticles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<OrderLine> orderLineList = controller.getArticlesForShoppingList();
                System.out.println("The size of the orderLine list is: " + orderLineList.size());
                if (orderLineList.size() > 0) {
                    String[] columnNames = { "Id", "Name", "Price", "Qty", "TotalPrice" };
                    frame.getContentPane().setLayout(null);
                    Object[][] data = new Object[orderLineList.size()][5];
                    for (int i = 0; i < orderLineList.size(); i++) {
                        data[i][0] = orderLineList.get(i).getArticle().getarticleId();
                        data[i][1] = orderLineList.get(i).getArticle().getarticleName();
                        data[i][2] = orderLineList.get(i).getArticle().getarticlePrice();
                        data[i][3] = orderLineList.get(i).getOrderquantity();
                        double artTotalPrice = (orderLineList.get(i).getArticle().getarticlePrice())
                                * (orderLineList.get(i).getOrderquantity());
                        data[i][4] = artTotalPrice;
                        JTable table = new JTable(data, columnNames);
                        JScrollPane scrollPane = new JScrollPane(table);
                        scrollPane.setBounds(403, 88, 356, 379);
                        frame.getContentPane().add(scrollPane);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Shopping List Empty!");
                }
            }
        });
        btnListArticles.setBounds(113, 413, 117, 29);
        frame.getContentPane().add(btnListArticles);
        JButton btnFindArticle = new JButton("Find Article");
        btnFindArticle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String articleName = textField_ArticleName.getText();
                for (Article article : articleInventory) {
                    if (article.getarticleName().toLowerCase().equals(articleName.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Exists in Inventory!");
                        return;
                    }
                }
                
            }
        });
        btnFindArticle.setBounds(6, 413, 117, 29);
        frame.getContentPane().add(btnFindArticle);
        table_1 = new JTable();
        table_1.setBounds(403, 88, 356, 379);
        frame.getContentPane().add(table_1);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(22, 205, 325, 200);
        frame.getContentPane().add(textArea);
        // Creating an Order*****
        JButton btnCreateOrder = new JButton("Create Order");
        btnCreateOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String custName = textField_Name.getText();
                String custAddress = textField_Address.getText();
                String custPhone = textField_Phone.getText();
                String dateOfOrder = textField_Date.getText();
                tmpCust = new PrivateCustomer(custName, custAddress, custPhone);
                
                List<OrderLine> orderLineList = controller.getArticlesForShoppingList();
                Order order = controller.createOrder(tmpCust, dateOfOrder, orderLineList);
                
                textArea.setText("***************************");
                textArea.append("\n");
                textArea.append("NEW ORDER CREATED ON: " + order.getStringDate());
                textArea.append("\n");
                textArea.append("***************************");
                textArea.append("\n");
                textArea.append("Customer Name: " + order.getCustomer().getName());
                textArea.append("\n");
                textArea.append("Customer Address: " + order.getCustomer().getAddress());
                textArea.append("\n");
                textArea.append("Customer Contact: " + order.getCustomer().getPhonenumber());
                textArea.append("\n");
                textArea.append("***************************");
                textArea.append("\n");
                double totalOrderPrice = 0.00;
                for(OrderLine orderLine: order.getOrderlines()) {
                    
                    textArea.append(orderLine.getArticle().getarticleId());
                    textArea.append("\t");
                    textArea.append(orderLine.getArticle().getarticleName());
                    textArea.append("\t");
                    String stringPrice = String.valueOf(orderLine.getArticle().getarticlePrice());
                    textArea.append(stringPrice);
                    textArea.append("\t");
                    String stringQty = String.valueOf(orderLine.getOrderquantity());
                    textArea.append(stringQty);
                    textArea.append("\t");
                    double artTotalPrice = ((orderLine.getArticle().getarticlePrice())
                    * (orderLine.getOrderquantity()));
                    String stringArtTotalPrice = String.valueOf(artTotalPrice);
                    textArea.append(stringArtTotalPrice);
                    textArea.append("\n");
                    totalOrderPrice += artTotalPrice;
                    
                }
                textArea.append("\n");
                textArea.append("\n");
                textArea.append("Total Price: " +String.valueOf(totalOrderPrice));
                textArea.append("\n");
                textArea.append("\n");
                textArea.append("****** THANK YOU ******");
            }
        });
        btnCreateOrder.setBounds(106, 444, 116, 29);
        frame.getContentPane().add(btnCreateOrder);
        // Article Inventory
        JButton btnArticleInv = new JButton("Article Inv");
        btnArticleInv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("The size of the article list is: " + articleInventory.size());
                if (articleInventory.size() > 0) {
                    String[] columnNames = { "ArticleId", "ArticleName", "Price" };
                    frame.getContentPane().setLayout(null);
                    Object[][] data = new Object[articleInventory.size()][10];
                    for (int i = 0; i < articleInventory.size(); i++) {
                        data[i][0] = articleInventory.get(i).getarticleId();
                        data[i][1] = articleInventory.get(i).getarticleName();
                        data[i][2] = articleInventory.get(i).getarticlePrice();
                        JTable table = new JTable(data, columnNames);
                        JScrollPane scrollPane = new JScrollPane(table);
                        scrollPane.setBounds(403, 88, 356, 379);
                        frame.getContentPane().add(scrollPane);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No Articles in Inventory");
                }
            }
        });
        btnArticleInv.setBounds(220, 413, 117, 29);
        frame.getContentPane().add(btnArticleInv);
    }
}
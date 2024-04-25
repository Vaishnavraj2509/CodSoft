import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class currencyconverter extends JFrame {
        private JTextField amountField;
        private JComboBox<String> fromCurrencyComboBox;
        private JComboBox<String> toCurrencyComboBox;
        private JButton convertButton;
        private JLabel resultLabel;
//public class currencyconverter{
    public static void currencyconverter(int choice, double dollar){

    switch (choice) {
        case 1:System.out.println("EURO VALUE OF DOLLAR IS"+dollar*0.99);

        break;
        case 2:System.out.println("POUND STERLING OF DOLLAR IS"+dollar*0.86);

        break;
        case 3:System.out.println("AUSTRALIAN DOLLAR OF DOLLAR IS"+dollar*1.53);

        break;
        case 4:System.out.println("CANADIAN DOLLAR OF DOLLAR IS"+dollar*1.34);

        break;
        case 5:System.out.println("SWISS FRANC OF DOLLAR IS"+dollar*0.98);

        break;
        case 6:System.out.println("INDIAN RUPEES OF DOLLAR IS"+dollar*81.31);

        break;
        case 7:System.out.println("CHINESE YUAN OF DOLLAR IS"+dollar*7.24);

        break;

        default:System.out.println("ENTER VALID INPUT ");
            break;
    }
    }

    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("SELECT OPTION.........");
    System.out.println("1.DOLLAR TO EURO");
    System.out.println("2.DOLLAR TO POUND STERLING");
    System.out.println("3.DOLLAR TO AUSTRALIAN DOLLAR");
    System.out.println("4.DOLLAR TO CANDIAN DOLLAR");
    System.out.println("5.DOLLAR TO SWISS FRANC");
    System.out.println("6.DOLLAR TO INDIAN RUPEES");
    System.out.println("7.DOLLAR TO CHINESE YUAN");

    System.out.println("ENTER YOUR CHOICE=");
    int userinput=sc.nextInt();

    System.out.println("ENTER YOUR DOLLAR VALUE=");
    double dollar=sc.nextDouble();


    currencyconverter(userinput,dollar);
    System.out.println();
    }

}


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class currencyconverter extends JFrame {
//     private JTextField amountField;
//     private JComboBox<String> fromCurrencyComboBox;
//     private JComboBox<String> toCurrencyComboBox;
//     private JButton convertButton;
//     private JLabel resultLabel;

//     // Exchange rates (example rates: 1 USD = 0.85 EUR, 1 USD = 110 JPY)
//     private double[][] exchangeRates = {
//         {1.0, 0.85, 110.0}, // USD to USD, EUR, JPY
//         {1.18, 1.0, 129.41}, // EUR to USD, EUR, JPY
//         {0.0091, 0.0077, 1.0} // JPY to USD, EUR, JPY
//     };

//     public currencyconverter() {
//         setTitle("currencyconverter");
//         setSize(400, 200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Initialize components
//         amountField = new JTextField(10);
//         fromCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "JPY"});
//         toCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "JPY"});
//         convertButton = new JButton("Convert");
//         resultLabel = new JLabel("Result: ");

//         // Layout
//         setLayout(new GridLayout(4, 1));

//         JPanel amountPanel = new JPanel();
//         amountPanel.add(new JLabel("Amount:"));
//         amountPanel.add(amountField);

//         JPanel currencyPanel = new JPanel();
//         currencyPanel.add(new JLabel("From:"));
//         currencyPanel.add(fromCurrencyComboBox);
//         currencyPanel.add(new JLabel("To:"));
//         currencyPanel.add(toCurrencyComboBox);

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.add(convertButton);

//         // Add components to frame
//         add(amountPanel);
//         add(currencyPanel);
//         add(buttonPanel);
//         add(resultLabel);

//         // Add action listener to the convert button
//         convertButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 convertCurrency();
//             }
//         });
//     }

//     private void convertCurrency() {
//         try {
//             double amount = Double.parseDouble(amountField.getText());
//             int fromIndex = fromCurrencyComboBox.getSelectedIndex();
//             int toIndex = toCurrencyComboBox.getSelectedIndex();

//             double exchangeRate = exchangeRates[fromIndex][toIndex];
//             double convertedAmount = amount * exchangeRate;

//             resultLabel.setText(String.format("Result: %.2f %s", convertedAmount, toCurrencyComboBox.getSelectedItem()));
//         } catch (NumberFormatException ex) {
//             resultLabel.setText("Invalid amount entered!");
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new currencyconverter().setVisible(true);
//             }
//         });
//     }
// }

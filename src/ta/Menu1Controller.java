/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ditya RA
 */
public class Menu1Controller implements Initializable {

    @FXML
    private Label hargaMakanan;
    @FXML
    private Label hargaMakanan1;
    @FXML
    private Label hargaMakanan11;
    @FXML
    private Label hargaMakanan13;
    @FXML
    private Label hargaMakanan12;
    @FXML
    private Label hargaMakanan121;
    @FXML
    private Label hargaMakanan1211;
    @FXML
    private Label hargaMakanan12111;
    @FXML
    private Label total;
    @FXML
    private TextField inAn;
    @FXML
    private RadioButton radio1;
    @FXML
    private RadioButton radio2;
    @FXML
    private TextField jumlahUang;
    @FXML
    private Button btnCetak;
    @FXML
    private TextArea hasilPesanan;
    @FXML
    private CheckBox mak1;
    @FXML
    private CheckBox mak2;
    @FXML
    private CheckBox mak3;
    @FXML
    private CheckBox mak4;
    @FXML
    private CheckBox mak5;
    @FXML
    private CheckBox mak6;
    @FXML
    private CheckBox mak7;
    @FXML
    private CheckBox mak8;
    @FXML
    private TextField jumlah1;
    @FXML
    private TextField jumlah2;
    @FXML
    private TextField jumlah3;
    @FXML
    private TextField jumlah4;
    @FXML
    private TextField jumlah5;
    @FXML
    private TextField jumlah6;
    @FXML
    private TextField jumlah7;
    @FXML
    private TextField jumlah8;
    @FXML
    private Button btnCetak1;
    
    int jumlahmakan, jumlahminum;
    int hagatotal1,hagatotal2,hagatotal3,hagatotal4,hagatotal5,hagatotal6,hagatotal7,hagatotal8;
    String menu1, menu2, menu3, menu4,menu5,menu6,menu7,menu8;
    String menu="";
    String kasir="";
    String atasnama, tampilTotalBayar, ket;
    int harga, kembalian;
    int totalbayar, jmlUangBayar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CetakPemesan(ActionEvent event) {
        if (radio1.isSelected()) {
            ket = "Yes";
        } else if (radio2.isSelected()) {
            ket = "No";
        } else {
            ket = "";
        }
        atasnama = inAn.getText();
        jmlUangBayar = Integer.parseInt(jumlahUang.getText());
        kembalian = jmlUangBayar - totalbayar;
        
        hasilPesanan.setText("Your Name: " + atasnama + "\n" + "Ordered Menu : "  + menu +"\n" + "Take Away : " + ket + "\n" + "Total Price : Rp. " + totalbayar + "\n" + "Money Did you Pay : Rp. "
                + jmlUangBayar + "\n" + "Cash Back : Rp. " + kembalian);
        
    }

    @FXML
    private void nasiAnget(ActionEvent event) {
    }

    @FXML
    private void bebekgoreng(ActionEvent event) {
    }

    @FXML
    private void Hitung(ActionEvent event) {
        if(mak1.isSelected()){     
            harga = 10000;
            menu += mak1.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah1.getText());
            hagatotal1=harga*jumlahmakan;
            System.out.println(hagatotal1);
        }
        if(mak2.isSelected()){     
            harga = 25000;
            menu += mak2.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah2.getText());
            hagatotal2=harga*jumlahmakan;
            System.out.println(hagatotal2);
        }
        if(mak3.isSelected()){     
            harga = 15000;
            menu += mak3.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah3.getText());
            hagatotal3=harga*jumlahmakan;
            System.out.println(hagatotal3);
        }
        if(mak4.isSelected()){     
            harga = 15000;
            menu += mak4.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah4.getText());
            hagatotal4=harga*jumlahmakan;
            System.out.println(hagatotal4);
        }
        if(mak5.isSelected()){     
            harga = 30000;
            menu += mak5.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah5.getText());
            hagatotal5=harga*jumlahmakan;
            System.out.println(hagatotal5);
        }
        if(mak6.isSelected()){     
            harga = 5000;
            menu += mak6.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah6.getText());
            hagatotal6=harga*jumlahmakan;
            System.out.println(hagatotal6);
        }
        if(mak7.isSelected()){     
            harga = 5000;
            menu += mak7.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah7.getText());
            hagatotal7=harga*jumlahmakan;
            System.out.println(hagatotal7);
        }
        if(mak8.isSelected()){     
            harga = 5000;
            menu += mak8.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah8.getText());
            hagatotal8=harga*jumlahmakan;
            System.out.println(hagatotal8);
        }
        totalbayar = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5+hagatotal6+hagatotal7+hagatotal8;
        tampilTotalBayar=String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
    }
    
}

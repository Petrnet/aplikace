package aplikace;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Observer;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.util.Observable;
import java.util.Observer;

import java.net.URL;



public class UkladaniController implements Initializable{

@FXML private TextField Surname;
@FXML private TextField Username;
@FXML private TextField password;
@FXML private TextField EID;
@FXML private TextField name;
Connection connection;


public void ukladani(ActionEvent event) {
		connection = sqliteConnection.dbConnector();
		if (connection==null)System.exit(1);
	
	 try {
		String query="insert into Employees (EID,Name,Surname,Username,password) values (?,?,?,?,?)";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1,EID.getText());
				pst.setString(2,Username.getText());
				pst.setString(3,password.getText());
				pst.setString(4,name.getText());
				pst.setString(5,Surname.getText());
				
				pst.execute();
				
				JOptionPane.showMessageDialog(null, "Data Saved");
				pst.close();
				
				
	} catch (SQLException e) {
		
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}
}
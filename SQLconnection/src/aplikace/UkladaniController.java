package aplikace;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.lang.Object;
import javax.swing.JOptionPane;

import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import java.util.Observable;
import java.util.Observer;

import java.net.URL;



public class UkladaniController implements Initializable{

	ObservableList<Zamestnanec> data=FXCollections.observableArrayList();

@FXML private TextField Surname;
@FXML private TextField Username;
@FXML private TextField password;
@FXML private TextField EID;
@FXML private TextField name;
@FXML private TableView<Zamestnanec> vypis;
@FXML private TableColumn<?, ?> EID2; 
@FXML private TableColumn<?, ?> name2;
@FXML private TableColumn<?, ?> Surname2;
@FXML private TableColumn<?, ?> Username2;
@FXML private TableColumn<?, ?> password2;
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
	 public void ukazani(ActionEvent event) {
		 
		 vypis.getItems().clear();
		 PreparedStatement preparedStatement=null;
		 ResultSet rs=null;
		 connection = sqliteConnection.dbConnector();
		if (connection==null)System.exit(1);
		
	
	 try {
		
		 
		 EID2.setCellValueFactory(new PropertyValueFactory<>("EID"));
			Username2.setCellValueFactory(new PropertyValueFactory<>("Username"));
			Surname2.setCellValueFactory(new PropertyValueFactory<>("Surname"));
			name2.setCellValueFactory(new PropertyValueFactory<>("Name"));
			password2.setCellValueFactory(new PropertyValueFactory<>("password"));
			
			String query="select * from Employees";
			preparedStatement=connection.prepareStatement(query);
			rs=preparedStatement.executeQuery();
			
			while(rs.next())
			{
				data.add(new Zamestnanec(
						rs.getString("EID"),
						rs.getString("Username"),
						rs.getString("Surname"),
						rs.getString("Name"),
						rs.getString("password")
						));
						vypis.setItems(data);
			 }
	 preparedStatement.close();
	 rs.close();
	 }
			
	 catch (SQLException e) 
	 { 
	 System.err.println(e);
			
	 }  
	 }	 


@Override
public void initialize(URL location, ResourceBundle resources) {
	
	

	
	// TODO Auto-generated method stub
	
}
}
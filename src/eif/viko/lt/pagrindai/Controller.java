package eif.viko.lt.pagrindai;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


  final ObservableList<Person> data = FXCollections.observableArrayList(
      new Person("Jacob", "Smith", "jacob.smith@example.com"),
      new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
      new Person("Ethan", "Williams", "ethan.williams@example.com"),
      new Person("Emma", "Jones", "emma.jones@example.com"),
      new Person("Michael", "Brown", "michael.brown@example.com")
  );

  @FXML
  private TextField vardas;

  @FXML
  private TextField pavarde;

  @FXML
  private TextField email;

  @FXML
  private TableView<Person> lentele;

  // Iterpti i sarasa
  @FXML
  void iterpti(ActionEvent event) {
    data.add(new Person(vardas.getText(), pavarde.getText(), email.getText()));
  }
  // Panaikinti is saraso
  @FXML
  void panaikinti(ActionEvent event) {
    for(Person person: lentele.getSelectionModel().getSelectedItems()){
      data.remove(person);
    }
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    lentele.setEditable(true);

    TableColumn firstNameCol = new TableColumn("First Name");
    firstNameCol.setMinWidth(100);
    firstNameCol.setCellValueFactory(
        new PropertyValueFactory<Person, String>("firstName"));

    TableColumn lastNameCol = new TableColumn("Last Name");
    lastNameCol.setMinWidth(100);
    lastNameCol.setCellValueFactory(
        new PropertyValueFactory<Person, String>("lastName"));

    TableColumn emailCol = new TableColumn("Email");
    emailCol.setMinWidth(200);
    emailCol.setCellValueFactory(
        new PropertyValueFactory<Person, String>("email"));

    lentele.setItems(data);
    lentele.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

  }

  public static class Person {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;

    private Person(String fName, String lName, String email) {
      this.firstName = new SimpleStringProperty(fName);
      this.lastName = new SimpleStringProperty(lName);
      this.email = new SimpleStringProperty(email);
    }

    public String getFirstName() {
      return firstName.get();
    }

    public void setFirstName(String fName) {
      firstName.set(fName);
    }

    public String getLastName() {
      return lastName.get();
    }

    public void setLastName(String fName) {
      lastName.set(fName);
    }

    public String getEmail() {
      return email.get();
    }

    public void setEmail(String fName) {
      email.set(fName);
    }

    @Override
    public String toString() {
      return "Person{" +
          "firstName=" + firstName +
          ", lastName=" + lastName +
          ", email=" + email +
          '}';
    }
  }
}


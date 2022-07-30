module com.example.niotesting {
  requires javafx.controls;
  requires javafx.fxml;
  
  
  opens com.example.niotesting to javafx.fxml;
  exports com.example.niotesting;
}
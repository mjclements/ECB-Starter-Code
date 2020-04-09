package edu.wpi.teamname.views;

import edu.wpi.teamname.entity.Mortgage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
  @FXML private TextField amountField;
  @FXML private TextField rateField;
  @FXML private TextField yearField;
  @FXML private Button computeButton;

  private Mortgage mortgage;

  public MainController(Mortgage mortgage) {
    /* Inject entity objects */
    this.mortgage = mortgage;
  }

  /** Set the properties of the mortgage model and calculate the monthly interest */
  @FXML
  private void calculateTotalClicked() {
    mortgage.setAmount(Double.parseDouble(amountField.getText()));
    mortgage.setRate(Double.parseDouble(rateField.getText()));
    mortgage.setYears(Integer.parseInt(yearField.getText()));

    mortgage.calcMortgage();
  }

  /**
   * Enables the calculate button if every text box is filled. Disables it if any text box is empty
   */
  @FXML
  private void validateButton() {
    if (!amountField.getText().isEmpty()
        && !rateField.getText().isEmpty()
        && !yearField.getText().isEmpty()) {
      computeButton.setDisable(false);
    }
  }
}

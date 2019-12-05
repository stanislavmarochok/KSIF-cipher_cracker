package ViewModel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainWindowViewModel {

    @FXML
    private Label lblTitle;

    @FXML
    private TextArea textDecodedText;

    @FXML
    private TextArea textCipheredText;

    @FXML
    public void initialize()
    {
        // some staff on initialization
    }

    @FXML
    private void DecodeText()
    {
        textDecodedText.setText(DecodeMessage(textCipheredText.getText()));
    }

    private String DecodeMessage(String cipheredText)
    {
        StringBuilder text = new StringBuilder(cipheredText);

        return text.toString();
    }
}

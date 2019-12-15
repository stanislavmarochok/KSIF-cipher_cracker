package ViewModel;

import TCipher.Decrypt;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowViewModel {

    @FXML
    private Label lblTitle;

    @FXML
    private TextArea textDecodedText;

    @FXML
    private TextArea textCipheredText;

    @FXML
    private CheckBox cbKnowKey;

    @FXML
    private TextField txtKeyField;

    @FXML
    public void initialize()
    {
        // some staff on initialization
    }

    @FXML
    private void DecryptTextButtonClicked()
    {
        textDecodedText.setText("");

        if (cbKnowKey.isSelected())
        {
            textDecodedText.appendText(Decrypt.decryptWithKey(textCipheredText.getText().replaceAll("\\s",""), txtKeyField.getText().replaceAll("\\s","")) + '\n');
            return;
        }

        String decryptedText[][] = Decrypt.decryptWithoutKey(textCipheredText.getText().replaceAll("\\s","").toLowerCase(), 1, 6);

        for (int i = 0; i < decryptedText.length; i++)
        {
            textDecodedText.appendText((i + 1) + " - " + decryptedText[i][1] + " - " + decryptedText[i][0] + '\n');
        }

    }
}

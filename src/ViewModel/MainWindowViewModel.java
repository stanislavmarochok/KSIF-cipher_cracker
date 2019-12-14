package ViewModel;

import TCipher.Decrypt;
import helpers.Bigram;
import helpers.Node;
import helpers.Text;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private void DecryptText()
    {
        textDecodedText.setText("");

        if (cbKnowKey.isSelected())
        {
            textDecodedText.appendText(Decrypt.decryptWithKey(textCipheredText.getText(), txtKeyField.getText()) + '\n');
            return;
        }

        String decryptedText[] = Decrypt.startDecryption(textCipheredText.getText(), 1, 6);

        for (int i = 0; i < decryptedText.length; i++)
        {
            textDecodedText.appendText((i + 1) + ": " + decryptedText[i] + '\n');
        }

        //Node.loadDictionary(Node.readDictionaryWords("dictionary_5000.txt"));
    }
}

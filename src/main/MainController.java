package main;

import Decryption.DecryptMethod_1;
import Decryption.DecryptMethod_2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    @FXML
    private Label lblTitle;

    @FXML
    private TextArea textDecodedText;

    @FXML
    private TextArea textCipheredText;

    @FXML
    private TextField txtKeyField;

    @FXML
    private ComboBox comBoxMin;

    @FXML
    private ComboBox comBoxMax;

    @FXML
    public void initialize()
    {
        ObservableList<Integer> list = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8);

        comBoxMin.setItems(list);
        comBoxMax.setItems(list);
    }

    @FXML
    private void DecryptTextButtonClicked()
    {
        textDecodedText.setText("");

        if (!txtKeyField.getText().isEmpty())
        {
            long startTime = System.nanoTime();
                String str = DecryptMethod_1.decryptWithKey(textCipheredText.getText().replaceAll("\\s",""), txtKeyField.getText().replaceAll("\\s",""));
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);
            textDecodedText.appendText("Time spend: " + duration + "ns \n" + str);
            return;
        }

        long startTime = System.nanoTime();
            String decryptedText[][] =
                DecryptMethod_1.decryptWithoutKey(
                    textCipheredText.getText().replaceAll("\\s","").toLowerCase(),
                    comBoxMin.getValue() != null ? (int)comBoxMin.getValue() : 1,
                    comBoxMax.getValue() != null ? (int)comBoxMax.getValue() : 7
                );
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        textDecodedText.appendText("Time spend: " + duration + "ns \n");

        for (int i = 0; i < decryptedText.length; i++)
        {
            textDecodedText.appendText((i + 1) + " - " + decryptedText[i][1] + " - " + decryptedText[i][0] + '\n');
        }
    }

    @FXML
    private void DecryptTextButtonClicked_2()
    {
        textDecodedText.setText("");

        if (!txtKeyField.getText().isEmpty())
        {
            long startTime = System.nanoTime();
                String str = DecryptMethod_2.decryptWithKey(textCipheredText.getText().replaceAll("\\s",""), txtKeyField.getText().replaceAll("\\s",""));
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);
            textDecodedText.appendText("Time spend: " + duration + "ns \n" + str);
            return;
        }

        long startTime = System.nanoTime();
            String decryptedText[][] =
                DecryptMethod_2.decryptWithoutKey(
                        textCipheredText.getText().replaceAll("\\s","").toLowerCase(),
                        comBoxMin.getValue() != null ? (int)comBoxMin.getValue() : 1,
                        comBoxMax.getValue() != null ? (int)comBoxMax.getValue() : 7
                );
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        textDecodedText.appendText("Time spend: " + duration + "ns \n");

        for (int i = 0; i < decryptedText.length; i++)
        {
            textDecodedText.appendText((i + 1) + " - " + decryptedText[i][1] + " - " + decryptedText[i][0] + '\n');
        }
    }

    @FXML
    private void EncryptTextButtonClicked()
    {
        textDecodedText.setText("");

        if (!txtKeyField.getText().isEmpty())
        {
            long startTime = System.nanoTime();
                String str = DecryptMethod_1.encryptText(textCipheredText.getText().replaceAll("\\s",""), txtKeyField.getText().replaceAll("\\s",""));
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);
            textDecodedText.appendText("Time spend: " + duration + "ns \n" + str);
            return;
        }
    }

    @FXML
    private void ComboBoxValueChanged()
    {
        comBoxMin.setAccessibleText(comBoxMin.getPromptText() + comBoxMin.getValue());
    }
}

package ViewModel;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

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
            textDecodedText.appendText(DecryptWithKey(textCipheredText.getText(), txtKeyField.getText()) + '\n');
            return;
        }

        String decryptedText[] = Decrypt(textCipheredText.getText());

        for (int i = 0; i < decryptedText.length; i++)
        {
            textDecodedText.appendText((i + 1) + ": " + decryptedText[i] + '\n');
        }
    }

    private String[] Decrypt(String cipheredText)
    {

        int getnum = cipheredText.length();

        //get possible division number
        List< Integer > val = new ArrayList< Integer >();
        for (int x = 1; x < getnum; x++) {
            if (getnum % x == 0)
                val.add(x);
        }

        String[] dec = new String[val.size()];
        for (int x = 0; x < val.size(); x++) {
            int now = (int) val.get(x);
            String regex = "(?<=\\G.{" + now + "})";
            String[] get = cipheredText.split(regex);

            //tranpose
            char grid[][] = new char[now][get.length];
            for (int y = 0; y < get.length; y++) {
                String nw = get[y];
                for (int z = 0; z < nw.length(); z++) {
                    grid[z][y] = nw.charAt(z);
                }
            }

            //combine
            dec[x] = "";
            for (int y = 0; y < now; y++) {
                for (int z = 0; z < get.length; z++) {
                    dec[x] = dec[x] + grid[y][z];
                }
                dec[x] = dec[x] + " ";
            }

        }


        return dec;
    }

    private String DecryptWithKey(String cipheredText, String key)
    {
        String str = "huj tebe v rot, a ne perevod";

        return str;
    }
}

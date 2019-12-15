package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller  /*Vytvoření postavy*/ { /*přidat konečný tlačítko na uložení postavy*/
    public Button male;
    public Button female;
    public Button eyes;
    public Button eyebrows;
    public Button nose;
    public Button hair;
    public TextField jmeno;
    public Button mouth;
    public Button haircolor;
    public Button ears;
    public Button extras;
    public Button aracora;
    public Button human;
    public Label label1;
    public Label label3;
    public Label label2;
    public Label label4;
    public Label label6;
    public Label label7;
    public Label label5;
    public Label label8;
    public Button nahrani;
    public Button ulozit;
    public AnchorPane anchor;
    public ImageView imageview;
    public ImageLoad IL;
    public File imgPath;
    //public ImageView imageview; public ImageLoad IL;
    int m,f=0;/*pohlaví*/
    int a,h=0;/*rasa*/
    int intlabel1 = 0;
    public Object obr;

    /*jméno hráče*/
    public void gender(ActionEvent actionEvent) { /*muž*/
         m=1;
         f=0;
    }
    public void gender1(ActionEvent actionEvent) { /*žena*/
         m=0;
         f=1;
    }
    public void aracora(ActionEvent actionEvent) {
         a=1;
         h=0;
    }
    public void human(ActionEvent actionEvent) {
         a=0;
         h=1;
    }
    public void eyes(ActionEvent actionEvent) {/*oči*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/ {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)/*switch přepínající oči/backround labelu*/
                {
                    case 1:
                        label1.setText("1");break;/*NAHRADIT VŠE OBRÁZKAMA + vymyslet jak by to mělo sedět*/
                    case 2:
                        label1.setText("2");break;
                    case 3:
                        label1.setText("3");break;
                    case 4:
                        label1.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label1.setText("5");break;
                    case 2:
                        label1.setText("6");break;
                    case 3:
                        label1.setText("7");break;
                    case 4:
                        label1.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label1.setText("1");break;
                    case 2:
                        label1.setText("2");break;
                    case 3:
                        label1.setText("3");break;
                    case 4:
                        label1.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label1.setText("5");break;
                    case 2:
                        label1.setText("6");break;
                    case 3:
                        label1.setText("7");break;
                    case 4:
                        label1.setText("8");break;
                }
            }
        }
    }
    public void eyebrows(ActionEvent actionEvent) {/*obočí*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label2.setText("1");break;
                    case 2:
                        label2.setText("2");break;
                    case 3:
                        label2.setText("3");break;
                    case 4:
                        label2.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label2.setText("5");break;
                    case 2:
                        label2.setText("6");break;
                    case 3:
                        label2.setText("7");break;
                    case 4:
                        label2.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label2.setText("1");break;
                    case 2:
                        label2.setText("2");break;
                    case 3:
                        label2.setText("3");break;
                    case 4:
                        label2.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label2.setText("5");break;
                    case 2:
                        label2.setText("6");break;
                    case 3:
                        label2.setText("7");break;
                    case 4:
                        label2.setText("8");break;
                }
            }
        }
    }

    public void nose(ActionEvent actionEvent) {/*nos*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label3.setText("1");break;
                    case 2:
                        label3.setText("2");break;
                    case 3:
                        label3.setText("3");break;
                    case 4:
                        label3.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label3.setText("5");break;
                    case 2:
                        label3.setText("6");break;
                    case 3:
                        label3.setText("7");break;
                    case 4:
                        label3.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label3.setText("1");break;
                    case 2:
                        label3.setText("2");break;
                    case 3:
                        label3.setText("3");break;
                    case 4:
                        label3.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label3.setText("5");break;
                    case 2:
                        label3.setText("6");break;
                    case 3:
                        label3.setText("7");break;
                    case 4:
                        label3.setText("8");break;
                }
            }
        }
    }
    public void hair(ActionEvent actionEvent) {/*vlasy*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label4.setText("1");break;
                    case 2:
                        label4.setText("2");break;
                    case 3:
                        label4.setText("3");break;
                    case 4:
                        label4.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label4.setText("5");break;
                    case 2:
                        label4.setText("6");break;
                    case 3:
                        label4.setText("7");break;
                    case 4:
                        label4.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label4.setText("1");break;
                    case 2:
                        label4.setText("2");break;
                    case 3:
                        label4.setText("3");break;
                    case 4:
                        label4.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label4.setText("5");break;
                    case 2:
                        label4.setText("6");break;
                    case 3:
                        label4.setText("7");break;
                    case 4:
                        label4.setText("8");break;
                }
            }
        }
    }
    public void mouth(ActionEvent actionEvent) {/*pusa*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label5.setText("1");break;
                    case 2:
                        label5.setText("2");break;
                    case 3:
                        label5.setText("3");break;
                    case 4:
                        label5.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label5.setText("5");break;
                    case 2:
                        label5.setText("6");break;
                    case 3:
                        label5.setText("7");break;
                    case 4:
                        label5.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label5.setText("1");break;
                    case 2:
                        label5.setText("2");break;
                    case 3:
                        label5.setText("3");break;
                    case 4:
                        label5.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label5.setText("5");break;
                    case 2:
                        label5.setText("6");break;
                    case 3:
                        label5.setText("7");break;
                    case 4:
                        label5.setText("8");break;
                }
            }
        }
    }
    public void haircolor(ActionEvent actionEvent) {/*barva vlasů*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label6.setText("1");break;
                    case 2:
                        label6.setText("2");break;
                    case 3:
                        label6.setText("3");break;
                    case 4:
                        label6.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label6.setText("5");break;
                    case 2:
                        label6.setText("6");break;
                    case 3:
                        label6.setText("7");break;
                    case 4:
                        label6.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label6.setText("1");break;
                    case 2:
                        label6.setText("2");break;
                    case 3:
                        label6.setText("3");break;
                    case 4:
                        label6.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label6.setText("5");break;
                    case 2:
                        label6.setText("6");break;
                    case 3:
                        label6.setText("7");break;
                    case 4:
                        label6.setText("8");break;
                }
            }
        }
    }
    public void ears(ActionEvent actionEvent) {/*uši*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label7.setText("1");break;
                    case 2:
                        label7.setText("2");break;
                    case 3:
                        label7.setText("3");break;
                    case 4:
                        label7.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label7.setText("5");break;
                    case 2:
                        label7.setText("6");break;
                    case 3:
                        label7.setText("7");break;
                    case 4:
                        label7.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label7.setText("1");break;
                    case 2:
                        label7.setText("2");break;
                    case 3:
                        label7.setText("3");break;
                    case 4:
                        label7.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label7.setText("5");break;
                    case 2:
                        label7.setText("6");break;
                    case 3:
                        label7.setText("7");break;
                    case 4:
                        label7.setText("8");break;
                }
            }
        }
    }
    public void extras(ActionEvent actionEvent) {/*dodatky*/
        if (m == 1) /*muž*/ {
            if (h == 1) /*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label8.setText("1");break;
                    case 2:
                        label8.setText("2");break;
                    case 3:
                        label8.setText("3");break;
                    case 4:
                        label8.setText("4");break;
                }
            }
            else /*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label8.setText("5");break;
                    case 2:
                        label8.setText("6");break;
                    case 3:
                        label8.setText("7");break;
                    case 4:
                        label8.setText("8");break;
                }
            }
        }
        else /*žena*/
        {
            if (h==1)/*člověk*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label8.setText("1");break;
                    case 2:
                        label8.setText("2");break;
                    case 3:
                        label8.setText("3");break;
                    case 4:
                        label8.setText("4");break;
                }
            }
            else/*aracora*/
            {
                intlabel1++;
                if(intlabel1==5)
                {
                    intlabel1=1;
                }
                switch (intlabel1)
                {
                    case 1:
                        label8.setText("5");break;
                    case 2:
                        label8.setText("6");break;
                    case 3:
                        label8.setText("7");break;
                    case 4:
                        label8.setText("8");break;
                }
            }
        }
    }
    public void save(ActionEvent actionEvent) throws IOException /*uloží postavu a přesune se do hry*/ {
        Object [] options = {"OK","Ne vrať mě zpět na tvorbu postavy"};
        int n = JOptionPane.showInternalOptionDialog(null , "Jsi hotov s vytvářením tvé postavy", "Otázka",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, options, options[1]);
        if(n == 0)
         {
             AnchorPane pane = FXMLLoader.load(getClass().getResource("sample1.fxml"));
             anchor.getChildren().setAll(pane);
         }


    }


    public void nahrani(ActionEvent actionEvent) { /*import obrázku*/
        IL = new ImageLoad();
        if (IL.getImagePath() != null)
        {
            try {
                imgPath = IL.getImagePath();
                Image image = new Image(new FileInputStream(imgPath));
                imageview.setImage(image);
                //uložit v databázi

            }
            catch (IllegalArgumentException | IOException e)
            {
                System.out.println("Chyba načítání obrázku");
            }

        }
    }
    //udělat get level


}

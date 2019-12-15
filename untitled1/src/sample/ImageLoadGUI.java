package sample;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class ImageLoadGUI extends JFrame {
    private File imagePath;


    public ImageLoadGUI(){
        JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("Obrázky: png, jpeg, jpg, bmp", "png","jpeg","jpg","bmp");

        fc.setDialogTitle("Vyberte obrázek");
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(extFilter);
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            imagePath = fc.getSelectedFile();
    }
        public File getImagePath() {return imagePath.getAbsoluteFile();}
    }




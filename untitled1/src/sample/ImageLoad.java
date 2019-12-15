package sample;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class ImageLoad extends JFrame {
    private File ImagePath;
    public ImageLoad(){
        //file chooser získá domácí adresář
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG a GIF", "png", "jpg", "gif");

        jfc.setDialogTitle("Vyber si obrázek své postavy");
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.addChoosableFileFilter(filter);
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            ImagePath = jfc.getSelectedFile();
        }
    }
    public File getImagePath()
    {
        return ImagePath.getAbsoluteFile();
    }
}

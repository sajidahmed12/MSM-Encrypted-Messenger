package BaseCode;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
 
public class Resize_Image {
 
    public static Image resize(ImageIcon image, int scaledWidth, int scaledHeight){
        // reads input image
        //File inputFile = new File(image);
        BufferedImage inputImage;
        inputImage = (BufferedImage)image.getImage();
 
        // creates output image
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();
 
        return (Image) outputImage;
        
    }
    
}

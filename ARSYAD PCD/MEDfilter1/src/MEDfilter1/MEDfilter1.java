/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medfilter1;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Amigo Paradise
 */
public class MEDfilter1 {
    public static void main(String[] args) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        
         // Reading the Image from the file and storing it in to a Matrix object
        String file ="C:\\Users\\Abang Kampret\\Desktop\\Marco\\kucing.jpg";
        Mat src = Imgcodecs.imread(file);
        
        // Creating an empty matrix to store the result
         Mat dst = new Mat();

        // Applying MedianBlur on the Image
        Imgproc.medianBlur(src, dst, 5);

        // Writing the image
        Imgcodecs.imwrite("C:\\Users\\Abang Kampret\\Desktop\\Marco\\kucingburam.jpg", dst);

        System.out.println("Image Processed");
        // TODO code application logic here
    }
    
}

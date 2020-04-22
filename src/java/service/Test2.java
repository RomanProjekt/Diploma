///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package service;
//
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.rendering.ImageType;
//import org.apache.pdfbox.rendering.PDFRenderer;
//import org.apache.pdfbox.tools.imageio.ImageIOUtil;
//
///**
// *
// * @author hp
// */
//public class Test2 {
//    
//    
//    public static void main(String[] args) throws IOException {
//        Test2 t = new Test2();
//        t.generateImageFromPDF("Agrio", "C:\\Users\\hp\\Desktop\\bild.png");
//    }
//    
//    
//    private void generateImageFromPDF(String filename, String extension) throws IOException {
//        PDDocument document = PDDocument.load(new File(filename));
//        PDFRenderer pdfRenderer = new PDFRenderer(document);
//        for (int page = 0; page < document.getNumberOfPages(); ++page) {
//            BufferedImage bim = pdfRenderer.renderImageWithDPI(
//                    page, 300, ImageType.RGB);
//            ImageIOUtil.writeImage(
//                    bim, String.format("src/output/pdf-%d.%s", page + 1, extension), 300);
//        }
//        document.close();
//}
//    
//}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.ghost4j.document.DocumentException;
import org.ghost4j.document.PDFDocument;
import org.ghost4j.renderer.RendererException;
import org.ghost4j.renderer.SimpleRenderer;




/**
 *
 * @author hp
 */
public class PDFToImage {

    public void pdf() throws IOException, RendererException, DocumentException {

        File file = new File("H:\\AK_Projekt\\Version 10.04.2020\\Version 31.03.2020\\DA_AK\\src\\java\\service\\Agrio.pdf");
        File file2 = new File("H:\\AK_Projekt\\Version 10.04.2020\\Version 31.03.2020\\DA_AK\\src\\java\\service\\Agrio.pdf");
        File file3 = new File("C:\\Users\\hp\\Desktop\\document.pdf");
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getName());

        // PDF oder PS Datei laden
        PDFDocument document = new PDFDocument();
        document.load(new File("C:\\Users\\hp\\Desktop\\document.pdf"));

//// Renderer erstellen
       SimpleRenderer renderer = new SimpleRenderer();
//
//// Auflösung in DPI
        renderer.setResolution(300);
//
//// Render
        List<Image> images = renderer.render(document);
//
//// images dann als PNG umwandeln
//        for (int i = 0; i < images.size(); i++) {
//            ImageIO.write((RenderedImage) images.get(i), "png", new File((i + 1) + ".png"));
//        }
//
  }

    public static void main(String[] args) throws IOException, RendererException, DocumentException {

        PDFToImage t = new PDFToImage();
        t.pdf();

    }

}

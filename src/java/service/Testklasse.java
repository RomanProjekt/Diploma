
package service;
//
//import de.mkammerer.argon2.Argon2;
//import de.mkammerer.argon2.Argon2Factory;
//import java.awt.image.BufferedImage; 
//import java.io.File; 
//import java.io.IOException;
//
//import javax.imageio.ImageIO; 
//import org.apache.pdfbox.pdmodel.PDDocument; 
//import org.apache.pdfbox.rendering.PDFRenderer;  
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.faces.context.FacesContext;
//import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.apache.pdfbox.pdmodel.PDDocument;
import pojo.Diplomarbeit;

public class Testklasse {
    
    
    
////    
//////    public String mainEncryption(String securityanswer, int id) {
//////        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
//////        return argon2.hash(4, 1024 * 1024, 8, (String.valueOf(id) + securityanswer).toCharArray());
//////    }
//////
////////    public String entcryptionSecurityAnswer(String securityanswer, int id) {
////////        String schlüssel = securityanswer + String.valueOf(id);
////////        //String firstEnc =  this.manipulationCode(this.encrypt(this.composeSecurityAnswer(securityanswer, benutzername, date, time), this.mainEncryption()));
////////        return  this.manipulationCode(this.encrypt( schlüssel , this.mainEncryption(securityanswer, id)));
////////
////////    }
//////
//////    public String manipulationCode(String code) {
//////        return code.substring(0, 15);
//////    }
//////    
////    
////    
////    
////    public void pdf() throws IOException {
////        
////          //C://Users//hp//Desktop//document.pdf
////        
////          
////          
//////        String server_pdf_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/pdf/" + filename + ".pdf";
////
////        //Loading an existing PDF document 
////        File file = new File("H:\\AK_Projekt\\Version 10.04.2020\\Version 31.03.2020\\DA_AK\\src\\java\\service\\Agrio.pdf");
////        File file2 = new File("H:\\AK_Projekt\\Version 10.04.2020\\Version 31.03.2020\\DA_AK\\src\\java\\service\\Agrio.pdf");
////        File file3 = new File("C:\\Users\\hp\\Desktop\\document.pdf");
////        System.out.println(file3.getAbsolutePath());
////        System.out.println(file3.getName());
////       
////        
////        
////
////        if (file.exists()) {
////
////            //Instantiating the PDFRenderer class
////            try (PDDocument document = PDDocument.load(file3)) {
////                //Instantiating the PDFRenderer class
////                PDFRenderer renderer = new PDFRenderer(document);
////                //Rendering an image from the PDF document
////                BufferedImage image = renderer.renderImage(0);
////                //Writing the image to a file
////                ImageIO.write(image, "JPEG", new File("C:\\Users\\hp\\Desktop\\bild.png"));
////                System.out.println("Image created");
////                //Closing the document
////            }
////
////        }
////        else {
////            System.out.println("PDf ist nicht vorhanden!");
////        }
////
////        
////    }
//
//    public boolean DeleteFile(String filename) {
//        
//         FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
//         ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
//         String server_pdf_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "resources/pdf/" + filename + ".pdf";
//        
//        
//        boolean del = false;
//        File file = new File(server_pdf_pfad);
//        if (file.exists()) {
//            del = file.delete();
//        }
//        return del;
//    }
////   Testklasse t = new Testklasse();
//      String filepath = "C:\\Users\\hp\\Desktop\\document.pdf";
//      String filename = "TitelTEST";
//      t.DeleteFile(filename);
//// 
//
//
//
//    
//    
// 
    
    public void getNumberOfPages() throws IOException {
        
        String pfad = "F:\\DA_AK\\web\\resources\\pdf\\Agrario.pdf";
        File pdf1 = new File("C:\\Users\\hp\\Desktop\\Test.pdf");
        String pdfpfad = "resources/pdf/Test.pdf";
        
        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        String abs  = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + pdfpfad;
        System.out.println(abs);
        
        
        
        File pdf = new File(abs);

        if (pdf.exists()) {

            //Instantiating the PDFRenderer class
            try (PDDocument document = PDDocument.load(pdf)) {
                System.out.println(document);
                
                int numberofpages = document.getNumberOfPages();
                System.out.println("Seitenanzahl " + numberofpages);
                
            }

        } else {
            System.out.println("PDf ist nicht vorhanden!");
        }

    }
    
    
    
     
    
    
    
     public void convertSQLDateToUtilDate(java.sql.Date date) {
        
        java.util.Date utilDate = new java.util.Date(date.getTime());
        
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat  simpledateformat = new SimpleDateFormat(pattern);
        
        String dateFormat = simpledateformat.format(utilDate);
        
        System.out.println(dateFormat);
        
        
        
    }
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) throws IOException {
        
       Testklasse tk = new Testklasse();
       tk.convertSQLDateToUtilDate(new java.sql.Date(12-12-2000));

    }
    
}

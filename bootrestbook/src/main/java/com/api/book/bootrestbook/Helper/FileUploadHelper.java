package com.api.book.bootrestbook.Helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {

    public final String UPLOAD_DIR;

    // Constructor
    public FileUploadHelper() throws IOException {
        // Dynamically resolve the upload directory
        UPLOAD_DIR = new ClassPathResource("static/image").getFile().getAbsolutePath();
    }

    public boolean uploadFile(org.springframework.web.multipart.MultipartFile file) {
        try {
            // Ensure the upload directory exists
            Path uploadPath = Path.of(UPLOAD_DIR);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            // Copy the file to the upload directory
            Path targetPath = uploadPath.resolve(file.getOriginalFilename());
            Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            return true; // Upload success
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Upload failure
        }
    }
}























//static upload file

// import java.io.File;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.nio.file.StandardCopyOption;

// import org.springframework.core.io.ClassPathResource;

// // import java.io.File;
// // import java.io.FileOutputStream;
// // import java.io.InputStream;

// import org.springframework.stereotype.Component;
// import org.springframework.web.multipart.MultipartFile;

// @Component
// public class FileUploadHelper {
    
//     //static 
//    // public final String UPLOAD_DIR="D:\\Springboot\\bootrestbook\\src\\main\\resources\\static";
    
//     //dyanamic
//     public final String UPLOAD_DIR=new ClassPathResource("static/image").getFile().getAbsolutePath();

//     public FileUploadHelper()throws IOException
//     {
        
//     }

//     public boolean uploadFile(MultipartFile multipartFile)
//     {
//         boolean f = false;
//         try {

//         //     //read
//         //    InputStream is=multipartFile.getInputStream();
//         //    byte data[]=new byte[is.available()];
//         //    is.read(data);

//         //    //writeUPLOAD_DIR+"\\"+multipartFile.getOriginalFilename()
//         //    FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
//         //     fos.write(data);

//         //     fos.flush();
//         //     fos.close();
            
        
//         Files.copy(
//     multipartFile.getInputStream(),
//     Paths.get(UPLOAD_DIR + File.separator + multipartFile.getOriginalFilename()),
//     StandardCopyOption.REPLACE_EXISTING
//      );
  
//         f=true;


        
//         } catch (Exception e) {
//            e.printStackTrace();
//         }
//        return f;
//     }
// }

package com.api.book.bootrestbook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.book.bootrestbook.Helper.FileUploadHelper;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            boolean isUploaded = fileUploadHelper.uploadFile(file);
            if (isUploaded) {
                // Generate file URI dynamically
                @SuppressWarnings("null")
                String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/image/")
                        .path(file.getOriginalFilename())
                        .toUriString();
                return ResponseEntity.ok(fileDownloadUri);
            } else {
                return ResponseEntity.status(500).body("File upload failed. Please try again.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred: " + e.getMessage());
        }
    }
}


































//static upload code

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.multipart.MultipartFile;


// import com.api.book.bootrestbook.Helper.FileUploadHelper;

// @RestController
// public class FileUploadController {


//     @Autowired
//     private FileUploadHelper fileUploadHelper;

//     @SuppressWarnings("null")
//     @PostMapping("/upload-file")
//     public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
//         // System.out.println(file.getOriginalFilename());
//         // System.out.println(file.getSize());
//         // System.out.println(file.getContentType());
//         // System.out.println(file.getName());
       
//         try{
//         //validation
//         if(file.isEmpty()){
//             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
//         }

//         //
//          if(!file.getContentType().equals("image/jpeg")){
//             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG content type are allowed");
//          }

//          //file upload code 

//         boolean f =fileUploadHelper.uploadFile(file);
//         if(f){
//             //static
//              return ResponseEntity.ok("File is successfully uploded");
//         }

//         }
//         catch(Exception e){
//            e.printStackTrace();
//         }
        
//         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong !! try again");
//     }
    
// }

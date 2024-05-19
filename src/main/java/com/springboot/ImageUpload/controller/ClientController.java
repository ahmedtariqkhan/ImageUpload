package com.springboot.ImageUpload.controller;

import com.springboot.ImageUpload.model.Image;
import com.springboot.ImageUpload.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.sql.Blob;

@RestController
@RequestMapping("image")
public class ClientController {
    @Autowired
    private ImageService imageService;
    @PostMapping("add")
    public String addImagePost(@RequestParam("image") MultipartFile file) throws Exception{
        byte[] bytes = file.getBytes();
        Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);

        Image image = new Image();
        image.setImage(blob);
        imageService.create(image);
        return "Successful";
    }
}

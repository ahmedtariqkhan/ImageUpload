package com.springboot.ImageUpload.service;

import com.springboot.ImageUpload.model.Image;
import com.springboot.ImageUpload.repository.ImageRepositoy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ImageService implements Service<Image>{
    @Autowired
    private ImageRepositoy imageRepositoy;
    @Override
    public Image create(Image image) {
        return imageRepositoy.save(image);
    }

    @Override
    public List<Image> viewAll() {
        return imageRepositoy.findAll();
    }
}

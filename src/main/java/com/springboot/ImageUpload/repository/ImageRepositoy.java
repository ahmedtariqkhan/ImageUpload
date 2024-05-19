package com.springboot.ImageUpload.repository;

import com.springboot.ImageUpload.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepositoy extends JpaRepository<Image,Long> {
}

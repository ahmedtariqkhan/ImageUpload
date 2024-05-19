package com.springboot.ImageUpload.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Data
@Entity
@Table(name = "image_upload")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Blob image;
    private Date date = new Date();
}

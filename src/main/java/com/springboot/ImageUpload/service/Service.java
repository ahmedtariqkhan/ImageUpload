package com.springboot.ImageUpload.service;


import java.util.*;

@org.springframework.stereotype.Service
public interface Service<T> {
    public T create(T image);
    public List<T> viewAll();
}

package com.NU.riddhi.photoz.clone.service;

import com.NU.riddhi.photoz.clone.model.Photo;
import com.NU.riddhi.photoz.clone.repository.PhotosRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PhotoService {

    private final PhotosRepository photosRepository;

    public PhotoService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }
    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
       photosRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setFileName(fileName);
        photo.setData(data);
        photo.setContentType(contentType);
        photosRepository.save(photo);
        return photo;

    }
}

package com.NU.riddhi.photoz.clone.web;

import com.NU.riddhi.photoz.clone.model.Photo;
import com.NU.riddhi.photoz.clone.service.PhotoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.*;

@RestController
public class PhotosController {


    private final PhotoService photoService;

    public PhotosController(PhotoService photoService) {
        this.photoService = photoService;
    }


    @GetMapping("/photos")
    public Iterable<Photo> get(){
        return photoService.get();

    }

    @GetMapping("/photos/{id}")
    public Photo get(@PathVariable Integer id){
        Photo photo = photoService.get(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;


    }

    @PostMapping("/photos")
    public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
        return photoService.save(file.getOriginalFilename(),file.getContentType(),file.getBytes());


    }


    @DeleteMapping("/photos/{id}")
    public void delete(@PathVariable Integer id){
        photoService.remove(id);
    }
}

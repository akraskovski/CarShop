package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Photo;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Component
public class PhotoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private UploadedFile uploadedFile;
    private List<InputStream> streams;
    private List<Photo> photos;
    private List<String> background;

    @PostConstruct
    public void init() {
        streams = new ArrayList<>();
        photos = new ArrayList<>();
        background = new ArrayList<>();
        for (int i = 1; i <= 4; i++)
            background.add("images/background/background" + i + ".jpg");
    }

    public void uploadPhoto(FileUploadEvent e) throws IOException {
        this.uploadedFile = e.getFile();
        InputStream input = uploadedFile.getInputstream();
        streams.add(input);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("File(s) Uploaded Successfully"));
    }

    public Boolean savePhotosToSystem() {
        if (streams.size() > 0) {
            for (InputStream input : streams) {
                Photo photo = new Photo();
                File f;
                try {
                    f = File.createTempFile("car", ".jpg", new File("E:\\CarShop\\src\\main\\webapp\\resources\\images\\"));
                    Files.copy(input, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    photo.setPath(f.getName());
                    photos.add(photo);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            streams.clear();
            //photos.clear();
            return true;
        }
        return false;
    }

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<String> getBackground() {
        return background;
    }
}

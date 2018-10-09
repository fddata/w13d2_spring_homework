package com.example.codeclan.FileHomework.components;

import com.example.codeclan.FileHomework.models.File;
import com.example.codeclan.FileHomework.models.Folder;
import com.example.codeclan.FileHomework.models.User;
import com.example.codeclan.FileHomework.repository.FileRepository;
import com.example.codeclan.FileHomework.repository.FolderRepository;
import com.example.codeclan.FileHomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Folder pictureFolder = new Folder("My Pictures");
        Folder documentsFolder = new Folder("My Documents");
        folderRepository.save(pictureFolder);
        folderRepository.save(documentsFolder);

        File pictureFile1 = new File("myImage", "bmp", 123,  pictureFolder);
        File pictureFile2 = new File("myImage2", "jpg", 223,  pictureFolder);
        File documentFile1 = new File("myCV", "doc", 223,  documentsFolder);
        File documentFile2 = new File("readme", "txt", 223,  documentsFolder);
        fileRepository.save(pictureFile1);
        fileRepository.save(pictureFile2);
        fileRepository.save(documentFile1);
        fileRepository.save(documentFile2);

        pictureFolder.addFile(pictureFile1);
        pictureFolder.addFile(pictureFile2);
        folderRepository.save(pictureFolder);
        folderRepository.save(documentsFolder);

        User user = new User("John Doe");
        user.addFolder(documentsFolder);
        user.addFolder(pictureFolder);
        userRepository.save(user);
    }
}

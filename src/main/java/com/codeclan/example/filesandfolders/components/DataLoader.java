package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.User;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import com.codeclan.example.filesandfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args){
        User emma = new User("Emma");
        userRepository.save(emma);

        Folder folder1 = new Folder("My_Stuff", emma);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Cool_Stuff", emma);
        folderRepository.save(folder2);

        File file1 = new File("dog_picture", ".jpg", 40, folder1);
        fileRepository.save(file1);

        File file2 = new File("dogs_picture", ".png", 60, folder1);
        fileRepository.save(file2);

        File file3 = new File("me_with_dog", ".jpg", 70, folder2);
        fileRepository.save(file3);





    }
}

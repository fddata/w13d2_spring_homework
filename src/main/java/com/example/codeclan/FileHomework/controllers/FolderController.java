package com.example.codeclan.FileHomework.controllers;

import com.example.codeclan.FileHomework.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/folders")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;
}

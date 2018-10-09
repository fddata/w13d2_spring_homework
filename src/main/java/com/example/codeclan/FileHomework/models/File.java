package com.example.codeclan.FileHomework.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class File {

    @Column(name = "name")
    private String name;

    @Column
    private String extension;
    private int size;
    private Folder folder;

}

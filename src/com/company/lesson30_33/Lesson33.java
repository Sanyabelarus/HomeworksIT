package com.company.lesson30_33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson33 {
    public static void main(String[] args) {
        List<String> directories = new ArrayList<>();
        List<String> files = new ArrayList<>();

        File [] roots = File.listRoots();
        Random random = new Random();
        File file = roots[random.nextInt(roots.length-1)];
        File [] filesAndDirs = file.listFiles();
        for (File a:filesAndDirs){
            if (a.isDirectory()){
                directories.add(a.getName());
            }
            if (a.isFile()){
                files.add(a.getName());
            }
        }
        System.out.println("Диск " + file+" содержит объекты:");
        System.out.println("Директории:\n"+directories);
        System.out.println("Файлы:\n"+files);

    }
}

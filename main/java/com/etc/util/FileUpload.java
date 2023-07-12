package com.etc.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/10/1 22:49
 * 文件上传工具类
 */
public class FileUpload {

    public static String saveFile(MultipartFile file) {

        if (file.getSize() > 0) {

            String newName = createName(file.getOriginalFilename());

            String path = "D:" + File.separator + "img" + File.separator + newName;

            try {
                file.transferTo(new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return newName;
        }
        return "上传失败！";
    }

    public static String createName(String name) {

        String suffix = name.substring(name.indexOf("."));

        int n = (int) (Math.random() * 10000 + 1);

        String newName = System.currentTimeMillis() + n + suffix;

        return newName;
    }
}

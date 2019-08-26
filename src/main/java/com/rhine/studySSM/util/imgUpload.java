package com.rhine.studySSM.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author lwep
 * @dareTime 2019/6/28 9:40
 */
public class imgUpload {

    /**
     * 图片上传
     * @param request
     * @param pictureFile
     * @return
     * @throws IOException
     */
    public static String upload(HttpServletRequest request,
                                MultipartFile pictureFile) throws IOException {
        String imgPath = null;//装配后的图片地址
        //上传图片
        if (pictureFile != null && !pictureFile.isEmpty()) {
            // 使用UUID给图片重命名，并去掉四个“-”
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            // 获取文件的扩展名
            String ext = FilenameUtils.getExtension(pictureFile
                    .getOriginalFilename());
            // 设置图片上传路径
            String url = request.getSession().getServletContext()
                    .getRealPath("/upload");
            // 检验文件夹是否存在
            isFolderExists(url);
            // 以绝对路径保存重名命后的图片
            pictureFile.transferTo(new File(url + "/" + name + "." + ext));
            // 装配图片地址
            imgPath = "upload/" + name + "." + ext;
        }
        return imgPath;
    }

    /**
     * 验证文件是否存在
     * @param strFolder
     * @return
     */
    public static boolean isFolderExists(String strFolder) {
        File file = new File(strFolder);

        if (!file.exists()) {
            if (file.mkdir()) {
                return true;
            } else {
                return false;
            }

        }
        System.out.println("-----------------文件上传路径：" + strFolder);
        return true;
    }

    /**
     * 获取目录下的所有文件
     * @param path
     * @return
     */

    public static List<File> getFileSort(String path) {
        List<File> list = getFiles(path, new ArrayList<File>());
        if (list != null && list.size() > 0) {
            Collections.sort(list, new Comparator<File>() {
                public int compare(File file, File newFile) {
                    if (file.lastModified() < newFile.lastModified()) {//降序<;升序>
                        return 1;
                    } else if (file.lastModified() == newFile.lastModified()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            });
        }
        return list;
    }


    public static List<File> getFiles(String realpath, List<File> files) {
        File realFile = new File(realpath);
        if (realFile.isDirectory()) {
            File[] subfiles = realFile.listFiles();
            for (File file : subfiles) {
                if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(), files);
                } else {
                    files.add(file);
                }
            }
        }
        return files;
    }

    /**
     * 上传文件时根据文件流生成哈希码用作全局唯一文件名
     * @param in
     * @return
     */
    public static String getHashFileName(InputStream in) {
        try {
            return DigestUtils.sha1Hex(in);
        } catch (IOException e) {
            throw new RuntimeException("根据文件流生成哈希码发生错误");
        }
    }

    public static String getFilenameSuffix(String fileName) {
        int index = fileName.lastIndexOf(".");
        return index > 0 && index < fileName.length() - 1 ? fileName.substring(index) : "";
    }
}

package com.smart.web.common;

import cn.hutool.core.date.DateUtil;
import sun.net.www.content.image.png;

import java.io.File;
import java.util.Date;

public class FileUtils {
    public static String ROOT_PATH = "D:\\work\\IdeaProjects\\small-film\\small-film\\src\\main\\webapp";
    public static String IMG_SAVE_PATH = "\\upload\\images";

    /**
     * @param oldName
     * @return
     */
    public static String getImageNewName(String oldName) {
//       时间戳+随机数  202102041034.png
        String dateStr = DateUtil.format(new Date(), "yyyyMMddHHmmss");
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        return String.format("%s%s", dateStr, suffix);
    }

    /**
     * 保存路径处理
     */
    public static String saveImagePath() {
        File file = new File(String.format("%s%s%s", ROOT_PATH, File.separator, DateUtil.format(new Date(), "yyyyMMdd")));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }



    public static void main(String[] args) {
        File file = new File(String.format("%s%s%s", ROOT_PATH, File.separator, DateUtil.format(new Date(), "yyyyMMdd")));
        System.out.println(file.getAbsoluteFile());
    }


}

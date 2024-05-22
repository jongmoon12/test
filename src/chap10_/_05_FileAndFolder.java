package chap10_;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "E:\\koreait\\java\\src\\chap10_";
        String folder = "src/chap10_";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsoluteFile());
        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }

    }
}

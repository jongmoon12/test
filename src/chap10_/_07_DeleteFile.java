package chap10_;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.text");
        if (file.delete()) {
            System.out.println("파일 삭제 성공 : " + file.getName());
        } else {
            System.out.println("파일 삭제 실패 : " + file.getName());
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }
        if (deleteFodler(folder)) {
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder.getAbsolutePath());
        }
    }

    // deleteFolder(A)
    //      deleteFolder(B)
    //          deleteFolder(C)
    //          C.delete() 삭제
    //      B.delete() 삭제
    // A.delete() 삭제
    public static boolean deleteFodler(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFodler(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}

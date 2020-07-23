package thumuc;

import java.io.File;


class FileThucThi extends File {

    public FileThucThi(String pathname) {
        super(pathname);
    }

    void mo() {
        System.out.println("\nFile thuc thi:  "+ getAbsolutePath());
    }
}
package ThuMuc;

import java.io.File;
import java.net.URI;

class FileThucThi extends File {

    public FileThucThi(String pathname) {
        super(pathname);
    }

    void mo() {
        System.out.println("\nFile thuc thi:  "+ getAbsolutePath());
    }
}
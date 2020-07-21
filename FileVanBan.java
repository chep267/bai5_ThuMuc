package ThuMuc;

import java.io.File;
import java.net.URI;

class FileVanBan extends File {


    public FileVanBan(String pathname) {
        super(pathname);
    }

    void mo() {
        System.out.println("\nFile van ban:  "+ getAbsolutePath());
    }
}



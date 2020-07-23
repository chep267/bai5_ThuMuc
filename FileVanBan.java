package thumuc;

import java.io.File;

class FileVanBan extends File {

    public FileVanBan(String pathname) {
        super(pathname);
    }

    void mo() {
        System.out.println("\nFile van ban:  "+ getAbsolutePath());
    }
}



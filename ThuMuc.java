package thumuc;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

class ThuMuc{

    public void mo(final File f) {

        // check xem fileOrDir la file hay foder
        if ( f.isDirectory() ) {
            // in ten folder ra man hinh
            System.out.println("\nThu muc:  " + f.getAbsolutePath());

            final File[] children = f.listFiles();
            if ( children == null ) {
                return;
            }

            // sắp xếp file theo thứ tự tăng dần
            Arrays.sort(children, new Comparator<File>() {
                public int compare(final File o1, final File o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (final File each : children) {
                // gọi lại hàm mo()
                mo(each);
            }

        } else {
            // in ten file ra man hinh
            if( f.getAbsolutePath().endsWith(".txt") || f.getAbsolutePath().endsWith(".pdf") || f.getAbsolutePath().endsWith(".docx") || f.getAbsolutePath().endsWith(".xls") || f.getAbsolutePath().endsWith(".doc")) {
                FileVanBan a = new FileVanBan(f.getName());
                a.mo();
            }
            else {
                FileThucThi b = new FileThucThi(f.getName());
                b.mo();
            }
        }
    }



}


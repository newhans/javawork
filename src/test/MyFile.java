package test;

import java.io.*;

public class MyFile {
    private File file;

    public MyFile(String filename){
        this.file = new File(filename);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void writefile(Teacher tea) throws Exception {
        FileOutputStream file_out = new FileOutputStream(file, true);
        if (file.length() == 0) {
            ObjectOutputStream out = new ObjectOutputStream(file_out);
            out.writeObject(tea);
            out.flush();
            out.close();
        } else {
            MyObjectOutputStream out = new MyObjectOutputStream(file_out);
            out.writeObject(tea);
            out.flush();
            out.close();
        }
    }



    public int readfile(Teacher[] tea) throws Exception {
        FileInputStream file_in = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(file_in);
        int tot = 0;
        try {
            for (Teacher tea_in; (tea_in = (Teacher) in.readObject()) != null;) {
                tea[tot++] = tea_in;
            }
        } catch (Exception ignore) {

        }
        return tot;
    }



}

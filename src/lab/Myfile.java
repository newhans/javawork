package lab;
import java.io.*;
public class Myfile {
    private File file;
    public Myfile(String filename){
        this.file = new File(filename);
    }
    public File getFile(){
        return this.file;
    }
    public void setFile(File file){
        this.file = file;
    }

    public void writefile(Course cou) throws Exception{
        /*
        *FileOutputStream(File file, booleanappend)
        * Creates a FileOutputStream object using the File object.
        *  If the second parameter is true, the bytes are written
        * to the end of the file, not to the beginning of the file.
        */
        FileOutputStream fos = new FileOutputStream(file,true);
        if(file.length() == 0){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cou);
            oos.flush();
            oos.close();
        }else{
            MyObjectOutputStream oos = new MyObjectOutputStream(fos);
            oos.writeObject(cou);
            oos.flush();
            oos.close();
        }
    }

    public int readfile(Course[] cou)throws Exception{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        int tot = 0;
        try{
            for(Course cou_in;(cou_in = (Course) ois.readObject()) != null;){
                cou[tot++] = cou_in;
            }
        } catch(Exception ignore){

        }
        return tot;
    }


    public void writefile(Student stu) throws Exception {
        FileOutputStream file_out = new FileOutputStream(file, true);
        if (file.length() == 0) {
            ObjectOutputStream out = new ObjectOutputStream(file_out);
            out.writeObject(stu);
            out.flush();
            out.close();
        } else {
            MyObjectOutputStream out = new MyObjectOutputStream(file_out);
            out.writeObject(stu);
            out.flush();
            out.close();
        }
    }

    public int readfile(Student[] stu) throws Exception {
        FileInputStream file_in = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(file_in);
        int tot = 0;
        try{
            for (Student stu_in; (stu_in = (Student) in.readObject()) != null;) {
                stu[tot++] = stu_in;
            }
        } catch (Exception ignore) {

        }
        return tot;
    }

    public void writefile(Person per) throws Exception {
        FileOutputStream file_out = new FileOutputStream(file, true);
        if (file.length() == 0) {
            ObjectOutputStream out = new ObjectOutputStream(file_out);
            out.writeObject(per);
            out.flush();
            out.close();
        } else {
            MyObjectOutputStream out = new MyObjectOutputStream(file_out);
            out.writeObject(per);
            out.flush();
            out.close();
        }
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

    public void writefile(Electivecourse ele) throws Exception {
        FileOutputStream file_out = new FileOutputStream(file, true);
        if (file.length() == 0) {
            ObjectOutputStream out = new ObjectOutputStream(file_out);
            out.writeObject(ele);
            out.flush();
            out.close();
        } else {
            MyObjectOutputStream out = new MyObjectOutputStream(file_out);
            out.writeObject(ele);
            out.flush();
            out.close();
        }
    }

    public void writefile(Schedule sch) throws Exception {
        FileOutputStream file_out = new FileOutputStream(file, true);
        if (file.length() == 0) {
            ObjectOutputStream out = new ObjectOutputStream(file_out);
            out.writeObject(sch);
            out.flush();
            out.close();
        } else {
            MyObjectOutputStream out = new MyObjectOutputStream(file_out);
            out.writeObject(sch);
            out.flush();
            out.close();
        }
    }

    public int readfile(Person[] per) throws Exception {
        FileInputStream file_in = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(file_in);
        int tot = 0;
        try {
            for (Person per_in; (per_in = (Person) in.readObject()) != null;) {
                per[tot++] = per_in;
            }
        } catch (Exception ignore) {

        }
        return tot;
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

    public int readfile(Schedule[] sch) throws Exception {
        FileInputStream file_in = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(file_in);
        int tot = 0;
        try {
            for (Schedule sch_in; (sch_in = (Schedule) in.readObject()) != null;) {
                sch[tot++] = sch_in;
            }
        } catch (Exception ignore) {

        }
        return tot;
    }

    public int readfile(Electivecourse[] ele) throws Exception {
        FileInputStream file_in = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(file_in);
        int tot = 0;
        try {
            for (Electivecourse ele_in; (ele_in = (Electivecourse) in.readObject()) != null;) {
                ele[tot++] = ele_in;
            }
        } catch (Exception ignore) {

        }
        return tot;
    }


}

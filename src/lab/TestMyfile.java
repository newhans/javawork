package lab;

public class TestMyfile {
    public static void  main(String[] args) throws Exception {
       Myfile TestMyfile_cou = new Myfile("Course.dat");
        Course cou = new Course("java", "123", 8);
        Course cou1 = new Course("chinese","1222",0);
        Course cou2 = new Course("ENglish","3333",1);
        TestMyfile_cou.writefile(cou);
        TestMyfile_cou.writefile(cou1);
        TestMyfile_cou.writefile(cou2);
        Course[] cou_list = new Course[100];
        int tot = TestMyfile_cou.readfile(cou_list);
        for(int i=1;i<=tot;i++){
            cou_list[i-1].display();
        }

        Myfile MyFileTest_stu = new Myfile("student.dat");
        Student stu = new Student("2018091615014", "newhans", "nan", 19, "cs");
        MyFileTest_stu.writefile(stu);
        //MyFileTest_stu.writefile((Student) null);
        Student[] stu_list = new Student[100];
        tot = MyFileTest_stu.readfile(stu_list);
        for (int i = 1; i <= tot ;i++) {
            stu_list[i - 1].display();
        }


        Myfile MyFileTest_tea = new Myfile("teacher.dat");
        Teacher tea = new Teacher("0000", "cz", "nan", 40, "professor");
        Teacher tea1 = new Teacher("0001","ss","boy",33,"professor");
        MyFileTest_tea.writefile(tea);
        MyFileTest_tea.writefile(tea1);
        //MyFileTest_tea.writefile((Teacher) null);
        Teacher[] tea_list = new Teacher[100];
        tot = MyFileTest_tea.readfile(tea_list);
        for (int i = 1; i <= tot; i++) {
            tea_list[i - 1].display();
        }
    }
}

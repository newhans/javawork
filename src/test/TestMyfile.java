package test;

public class TestMyfile {

        public static void main(String[] args) throws Exception {
            MyFile MyFileTest_tea = new MyFile("teacher.dat");
            Teacher tea = new Teacher("0000", "cz", "nan", 40, "professor");
            Teacher tea1 = new Teacher("0001", "ss", "boy", 33, "professor");
            MyFileTest_tea.writefile(tea);
            MyFileTest_tea.writefile(tea1);
            //MyFileTest_tea.writefile((Teacher) null);
            Teacher[] tea_list = new Teacher[100];
            int tot = MyFileTest_tea.readfile(tea_list);
            for (int i = 1; i <= tot; i++) {
                tea_list[i - 1].display();
            }
        }
    }



package lab;
import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl;
import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.KeyPair;

public class GUI {
    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Students'Courses Management System");
        frame.setSize(550,690);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JButton addStudent = new JButton("Add Student");
        addStudent.setBounds(0,0,550,110);
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("already done");

                JFrame addStudentFrame = new JFrame("Add Student");
                addStudentFrame.setSize(550,690);
                addStudentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel addStudentPanel = new JPanel();
                addStudentFrame.add(addStudentPanel);

                addStudentComponents(addStudentPanel);


                addStudentFrame.setVisible(true);

                JButton addStudnet_Last = new JButton("Go back to last page");
                addStudnet_Last.setBounds(0,550,550,110);
                addStudnet_Last.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("GO back!");
                        addStudentFrame.setVisible(false);
                    }
                });
                addStudentPanel.add(addStudnet_Last);
            }
        });
        panel.add(addStudent);

        JButton addTeacher = new JButton("Add Teacher");
        addTeacher.setBounds(0,110,550,110);
        addTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Teacher done");

                JFrame addTeacherFrame = new JFrame("Add Teacher");
                addTeacherFrame.setSize(550,690);
                addTeacherFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel addTeacherPanel = new JPanel();
                addTeacherFrame.add(addTeacherPanel);

                addTeacherComponents(addTeacherPanel);

                addTeacherFrame.setVisible(true);

                JButton addTeacher_Last = new JButton("Go back to last page");
                addTeacher_Last.setBounds(0,550,550,110);
                addTeacher_Last.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("GO back!");
                        addTeacherFrame.setVisible(false);
                    }
                });
                addTeacherPanel.add(addTeacher_Last);

            }
        });
        panel.add(addTeacher);

        JButton addCourse = new JButton("Add Course");
        addCourse.setBounds(0,220,550,110);
        addCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Course done");

                JFrame addCourseFrame = new JFrame("Add Course");
                addCourseFrame.setSize(550,690);
                addCourseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel addCoursePanel = new JPanel();
                addCourseFrame.add(addCoursePanel);

                addCourseComponents(addCoursePanel);

                addCourseFrame.setVisible(true);
                JButton addCourse_Last = new JButton("Go back to last page");
                addCourse_Last.setBounds(0,550,550,110);
                addCourse_Last.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("GO back!");
                        addCourseFrame.setVisible(false);
                    }
                });
                addCoursePanel.add(addCourse_Last);

            }
        });
        panel.add(addCourse);

        JButton addSchedule = new JButton("Add Schedule");
        addSchedule.setBounds(0,330,550,110);
        addSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Schedule done");

                JFrame addScheduleFrame = new JFrame("Add schedule");
                addScheduleFrame.setSize(550,690);
                addScheduleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel addSchedulePanel = new JPanel();
                addScheduleFrame.add(addSchedulePanel);

                addScheduleComponents(addSchedulePanel);

                addScheduleFrame.setVisible(true);
                JButton addSchedule_Last = new JButton("Go back to last page");
                addSchedule_Last.setBounds(0,550,550,110);
                addSchedule_Last.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("GO back!");
                        addScheduleFrame.setVisible(false);
                    }
                });
                addSchedulePanel.add(addSchedule_Last);

            }
        });
        panel.add(addSchedule);

        JButton addElectivecourse = new JButton("Add Electivecourse");
        addElectivecourse.setBounds(0,440,550,110);
        addElectivecourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ele done");

                JFrame addElectivecourseFrame = new JFrame("Add Electivecourse");
                addElectivecourseFrame.setSize(550,690);
                addElectivecourseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel addElectivecoursePanel = new JPanel();
                addElectivecourseFrame.add(addElectivecoursePanel);

                addElectivecourseComponents(addElectivecoursePanel);

                addElectivecourseFrame.setVisible(true);
                JButton addElectivecourse_Last = new JButton("Go back to last page");
                addElectivecourse_Last.setBounds(0,550,550,110);
                addElectivecourse_Last.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("GO back!");
                        addElectivecourseFrame.setVisible(false);
                    }
                });
                addElectivecoursePanel.add(addElectivecourse_Last);
            }
        });
        panel.add(addElectivecourse);

        JButton searchStudent = new JButton("Search student's class");
        searchStudent.setBounds(0,550,550,110);
        searchStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("search done");

                JFrame SearchStudentFrame = new JFrame("Search Student's Class");
                SearchStudentFrame.setSize(550,690);
                SearchStudentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel SearchStudentPanel = new JPanel();
                SearchStudentFrame.add(SearchStudentPanel);

                SearchStudentComponments(SearchStudentPanel);

                SearchStudentFrame.setVisible(true);
                JButton sout = new JButton("Go back to last page");
                sout.setBounds(0,550,550,110);
                SearchStudentPanel.add(sout);
                sout.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SearchStudentFrame.setVisible(false);
                    }
                });
            }
        });
        panel.add(searchStudent);
    }

    private static void addStudentComponents(JPanel addStudentPanel){
        addStudentPanel.setLayout(null);

        JButton addStudent_SetName = new JButton("Student's name");
        addStudent_SetName.setBounds(75,50,150,60);
        JTextField addStudent_InputName = new JTextField(20);
        addStudent_InputName.setBounds(325,50,150,60);
        addStudentPanel.add(addStudent_InputName);
        addStudentPanel.add(addStudent_SetName);

        JButton addStudent_SetId = new JButton("Student's id");
        addStudent_SetId.setBounds(75,120,150,60);
        JTextField addStudent_InputId = new JTextField(20);
        addStudent_InputId.setBounds(325,120,150,60);
        addStudentPanel.add(addStudent_InputId);
        addStudentPanel.add(addStudent_SetId);

        JButton addStudent_SetAge = new JButton("Student's age");
        addStudent_SetAge.setBounds(75,190,150,60);
        JTextField addStudent_InputAge = new JTextField(20);
        addStudent_InputAge.setBounds(325,190,150,60);
        addStudentPanel.add(addStudent_InputAge);
        addStudentPanel.add(addStudent_SetAge);

        JButton addStudent_SetSex = new JButton("Student's sex");
        addStudent_SetSex.setBounds(75,260,150,60);
        JTextField addStudent_InputSex = new JTextField(20);
        addStudent_InputSex.setBounds(325,260,150,60);
        addStudentPanel.add(addStudent_InputSex);
        addStudentPanel.add(addStudent_SetSex);

        JButton addStudent_SetMajor = new JButton("Student's major");
        addStudent_SetMajor.setBounds(75,330,150,60);
        JTextField addStudent_InputMajor = new JTextField(20);
        addStudent_InputMajor.setBounds(325,330,150,60);
        addStudentPanel.add(addStudent_InputMajor);
        addStudentPanel.add(addStudent_SetMajor);

        JButton addStudent_Next = new JButton("confirm!");
        addStudent_Next.setBounds(0,440,550,110);
        addStudent_Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click to next");
                String sid = addStudent_InputId.getText().trim();
                String name = addStudent_InputName.getText().trim();
                String sex = addStudent_InputSex.getText().trim();
                int age = Integer.parseInt(addStudent_InputAge.getText().trim());
                String major = addStudent_InputMajor.getText().trim();

                Student addStudent = new Student(sid,name,sex,age,major);

                Myfile input = new Myfile("student.dat");
                try{
                    input.writefile(addStudent);
                }catch(Exception e2){
                    e2.printStackTrace();
                }
            }
            
        });
        addStudentPanel.add(addStudent_Next);
/*
        JButton addStudnet_Last = new JButton("Go back to last page");
        addStudnet_Last.setBounds(0,550,550,110);
        addStudnet_Last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("GO back!");
            }
        });
        addStudentPanel.add(addStudnet_Last);*/


    }

    private static void addTeacherComponents(JPanel addTeacherPanel){
        addTeacherPanel.setLayout(null);
        JButton addTeacher_SetName = new JButton("Teacher's name");
        addTeacher_SetName.setBounds(75,50,150,60);
        JTextField addTeacher_InputName = new JTextField(20);
        addTeacher_InputName.setBounds(325,50,150,60);
        addTeacherPanel.add(addTeacher_InputName);
        addTeacherPanel.add(addTeacher_SetName);

        JButton addTeacher_SetId = new JButton("Teacher's id");
        addTeacher_SetId.setBounds(75,120,150,60);
        JTextField addTeacher_InputId = new JTextField(20);
        addTeacher_InputId.setBounds(325,120,150,60);
        addTeacherPanel.add(addTeacher_InputId);
        addTeacherPanel.add(addTeacher_SetId);

        JButton addTeacher_SetAge = new JButton("Teacher's age");
        addTeacher_SetAge.setBounds(75,190,150,60);
        JTextField addTeacher_InputAge = new JTextField(20);
        addTeacher_InputAge.setBounds(325,190,150,60);
        addTeacherPanel.add(addTeacher_InputAge);
        addTeacherPanel.add(addTeacher_SetAge);

        JButton addTeacher_SetSex = new JButton("Teacher's sex");
        addTeacher_SetSex.setBounds(75,260,150,60);
        JTextField addTeacher_InputSex = new JTextField(20);
        addTeacher_InputSex.setBounds(325,260,150,60);
        addTeacherPanel.add(addTeacher_InputSex);
        addTeacherPanel.add(addTeacher_SetSex);

        JButton addTeacher_SetTitle = new JButton("Teacher's title");
        addTeacher_SetTitle.setBounds(75,330,150,60);
        JTextField addTeacher_InputTitle = new JTextField(20);
        addTeacher_InputTitle.setBounds(325,330,150,60);
        addTeacherPanel.add(addTeacher_InputTitle);
        addTeacherPanel.add(addTeacher_SetTitle);

        JButton addTeacher_Next = new JButton("confirm!");
        addTeacher_Next.setBounds(0,440,550,110);
        addTeacher_Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click to next");
                String tid = addTeacher_InputId.getText().trim();
                String name = addTeacher_InputName.getText().trim();
                String sex = addTeacher_InputSex.getText().trim();
                int age = Integer.parseInt(addTeacher_InputAge.getText().trim());
                String title = addTeacher_InputTitle.getText().trim();
                Teacher addTeacher = new Teacher(tid,name,sex,age,title);
                Myfile input = new Myfile("teacher.dat");
                try{
                    input.writefile(addTeacher);
                }catch(Exception e2){
                    e2.printStackTrace();
                }

            }
        });
        addTeacherPanel.add(addTeacher_Next);

        /*JButton addTeacher_Last = new JButton("Go back to last page");
        addTeacher_Last.setBounds(0,550,550,110);
        addTeacher_Last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("GO back!");
            }
        });
        addTeacherPanel.add(addTeacher_Last);*/
    }

    private static void addCourseComponents(JPanel addCoursePanel){
        addCoursePanel.setLayout(null);

        JButton addCourse_SetName = new JButton("Course's name");
        addCourse_SetName.setBounds(75,150,150,60);
        JTextField addCourse_InputName = new JTextField(20);
        addCourse_InputName.setBounds(325,150,150,60);
        addCoursePanel.add(addCourse_InputName);
        addCoursePanel.add(addCourse_SetName);

        JButton addCourse_SetId = new JButton("Course's id");
        addCourse_SetId.setBounds(75,220,150,60);
        JTextField addCourse_InputId = new JTextField(20);
        addCourse_InputId.setBounds(325,220,150,60);
        addCoursePanel.add(addCourse_InputId);
        addCoursePanel.add(addCourse_SetId);

        JButton addCourse_SetHour = new JButton("Course's hour");
        addCourse_SetHour.setBounds(75,290,150,60);
        JTextField addCourse_InputHour = new JTextField(20);
        addCourse_InputHour.setBounds(325,290,150,60);
        addCoursePanel.add(addCourse_InputHour);
        addCoursePanel.add(addCourse_SetHour);

        JButton addCourse_Next = new JButton("confirm!");
        addCourse_Next.setBounds(0,440,550,110);
        addCourse_Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click to next");
                String cname = addCourse_InputName.getText().trim();
                String cid = addCourse_InputId.getText().trim();
                int chour = Integer.parseInt(addCourse_InputHour.getText().trim());
                Course addCourse = new Course(cname,cid,chour);
                Myfile input = new Myfile("course.dat");
                try{
                    input.writefile(addCourse);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        addCoursePanel.add(addCourse_Next);

        /*JButton addCourse_Last = new JButton("Go back to last page");
        addCourse_Last.setBounds(0,550,550,110);
        addCourse_Last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("GO back!");
            }
        });
        addCoursePanel.add(addCourse_Last);*/
    }

    private static void addScheduleComponents(JPanel addSchedulePanel){
        addSchedulePanel.setLayout(null);

        JButton addSchedule_ClassId = new JButton("Class ID");
        addSchedule_ClassId.setBounds(75,50,150,60);
        JTextField addSchedule_InputClassId = new JTextField(20);
        addSchedule_InputClassId.setBounds(325,50,150,60);
        addSchedulePanel.add(addSchedule_InputClassId);
        addSchedulePanel.add(addSchedule_ClassId);

        JButton addSchedule_CourseId = new JButton("Course ID");
        addSchedule_CourseId.setBounds(75,120,150,60);
        JTextField addSchedule_InputCourseId = new JTextField(20);
        addSchedule_InputCourseId.setBounds(325,120,150,60);
        addSchedulePanel.add(addSchedule_InputCourseId);
        addSchedulePanel.add(addSchedule_CourseId);

        JButton addTeacher_Id = new JButton("Teacher ID");
        addTeacher_Id.setBounds(75,190,150,60);
        JTextField addTeacher_InputId = new JTextField(20);
        addTeacher_InputId.setBounds(325,190,150,60);
        addSchedulePanel.add(addTeacher_Id);
        addSchedulePanel.add(addTeacher_InputId);

        JButton addClassroom = new JButton("Classroom");
        addClassroom.setBounds(75,260,150,60);
        JTextField add_InputClassroom = new JTextField(20);
        add_InputClassroom.setBounds(325,260,150,60);
        addSchedulePanel.add(add_InputClassroom);
        addSchedulePanel.add(addClassroom);

        JButton addSchedule_Next = new JButton("confirm!");
        addSchedule_Next.setBounds(0,440,550,110);
        addSchedule_Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click to next");
                String classid = addSchedule_InputClassId.getText().trim();
                String cid = addSchedule_InputCourseId.getText().trim();
                String tid = addTeacher_InputId.getText().trim();
                String classroom = add_InputClassroom.getText().trim();
                Schedule addSchedule = new Schedule(classid,cid,tid,classroom);
                Myfile input = new Myfile("schedule.dat");
                try {
                    input.writefile(addSchedule);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        addSchedulePanel.add(addSchedule_Next);

        /*JButton addSchedule_Last = new JButton("Go back to last page");
        addSchedule_Last.setBounds(0,550,550,110);
        addSchedule_Last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("GO back!");
            }
        });
        addSchedulePanel.add(addSchedule_Last);
*/
    }

    private static void addElectivecourseComponents(JPanel addElectivecoursePanel){
        addElectivecoursePanel.setLayout(null);

        JButton addElectiveCourse_SetName = new JButton("Elective's ID");
        addElectiveCourse_SetName.setBounds(75,150,150,60);
        JTextField addElectiveCourse_InputName = new JTextField(20);
        addElectiveCourse_InputName.setBounds(325,150,150,60);
        addElectivecoursePanel.add(addElectiveCourse_InputName);
        addElectivecoursePanel.add(addElectiveCourse_SetName);

        JButton addStudent_SetId = new JButton("Student's ID");
        addStudent_SetId.setBounds(75,220,150,60);
        JTextField addStudent_InputId = new JTextField(20);
        addStudent_InputId.setBounds(325,220,150,60);
        addElectivecoursePanel.add(addStudent_InputId);
        addElectivecoursePanel.add(addStudent_SetId);

        JButton addClass = new JButton("Class ID");
        addClass.setBounds(75,290,150,60);
        JTextField InputClass = new JTextField(20);
        InputClass.setBounds(325,290,150,60);
        addElectivecoursePanel.add(InputClass);
        addElectivecoursePanel.add(addClass);

        JButton addElectivecourse_Next = new JButton("confirm!");
        addElectivecourse_Next.setBounds(0,440,550,110);
        addElectivecourse_Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click to next");
                String elid = addElectiveCourse_InputName.getText().trim();
                String sid = addStudent_InputId.getText().trim();
                String classid = InputClass.getText().trim();
                Electivecourse addElectivecourse = new Electivecourse(elid,sid,classid);
                Myfile input = new Myfile("electivecourse.dat");
                try{
                    input.writefile(addElectivecourse);
                }catch(Exception ex){
                    ex.printStackTrace();
                }

            }
        });
        addElectivecoursePanel.add(addElectivecourse_Next);

        /*JButton addElectivecourse_Last = new JButton("Go back to last page");
        addElectivecourse_Last.setBounds(0,550,550,110);
        addElectivecourse_Last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("GO back!");
            }
        });
        addElectivecoursePanel.add(addElectivecourse_Last);*/

    }

    private static void SearchStudentComponments(JPanel SearchStudentPanel){
        SearchStudentPanel.setLayout(null);

        JButton SearchId = new JButton("Student's ID");
        SearchId.setBounds(75,240,150,60);
        JTextField InputSearchId = new JTextField(20);
        InputSearchId.setBounds(325,240,150,60);
        SearchStudentPanel.add(InputSearchId);
        SearchStudentPanel.add(SearchId);

        JButton SearchStudent_Next = new JButton("confirm!");
        SearchStudent_Next.setBounds(0,440,550,110);
        SearchStudentPanel.add(SearchStudent_Next);
       /* JButton sout = new JButton("exit");
        sout.setBounds(0,550,550,110);
        SearchStudentPanel.add(sout);
        sout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });*/

        SearchStudent_Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click to next");
                JFrame addSearchFrame = new JFrame("Search");
                addSearchFrame.setSize(550,690);
                addSearchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                //JPanel addSearchPanel = new JPanel();
               // addSearchFrame.add(addSearchPanel);


                String sid = InputSearchId.getText().trim();
                Myfile readStudent = new Myfile("student.dat");
                Student[] studentList = new Student[100];
                int studentTot = 0;
                try {
                    studentTot = readStudent.readfile(studentList);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                boolean flag = false;
                for (int i = 0; i < studentTot; i++) {
                    if (studentList[i].getSid().equals(sid)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    boolean find = true;
                    int findTot = 0;
                    SearchStudent[] findId = new SearchStudent[100];
                    //you know, the elective courses is all the courses which you can choose from.
                    Myfile readElective = new Myfile("electivecourse.dat");
                    Electivecourse[] eleList = new Electivecourse[100];
                    int eleTot = 0;
                    try {
                        eleTot = readElective.readfile(eleList);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    for (int i = 0; i < eleTot; i++) {
                        if (eleList[i].getSid().equals(sid)) {
                            findId[findTot] = new SearchStudent();
                            findId[findTot].setClassId(eleList[i].getClassid());
                            findTot++;
                        }
                    }

                    Myfile readSchedule = new Myfile("schedule.dat");
                    Schedule[] scheduleList = new Schedule[100];
                    int scheduleTot = 0;
                    try {
                        scheduleTot = readSchedule.readfile(scheduleList);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    for (int i = 0; i < scheduleTot; i++) {
                        for (int j = 0; j < findTot; j++) {
                            if (scheduleList[i].getClassid().equals(findId[j].getClassId())) {
                                findId[j].setClassroom(scheduleList[i].getClassroom());
                                findId[j].setCourseId(scheduleList[i].getCid());
                                findId[j].setTeacherId(scheduleList[i].getTid());
                            }
                        }
                    }

                    Myfile readCourse = new Myfile("course.dat");
                    Course[] courseList = new Course[100];
                    int couTot = 0;
                    try {
                        couTot = readCourse.readfile(courseList);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    for (int i = 0; i < couTot; i++) {
                        for (int j = 0; j < findTot; j++) {
                            if (courseList[i].getCid().equals(findId[j].getCourseId())) {
                                findId[j].setCourseName(courseList[i].getCname());
                                findId[j].setChour(courseList[i].getChour());
                            }
                        }
                    }

                    Myfile readTeacher = new Myfile("teacher.dat");
                    Teacher[] teacherList = new Teacher[100];
                    int teacherTot = 0;
                    try {
                        teacherTot = readTeacher.readfile(teacherList);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    for (int i = 0; i < teacherTot; i++) {
                        for (int j = 0; j < findTot; j++) {
                            if (teacherList[i].getTid().equals(findId[j].getTeacherId())) {
                                findId[j].setTeacherName(teacherList[i].getName());
                            }
                        }
                    }
                    if (findTot == 0) {
                        JOptionPane.showMessageDialog(null, "no information");
                    } else {
                            addSearchFrame.setVisible(true);
                            JLabel student_id = new JLabel(sid);
                            JPanel info = new JPanel(new GridLayout(findTot * 5 + 2,2));
                            JLabel cou_name = new JLabel("the course's name is:");
                            JLabel tea_name = new JLabel("the teacher's name is:");
                            JLabel class_name = new JLabel("the class room is:");
                                for (int i = 0;i < findTot; i++) {
                                    info.add(new Label("" + (i + 1) + "."));
                                    info.add(new Label("course info is:"));
                                    info.add(new Label("---"));
                                    info.add(new Label("---"));
                                    info.add(new Label("the course name is:"));
                                    info.add(new Label(findId[i].getCourseName()));
                                    info.add(new Label("the teacher name is:"));
                                    info.add(new Label((findId[i].getTeacherName())));
                                    info.add(new Label("the classroom is:"));
                                    info.add(new Label(findId[i].getClassroom()));
                                }
                                info.add(new Label("If the query is completed, please click the close button in the upper right corner to return to the previous level"));
                                info.add(new Label(("lose button in the upper right corner to ")));
                                info.add(new Label("return to the previous page"));
                                addSearchFrame.add(info);

                                addSearchFrame.setVisible(true);

                    }

                } else{
                     JOptionPane.showMessageDialog(null, "The student does not exist");
                }

            }

        });




    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}


package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 * My main App. 
 * <p>
 This executes everything.
 
 *	Submitted by:	Taimoor Bin Khalid
 * 	Class:			BSCS-4C
 *	Regn No:		32163
 *
**/

public class App {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        CloDao clodao = new CloDao();
        Clo clo = new Clo();
        
        CourseDao coursedao = new CourseDao();
        Course course = new Course();
        
        TeacherDao teacherdao = new TeacherDao();
        Teacher teacher = new Teacher();
        
        StudentDao studentdao = new StudentDao();
        Student student = new Student();
        
        ContentDao contentdao = new ContentDao();
        Content content = new Content();
        
        GradeDao gradedao = new GradeDao();
        Grade grade = new Grade();
        
        // Main Menu
        while(true) {
	        System.out.print("Please select one of the options:\n");
	        System.out.print("01. Add/Update CLO\n");
	        System.out.print("02. Add/Update Course\n");
	        System.out.print("03. Add/Update Teacher\n");
	        System.out.print("04. Add/Update Student\n");
	        System.out.print("05. Add/Update Content\n");
	        System.out.print("06. Add/Update Grade\n");
	        System.out.print("07. Delete CLO\n");
	        System.out.print("08. Delete Course\n");
	        System.out.print("09. Delete Teacher\n");
	        System.out.print("10. Delete Student\n");
	        System.out.print("11. Delete Content\n");
	        System.out.print("12. Delete Grade\n");
	        System.out.print("13. Display CLO\n");
	        System.out.print("14. Display Course\n");
	        System.out.print("15. Display Teacher\n");
	        System.out.print("16. Display Student\n");
	        System.out.print("17. Display Content\n");
	        System.out.print("18. Display Grade\n");
	        System.out.print("19. Exit\n");
	        
	        int userChoice = input.nextInt();
	        
	        if(userChoice == 1) {
	        	System.out.print("Please enter CLO name: ");
	            String userCLO = input.nextLine();
	            clo.setName(userCLO);
	            System.out.print("Please enter description of CLO: ");
	            String userDescription = input.nextLine();
	            clo.setDescription(userDescription);
	            System.out.print("Please enter PLO: ");
	            String userPLO = input.nextLine();
	            clo.setPlo(userPLO);
	            
	            while(true) {
		            System.out.print("Do you want to add this or update?\n");
			        System.out.print("1. Add\n");
			        System.out.print("2. Update\n");
			        
			        int userChoice2 = input.nextInt();
			        
			        if(userChoice2 == 1) {
			        	clodao.addClo(clo);
			        	System.out.print("Record added.\n");
			        	break;
			        } else if (userChoice2 == 2) {
			        	clodao.updateClo(clo);
			        	System.out.print("Record updated.\n");
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	            
	        } else if (userChoice == 2) {
	            System.out.print("Please enter class title: ");
	            String userCourse = input.nextLine();
	            course.setClasstitle(userCourse);
	            System.out.print("Please enter number of credit hours: ");
	            int userCH = input.nextInt();
	            course.setCreditHours(userCH);
	        	
	            while(true) {
		            System.out.print("Do you want to add this or update?\n");
			        System.out.print("1. Add\n");
			        System.out.print("2. Update\n");
			        
			        int userChoice2 = input.nextInt();
			        
			        if(userChoice2 == 1) {
			        	coursedao.addCourse(course);
			        	System.out.print("Record added.\n");
			        	break;
			        } else if (userChoice2 == 2) {
			        	coursedao.updateCourse(course);
			        	System.out.print("Record updated.\n");
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 3) {
	            System.out.print("Please enter teacher's name: ");
	            String userName = input.nextLine();
	            teacher.setName(userName);
	            
	            while(true) {
		            System.out.print("Do you want to add this or update?\n");
			        System.out.print("1. Add\n");
			        System.out.print("2. Update\n");
			        
			        int userChoice2 = input.nextInt();
			        
			        if(userChoice2 == 1) {
			        	teacherdao.addTeacher(teacher);
			        	System.out.print("Record added.\n");
			        	break;
			        } else if (userChoice2 == 2) {
			        	teacherdao.updateTeacher(teacher);
			        	System.out.print("Record updated.\n");
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 4) {
	            System.out.print("Please enter student's name: ");
	            String userName2 = input.nextLine();
	            student.setName(userName2);
	            
	            while(true) {
		            System.out.print("Do you want to add this or update?\n");
			        System.out.print("1. Add\n");
			        System.out.print("2. Update\n");
			        
			        int userChoice2 = input.nextInt();
			        
			        if(userChoice2 == 1) {
			        	studentdao.addStudent(student);
			        	System.out.print("Record added.\n");
			        	break;
			        } else if (userChoice2 == 2) {
			        	studentdao.updateStudent(student);
			        	System.out.print("Record updated.\n");
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 5) {
	            System.out.print("Please enter content title: ");
	            String userContentTitle = input.nextLine();
	            content.setTitle(userContentTitle);
	            System.out.print("Please enter description of content: ");
	            String userDescription2 = input.nextLine();
	            content.setDescription(userDescription2);
	        	
	            while(true) {
		            System.out.print("Do you want to add this or update?\n");
			        System.out.print("1. Add\n");
			        System.out.print("2. Update\n");
			        
			        int userChoice2 = input.nextInt();
			        
			        if(userChoice2 == 1) {
			        	contentdao.addContent(content);
			        	System.out.print("Record added.\n");
			        	break;
			        } else if (userChoice2 == 2) {
			        	contentdao.updateContent(content);
			        	System.out.print("Record updated.\n");
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 6) {
	            System.out.print("Please enter grade name: ");
	            String userName3 = input.nextLine();
	            grade.setName(userName3);
	            System.out.print("Please enter grade score: ");
	            int userScore = input.nextInt();
	            grade.setScore(userScore);
	        	
	            while(true) {
		            System.out.print("Do you want to add this or update?\n");
			        System.out.print("1. Add\n");
			        System.out.print("2. Update\n");
			        
			        int userChoice2 = input.nextInt();
			        
			        if(userChoice2 == 1) {
			        	gradedao.addGrade(grade);
			        	System.out.print("Record added.\n");
			        	break;
			        } else if (userChoice2 == 2) {
			        	gradedao.updateGrade(grade);
			        	System.out.print("Record updated.\n");
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 7) {
	            System.out.print("Please enter the ID of CLO you want to delete: ");
	            int userChoice3 = input.nextInt();
	            clodao.deleteClo(userChoice3);
	            System.out.print("Record deleted.\n");
	        } else if (userChoice == 8) {
	            System.out.print("Please enter the ID of course you want to delete: ");
	            int userChoice3 = input.nextInt();
	            coursedao.deleteCourse(userChoice3);
	            System.out.print("Record deleted.\n");
	        } else if (userChoice == 9) {
	            System.out.print("Please enter the ID of teacher you want to delete: ");
	            int userChoice3 = input.nextInt();
	            teacherdao.deleteTeacher(userChoice3);
	            System.out.print("Record deleted.\n");
	        } else if (userChoice == 10) {
	            System.out.print("Please enter the ID of student you want to delete: ");
	            int userChoice3 = input.nextInt();
	            studentdao.deleteStudent(userChoice3);
	            System.out.print("Record deleted.\n");
	        } else if (userChoice == 11) {
	            System.out.print("Please enter the ID of content you want to delete: ");
	            int userChoice3 = input.nextInt();
	            contentdao.deleteContent(userChoice3);
	            System.out.print("Record deleted.\n");
	        } else if (userChoice == 12) {
	            System.out.print("Please enter the ID of grade you want to delete: ");
	            int userChoice3 = input.nextInt();
	            gradedao.deleteGrade(userChoice3);
	            System.out.print("Record deleted.\n");
	        } else if (userChoice == 13) {
	        	while(true) {
	        		System.out.print("Do you want to display all or one specific record?\n");
			        System.out.print("1. All\n");
			        System.out.print("2. One\n");
			        
			        int userChoice3 = input.nextInt();
			        
			        if(userChoice3 == 1) {
			        	for (Clo iter : clodao.getAllClos()) {
			                System.out.println(iter);
			            }
			        	break;
			        } else if (userChoice3 == 2) {
			        	System.out.print("Please enter the ID of CLO you want to display: ");
			            int userChoice4 = input.nextInt();
			        	System.out.println(clodao.getCloById(userChoice4));
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 14) {
	        	while(true) {
	        		System.out.print("Do you want to display all or one specific record?\n");
			        System.out.print("1. All\n");
			        System.out.print("2. One\n");
			        
			        int userChoice3 = input.nextInt();
			        
			        if(userChoice3 == 1) {
			        	for (Course iter : coursedao.getAllCourses()) {
			                System.out.println(iter);
			            }
			        	break;
			        } else if (userChoice3 == 2) {
			        	System.out.print("Please enter the ID of course you want to display: ");
			            int userChoice4 = input.nextInt();
			        	System.out.println(coursedao.getCourseById(userChoice4));
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 15) {
	        	while(true) {
	        		System.out.print("Do you want to display all or one specific record?\n");
			        System.out.print("1. All\n");
			        System.out.print("2. One\n");
			        
			        int userChoice3 = input.nextInt();
			        
			        if(userChoice3 == 1) {
			        	for (Teacher iter : teacherdao.getAllTeachers()) {
			                System.out.println(iter);
			            }
			        	break;
			        } else if (userChoice3 == 2) {
			        	System.out.print("Please enter the ID of teacher you want to display: ");
			            int userChoice4 = input.nextInt();
			        	System.out.println(teacherdao.getTeacherById(userChoice4));
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 16) {
	        	while(true) {
	        		System.out.print("Do you want to display all or one specific record?\n");
			        System.out.print("1. All\n");
			        System.out.print("2. One\n");
			        
			        int userChoice3 = input.nextInt();
			        
			        if(userChoice3 == 1) {
			        	for (Student iter : studentdao.getAllStudents()) {
			                System.out.println(iter);
			            }
			        	break;
			        } else if (userChoice3 == 2) {
			        	System.out.print("Please enter the ID of student you want to display: ");
			            int userChoice4 = input.nextInt();
			        	System.out.println(studentdao.getStudentById(userChoice4));
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 17) {
	        	while(true) {
	        		System.out.print("Do you want to display all or one specific record?\n");
			        System.out.print("1. All\n");
			        System.out.print("2. One\n");
			        
			        int userChoice3 = input.nextInt();
			        
			        if(userChoice3 == 1) {
			        	for (Content iter : contentdao.getAllContents()) {
			                System.out.println(iter);
			            }
			        	break;
			        } else if (userChoice3 == 2) {
			        	System.out.print("Please enter the ID of content you want to display: ");
			            int userChoice4 = input.nextInt();
			        	System.out.println(contentdao.getContentById(userChoice4));
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 18) {
	        	while(true) {
	        		System.out.print("Do you want to display all or one specific record?\n");
			        System.out.print("1. All\n");
			        System.out.print("2. One\n");
			        
			        int userChoice3 = input.nextInt();
			        
			        if(userChoice3 == 1) {
			        	for (Grade iter : gradedao.getAllGrades()) {
			                System.out.println(iter);
			            }
			        	break;
			        } else if (userChoice3 == 2) {
			        	System.out.print("Please enter the ID of grade you want to display: ");
			            int userChoice4 = input.nextInt();
			        	System.out.println(gradedao.getGradeById(userChoice4));
			        	break;
			        } else {
			        	System.out.print("Please enter the correct choice.\n");
			        }
	            }
	        } else if (userChoice == 19) {
	        	System.out.print("Goodbye.\n");
	        	break;
	        } else {
	        	System.out.print("Please enter the correct choice.\n");
	        }
        }
    }
}
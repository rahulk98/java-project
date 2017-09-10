package Student;

public class Driver {
	public static void main(String args[])
	{
		Student s = new Student();
		PersonalDetail p= new PersonalDetail();
		ParentDetail par = new ParentDetail();
		s.newStudent();
		par.newParentDetail(s);
		par.writeFile();
		par.readFile();
	}

}

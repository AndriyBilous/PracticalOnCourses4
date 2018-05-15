package mypc;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group gr = new Group();
		
		try {
			gr.addStudent(new Student(20, "Anton", "Vanko", true, 5322114, "One"));
			gr.addStudent(new Student(19, "Ivan", "Korun", true, 5322117, "One"));
			gr.addStudent(new Student(18, "Ivan", "Bifrost", true, 5322122, "One"));
			gr.addStudent(new Student(19, "Hanna", "Monique", false, 5322125, "One"));
			gr.addStudent(new Student(20, "Svetlana", "Bondar", false, 5322130, "One"));
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(gr);
		

		

	}

}

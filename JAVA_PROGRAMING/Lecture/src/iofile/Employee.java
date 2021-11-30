package iofile;

import java.io.IOException;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
class appenbale extends ObjectOutputStream{

	public appenbale(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() {}
}

public class Employee implements Serializable {
	
		int Empno ,salary;
		String name;
		public Employee( String name,int empno, int salary) {
			super();
			this.Empno = empno;
			this.salary = salary;
			this.name = name;
		
		}
		void display() {
			System.out.println("employee name="+name);
			System.out.println("salary="+salary);
			System.out.println("emp.no="+Empno);
		}
		
//		@Override
//		public String toString() {
//		return "Employee [Empno=" + Empno + ", salary=" + salary + ", name=" + name + "]";
//		}
		
	void count(int count) {

		System.out.println(count);
	}
	


}


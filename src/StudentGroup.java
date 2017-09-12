import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			System.out.println("student.name");
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students!=null)
		{
			for(i=0;i<length;i++)
		{
			if(students.next=null)
			{
				students.next=students;
				length+=1;
			}
			else
				students=students.next;
		}
		}
		}
		else
			throws IllegalArgumentException;
	

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.index=index)
				return students;
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students!=null)
		{
			for(i=0;i<length;i++)
		{
			if(students.next=null)
			{
				students.next=student;
				students.index=index;
				length+=1;
			}
			else
				students=students.next;
		}
		}
		else
			throws IllegalArgumentException;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students.prev=null)
		{
			students.prev=student;
			length+=1;
		}
		else
			students=students.prev;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students.next=null)
		{
			students.next=student;
			length+=1;
		}
		else
			students=students.next;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(students!=null)
		{
			if(students.next=null)
			{
				students.next=student;
				students.index=index;
				length+=1;
			}
			else
				students=students.next;
		}
		else
			throws IllegalArgumentException;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.index=index)
			{
				students.prev.next=students.next;
				length-=1;
			}
			else
				students=students.next;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.student=student)
			{
				students.prev.next=students.next;
				length-=1;
			}
			else
				students=students.next;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.index=index)
			{
				students.prev.next=students.next;
				length-=1;
			}
			else
				students=students.next;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.student=student)
			{
				students.prev.next=students.next;
				length-=1;
			}
			else
				students=students.next;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.index=index)
			{
				students.prev.next=students.next;
				length-=1;
			}
			else
				students=students.next;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(students.student=student)
			{
				students.prev.next=students.next;
				length-=1;
			}
			else
				students=students.next;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		 int temp = 0;  
		for(i=0;i<length;i++)
		{
			for(j=1;j<length-i;j++)
			{
			    if(student[j-1] > student[j])
				{
					temp = student[j-1];  
					student[j-1] = student[j];  
					student[j] = temp; 
				}					
            }   
        }  
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(student.date=date)
			System.out.println(student);
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(student.date<firstDate && student.date>lastDate)
			{
				System.out.println(student.name);
			}
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(student.date<date || student.date>date || student.date=date)
			{
				if(student.date-date<=days)
				{
					System.out.println(student.name);
				}
			}
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(student.index=indexOfStudent)
			{
				System.out.println(student.name);
			}
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			if(student.age=age)
			{
				System.out.println(student.name);
			}
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			aver[i]=avg(student.marks[]);
		}
		for(i=0;i<length;i++)
		{	
			System.out.println(max(aver[i]);
		}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			System.out.println(student.next);
		return null;
	}
}

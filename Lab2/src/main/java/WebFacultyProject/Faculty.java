package WebFacultyProject;

public class Faculty 
{
	private int f_id;
	private String l_name;
	private String f_name;
	private double salary;
	private double bonus;
	
	public Faculty(int f_id, String l_name, String f_name, double salary, double bonus) {
		super();
		this.f_id = f_id;
		this.l_name = l_name;
		this.f_name = f_name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Faculty [f_id=" + f_id + ", l_name=" + l_name + ", f_name=" + f_name + ", salary=" + salary + ", bonus="
				+ bonus + "]";
	}
	
	
    public double calculate_Bonus() {
        return (salary * bonus) / 100;
    }

}

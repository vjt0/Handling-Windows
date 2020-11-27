package handelingWindows;

public class ThisConcept {
	int a;
	int b;
	
	public void stdata(int a,int b) {
		this.a=a;
		this.b=b;
		showdata();
	}
	public void showdata() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		ThisConcept ts=new ThisConcept();
		ts.stdata(5, 6);
		// TODO Auto-generated method stub

	}

}

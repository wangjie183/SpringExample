
public class Spring {
	private String first;
	private String second;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public void print() {
		System.out.println("张嘎说："+first);
		System.out.println("Rod说："+second);
	}
}

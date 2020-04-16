package print;

public class Printer {
	//创建墨盒和纸张两个组件
	private link Ink;
	private paper paper;
	public link getInk() {
		return Ink;
	}
	public void setInk(link ink) {
		Ink = ink;
	}
	public paper getPaper() {
		return paper;
	}
	public void setPaper(paper paper) {
		this.paper = paper;
	}
	public void print() {
		System.out.println(Ink.getColor()+"在"+paper.getSize()+"打印内容");
	}
}

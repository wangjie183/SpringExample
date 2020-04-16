package compture;

public class computer {
	private CPU cpu;
	private Memory memory;
	private Harddisk hard;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Harddisk getHard() {
		return hard;
	}
	public void setHard(Harddisk hard) {
		this.hard = hard;
	}
	public void print() {
		System.out.println("该电脑cpu为："+cpu.getFirst()+"；"+"内存为："+"硬盘为"+hard.getSecond()+"；"+"内存为："+memory.getThird()+"。");
	}
}

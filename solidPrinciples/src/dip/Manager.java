package dip;

public class Manager {
	
	Worker worker;
	public void SetWorker(Worker w) {
		worker = w;
	}
	
	public void manager() {
		worker.work();
	}
	
	
	
}

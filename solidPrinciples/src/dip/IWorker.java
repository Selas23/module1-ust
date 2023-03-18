package dip;

public interface IWorker {
	public void work();
}

class SuperWorker1 implements IWorker{
	public void work() {
		
	}
}

class Worker1 implements IWorker{
	public void work() {
		//......working much more
		
	}
}

class Manager1{
	IWorker worker;
	
	public void SetWorker(IWorker w) {
		worker = w;
	}
	public void manager() {
		worker.work();
	}
}
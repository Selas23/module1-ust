package interthread;

public class TestProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBuffer sharedObject = new DataBuffer();
		ProduceInteger producer = new ProduceInteger(sharedObject);
		ConsumerInteger consumer = new ConsumerInteger(sharedObject);

		producer.start();
		consumer.start();

	}

}

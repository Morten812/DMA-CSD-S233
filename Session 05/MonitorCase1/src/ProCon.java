class Producer extends Thread {
	private Buffer buffer;

	Producer(Buffer b) {
		buffer = b;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				buffer.Put((char) ('A' + i % 26));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private Buffer buffer;

	Consumer(Buffer b) {
		buffer = b;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				buffer.Get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

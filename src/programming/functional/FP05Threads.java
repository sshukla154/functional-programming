package programming.functional;

import java.util.stream.IntStream;

public class FP05Threads {

	public static void main(String[] args) {

		System.out.println("------------- Traditional Approach : ");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(
							Thread.currentThread().getId() + " : " + Thread.currentThread().getName() + " : " + i);
				}
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		Thread thread3 = new Thread(runnable);
		thread3.start();

		System.out.println("------------- Functional Approach : ");

		Runnable runnable2 = () -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(
						Thread.currentThread().getId() + " :::: " + Thread.currentThread().getName() + " :::: " + i);
			}
		};
		Thread thread4 = new Thread(runnable2);
		thread4.start();
		Thread thread5 = new Thread(runnable2);
		thread5.start();
		Thread thread6 = new Thread(runnable2);
		thread6.start();

		System.out.println("------------- Updated Functional Approach : ");

		Runnable runnable3 = () -> {
			IntStream.range(0, 10000).forEach(i -> System.out.println(
					Thread.currentThread().getId() + " :::::::: " + Thread.currentThread().getName() + " :::::::: " + i));
		};
		Thread thread7 = new Thread(runnable3);
		thread7.start();
		Thread thread8 = new Thread(runnable3);
		thread8.start();
		Thread thread9 = new Thread(runnable3);
		thread9.start();

	}

}

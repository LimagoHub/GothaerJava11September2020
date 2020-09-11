package de.flowdemo;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws Exception{
		
		var pool = ForkJoinPool.commonPool();
		
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>(pool, 1);
		EndSubscriber<String> subscriber = new EndSubscriber<>();
		publisher.subscribe(subscriber);
		final List<String> items = List.of("1", "x", "2", "x", "3", "x");

		
		items.forEach(publisher::submit);
		publisher.close();
		
		pool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		
//		new Thread() {
//			public void run() {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			};
//		}.start();

	}

}

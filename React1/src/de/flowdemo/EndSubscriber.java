package de.flowdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class EndSubscriber<T> implements Subscriber<T> {
    private Subscription subscription;
   
 
    @Override
    public void onSubscribe(final Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }
    
    @Override
    public void onNext(T item) {
        System.out.println("Got : " + item);
        subscription.request(1);
    }
    @Override
    public void onError(Throwable t) {
    	System.out.println("Upps");
        t.printStackTrace();
    }
     
    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
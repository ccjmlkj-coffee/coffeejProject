//package com.coffee.virtualthread;
//
//import jdk.internal.vm.Continuation;
//import jdk.internal.vm.ContinuationScope;
//
//public class VirtualTheadContinuation {
//    public static void main(String[] args) {
//        ContinuationScope scope = new ContinuationScope("scope");
//        Continuation continuation = new Continuation(scope,()->{
//            System.out.println("Running before yield");
//            Continuation.yield(scope);
//            System.out.println("Running after yield");
//        });
//        System.out.println("First Run");
//        continuation.run();
//        System.out.println("Second Run");
//        continuation.run();
//        System.out.println("Done");
//    }
//}

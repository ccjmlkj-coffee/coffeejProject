package com.coffee.designPattern.observer;

import com.coffee.designPattern.observer.classs.ObserverOne;
import com.coffee.designPattern.observer.classs.ObserverTwo;
import com.coffee.designPattern.observer.classs.SubjectManager;

import java.io.FileInputStream;

public class ObserverTest {
    public static void main(String[] args) {
        SubjectManager subjectManager = new SubjectManager();
        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();
        subjectManager.registerObserver(observerOne);
        subjectManager.registerObserver(observerTwo);
        subjectManager.noticeObserver("通知下达，各位观察着按需变更");
        subjectManager.removeObserver(observerOne);
        subjectManager.noticeObserver("通知下达，各位观察着按需变更");

    }
}

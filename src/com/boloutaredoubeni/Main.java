package com.boloutaredoubeni;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Phone iphone = new IPhone();
        Phone android = new Android();

        iphone.openApp("iCloud");
        android.openApp("Google Drive");

        // Note cant call the interface methods here because of upcast
        ICallable callableIPhone = (ICallable)iphone;
        ICallable callableAndroid = (ICallable)android;

        callableAndroid.call("911");
        callableIPhone.call("911");

        // Just as an example, will never use in production code
    }

    public static abstract class Phone {
        public abstract boolean openApp(String number);
    }

    public interface ICallable {
        void call(String number);
    }

    public static class IPhone extends Phone implements ICallable{

        @Override
        public void call(String number) {
            System.out.println("Calling " + number + ", from an IPhone");
        }

        @Override
        public boolean openApp(String number) {
            System.out.println("Launched view controller from an AppDelegate");
            return true;
        }
    }

    public static class Android extends Phone implements ICallable {

        @Override
        public void call(String number) {
            System.out.println("Calling " + number + ", from an Android");
        }

        @Override
        public boolean openApp(String number) {
            System.out.println("Launched activity from an Application class");
            return false;
        }
    }



}

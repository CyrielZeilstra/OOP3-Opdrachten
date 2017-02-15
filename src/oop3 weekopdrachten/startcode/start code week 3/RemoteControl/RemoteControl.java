public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getDevice(){
        
        return new Television();
    }
}
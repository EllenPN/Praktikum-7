public class PhoneUser {
    Phone phone;

    public void turnOnThePhone(){
        phone.powerOn();
    }


    public void turnOffThePhone(){
        phone.powerOff();
    }

    public void makePhoneLouder(){
        phone.volume(volume);
    }

    public void makePhoneSilent(int volume){
        phone.volumeDown(volume);
    }
}
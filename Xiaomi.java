public class Xiaomi implements Phone {

    private int volume ;
    private boolean isPowerOn ;

    @Override
    public void powerOn(){
        System.out.println("Xiaomi dihidupkan ...");
    }

    @Override
    public void powerOff(){
        System.out.println("Xiaomi dimatikan");
    }

    @Override
    public void volumeUp(int volume){
        if(volume > this.MAX_VOLUME){
            System.out.println("Xiaomi volume tidak boleh melebihi: " + this.MAX_VOLUME);
        } else{
            System.out.println("Xiaomi volume dinaikan sebesar: " + volume);
            this.volume = volume;
        }
        
    }

    @Override
    public void volumeDown(int volume){
        this.volume = volume;
        if(volume < this.MIN_VOLUME){
            System.out.println("Xiaomi volume tidak boleh kurang: " + this.MIN_VOLUME);
        } else{
            System.out.println("Xiaomi volume dinaikan sebesar: " + volume);
            this.volume = volume;
        }
    }

}
public class MobilePhone implements Telephone {

    private String myNumber;
    private boolean isRinging;

    boolean powerOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.isRinging=false;
        this.powerOn=false;
    }

    @Override
    public void powerOn() {
         this.powerOn=true;
        System.out.println("Phone is set on");
    }

    @Override
    public void dial(String phoneNo) {
        if(powerOn==true)
        System.out.println("Dialing the phoneNo "+phoneNo);
        else
            System.out.println("Mobile is not on");
    }

    @Override
    public void answer() {
        if(isRinging()==true ){
            System.out.println("answer the phone");
            isRinging=false;
        }else{
            System.out.println("No phone is coming or phone is off");
        }
    }

    @Override
    public boolean receivePhone(String phoneNo) {

        if(phoneNo==myNumber && powerOn==true){
            isRinging=true;
            System.out.println("phone is ringing");
        }else{
            isRinging=false;
            System.out.println("wrong number or phone is not ringing");
        }

        return  isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }
}

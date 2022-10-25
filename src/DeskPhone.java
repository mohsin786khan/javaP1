public class DeskPhone implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
        this.isRinging=false;
    }

    @Override
    public void powerOn() {
         System.out.println("Desk phone is always on");
    }

    @Override
    public void dial(String phoneNo) {
           System.out.println("Dialing the phoneNo "+phoneNo);
    }

    @Override
    public void answer() {
        if(isRinging()==true){
            System.out.println("answer the phone");
            isRinging=false;
        }else{
             System.out.println("No phone is coming");
        }
    }

    @Override
    public boolean receivePhone(String phoneNo) {

        if(phoneNo==myNumber){
            isRinging=true;
            System.out.println("phone is ringing");
        }else{
            isRinging=false;
            System.out.println("wrong number");
        }

        return  isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }
}

public class Main {
    public static void main(String[] args) {

//           DeskPhone d1 = new DeskPhone("1234567");
//
//           d1.powerOn();
//
//           boolean callaarahihai = d1.receivePhone("1234567");
//
//           if(callaarahihai==true){
//               System.out.println("call aarahi hai");
//           }else {
//               System.out.println("call nhi aarahi hai");
//           }
//               d1.answer();
//    }

        MobilePhone m1 = new MobilePhone("1234");

        m1.powerOn();
        m1.dial("1234");
        m1.receivePhone("1234");
    }
}
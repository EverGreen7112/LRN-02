import java.util.Scanner;

public class Main {
    static void main(String[] args) {


        System.out.println("enter which action you want to do (option: configure, check/test, quit)");
        Scanner act = new Scanner(System.in);
        String action = (act.nextLine());

        int[] ports = new int[16];
        String[] sensors = new String[16];

        if (action == "configure") {

            System.out.println("enter one working port (for end enter -1)");
            Scanner port = new Scanner(System.in);
            int portsNum = Integer.parseInt(port.nextLine());
            if (portsNum != -1) {
                ports[portsNum] = 1;
            }

            while (portsNum != -1) {

                System.out.println("enter another working port (for end enter -1)");
                port = new Scanner(System.in);
                portsNum = Integer.parseInt(port.nextLine());
                ports[portsNum] = 1;
            }

            for (int i = 0; i <= ports.length; i++) {

                if (ports[i] == 1) {
                    System.out.println("enter the sensor that belong to port " + i);
                    Scanner sensorsNames = new Scanner(System.in);
                    sensors[i] = (sensorsNames.nextLine());
                }
            }
        }

        else if (action == "check" || action == "test") {

            System.out.println("you can't do the test before the configure, want to do it now?");
            Scanner yesOrNo = new Scanner(System.in);
            String answer = (yesOrNo.nextLine());

            if (answer == "yes"){


                System.out.println("enter one working port (for end enter -1)");
                Scanner port = new Scanner(System.in);
                int portsNum = Integer.parseInt(port.nextLine());
                if (portsNum != -1) {
                    ports[portsNum] = 1;
                }

                while (portsNum != -1) {

                    System.out.println("enter another working port (for end enter -1)");
                    port = new Scanner(System.in);
                    portsNum = Integer.parseInt(port.nextLine());
                    ports[portsNum] = 1;
                }
                
                for (int i = 0; i <= ports.length; i++) {

                    if (ports[i] == 1) {
                        System.out.println("enter the sensor that belong to port " + i);
                        Scanner sensorsNames = new Scanner(System.in);
                        sensors[i] = (sensorsNames.nextLine());

                    }
                }

                System.out.println("now lets do the the test");

                System.out.println("enter port (to end enter -1)");
                Scanner portToTest = new Scanner(System.in);
                int portTest = Integer.parseInt(portToTest.nextLine());

                while (portTest != -1) {
                    System.out.println("enter sensor");
                    Scanner sensorToTest = new Scanner(System.in);
                    String sensorTest = (sensorToTest.nextLine());

                    if (ports[portTest] == 1 && sensors[portTest] == sensorTest) {
                        System.out.println("the sensor is belong to the port");
                    } else {
                        System.out.println("the sensor isn't belong to the port");
                    }

                    System.out.println("enter port (to end enter -1)");
                    portToTest = new Scanner(System.in);
                    portTest = Integer.parseInt(portToTest.nextLine());
                }

            }

            else if (answer == "no"){
                System.out.println("OK");
            }
        }



        System.out.println("enter which action you want to do (option: configure, check/test, quit)");
        act = new Scanner(System.in);
        action = (act.nextLine());

        while(action != "quit"){

            if (action == "configure") {

                System.out.println("enter one working port (for end enter -1)");
                Scanner port = new Scanner(System.in);
                int portsNum = Integer.parseInt(port.nextLine());
                if (portsNum != -1) {
                    ports[portsNum] = 1;
                }

                while (portsNum != -1) {

                    System.out.println("enter another working port (for end enter -1)");
                    port = new Scanner(System.in);
                    portsNum = Integer.parseInt(port.nextLine());
                    ports[portsNum] = 1;
                }

                for (int i = 0; i <= ports.length; i++) {

                    if (ports[i] == 1) {
                        System.out.println("enter the sensor that belong to port " + i);
                        Scanner sensorsNames = new Scanner(System.in);
                        sensors[i] = (sensorsNames.nextLine());
                    }
                }
            }

            else if (action == "check" || action == "test") {

                    System.out.println("enter port (to end enter -1)");
                    Scanner portToTest = new Scanner(System.in);
                    int portTest = Integer.parseInt(portToTest.nextLine());

                    while (portTest != -1) {
                        System.out.println("enter sensor");
                        Scanner sensorToTest = new Scanner(System.in);
                        String sensorTest = (sensorToTest.nextLine());

                        if (ports[portTest] == 1 && sensors[portTest] == sensorTest) {
                            System.out.println("the sensor is belong to the port");
                        } else {
                            System.out.println("the sensor isn't belong to the port");
                        }

                        System.out.println("enter port (to end enter -1)");
                        portToTest = new Scanner(System.in);
                        portTest = Integer.parseInt(portToTest.nextLine());
                    }

            }
        }


    }
}


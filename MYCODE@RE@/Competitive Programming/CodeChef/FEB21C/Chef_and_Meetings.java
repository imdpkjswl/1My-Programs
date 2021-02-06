import java.math.*;
import java.util.*;
import java.lang.*;
//Chef and Meetings

class Chef_and_Meetings {

    private static int timeToNumber(String str){
        StringTokenizer st1 = new StringTokenizer(str,":");
        StringTokenizer st2 = null;
        int HH = 0;
        int MM = 0;
        while (st1.hasMoreTokens()) {  // checks for colon token
            HH = Integer.parseInt(st1.nextToken());
            st2 = new StringTokenizer(st1.nextToken()," ");
        }
        assert st2 != null;
        MM = Integer.parseInt(st2.nextToken());  // checked for colon token
        //System.out.println("HH --> "+HH);
        //System.out.println("MM --> "+MM);
        String mode = st2.nextToken(); // checked for space token
        //System.out.println(mode);
        if(mode.equals("AM")){
            if(HH!=12)
                return 100*(0+HH) + MM;
            else
                return MM;
        }
        else{
            if(HH!=12)
                return 100*(12+HH) + MM;
            else
                return 100*(0+HH) + MM;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) { T = in.nextInt(); }
        for (int t = 1; t <= T; t++) {

            String result = "";
            String meetingTime = in.nextLine();//"03:12 PM";
            //System.out.println(meetingTime);
            int N = 0;
            if (in.hasNextInt()) {
                N = in.nextInt();
            }
            //System.out.println(N);
            for (int j = 0; j < N; j++) {   // N friends avail at some time
                String times = in.nextLine();//"02:42 AM 04:12 AM";
                String from = null;
                String to;
                int i;
                for (i = 0; i < times.length(); i++) {
                    if (times.charAt(i) == 'M') {
                        from = times.substring(0, i + 1);
                        break;
                    }
                }
                //System.out.println(from);
                to = times.substring(i + 2, times.length());
                //System.out.println("BREAK POINT");

                //System.out.println(from+"<->"+to);
                int meet = timeToNumber(meetingTime);
                int availFrom = timeToNumber((from));
                int availTill = timeToNumber(to);

                //System.out.println(meet);
                //System.out.println(availFrom);
                //System.out.println(availTill);

                if (meet >= availFrom && meet <= availTill) {
                    //System.out.println(1);
                    result += "1";
                } else {
                    //System.out.println(0);
                    result += "0";
                }
            }
            System.out.println(result);
        }

    }
}


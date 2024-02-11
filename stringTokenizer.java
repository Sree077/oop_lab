import java.util.*;
class stringTokenizer{
    public static void main(String[] args){
        int n,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers with one space gap: ");
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum+=n;
        }
        System.out.println("Sum of the Integers is: "+sum);
        in.close();
    }
}
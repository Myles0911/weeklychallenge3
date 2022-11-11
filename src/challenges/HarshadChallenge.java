package challenges;

public class HarshadChallenge {

    public static void main(String [] args) {
        System.out.println(Harshad(100));
        System.out.println(Harshad(18));
        System.out.println(Harshad(15));
    }




       public static int sum(int search) {
           int s = 0;
           if (search != 0) {
               return (search %10 + sum(search/10));

           } else {

           }
            return s;
       }
    static boolean Harshad(int search) {


        return search %sum(search) ==0;
    }
    }


public class StaticBlock {

    //1
    static {
        System.out.println("\n >>>> 1. The Story Starts from a Long Ago ");
    }

    //2
        static {
            System.out.println("\n >>>> 2. The son of King TORY his name Mr. John Peterson");
        }
    //3
    static {
        System.out.println("\n >>>> 3. A Big Dragon collapse the Kingdom of King Mr. TORY");
    }

    public static void main(String[] args) {

        // 4
        // here Static block will give the 1st preference based on the static block order only it will execute
        System.out.println("\n >>>> 4. The Hero John Killed the Dragon");
    }
}

public class StaticMethod {

    static void BabyBorn(){
        System.out.println("Baby was born in the Hospital");
    }

    void Schooling(){
        // here the static method can be called inside the non-static method
        BabyBorn();
        System.out.println("The Baby once reach more then the age of 3 he/she went to school");
    }

    public static void main(String[] args) {

        BabyBorn();
        // but the non-static method can be called inside the static method without creating object
        StaticMethod sm = new StaticMethod();
        sm.Schooling();

    }
}

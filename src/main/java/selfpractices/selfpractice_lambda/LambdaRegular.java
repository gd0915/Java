package selfpractices.selfpractice_lambda;

//interface methods{
//    public void learn();
//}
//
//public class LambdaRegular implements methods {
//    public static void main(String[] args) {
//        LambdaRegular obj = new LambdaRegular();
//        obj.learn();
//    }
//
//
//    @Override
//    public void learn() {
//        System.out.println("this is works");
//    }

interface methods{
    //public void learn();
    //public void add(int x,int y);
    public int add(int x,int y);

}


public class LambdaRegular {
    public static void main(String[] args) {

        // Interface name --- ref name --- = ---- () ---- -> ---- {}

//        methods ref1 = ()-> {
//            System.out.println("this is works");
//        };
//        ref1.learn();

//        methods ref = (x,y) -> System.out.println(x+y);
//
//        ref.add(3,5);
//
//    }

        methods ref = (x, y) -> {

            return x + y;
        };
        System.out.println(ref.add(3, 5));


    }

}


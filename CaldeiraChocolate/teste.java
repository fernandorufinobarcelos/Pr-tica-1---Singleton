public class teste{
    public static void main(String[] args){
        CaldeiraChocolate s1 = CaldeiraChocolate.getInstancia(true, false);
        CaldeiraChocolate s2 = CaldeiraChocolate.getInstancia(true, false);
        s1.encher();
        s2.encher();
        s2.ferver();
        System.out.println(s1 == s2);
    }
}

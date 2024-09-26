public class teste{
    public static void main(String[] args){
        CaldeiraChocolate s1 = CaldeiraChocolate.getInstancia();
        CaldeiraChocolate s2 = CaldeiraChocolate.getInstancia();
        s1.encher();
        s2.encher();
        s2.ferver();
        s1.ferver();
        s1.drenar();
        s2.drenar();
        System.out.println(s1 == s2);
    }
}

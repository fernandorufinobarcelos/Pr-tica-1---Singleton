public class CaldeiraChocolate{
    public boolean vazia;
    public boolean fervida;
    private static CaldeiraChocolate instancia;

    private CaldeiraChocolate(){
        vazia = true;
        fervida = false;     
    }

    public static CaldeiraChocolate getInstancia(){
        if(instancia == null){
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }
    public void encher(){
        if (vazia == true){
            System.out.println("Preenchendo a caldeira com chocolate e leite!");
            vazia = false;
        } 
        else{
            System.out.println("A caldeira ja está cheia com chocolate e leite!");
        }
    }
    public void ferver(){
        if(fervida == true){
            System.out.println("A mistura ja foi fervida!");
        }
        else if (vazia == false){
            System.out.println("A mistura está sendo fervida!");
            fervida = true;
        } 
        else{
            System.out.println("A caldeira está vazia!");
        }
    }
    public void drenar(){
        if (fervida == true){
            System.out.println("A mistura está sendo drenada!");
            vazia = true;
            fervida = false;
            } 
        else{
            System.out.println("A caldeira está vazia!");
        }
    }
}

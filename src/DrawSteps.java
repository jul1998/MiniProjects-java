public class DrawSteps {

    public static void main(String[] args){
        int steps = 5;
        int width = 3;

        for(int i = 0; i < steps; i ++){
            for(int j = 0; j < (i+1)* width;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

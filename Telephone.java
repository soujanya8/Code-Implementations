public class Telephone {
    public static void main(String args[]){
        //we will print a Dial pad using 2D array
        
        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};
        System.out.println("-------");
        for(char[] numbers: telephone){
            for(char number: numbers){
                System.out.print(number+"  ");
            }
            System.out.println();
        }
        System.out.println("-------");
    }   
}

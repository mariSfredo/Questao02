/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /**
 *
 * @author Mari
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int x=1;x<=100;x++){//loop em "for" que inicializa o x=1 indo ate 100  
            if (x % 3 == 0 && x % 5 == 0 ){// mod da divisao de 3 e 5 devem ser = 0 simultaneamente
                System.out.println("FooBaa"); // imprimindo o palavra "FooBaa"
            } else if(x % 3 == 0){ // mod da divisao de 3 deve ser = 0
                System.out.println("Foo");
            } else if(x % 5 == 0){ // mod da divisao de 5 deve ser = 0
                System.out.println("Baa");
            } else{
                System.out.println(x);
            }
        }
    }
    
}

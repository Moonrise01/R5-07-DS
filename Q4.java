public class Q4 { 
    public static void main(String[] args) { 
        if (args.length == 0) { 
            System.out.println("Veuillez fournir un entier N en paramètre."); 
             return; 
        } 

        int n = Integer.parseInt(args[0]); 
        for (int i = n; i >= 0; i--) { 
            for (int j = i; j >= 1; j--) { 
                System.out.print(j); 
            } 
            System.out.println(); 
        } 
    } 
}

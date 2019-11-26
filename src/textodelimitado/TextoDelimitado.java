package textodelimitado;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alba
 */
public class TextoDelimitado {

    private static PrintWriter pw;
    private static BufferedReader br;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
            String cod[] = {"p1", "p2", "p3"};
            String desc[] = {"parafusos", "cravos", "tachas"};
            double prezo[] = {3, 4, 5};
            String linea;

            pw = new PrintWriter("texto8.txt");
            br = new BufferedReader(new FileReader("texto8.txt"));
            

            for (int i = 0; i < cod.length; i++) {
                pw.print(cod[i] + "\t");
                pw.print(desc[i] + "\t");
                pw.println(prezo[i]); //salto de linea
            }
            
            pw.close();
            
            while ((linea = br.readLine()) != null) {
                String[] leido = linea.split("\t");
                Products pr = new Products(leido[0], leido[1], Double.parseDouble(leido[2]));
                System.out.println(pr.toString());
            }
            
            br.close();
            
            
    }

}


package sourceInsta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstaComemntGenerator {

	public static void main(String[] args) {

        System.out.println("Hello");

        File file = new File("C:/Users/pedri/Desktop/instagram.txt");
        if (file.exists()) {
            try {
                PrintWriter pw = new PrintWriter(file);

                int count = 0;
                String[] usernames = {"dearyagoo", "cleonicekelly_", "hannafariias", "ivethearaujo", 
                		"yasmimluh", "daysemrss", "juliamariaazevedo", "juliamdrs_", "shelucena", "tatjanamirela", 
                		"srt_brito", "_helomdrs", "rillary.alves", "othondelfino", "ofelipemotta"};
                // Para tr�s nicks, utilizar este script e comentar o de dois nicks
                
                for (int i = 0; i < usernames.length - 2; i++) {
                    for (int j = i + 1; j < usernames.length - 1; j++) {
                        for (int k = j + 1; k < usernames.length; k++) {
                            pw.println("@" + usernames[i] + " @" + usernames[j] + " @" + usernames[k]);
                            count++;
                        }
                    }
                }
                
                
                /* Para dois nicks, utilizar esses par�metos aqui
                 
				for (int j = 0; j < usernames.length - 1; j++) {
                	for (int k = j + 1; k < usernames.length; k++) {
						pw.println(" @" + usernames[j] + " @" + usernames[k]);
                   	}
				}
                 
                 */

                pw.println();
                pw.println("Iterations: " + count);

                pw.close();
            } catch (FileNotFoundException fnfe){
                System.out.println(fnfe);
            }
        }

        System.out.println(" world!");
    }
}

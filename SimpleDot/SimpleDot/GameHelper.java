package SimpleDot;
import java.io.*;
public class GameHelper extends DotCom{
    public String getUserImput (String promt){
        String imputLine = null;
        System.out.print(promt+ " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            imputLine = is.readLine();
            if (imputLine.length()==0) return null;
        } catch (IOException e){
            System.out.println("IOException:" + e);
        }
        return imputLine;
    }
}

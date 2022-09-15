package SimpleDot;

public class SimpleDotComTestDrive extends DotCom{
    public static void main (String[] args){
        DotCom dot = new DotCom();
        int[] location = {2,3,4};
        dot.setLocationCells(location);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}

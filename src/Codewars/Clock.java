package Codewars;

public class Clock {
    public static int Past(int h, int m, int s)
    {
        int miliSecond = 0;
        if(h<24) {
            if (h != 0) {
                h = h * 60;
            }
            m = (h + m) * 60;
            s = m + s;
            miliSecond = s * 1000;
            }
    return miliSecond;
    }
    // return h * 3600000 + m * 60000 + s * 1000;

    public static void main(String[] args){
        int h = 21;
        int m = 0;
        int s = 38;
        System.out.println(Past(h,m,s));
    }
}

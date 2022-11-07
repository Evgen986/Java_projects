import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2 {
    private Pattern pattern,pattern2;
    private Matcher m;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
                                                //     info     @    test       .     ru
    private static final String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    // 192.168.56.1
    public RegularExpression2(){
        pattern = Pattern.compile(EMAIL_PATTERN);
        pattern2 = Pattern.compile(IP_PATTERN);
    }

    boolean checkIp (String ip){
        m = pattern2.matcher(ip);
        return m.matches();
    }
    boolean checkEmail(String email){
        m = pattern.matcher(email);
        return m.matches();
    }

    public static void main(String[] args) {
        RegularExpression2 r = new RegularExpression2();
        System.out.println(r.checkEmail("info@test.ru"));
        System.out.println(r.checkIp("192.168.56.1"));
    }
}

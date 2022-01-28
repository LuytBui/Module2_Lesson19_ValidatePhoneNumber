import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /*
        Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
        x là ký tự số
        Không chứa các ký tự đặc biệt
     */

    public static void main(String[] args) {
        showValidPhoneNumber("(84)-(0978489648)");
        showValidPhoneNumber("(a8)-(022222222)");
        showValidPhoneNumber("(58)-(0012345678)");
        showValidPhoneNumber("(98)-(122222222)");

    }

    public static void showValidPhoneNumber(String phoneNumber){
        System.out.println(phoneNumber + " " + (validPhoneNumber(phoneNumber) ? "hợp lệ." : "không hợp lệ."));
    }

    public static boolean validPhoneNumber(String phoneNumber){
        String PHONENUMBER_REGEX = "\\(\\d{2}\\)-\\([0]\\d{9}\\)";
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

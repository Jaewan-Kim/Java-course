
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> mapp = new HashMap<String, String>();
        
        mapp.put("matti", "mage");
        mapp.put("mikael", "mixu");
        mapp.put("arto", "arppa");
        
        String nickname = mapp.get("mikael");
        
        System.out.println(nickname);
    }

}

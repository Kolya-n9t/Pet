package LogSystem;

import java.util.HashMap;
import java.util.Map;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();

    public IDandPasswords() {
        loginInfo.put("Poland", "Germany");
        loginInfo.put("K1", "K234567");
        loginInfo.put("K2", "K132456");
        loginInfo.put("LW09", "000000");
    }
    public HashMap<String, String> getLoginInfo(){
        return loginInfo;
    }

}

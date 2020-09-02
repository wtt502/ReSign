package custom;

import java.util.ArrayList;
import java.util.TreeMap;

public class Testsign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		TreeMap <String, String> params = new TreeMap <>();
		params.put("Secret", "${ensecret}");
        params.put("uid", "${uidkone}");
        params.put("token", "${tokenkone");
        params.put("RequestTime", "${__time(/1000,)}");
        params.put("Noncestr", "1");
		ArrayList<String> keys = new ArrayList<String>(params.keySet());
        String  sb = "";
        for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = params.get(key);
			if (i == keys.size()-1) {
				sb = sb + key + "=" + value;
			}else {
				sb = sb + key + "=" + value + "&";
			}
		}
        System.out.println(sb);
	}

}

package com.lishiqian.cagedogclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.lishiqian.cagedogclientsdk.model.User;


import java.util.HashMap;
import java.util.Map;

import static com.lishiqian.cagedogclientsdk.utils.SignUtils.genSign;



/**
 * 调用第三方接口的客户端
 */
public class CageDogClient {

    public static final String GATEWAY_HOST = "http://localhost:8090";

    private String accessKey;

    private String secretKey;

    public CageDogClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result= HttpUtil.get(GATEWAY_HOST+"/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result= HttpUtil.post(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

//    private String genSign(Map<String,String> hashmap,String secretKey){
//        Digester md5 = new Digester(DigestAlgorithm.SHA256);
//        String content = hashmap.toString() + "." + secretKey;
//// 5393554e94bf0eb6436f240a4fd71282
//        String digestHex = md5.digestHex(content);
//        return digestHex;
//    }

    private Map<String,String> getHeaderMap(String body){
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("accessKey",accessKey);
        //密码一定不能在服务器中传输，需要进行加密后传输
//        hashMap.put("secretKey",secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body",body);
        hashMap.put("timestamp",String.valueOf(System.currentTimeMillis()/1000));
        hashMap.put("sign",genSign(body,secretKey));
        return hashMap;
    }



//    public String getUserNameByPOST(User user){
//        String json = JSON.toJSONString(user);
//        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
//                .addHeaders(getHeaderMap(json))
//                .body(json)
//                .execute();
//        System.out.println(httpResponse.getStatus());
//        String body = httpResponse.body();
//        System.out.println(body);
//        return body;
//    }

    public String onlineInvoke(String parameters,String url) {
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + url)
                .addHeaders(getHeaderMap(parameters))
                .body(parameters)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println("12");
        return result;
    }
}

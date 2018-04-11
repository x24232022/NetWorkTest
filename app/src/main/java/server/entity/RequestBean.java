package server.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/11 0011.
 */

public class RequestBean {
    public RequestBean(String type, String key) {
        this.type = type;
        this.key = key;
    }


    private String type;

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "RequestBean{" +
                "type='" + type + '\'' +
                ", key='" + key + '\'' +

                '}';
    }


}

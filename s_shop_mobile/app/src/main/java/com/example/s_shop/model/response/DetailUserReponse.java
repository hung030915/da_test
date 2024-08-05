package com.example.s_shop.model.response;

import com.example.s_shop.model.User;

public class DetailUserReponse {
    private int code;
    private User data;
    private String message;

    public DetailUserReponse() {
    }

    @Override
    public String toString() {
        return "DetailUserReponse{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

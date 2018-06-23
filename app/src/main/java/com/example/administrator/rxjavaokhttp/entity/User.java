package com.example.administrator.rxjavaokhttp.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public class User {

    @Override
    public String toString() {
        return "User{" +
                "status='" + status + '\'' +
                ", isSuccess=" + isSuccess +
                ", data=" + data +
                '}';
    }

    /**
     * status : 200
     * isSuccess : true
     * data : [{"id":1,"username":"123","password":"123","sex":"男","userhead":null,"location":"浙江省嘉兴学院","identity":"普通用户","usertel":"17374131273","idcard":"430223199711157474"}]
     */



    private String status;
    private boolean isSuccess;
    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * username : 123
         * password : 123
         * sex : 男
         * userhead : null
         * location : 浙江省嘉兴学院
         * identity : 普通用户
         * usertel : 17374131273
         * idcard : 430223199711157474
         */

        private int id;
        private String username;
        private String password;
        private String sex;
        private Object userhead;
        private String location;
        private String identity;
        private String usertel;
        private String idcard;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Object getUserhead() {
            return userhead;
        }

        public void setUserhead(Object userhead) {
            this.userhead = userhead;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getIdentity() {
            return identity;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }

        public String getUsertel() {
            return usertel;
        }

        public void setUsertel(String usertel) {
            this.usertel = usertel;
        }

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", sex='" + sex + '\'' +
                    ", userhead=" + userhead +
                    ", location='" + location + '\'' +
                    ", identity='" + identity + '\'' +
                    ", usertel='" + usertel + '\'' +
                    ", idcard='" + idcard + '\'' +
                    '}';
        }
    }
}

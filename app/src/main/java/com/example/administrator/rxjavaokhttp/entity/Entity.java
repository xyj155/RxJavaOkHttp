package com.example.administrator.rxjavaokhttp.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public class Entity {

    /**
     * status : 200
     * isSuccess : true
     * data : [{"id":28,"startlocation":"株洲","ordernum":"1851485","username":"432423","usertel":"2342342424","idcard":"24252532532","userid":"23132131","endlocation":"攸县","createtime":"2018-06-11 00:46:27","longitude":120.570277,"latitude":30.769317},{"id":29,"startlocation":"石家庄","ordernum":"12515","username":"423424324324","usertel":"1515","idcard":"1231231412412","userid":null,"endlocation":"茶陵","createtime":"2018-06-12 11:21:47","longitude":121.083888,"latitude":31.012085},{"id":30,"startlocation":"高老庄","ordernum":"32423432424","username":"234234324","usertel":"32423424","idcard":"312313213131","userid":null,"endlocation":"山东","createtime":"2018-06-12 14:10:44","longitude":120.732326,"latitude":30.755156},{"id":31,"startlocation":"秋名山","ordernum":"4234324242432","username":"43324234324","usertel":"234242432432","idcard":"5353534646","userid":null,"endlocation":"枣庄","createtime":"2018-06-12 14:10:44","longitude":121.24319,"latitude":31.052094},{"id":32,"startlocation":"商厦","ordernum":"34242424324","username":"32432432424","usertel":"3424324324","idcard":"12313131324","userid":"231313","endlocation":"沪松","createtime":"2018-06-12 14:10:44","longitude":120.248927,"latitude":30.655972}]
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
         * id : 28
         * startlocation : 株洲
         * ordernum : 1851485
         * username : 432423
         * usertel : 2342342424
         * idcard : 24252532532
         * userid : 23132131
         * endlocation : 攸县
         * createtime : 2018-06-11 00:46:27
         * longitude : 120.570277
         * latitude : 30.769317
         */

        private int id;
        private String startlocation;
        private String ordernum;
        private String username;
        private String usertel;
        private String idcard;
        private String userid;
        private String endlocation;
        private String createtime;
        private double longitude;
        private double latitude;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStartlocation() {
            return startlocation;
        }

        public void setStartlocation(String startlocation) {
            this.startlocation = startlocation;
        }

        public String getOrdernum() {
            return ordernum;
        }

        public void setOrdernum(String ordernum) {
            this.ordernum = ordernum;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
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

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getEndlocation() {
            return endlocation;
        }

        public void setEndlocation(String endlocation) {
            this.endlocation = endlocation;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }
}

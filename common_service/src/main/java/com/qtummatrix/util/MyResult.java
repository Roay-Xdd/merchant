package com.qtummatrix.util;

public class MyResult {

        // 响应业务状态
        private Integer status;

        // 响应消息
        private String msg;

        // 响应中的数据
        private Object data;

        public static MyResult build(Integer status, String msg, Object data) {
            return new MyResult(status, msg, data);
        }

        public static MyResult ok(Object data) {
            return new MyResult(data);
        }

        public static MyResult ok() {
            return new MyResult(null);
        }

        public MyResult() {

        }

        public static MyResult build(Integer status, String msg) {
            return new MyResult(status, msg, null);
        }

        public MyResult(Integer status, String msg, Object data) {
            this.status = status;
            this.msg = msg;
            this.data = data;
        }

        public MyResult(Object data) {
            this.status = 200;
            this.msg = "OK";
            this.data = data;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

    }


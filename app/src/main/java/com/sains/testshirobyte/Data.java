package com.sains.testshirobyte;

import java.util.List;

public class Data{


    /**
     * status : 200
     * data : [{"id":1,"deleted_at":"","created_at":"2017-07-17 18:12:32","updated_at":"2017-07-17 18:12:32","name":"Aplikasi A","version":"1.0.0","description":"Aplikasi A","id_apk":"13","id_image":"15","package_name":"com.example.applicationa","apk_name":"applicationA.apk","image":"appA.png"},{"id":2,"deleted_at":"","created_at":"2017-07-17 18:12:32","updated_at":"2017-07-17 18:12:32","name":"Aplikasi B","version":"1.0.0","description":"Aplikasi B","id_apk":"13","id_image":"15","package_name":"com.example.applicationb","apk_name":"applicationB.apk","image":"appB.png"},{"id":3,"deleted_at":"","created_at":"2017-07-17 18:12:32","updated_at":"2017-07-17 18:12:32","name":"Aplikasi C","version":"1.0.0","description":"Aplikasi C","id_apk":"13","id_image":"15","package_name":"com.example.applicationc","apk_name":"applicationC.apk","image":"appC.png"},{"id":4,"deleted_at":"","created_at":"2017-07-17 18:12:32","updated_at":"2017-07-17 18:12:32","name":"Aplikasi D","version":"1.0.0","description":"Aplikasi D","id_apk":"13","id_image":"15","package_name":"com.example.applicationd","apk_name":"applicationD.apk","image":"appD.png"}]
     * error :
     */

    private int status;
    private String error;
    private java.util.List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
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
         * deleted_at :
         * created_at : 2017-07-17 18:12:32
         * updated_at : 2017-07-17 18:12:32
         * name : Aplikasi A
         * version : 1.0.0
         * description : Aplikasi A
         * id_apk : 13
         * id_image : 15
         * package_name : com.example.applicationa
         * apk_name : applicationA.apk
         * image : appA.png
         */

        private int id;
        private String deleted_at;
        private String created_at;
        private String updated_at;
        private String name;
        private String version;
        private String description;
        private String id_apk;
        private String id_image;
        private String package_name;
        private String apk_name;
        private String image;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(String deleted_at) {
            this.deleted_at = deleted_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getId_apk() {
            return id_apk;
        }

        public void setId_apk(String id_apk) {
            this.id_apk = id_apk;
        }

        public String getId_image() {
            return id_image;
        }

        public void setId_image(String id_image) {
            this.id_image = id_image;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public String getApk_name() {
            return apk_name;
        }

        public void setApk_name(String apk_name) {
            this.apk_name = apk_name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}


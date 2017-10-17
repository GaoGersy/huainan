package com.gersion.huinan.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by aa326 on 2017/10/17.
 */

public class Bean implements Serializable{

    private int rtn;
    private DataBean data;

    public int getRtn() {
        return rtn;
    }

    public void setRtn(int rtn) {
        this.rtn = rtn;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        private String preview_title;
        private PayPageBean pay_page;
        private int product_id;
        private int login_user_id;
        private List<ListBean> list;
        private List<String> preview_list;

        public String getPreview_title() {
            return preview_title;
        }

        public void setPreview_title(String preview_title) {
            this.preview_title = preview_title;
        }

        public PayPageBean getPay_page() {
            return pay_page;
        }

        public void setPay_page(PayPageBean pay_page) {
            this.pay_page = pay_page;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getLogin_user_id() {
            return login_user_id;
        }

        public void setLogin_user_id(int login_user_id) {
            this.login_user_id = login_user_id;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<String> getPreview_list() {
            return preview_list;
        }

        public void setPreview_list(List<String> preview_list) {
            this.preview_list = preview_list;
        }

        public static class PayPageBean implements Serializable{
            private String image_url;
            private String title;
            private String content;
            private String btn;
            private String show_event_id;
            private String click_event_id;

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getBtn() {
                return btn;
            }

            public void setBtn(String btn) {
                this.btn = btn;
            }

            public String getShow_event_id() {
                return show_event_id;
            }

            public void setShow_event_id(String show_event_id) {
                this.show_event_id = show_event_id;
            }

            public String getClick_event_id() {
                return click_event_id;
            }

            public void setClick_event_id(String click_event_id) {
                this.click_event_id = click_event_id;
            }
        }

        public static class ListBean implements Serializable{
            private String feed_id;
            private String title;
            private String webview_url;
            private String summary;
            private int fav_count;
            private boolean is_fav;
            private String feed_id_string;

            public String getFeed_id() {
                return feed_id;
            }

            public void setFeed_id(String feed_id) {
                this.feed_id = feed_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getWebview_url() {
                return webview_url;
            }

            public void setWebview_url(String webview_url) {
                this.webview_url = webview_url;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public int getFav_count() {
                return fav_count;
            }

            public void setFav_count(int fav_count) {
                this.fav_count = fav_count;
            }

            public boolean isIs_fav() {
                return is_fav;
            }

            public void setIs_fav(boolean is_fav) {
                this.is_fav = is_fav;
            }

            public String getFeed_id_string() {
                return feed_id_string;
            }

            public void setFeed_id_string(String feed_id_string) {
                this.feed_id_string = feed_id_string;
            }
        }
    }
}

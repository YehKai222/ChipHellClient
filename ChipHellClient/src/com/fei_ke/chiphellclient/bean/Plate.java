
package com.fei_ke.chiphellclient.bean;

import com.fei_ke.chiphellclient.utils.UrlParamsMap;

/**
 * 版块
 * 
 * @author 杨金阳
 * @2014-6-14
 */
public class Plate extends BaseBean {
    String title;
    String url;
    String xg1;// 今日帖数
    String fid;// 版块id

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getXg1() {
        return xg1;
    }

    public void setXg1(String xg1) {
        this.xg1 = xg1;
    }

    @Override
    public String toString() {
        return "Plate [title=" + title + ", url=" + url + ", xg1=" + xg1 + "]";
    }

    public String getFid() {
        if (fid == null) {
            fid = new UrlParamsMap(url).get("fid");
        }
        return fid;
    }

}

package ren.yale.android.cachewebview;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * $
 *
 * @date: 2023/3/23 16:43
 * @author: zengbobo
 */
public class WebPerformanceEvent {

    // web链接
    private String weburl;
    // pageName        页面类名
    private String pn;
    // pageAddress        页面对象内存地址
    private String pa;

    // navigationStart 前浏览器窗口的前一个网页关闭，发生unload事件时的时间戳。如果没有前一个网页，则等于fetchStart属性。
    private long ns;

    // unloadEventStart 如果前一个网页与当前网页属于同一个域名，则返回前一个网页的unload事件发生时的时间戳。
    // 如果没有前一个网页，或者之前的网页跳转不是在同一个域名内，则返回值为0。
    private long ues;

    // unloadEventEnd 如果前一个网页与当前网页属于同一个域名，则返回前一个网页unload事件的回调函数结束时的时间戳。
    // 如果没有前一个网页，或者之前的网页跳转不是在同一个域名内，则返回值为0。
    private long uee;

    // redirectStart 返回第一个HTTP跳转开始时的时间戳。如果没有跳转，或者不是同一个域名内部的跳转，则返回值为0。
    private long rs;

    // redirectEnd 返回最后一个HTTP跳转结束时（即跳转回应的最后一个字节接受完成时）的时间戳。如果没有跳转，或者不是同一个域名内部的跳转，则返回值为0。
    private long re;

    // fetchStart 返回浏览器准备使用HTTP请求读取文档时的时间戳。该事件在网页查询本地缓存之前发生。
    private long fs;

    // domainLookupStart 返回域名查询开始时的时间戳。如果使用持久连接，或者信息是从本地缓存获取的，则返回值等同于fetchStart属性的值。
    private long dls;

    // domainLookupEnd 返回域名查询结束时的时间戳。如果使用持久连接，或者信息是从本地缓存获取的，则返回值等同于fetchStart属性的值。
    private long dle;

    // connectStart 返回HTTP请求开始向服务器发送时的时间戳。如果使用持久连接（persistent connection），则返回值等同于fetchStart属性的值。
    private long cs;

    // connectEnd 返回浏览器与服务器之间的连接建立时的时间戳。如果建立的是持久连接，则返回值等同于fetchStart属性的值。连接建立指的是所有握手和认证过程全部结束。
    private long ce;

    // secureConnectionStart 返回浏览器与服务器开始安全链接的握手时的时间戳。如果当前网页不要求安全连接，则返回0。
    private long scs;

    // requestStart 返回浏览器向服务器发出HTTP请求时（或开始读取本地缓存时）的时间戳。
    private long res;

    // responseStart 返回浏览器从服务器收到（或从本地缓存读取）第一个字节时的时间戳。
    private long rss;

    // responseEnd 返回浏览器从服务器收到（或从本地缓存读取）最后一个字节时（如果在此之前HTTP连接已经关闭，则返回关闭时）的时间戳。
    private long rse;

    // domLoading 返回当前网页DOM结构开始解析时（即Document.readyState属性变为“loading”、相应的readystatechange事件触发时）的时间戳。
    private long dl;

    // domInteractive 返回当前网页DOM结构结束解析、开始加载内嵌资源时（即Document.readyState属性变为“interactive”、相应的readystatechange事件触发时）的时间戳。
    private long di;

    // domContentLoadedEventStart 返回当前网页 DOMContentLoaded 事件发生时（即DOM结构解析完毕、所有脚本开始运行时）的时间戳。
    private long dcle;

    // domContentLoadedEventEnd 返回当前网页所有需要执行的脚本执行完成时的时间戳。
    private long dclee;

    // domComplete  返回当前网页DOM结构生成时（即Document.readyState属性变为“complete”，以及相应的readystatechange事件发生时）的时间戳。
    private long dc;

    // loadEventStart 返回当前网页load事件的回调函数开始时的时间戳。如果该事件还没有发生，返回0。
    private long les;

    // loadEventEnd 返回当前网页load事件的回调函数运行结束时的时间戳。如果该事件还没有发生，返回0。通过while循环持续判断直到loadEventEnd>0则表示完全加载完毕了！网络不再有任何数据请求、dom也渲染完毕了！！！
    private long lee;


    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public long getNs() {
        return ns;
    }

    public void setNs(long ns) {
        this.ns = ns;
    }

    public long getUes() {
        return ues;
    }

    public void setUes(long ues) {
        this.ues = ues;
    }

    public long getUee() {
        return uee;
    }

    public void setUee(long uee) {
        this.uee = uee;
    }

    public long getRs() {
        return rs;
    }

    public void setRs(long rs) {
        this.rs = rs;
    }

    public long getRe() {
        return re;
    }

    public void setRe(long re) {
        this.re = re;
    }

    public long getFs() {
        return fs;
    }

    public void setFs(long fs) {
        this.fs = fs;
    }

    public long getDls() {
        return dls;
    }

    public void setDls(long dls) {
        this.dls = dls;
    }

    public long getDle() {
        return dle;
    }

    public void setDle(long dle) {
        this.dle = dle;
    }

    public long getCs() {
        return cs;
    }

    public void setCs(long cs) {
        this.cs = cs;
    }

    public long getCe() {
        return ce;
    }

    public void setCe(long ce) {
        this.ce = ce;
    }

    public long getScs() {
        return scs;
    }

    public void setScs(long scs) {
        this.scs = scs;
    }

    public long getRes() {
        return res;
    }

    public void setRes(long res) {
        this.res = res;
    }

    public long getRss() {
        return rss;
    }

    public void setRss(long rss) {
        this.rss = rss;
    }

    public long getRse() {
        return rse;
    }

    public void setRse(long rse) {
        this.rse = rse;
    }

    public long getDl() {
        return dl;
    }

    public void setDl(long dl) {
        this.dl = dl;
    }

    public long getDi() {
        return di;
    }

    public void setDi(long di) {
        this.di = di;
    }

    public long getDcle() {
        return dcle;
    }

    public void setDcle(long dcle) {
        this.dcle = dcle;
    }

    public long getDclee() {
        return dclee;
    }

    public void setDclee(long dclee) {
        this.dclee = dclee;
    }

    public long getDc() {
        return dc;
    }

    public void setDc(long dc) {
        this.dc = dc;
    }

    public long getLes() {
        return les;
    }

    public void setLes(long les) {
        this.les = les;
    }

    public long getLee() {
        return lee;
    }

    public void setLee(long lee) {
        this.lee = lee;
    }

    @Override
    public String toString() {
        return "WebPerformanceEvent{" +
                "pn='" + pn + '\'' +
                ", pa='" + pa + '\'' +
                ", ns=" + getStr(ns )+
                ", ues=" + getStr(ues) +
                ", uee=" + getStr(uee) +
                ", rs=" + getStr(rs )+
                ", re=" + getStr(re) +
                ", fs=" + getStr(fs )+
                ", dls=" + getStr(dls) +
                ", dle=" + getStr(dle) +
                ", cs=" + getStr(cs) +
                ", ce=" + getStr(ce )+
                ", scs=" + getStr(scs) +
                ", res=" + getStr(res) +
                ", rss=" + getStr(rss) +
                ", rse=" + getStr(rse )+
                ", dl=" + getStr(dl) +
                ", di=" + getStr(di )+
                ", dcle=" + getStr(dcle) +
                ", dclee=" + getStr(dclee )+
                ", dc=" + getStr(dc) +
                ", les=" + getStr(les) +
                ", lee=" + getStr(lee) +
                '}';
    }

    public static String getStr(Long time){
        try {
            if(time==null){
                return "null";
            }
            Date mDate= new Date();
            mDate.setTime(time);
            return new SimpleDateFormat("yyyy-mm-dd HH:mm:ss:sss").format(mDate);
        } catch (Exception e) {
            e.printStackTrace();
            return  time.toString();
        }
    }
}

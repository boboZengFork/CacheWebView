package ren.yale.android.cachewebview;

/**
 * $
 *
 * @date: 2023/3/23 16:42
 * @author: zengbobo
 */
public class WebPerformanceBean {
    // 前浏览器窗口的前一个网页关闭，发生unload事件时的时间戳。如果没有前一个网页，则等于fetchStart属性。
    private long navigationStart;

    // 如果前一个网页与当前网页属于同一个域名，则返回前一个网页的unload事件发生时的时间戳。
    // 如果没有前一个网页，或者之前的网页跳转不是在同一个域名内，则返回值为0。
    private long unloadEventStart;

    // 如果前一个网页与当前网页属于同一个域名，则返回前一个网页unload事件的回调函数结束时的时间戳。
    // 如果没有前一个网页，或者之前的网页跳转不是在同一个域名内，则返回值为0。
    private long unloadEventEnd;

    // 返回第一个HTTP跳转开始时的时间戳。如果没有跳转，或者不是同一个域名内部的跳转，则返回值为0。
    private long redirectStart;

    // 返回最后一个HTTP跳转结束时（即跳转回应的最后一个字节接受完成时）的时间戳。如果没有跳转，或者不是同一个域名内部的跳转，则返回值为0。
    private long redirectEnd;

    // 返回浏览器准备使用HTTP请求读取文档时的时间戳。该事件在网页查询本地缓存之前发生。
    private long fetchStart;

    // 返回域名查询开始时的时间戳。如果使用持久连接，或者信息是从本地缓存获取的，则返回值等同于fetchStart属性的值。
    private long domainLookupStart;

    // 返回域名查询结束时的时间戳。如果使用持久连接，或者信息是从本地缓存获取的，则返回值等同于fetchStart属性的值。
    private long domainLookupEnd;

    // 返回HTTP请求开始向服务器发送时的时间戳。如果使用持久连接（persistent connection），则返回值等同于fetchStart属性的值。
    private long connectStart;

    // 返回浏览器与服务器之间的连接建立时的时间戳。如果建立的是持久连接，则返回值等同于fetchStart属性的值。连接建立指的是所有握手和认证过程全部结束。
    private long connectEnd;

    // 返回浏览器与服务器开始安全链接的握手时的时间戳。如果当前网页不要求安全连接，则返回0。
    private long secureConnectionStart;

    // 返回浏览器向服务器发出HTTP请求时（或开始读取本地缓存时）的时间戳。
    private long requestStart;

    // 返回浏览器从服务器收到（或从本地缓存读取）第一个字节时的时间戳。
    private long responseStart;

    // 返回浏览器从服务器收到（或从本地缓存读取）最后一个字节时（如果在此之前HTTP连接已经关闭，则返回关闭时）的时间戳。
    private long responseEnd;

    // 返回当前网页DOM结构开始解析时（即Document.readyState属性变为“loading”、相应的readystatechange事件触发时）的时间戳。
    private long domLoading;

    // 返回当前网页DOM结构结束解析、开始加载内嵌资源时（即Document.readyState属性变为“interactive”、相应的readystatechange事件触发时）的时间戳。
    private long domInteractive;

    // 返回当前网页 DOMContentLoaded 事件发生时（即DOM结构解析完毕、所有脚本开始运行时）的时间戳。
    private long domContentLoadedEventStart;

    // 返回当前网页所有需要执行的脚本执行完成时的时间戳。
    private long domContentLoadedEventEnd;

    // 返回当前网页DOM结构生成时（即Document.readyState属性变为“complete”，以及相应的readystatechange事件发生时）的时间戳。
    private long domComplete;

    // 返回当前网页load事件的回调函数开始时的时间戳。如果该事件还没有发生，返回0。
    private long loadEventStart;

    //返回当前网页load事件的回调函数运行结束时的时间戳。如果该事件还没有发生，返回0。通过while循环持续判断直到loadEventEnd>0则表示完全加载完毕了！网络不再有任何数据请求、dom也渲染完毕了！！！
    private long loadEventEnd;

    public long getNavigationStart() {
        return navigationStart;
    }

    public void setNavigationStart(long navigationStart) {
        this.navigationStart = navigationStart;
    }

    public long getUnloadEventStart() {
        return unloadEventStart;
    }

    public void setUnloadEventStart(long unloadEventStart) {
        this.unloadEventStart = unloadEventStart;
    }

    public long getUnloadEventEnd() {
        return unloadEventEnd;
    }

    public void setUnloadEventEnd(long unloadEventEnd) {
        this.unloadEventEnd = unloadEventEnd;
    }

    public long getRedirectStart() {
        return redirectStart;
    }

    public void setRedirectStart(long redirectStart) {
        this.redirectStart = redirectStart;
    }

    public long getRedirectEnd() {
        return redirectEnd;
    }

    public void setRedirectEnd(long redirectEnd) {
        this.redirectEnd = redirectEnd;
    }

    public long getFetchStart() {
        return fetchStart;
    }

    public void setFetchStart(long fetchStart) {
        this.fetchStart = fetchStart;
    }

    public long getDomainLookupStart() {
        return domainLookupStart;
    }

    public void setDomainLookupStart(long domainLookupStart) {
        this.domainLookupStart = domainLookupStart;
    }

    public long getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public void setDomainLookupEnd(long domainLookupEnd) {
        this.domainLookupEnd = domainLookupEnd;
    }

    public long getConnectStart() {
        return connectStart;
    }

    public void setConnectStart(long connectStart) {
        this.connectStart = connectStart;
    }

    public long getConnectEnd() {
        return connectEnd;
    }

    public void setConnectEnd(long connectEnd) {
        this.connectEnd = connectEnd;
    }

    public long getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public void setSecureConnectionStart(long secureConnectionStart) {
        this.secureConnectionStart = secureConnectionStart;
    }

    public long getRequestStart() {
        return requestStart;
    }

    public void setRequestStart(long requestStart) {
        this.requestStart = requestStart;
    }

    public long getResponseStart() {
        return responseStart;
    }

    public void setResponseStart(long responseStart) {
        this.responseStart = responseStart;
    }

    public long getResponseEnd() {
        return responseEnd;
    }

    public void setResponseEnd(long responseEnd) {
        this.responseEnd = responseEnd;
    }

    public long getDomLoading() {
        return domLoading;
    }

    public void setDomLoading(long domLoading) {
        this.domLoading = domLoading;
    }

    public long getDomInteractive() {
        return domInteractive;
    }

    public void setDomInteractive(long domInteractive) {
        this.domInteractive = domInteractive;
    }

    public long getDomContentLoadedEventStart() {
        return domContentLoadedEventStart;
    }

    public void setDomContentLoadedEventStart(long domContentLoadedEventStart) {
        this.domContentLoadedEventStart = domContentLoadedEventStart;
    }

    public long getDomContentLoadedEventEnd() {
        return domContentLoadedEventEnd;
    }

    public void setDomContentLoadedEventEnd(long domContentLoadedEventEnd) {
        this.domContentLoadedEventEnd = domContentLoadedEventEnd;
    }

    public long getDomComplete() {
        return domComplete;
    }

    public void setDomComplete(long domComplete) {
        this.domComplete = domComplete;
    }

    public long getLoadEventStart() {
        return loadEventStart;
    }

    public void setLoadEventStart(long loadEventStart) {
        this.loadEventStart = loadEventStart;
    }

    public long getLoadEventEnd() {
        return loadEventEnd;
    }

    public void setLoadEventEnd(long loadEventEnd) {
        this.loadEventEnd = loadEventEnd;
    }
}

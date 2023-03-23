package ren.yale.android.cachewebview;

import android.webkit.JavascriptInterface;

import com.google.gson.Gson;

/**
 * $
 *
 * @date: 2023/3/23 16:41
 * @author: zengbobo
 */
public class WebViewJsInterface {
    @JavascriptInterface
    public void sendResource(String timing, String curUrl) {
        try {
            WebPerformanceBean bean = new Gson().fromJson(timing, WebPerformanceBean.class);

            WebPerformanceEvent event = new WebPerformanceEvent();
//            event.setPn(getActivityByContext(context).getClass().getSimpleName());
//            event.setPa(StringUtils.INSTANCE.getObjectMemoryAddress(getActivityByContext(context)));

            event.setNs(bean.getNavigationStart());
            event.setUes(bean.getUnloadEventStart());
            event.setUee(bean.getUnloadEventEnd());
            event.setRs(bean.getRedirectStart());
            event.setRe(bean.getRedirectEnd());
            event.setFs(bean.getFetchStart());
            event.setDls(bean.getDomainLookupStart());
            event.setDle(bean.getDomainLookupEnd());
            event.setCs(bean.getConnectStart());
            event.setCe(bean.getConnectEnd());
            event.setScs(bean.getSecureConnectionStart());
            event.setRes(bean.getRequestStart());
            event.setRss(bean.getResponseStart());
            event.setRse(bean.getResponseEnd());
            event.setDl(bean.getDomLoading());
            event.setDi(bean.getDomInteractive());
            event.setDcle(bean.getDomContentLoadedEventStart());
            event.setDclee(bean.getDomContentLoadedEventEnd());
            event.setDc(bean.getDomComplete());
            event.setLes(bean.getLoadEventStart());
            event.setLee(bean.getLoadEventEnd());

            event.setWeburl(curUrl);


//            Log.v("fph", "request cost time: " + (event.getRe() - event.getRes()) + "ms");
//            Log.v("fph", "dom build time: " + (event.getDc() - event.getDi()) + "ms.");
//            Log.v("fph", "dom ready time: " + (event.getDcle() - event.getNs()) + "ms.");
//            Log.v("fph", "white screen time:" + (event.getDc() - event.getFs()) + "ms.");
//            Log.v("fph", "load time: " + (event.getLee() - event.getNs()) + "ms.");
//            Log.v("fph", "onload time: " + (event.getLee() - event.getFs()) + "ms.");

            System.out.println("zengbobo " + event.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

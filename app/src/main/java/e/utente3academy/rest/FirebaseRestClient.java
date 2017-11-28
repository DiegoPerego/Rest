package e.utente3academy.rest;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.net.Authenticator;
import com.loopj.android.http.*;

/**
 * Created by utente3.academy on 28-Nov-17.
 */

public class FirebaseRestClient {

    private static final String baseUrl = "https://hello-6d8d0.firebaseio.com/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler){
        client.get(getTotalUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler){
        client.post(getTotalUrl(url), params, responseHandler);
    }

    private static String getTotalUrl (String relativeUrl){
        return baseUrl + relativeUrl + ".json";
    }
}

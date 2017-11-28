package e.utente3academy.rest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loopj.android.http.*;

import org.json.JSONArray;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseRestClient.get("Users", null, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                if(statusCode==200){
                    String s = response.toString();

                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                if(statusCode >=400){
                    String s = errorResponse.toString();
                }
            }
        });

        /*AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://hello-6d8d0.firebaseio.com/Users", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if(statusCode==200){
                    String s = new String(responseBody);
                    Log.i("Tag", s);
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                if(statusCode>=400 && statusCode<500){
                    String s = new String(responseBody);
                    Log.i("Tag", s);
                }
            }
        });*/
    }
}

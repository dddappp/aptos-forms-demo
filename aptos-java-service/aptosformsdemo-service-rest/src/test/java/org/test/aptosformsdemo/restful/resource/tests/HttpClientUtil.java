package org.test.aptosformsdemo.restful.resource.tests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yangjiefeng on 2018/8/26.
 */
public class HttpClientUtil {

    public static String get(String token, String url) {
        try {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = doHttpGet(client, token, url);
            int responseCode = response.getStatusLine().getStatusCode();
            //Assert.assertEquals("20", String.valueOf(responseCode).substring(0, 2));
            System.out.println("==========================================");
            System.out.println(responseCode);
            System.out.println("==========================================");
            String rspStr = readString(response);
            System.out.println(rspStr);
            client.close();
            return rspStr;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /**
     * Http POST
     */
    private static HttpResponse doHttpGet(CloseableHttpClient client, String token, String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        // ///////////////////////////////////////////////////////////
        httpGet.setHeader("Accept", "application/json, text/plain");
        // ///////////////////////////////////////////////////////////
        httpGet.setHeader("Content-Type", "application/json");
        httpGet.setHeader("Authorization", "Bearer " + token);
        //getContentFromResponse(response);
        return client.execute(httpGet);
    }


    public static String post(String token, String url, Object obj) {
        try {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = doHttpPost(client, token, url, obj);
            int responseCode = response.getStatusLine().getStatusCode();
            //Assert.assertEquals("20", String.valueOf(responseCode).substring(0, 2));
            System.out.println("==========================================");
            System.out.println(responseCode);
            System.out.println("==========================================");
            String rspStr = readString(response);
            System.out.println(rspStr);
            client.close();
            return rspStr;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static void put(String token, String url, Object obj) {
        try {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = doHttpPut(client, token, url, obj);
            int responseCode = response.getStatusLine().getStatusCode();
            //Assert.assertEquals("20", String.valueOf(responseCode).substring(0, 2));
            System.out.println("==========================================");
            System.out.println(responseCode);
            System.out.println("==========================================");
            System.out.println(readString(response));
            client.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }


    public static void patch(String token, String url, Object obj) {
        try {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = doHttpPatch(client, token, url, obj);
            int responseCode = response.getStatusLine().getStatusCode();
            //Assert.assertEquals("20", String.valueOf(responseCode).substring(0, 2));
            System.out.println("==========================================");
            System.out.println(responseCode);
            System.out.println("==========================================");
            System.out.println(readString(response));
            client.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }


    public static void delete(String token, String url) {
        try {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = doHttpDelete(client, token, url);
            int responseCode = response.getStatusLine().getStatusCode();
            //Assert.assertEquals("20", String.valueOf(responseCode).substring(0, 2));
            System.out.println("==========================================");
            System.out.println(responseCode);
            System.out.println("==========================================");
            System.out.println(readString(response));
            client.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static String getJwtTokenRemote(String authTokenUrl, String username, String password) {
        return getJwtTokenRemote(authTokenUrl, username, password, null);
    }

    /**
     * Get JWT token from remote server.
     *
     * @return
     */
    public static String getJwtTokenRemote(String authTokenUrl, String username, String password, String tokenKey) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        try {
            HttpPost httpPost = new HttpPost(authTokenUrl);
            httpPost.setHeader("ACCEPT", "application/json");
            List<NameValuePair> pairs = new ArrayList<>();
            pairs.add(new BasicNameValuePair("grant_type", "password"));
            pairs.add(new BasicNameValuePair("client_id", "malls"));
            pairs.add(new BasicNameValuePair("username", username));
            pairs.add(new BasicNameValuePair("password", password));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(pairs);
            httpPost.setEntity(entity);
            HttpResponse response = client.execute(httpPost);
            //Assert.assertEquals(true, String.valueOf(response.getStatusLine().getStatusCode()).startsWith("20"));
            System.out.println(response.getStatusLine().getStatusCode());
            String jsonStr = readString(response);
            System.out.println(jsonStr);
            client.close();
            //JSONObject jsonObject = JSONObject.parseObject(jsonStr);
            Map<String, Object> jsonObject = getObjectMapper().readValue(jsonStr, new TypeReference<Map<String, Object>>() {
            });
            //String token = (String)jsonObject.get("access_token");
            String token = (String) jsonObject.get(tokenKey == null ? "access_token" : tokenKey);
            if (token == null) {
                token = (String) jsonObject.get(tokenKey == null ? "token" : tokenKey);
            }
            if (token == null) {
                throw new NullPointerException("access_token is null.");
            }
            System.out.println(token);
            return token;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static String appendUrl(String url, String component) {
        return (url.endsWith("/") ? url : url + "/") + component;
    }

    /**
     * Http POST
     */
    private static HttpResponse doHttpPost(CloseableHttpClient client, String token, String url, Object dto) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        // ///////////////////////////////////////////////////////////
        httpPost.setHeader("Accept", "application/json, text/plain");
        // ///////////////////////////////////////////////////////////
        httpPost.setHeader("Content-Type", "application/json");
        // if token is not null or empty, then set the Authorization header.
        if (token != null && !token.isEmpty()) {
            httpPost.setHeader("Authorization", "Bearer " + token);
        }
        //String json = JSON.toJSONString(dto);
        String json = getObjectMapper().writeValueAsString(dto);
        StringEntity entity = new StringEntity(json, "utf-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        //getContentFromResponse(response);
        return client.execute(httpPost);
    }

    /**
     * Http PUT
     */
    private static HttpResponse doHttpPut(CloseableHttpClient client, String token, String url, Object dto) throws IOException {
        HttpPut httpPut = new HttpPut(url);
        httpPut.setHeader("Accept", "application/json");
        httpPut.setHeader("Content-Type", "application/json");
        httpPut.setHeader("Authorization", "Bearer " + token);
        //String json = JSON.toJSONString(dto);
        String json = getObjectMapper().writeValueAsString(dto);
        StringEntity entity = new StringEntity(json, "utf-8");
        entity.setContentType("application/json");
        httpPut.setEntity(entity);
        //getContentFromResponse(response);
        return client.execute(httpPut);
    }

    /**
     * Http PATCH
     */
    private static HttpResponse doHttpPatch(CloseableHttpClient client, String token, String url, Object dto) throws IOException {
        HttpPatch httpPatch = new HttpPatch(url);
        httpPatch.setHeader("Accept", "application/json");
        httpPatch.setHeader("Content-Type", "application/json");
        httpPatch.setHeader("Authorization", "Bearer " + token);
        //String json = JSON.toJSONString(dto);
        String json = getObjectMapper().writeValueAsString(dto);
        StringEntity entity = new StringEntity(json, "utf-8");
        entity.setContentType("application/json");
        httpPatch.setEntity(entity);
        //getContentFromResponse(response);
        return client.execute(httpPatch);
    }

    private static ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    /**
     * Http DELETE
     */
    private static HttpResponse doHttpDelete(CloseableHttpClient client, String token, String url) throws IOException {
        HttpDelete httpDelete = new HttpDelete(url);
        httpDelete.setHeader("Accept", "application/json");
        httpDelete.setHeader("Content-Type", "application/json");
        httpDelete.setHeader("Authorization", "Bearer " + token);
        //String json = JSON.toJSONString(dto);
        //StringEntity entity = new StringEntity(json, "utf-8");
        //entity.setContentType("application/json");
        //httpPut.setEntity(entity);
        //getContentFromResponse(response);
        return client.execute(httpDelete);
    }

    /**
     * Read the content from the response as a string.
     *
     * @param response
     * @return
     * @throws IOException
     */
    static String readString(HttpResponse response) throws IOException {
        InputStream inputStream = response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
}

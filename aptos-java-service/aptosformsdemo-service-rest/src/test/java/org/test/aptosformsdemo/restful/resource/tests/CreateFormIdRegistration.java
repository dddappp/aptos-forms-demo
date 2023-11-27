package org.test.aptosformsdemo.restful.resource.tests;

import org.test.aptosformsdemo.domain.formidregistration.CreateOrMergePatchFormIdRegistrationDto;

import java.util.UUID;

public class CreateFormIdRegistration {
    //private static String baseUrl = "http://47.104.74.139:8080/api/";
    private static String baseUrl = "http://localhost:1023/api/";

    //private static String authTokenUrl = "http://47.104.74.139:8080/api/iam/oauth2/token";
    private static String authTokenUrl = "http://localhost:1003/api/login";
    //private static String authTokenUrl = "http://localhost:8080/api/iam/oauth2/token";
    private static String username = "admin";
    private static String password = "654321";


    // /////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        String token = null;
        String url = null;
        // /////////////////////////////////////////
        //token = HttpClientUtil.getJwtTokenRemote(authTokenUrl, username, password, "token");
        //token = getJwtToken();

        String testFormId = UUID.randomUUID().toString().hashCode() + "";
        CreateOrMergePatchFormIdRegistrationDto.CreateFormIdRegistrationDto createFormIdReg
                = new CreateOrMergePatchFormIdRegistrationDto.CreateFormIdRegistrationDto();
        createFormIdReg.setFormId("FormId_" + testFormId);
        createFormIdReg.setActive(true);
        createFormIdReg.setCommandId(testFormId);

        url = HttpClientUtil.appendUrl(baseUrl, "FormIdRegistrations");
        HttpClientUtil.post(token, url, createFormIdReg);

    }

}

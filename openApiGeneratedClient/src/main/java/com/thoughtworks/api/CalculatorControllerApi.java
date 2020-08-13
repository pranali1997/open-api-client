package com.thoughtworks.api;

import com.thoughtworks.invoker.ApiClient;

import com.thoughtworks.model.InputRequest;
//import com.thoughtworks.model.ResponseEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Component("com.thoughtworks.api.CalculatorControllerApi")
public class CalculatorControllerApi {
    private ApiClient apiClient;

    public CalculatorControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CalculatorControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * div
     * 
     * <p><b>200</b> - OK
     * @param inputRequest  (optional)
     * @return ResponseEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity divUsingPOST(InputRequest inputRequest) throws RestClientException {
        return divUsingPOSTWithHttpInfo(inputRequest).getBody();
    }

    /**
     * div
     * 
     * <p><b>200</b> - OK
     * @param inputRequest  (optional)
     * @return ResponseEntity&lt;ResponseEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseEntity> divUsingPOSTWithHttpInfo(InputRequest inputRequest) throws RestClientException {
        Object postBody = inputRequest;
        
        String path = apiClient.expandPath("/calculator/div", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ResponseEntity> returnType = new ParameterizedTypeReference<ResponseEntity>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * getCalculation
     * 
     * <p><b>200</b> - OK
     * @return List&lt;InputRequest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InputRequest> getCalculationUsingGET() throws RestClientException {
        return getCalculationUsingGETWithHttpInfo().getBody();
    }

    /**
     * getCalculation
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;InputRequest&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InputRequest>> getCalculationUsingGETWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/calculator/history", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<InputRequest>> returnType = new ParameterizedTypeReference<List<InputRequest>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * sub
     * 
     * <p><b>200</b> - OK
     * @param inputRequest  (optional)
     * @return ResponseEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity subUsingPOST(InputRequest inputRequest) throws RestClientException {
        return subUsingPOSTWithHttpInfo(inputRequest).getBody();
    }

    /**
     * sub
     * 
     * <p><b>200</b> - OK
     * @param inputRequest  (optional)
     * @return ResponseEntity&lt;ResponseEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseEntity> subUsingPOSTWithHttpInfo(InputRequest inputRequest) throws RestClientException {
        Object postBody = inputRequest;
        
        String path = apiClient.expandPath("/calculator/sub", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ResponseEntity> returnType = new ParameterizedTypeReference<ResponseEntity>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * sum
     * 
     * <p><b>200</b> - OK
     * @param inputRequest  (optional)
     * @return ResponseEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity sumUsingPOST(InputRequest inputRequest) throws RestClientException {
        return sumUsingPOSTWithHttpInfo(inputRequest).getBody();
    }

    /**
     * sum
     * 
     * <p><b>200</b> - OK
     * @param inputRequest  (optional)
     * @return ResponseEntity&lt;ResponseEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseEntity> sumUsingPOSTWithHttpInfo(InputRequest inputRequest) throws RestClientException {
        Object postBody = inputRequest;
        
        String path = apiClient.expandPath("/calculator/sum", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ResponseEntity> returnType = new ParameterizedTypeReference<ResponseEntity>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}

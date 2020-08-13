# CalculatorControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**divUsingPOST**](CalculatorControllerApi.md#divUsingPOST) | **POST** /calculator/div | div
[**getCalculationUsingGET**](CalculatorControllerApi.md#getCalculationUsingGET) | **GET** /calculator/history | getCalculation
[**subUsingPOST**](CalculatorControllerApi.md#subUsingPOST) | **POST** /calculator/sub | sub
[**sumUsingPOST**](CalculatorControllerApi.md#sumUsingPOST) | **POST** /calculator/sum | sum



## divUsingPOST

> ResponseEntity divUsingPOST(inputRequest)

div

### Example

```java
// Import classes:
import com.thoughtworks.invoker.ApiClient;
import com.thoughtworks.invoker.ApiException;
import com.thoughtworks.invoker.Configuration;
import com.thoughtworks.invoker.models.*;
import com.thoughtworks.api.CalculatorControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CalculatorControllerApi apiInstance = new CalculatorControllerApi(defaultClient);
        InputRequest inputRequest = new InputRequest(); // InputRequest | 
        try {
            ResponseEntity result = apiInstance.divUsingPOST(inputRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatorControllerApi#divUsingPOST");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputRequest** | [**InputRequest**](InputRequest.md)|  | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCalculationUsingGET

> List&lt;InputRequest&gt; getCalculationUsingGET()

getCalculation

### Example

```java
// Import classes:
import com.thoughtworks.invoker.ApiClient;
import com.thoughtworks.invoker.ApiException;
import com.thoughtworks.invoker.Configuration;
import com.thoughtworks.invoker.models.*;
import com.thoughtworks.api.CalculatorControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CalculatorControllerApi apiInstance = new CalculatorControllerApi(defaultClient);
        try {
            List<InputRequest> result = apiInstance.getCalculationUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatorControllerApi#getCalculationUsingGET");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;InputRequest&gt;**](InputRequest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## subUsingPOST

> ResponseEntity subUsingPOST(inputRequest)

sub

### Example

```java
// Import classes:
import com.thoughtworks.invoker.ApiClient;
import com.thoughtworks.invoker.ApiException;
import com.thoughtworks.invoker.Configuration;
import com.thoughtworks.invoker.models.*;
import com.thoughtworks.api.CalculatorControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CalculatorControllerApi apiInstance = new CalculatorControllerApi(defaultClient);
        InputRequest inputRequest = new InputRequest(); // InputRequest | 
        try {
            ResponseEntity result = apiInstance.subUsingPOST(inputRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatorControllerApi#subUsingPOST");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputRequest** | [**InputRequest**](InputRequest.md)|  | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## sumUsingPOST

> ResponseEntity sumUsingPOST(inputRequest)

sum

### Example

```java
// Import classes:
import com.thoughtworks.invoker.ApiClient;
import com.thoughtworks.invoker.ApiException;
import com.thoughtworks.invoker.Configuration;
import com.thoughtworks.invoker.models.*;
import com.thoughtworks.api.CalculatorControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CalculatorControllerApi apiInstance = new CalculatorControllerApi(defaultClient);
        InputRequest inputRequest = new InputRequest(); // InputRequest | 
        try {
            ResponseEntity result = apiInstance.sumUsingPOST(inputRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatorControllerApi#sumUsingPOST");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputRequest** | [**InputRequest**](InputRequest.md)|  | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


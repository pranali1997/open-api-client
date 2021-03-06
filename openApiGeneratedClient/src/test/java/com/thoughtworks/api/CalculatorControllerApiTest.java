/*
 * Calculator Service
 * Create calculator to calculate numbers
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: example@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thoughtworks.api;

import com.thoughtworks.model.InputRequest;
//import com.thoughtworks.model.ResponseEntity;
import org.junit.Test;
import org.junit.Ignore;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalculatorControllerApi
 */
@Ignore
public class CalculatorControllerApiTest {

    private final CalculatorControllerApi api = new CalculatorControllerApi();

    
    /**
     * div
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void divUsingPOSTTest() {
        InputRequest inputRequest = null;
        ResponseEntity response = api.divUsingPOST(inputRequest);

        // TODO: test validations
    }
    
    /**
     * getCalculation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCalculationUsingGETTest() {
        List<InputRequest> response = api.getCalculationUsingGET();

        // TODO: test validations
    }
    
    /**
     * sub
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subUsingPOSTTest() {
        InputRequest inputRequest = null;
        ResponseEntity response = api.subUsingPOST(inputRequest);

        // TODO: test validations
    }
    
    /**
     * sum
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sumUsingPOSTTest() {
        InputRequest inputRequest = null;
        ResponseEntity response = api.sumUsingPOST(inputRequest);

        // TODO: test validations
    }
    
}

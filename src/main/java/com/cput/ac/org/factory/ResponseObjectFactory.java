package com.cput.ac.org.factory;

import com.cput.ac.org.domain.ResponseObject;

public class ResponseObjectFactory
{
    public static ResponseObject buildGenericResponseObject(String responseCode, String responseDescription)
    {
        return new ResponseObject(responseCode,responseDescription);
    }
}

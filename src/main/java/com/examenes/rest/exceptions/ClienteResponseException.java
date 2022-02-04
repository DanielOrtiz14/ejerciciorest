package com.examenes.rest.exceptions;

public class ClienteResponseException extends Exception {

    private static final long serialVersionUID = 1L;

    public ClienteResponseException() {super();}
    public ClienteResponseException(String Cve_Mensaje) { super(Cve_Mensaje); }
    public ClienteResponseException(String Cve_Mensaje, Throwable Cve_Error) { super(Cve_Mensaje, Cve_Error); }
    public ClienteResponseException(Throwable Cve_Error) { super(Cve_Error); }


}


package day10_NestedIf;

public class HTTPProtocol {

    public static void main(String[] args) {

        int statusCode = 301;
        int s = statusCode;

        String protocolNumber = (s==200)? "OK" :(s==201)? "Created" :(s==202)? "Accepted" :(s==301)? "Moved Permanently" :(s==303)? "See Other"
                :(s==304)? "Not Modified" :(s==307)? "Temporary Redirect" :(s==400)? "Bad Request" :(s==401)? "Unauthorized"
                :(s==403)? "Forbidden" :(s==404)? "Not Found" :(s==410)? "Gone" :(s==500)? "Internal Server Error" :(s==503)?
                "Service Unavailable" : "Invalid Number";

        System.out.println(protocolNumber);


    }
}
/*
HTTP is the protocol that governs communications between web-servers
and web clients. Part of the protocol includes a status code returned
by the server to tell the browser the status of its most recent page
request.
Some of the codes and their meanings are listed below:
status codes and their meanings:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
declare an int variable called statusCode, and a valid status
code is already given
write a program that prints out, on a line by itself, the
appropriate label from the above list based on status.
Example:
if status code = 200
output:
ok
NOTE: MUST USE TERNARY.output:
ok
 */
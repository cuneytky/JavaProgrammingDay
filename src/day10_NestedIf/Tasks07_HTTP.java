package day10_NestedIf;
public class Tasks07_HTTP {
    public static void main(String[] args) {
        int c = 505;
        System.out.println(c==200?"OK":c==201?"Created":c==202?"Accepted":c==301?"Moved Permanently":c==303?"see other":
                c==304?"Not Modified":c==307?"Temproray Redirect":c==400?"Bad Request":c==401?"Unauthorized":c==403?"Forbidden":
                c==404?"Not Found":c==410?"Gone":c==500?"Internal Server Error":c==503?"Service Unavailable":"invalid code");
    }
}
/*
7.  HTTP is the protocol that governs communications between web-servers and web clients.
    Part of the protocol includes a status code returned by the server to tell the browser
    the status of its most recent page request.
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
         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200
                    output:
                        ok
            NOTE: MUST USE TERNARY.

 */
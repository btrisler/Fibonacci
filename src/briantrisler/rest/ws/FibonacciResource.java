package briantrisler.rest.ws;

import javax.ws.rs.*; 
import java.util.ArrayList; 
import java.util.List;
import briantrisler.rest.ws.FibElement;

@Path("fibonacci")
public class FibonacciResource {
    @GET
    @Produces("application/xml")
    public List<FibElement> calcFib(@QueryParam("n") int n) {
		
		List<FibElement> fibList = new ArrayList<FibElement>();
		
		if(n < 0) {
			fibList.add(new FibElement(0, "Error: input must be positive!"));
			//return "Error: input must be positive!";
			return fibList;
		}
		else if (n == 0) {
			fibList.add(new FibElement(0,"Error:  You really want to see 0 numbers?"));
			//return "Error:  You really want to see 0 numbers?";
			return fibList;
		}
		else {
			String fibString = "0";
			fibList.add(new FibElement(0, "0"));
			
			for(int i=1; i<n; i++) {
				fibString = fibString + " " + recFib(i);
				fibList.add(new FibElement(i, recFib(i)));
			}
			//return fibString;
			return fibList;
		}
	}
	
	private int recFib(int fib) {
		if(fib == 0) {
			return 0;
		}
		else if(fib == 1) {
			return 1;
		}
		else {
			return recFib(fib - 1) + recFib(fib - 2);
		}
	}
	
}


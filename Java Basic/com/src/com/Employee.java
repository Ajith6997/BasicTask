
package com;


public interface Employee {
    void name();
    
}
class Detail implements Employee {
public void name() {
	System.out.println("AJITH");
}

public static void main(String[] args) {
	Detail obj = new Detail();
	obj.name();
}
}
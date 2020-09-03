//answer for the below qestion
@interface Resource {
String name();
int priority() default 0;
}
 
 @Resource(name=“Customer1”, priority=100)  class ProcessOrders {
	
}

/*
Given the declaration:
@interface Resource {
String name();
int priority() default 0;
}

Examine this code fragment:

//Loc1  class ProcessOrders { … }

Which two annotations may be applied at Loc1 in the code fragment? (Choose two.)

A. @Resource(priority=100)

B. @Resource(priority=0)

C. @Resource(name=“Customer1”, priority=100)
D. @Resource(name=“Customer1”)
E. @Resource

*/







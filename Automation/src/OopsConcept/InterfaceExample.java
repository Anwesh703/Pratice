package OopsConcept;

public interface InterfaceExample {
//Interface allows only abstract method and by default interface method consists of public and abstract for method
//	i.e., It is used instead of class beacuse class accepts both complete method and 
	//Incomplete while interface allows only Incomplete (abstract) methods

/*(public abstract)*/	void run();
void run(int a);
//IN Interface, variables consists of default keywords as static & final
/*final static*/ int a=321;
//Note : while using interface keyword we does not use keyword as extends for inheritance
//instead we use keyword "implements"
//In Interface we call super class as interface & subclass as implementation class

}

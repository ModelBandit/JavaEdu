package DefaultAnno;

public interface Character {
	/*public static*/void func1();
	
	/*public*/default void func2() {
		System.out.println("Default Method");
	}
}

package chapter02;

public class Variables {
	public static void main(String[] args) {

	}

	public void CaluRadius() {

		final float pi = 3.141592f;
		float rad = 5.0f;

		float result = (rad * rad) * pi;

		System.out.printf("반지름이 5인 원의 면적은 %.4f", result);
	}

	public int prepp(int i)// ++i
	{
		i += 1;
		return i;
	}

	public int afterpp(int i)// i++
	{
		int n = i;
		i += 1;
		return n;
	}
}

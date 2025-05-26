package myNeural;

import java.lang.Math;

public class MyUtil {
	public static double simoid(int x) {
		double e = Math.log(x) / Math.log(2);
		
		if(x > 0) {
			for(int i = 0;i<x;++i) {
				e = e / e;
			}
		}
		else {
			for(int i = 0;i<x;++i) {
				e = e * e;
			}
		}
		
		return 1 / (1 + e);
	}
	
	public static float myLog(float num) {
		float n = 0f;
		return n;
	}
}

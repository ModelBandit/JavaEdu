package weatherKNN;

public class KNNMain {
	public static void main(String[] args) {
		KNearstNeighbors knn = new KNearstNeighbors();
		
		try {
			int regressionAir = knn.getAirInfo(3, 21, -1);
			System.out.println("대상 날짜의 대기 오염도: " + regressionAir);
		}
		catch(NoKInputException e) {
			System.out.println("님 미침?");
			e.printStackTrace();
		}
	}
}

package weatherKNN;
import java.util.Random;

public class KNearstNeighbors {
	
	int[] airInfo;
	
	public KNearstNeighbors() {
		airInfo = new int[FinalAirInfo.DayMax * FinalAirInfo.TimeMax];
		Random rand = new Random();
		//TODO1: 진짜 데이터 파일이나 리퀘스트로 리팩토링할것
		//TODO2: 리팩토링 후 파이썬에서도 해볼것
						//  0    1   2   3   4  5   6    7  8   9    10   11     12		13		14		15		16		17		18		19		20		21		22		23
		int[] dayRoutine = {80, 65, 30, 20, 23, 30, 40, 60, 90, 115, 140, 150,	160,	155,	150,	153,	160,	170,	200,	220,	210,	160,	140,	110};
		for(int i = 0; i < FinalAirInfo.DayMax;++i) {
			for(int j = 0;j<FinalAirInfo.TimeMax;++j) {
				airInfo[(i*FinalAirInfo.TimeMax)+j] = dayRoutine[j] + (rand.nextInt(20)-10);// dayRoutine + (+-10)
			}
		}
		System.out.println("DataSet Ready");
	}
	
	
	public int getAirInfo(int day, int hour, int k) throws NoKInputException {
		if(k < 0) {
			System.out.println("Error");
			throw new NoKInputException();// printStackTrace()에서 출력됨
		}
		
		int targetSum = 0;
		
		int checkStart =(day*FinalAirInfo.TimeMax)+hour - k/2;
		for(int i = 0; i < k; ++i) {
			targetSum += airInfo[checkStart+i];
		}
		
		return targetSum / k;
	}
}

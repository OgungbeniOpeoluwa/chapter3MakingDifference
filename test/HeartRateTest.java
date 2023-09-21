import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {
    @Test
    public  void testHeartRateCalculator(){
        HeartRate heartRate = new HeartRate("joy", "joseph", 24,   "july",  1999);
        assertNotNull(heartRate);

    }
    @Test
    public void testYearOfBirth(){
        HeartRate heartRate= new HeartRate("joy", "joseph", 23, "july", 1999);
        heartRate.setYearOfBirth(1998);
        assertEquals(1998,heartRate.getYearOfBirth());

    }
    @Test
    public void testAgeCalculation(){
        HeartRate heartRate = new HeartRate("joy", "joseph", 24,   "july",  1999);
        heartRate.setYearOfBirth(1999);
       int result = heartRate.caculateAgeInyears(2023);
        assertEquals(24,result);
    }
    @Test
    public void testMaximumHeartRate(){
        HeartRate heartRate = new HeartRate("joy", "joseph", 24,   "july", 1999);
        heartRate.setYearOfBirth(1999);
        heartRate.caculateAgeInyears(2023);
        double result = heartRate.maximumHeartRate();
        assertEquals(196.0,result);

    }
    @Test
    public  void testTargetHeartRate(){
        HeartRate heartRate = new HeartRate("joy", "joseph", 24,   "july",  1999);
        heartRate.setYearOfBirth(1999);
        heartRate.caculateAgeInyears(2023);
        heartRate.maximumHeartRate();
        double result = heartRate.targetHeartRate(50);
        assertEquals(98,result);
    }




}
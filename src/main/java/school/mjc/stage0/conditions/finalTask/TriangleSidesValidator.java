package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int flag;
        if(firstSide + secondSide  >  thirdSide) {
			if (secondSide + thirdSide > firstSide) {
				if (firstSide + thirdSide > side2) {
					flag = 1;
				}
			}
		}
		if(flag == 1)
		{
			System.out.println("this is a valid triangle");
		}
		else 
		{
			System.out.println("it's not a triangle");
		}
    }
}

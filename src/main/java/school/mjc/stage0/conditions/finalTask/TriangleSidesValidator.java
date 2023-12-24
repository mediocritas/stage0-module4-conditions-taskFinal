package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
//ab^2 = bc^2 + ca^2-2*bc*ca*cos(abc)
        double cosBC = (firstSide*firstSide - secondSide*secondSide - thirdSide*thirdSide)/(-2.*secondSide*thirdSide);
        double cosAC = (secondSide*secondSide - firstSide*firstSide - thirdSide*thirdSide)/(-2.*firstSide*thirdSide);
        double cosBA = (thirdSide*thirdSide - secondSide*secondSide - firstSide*firstSide)/(-2.*secondSide*firstSide);
        double sumOfAngles;
        try {
            sumOfAngles = Math.acos(cosBA) + Math.acos(cosAC) + Math.acos(cosBC);
        } catch (IllegalArgumentException e) {
                System.out.println("it's not a triangle");
                return;
        }
        System.out.println(sumOfAngles == Math.PI ? "this is a valid triangle" : "it's not a triangle");
        //System.out.println(sumOfAngles);
    }
}

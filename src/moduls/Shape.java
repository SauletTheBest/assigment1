package moduls;

import java.util.ArrayList;

public class Shape {
    ArrayList<point> pointList = new ArrayList<>();


    public void addPoint(point a){
        pointList.add(a);
    }

    private double[] getSides(){
        int len = pointList.size();
        double[] sides = new double[len];
        for (int i = 0; i < len; i++){
            sides[i] = pointList.get(i).distance(pointList.get((i+1)%len).getX(), pointList.get((i+1)%len).getY());
        }
        sides[len-1] = pointList.get(len-1).distance(pointList.getFirst().getX(), pointList.getFirst().getY());
        return sides;
    };

    public double calculatePerimeter(){
        double sum = 0;
        double[] s = getSides();
        int len = pointList.size();
        for (int i = 0; i < len; i++){
            sum += s[i];
        }
        return sum;
    }

    public double getAverageSide(){
        double[] s = getSides();
        int len = pointList.size();
        double max = s[0], min = s[0];
        for (int i = 1; i < len; i++){
            if (max < s[i]){
                max = s[i];
            } else if (min > s[i]) {
                min = s[i];
            }
        }
        return (max+min)/2;
    }

    public double getLongestSide(){
        double[] s = getSides();
        int len = pointList.size();
        double max = s[0];
        for (int i = 1; i < len; i++) {
            if (max < s[i]){
                max = s[i];
            }
        }

        return max;
    }

}
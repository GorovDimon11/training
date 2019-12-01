package Triangle;

import java.util.Arrays;
import java.util.stream.Stream;

public class Triangle {
    Side sides[] = new Side[3];

    public Triangle(Side s1, Side s2, Side s3){
        this.sides[0] = s1;
        this.sides[1] = s2;
        this.sides[2] = s3;
        createTriangle(this.sides);
    }



    public void createTriangle(Side[] sides) {
        if( ! q(sides[0].length, sides[1].length, sides[2].length) ){
            throw new IllegalArgumentException("Incorrect sides, they must be locked up");
        }
        System.out.println(toString());
    }

    private boolean q(double s1, double s2, double s3){
        if(s1 >= s2 && s1 >= s3){
            if (s2+s3 > s1){return true;}else{return false;}
        }else if(s2 >= s1 && s2 >= s3){
            if (s1+s3 > s2){return true;}else{return false;}
        }else if(s3 >= s1 && s3 >= s2){
            if (s1+s2 > s3){return true;}else{return false;}
        }
        return false;
    }

    @Override
    public String toString() {
        return "Triangle has well created" ;
    }

}

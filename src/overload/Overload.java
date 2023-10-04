package overload;

public class Overload {

    int width;
    int height;



    Overload(int width,int height){
        this.width = width;
        this.height = height;
    }

    Overload(int x){

        this.width = x;
        this.height = x;
    }
}

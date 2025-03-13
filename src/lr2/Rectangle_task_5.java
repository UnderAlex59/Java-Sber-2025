package lr2;

import javax.xml.transform.dom.DOMLocator;
import java.io.IOException;

public class Rectangle_task_5 {
    Float width;
    Float length;

    Rectangle_task_5(Float width, Float length) throws IOException{
        if (width <=0 || length <= 0) throw new IOException("Нельзя присваивать отрицательные значения!");
        else{
            this.width = width;
            this.length = length;
        }
    }

    public Float getPerimeter(){
        return 2*length+2*width;
    }

    public Float getSquare(){
        return width*length;
    }

    public void setWidth(Float width) {
        if (width <= 0) System.out.println("Нельзя присвоить нулевую или отрицательную ширину");
        else this.width = width;
    }

    public void setLength(Float length) {
        if (width <= 0) System.out.println("Нельзя присвоить нулевую или отрицательную длину");
        else this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public Float getLength() {
        return length;
    }
}

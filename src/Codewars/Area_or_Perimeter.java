package Codewars;
/*Вам даны длина и ширина 4-стороннего многоугольника. Многоугольник может быть как прямоугольником, так и квадратом.
Если это квадрат, верните его площадь. Если это прямоугольник, верните его периметр.
6, 10 --> 32
3, 3 --> 9
Примечание: для целей этого ката вы будете считать, что это квадрат,
если его длина и ширина равны, в противном случае это прямоугольник.
 */
public class Area_or_Perimeter {

    public static int areaOrPerimeter (int l, int w) {
        if (l == w) return (int) Math.pow(l,2);
        else return (l+w)*2;
    }

    public static void main(String[] args) {
        int l = 3;
        int w = 3;
        System.out.println(areaOrPerimeter(l,w));
    }
}

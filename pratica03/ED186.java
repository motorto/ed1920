class Point {
   int x, y;

   Point() {
      x = y = 0;
   }
   
   Point(int x0, int y0) {
      x = x0;
      y = y0;
   }

   public String toString() {
      return "(" + x + "," + y + ")";
   }
}

class Rectangle {
        Point a, b;

        Rectangle(int x1,int y1,int x2,int y2){
                Point a = new Point(x1,y1);
                Point b = new Point(x2,y2);
        }

        Rectangle(Point p1,Point p2){
                a = p1;
                b = p2;
        }

        int area(){
                int len = b.x -a.x;
                int wid = b.y - a.y;
                int area = len * wid;
                return area_;
        }

        int perimeter(){
                int len = b.x - a.x;
                int wid= b.y- a.y;
                int per = 2*len + 2*wid;
                return per_;
        }

        boolean pointInside(Point p){
                if ( p.x >= a.x && p.x <= b.x){
                        if (p.y >= a.y && p.y<=b.y)
                                return True;
                        else
                                return False;
                }
                return False;
        }

}

class ED186{
   public static void main(String[] args) {
      Point a = new Point(1,1);
      Point b = new Point(2,2);
      Point c = new Point(3,4);
      Point d = new Point(8,2);

      Rectangle amarelo  = new Rectangle(a, c);
      Rectangle laranja  = new Rectangle(2, 3, 9, 6);
      Rectangle verde    = new Rectangle(3, 4, 4, 5);
      Rectangle azul     = new Rectangle(5, 1, 6, 5);
      Rectangle vermelho = new Rectangle(7, 3, 9, 5);

      System.out.println("Perimetro do retangulo amarelo = " + amarelo.perimeter()); // 10
      System.out.println("Perimetro do retangulo laranja = " + laranja.perimeter()); // 20

      System.out.println("Area do retangulo amarelo = " + amarelo.area()); // 6
      System.out.println("Area do retangulo laranja = " + laranja.area()); // 21

      System.out.println("Ponto B dentro rectangulo amarelo? " + amarelo.pointInside(b)); // true
      System.out.println("Ponto D dentro rectangulo amarelo? " + amarelo.pointInside(d)); // false

      System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));       // true
      System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));         // false
      System.out.println("Retangulo vermelho dentro do laranja? " + laranja.rectangleInside(vermelho)); // true
   }
}

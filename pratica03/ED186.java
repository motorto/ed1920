class Rectangle {
        Point a, b;

        Rectangle(int x1,int y1,int x2,int y2){
                a = new Point(x1,y1);
                b = new Point(x2,y2);
        }

        Rectangle(Point p1,Point p2){
                a = p1;
                b = p2;
        }

        int area(){
                int len = b.x -a.x;
                int wid = b.y - a.y;
                int area_ = len * wid;
                return area_ ;
        }

        int perimeter(){
                int len = b.x - a.x;
                int wid= b.y- a.y;
                int per = 2*len + 2*wid;
                return per;
        }

        boolean pointInside(Point p){
                if ( p.x >= a.x && p.x <= b.x){
                        if (p.y >= a.y && p.y<=b.y)
                                return true;
                        else
                                return false;
                }
                return false;
        }

        boolean rectangleInside(Rectangle r){
                if (this.a.x <= r.a.x && r.b.x <= this.b.x){
                        if(r.a.y >= this.a.y && r.b.y <= this.b.y)
                                return true;
                        else
                                return false;
                }
                return false;
        }

}


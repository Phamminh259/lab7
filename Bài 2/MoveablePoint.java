 class MoveablePoint implements Moveable{
      int x;
       int y;
       int xSpeed;
       int ySpeed;
           public MoveablePoint (int x,int y,int xSpeed,int ySpeed ){
               this.x=x;
               this.y=y;
               this.xSpeed=xSpeed;
               this.ySpeed=ySpeed;
           }
           public String toString (){
            return "MoveablePoint [x="+x+",y="+y+",xSpeed="+xSpeed+",ySpeed="+ySpeed+"]";
 
                    }
     

    @Override
    public void moveUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveRight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
     
 }

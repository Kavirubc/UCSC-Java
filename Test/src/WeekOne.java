public class WeekOne {


        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }



        private int x= 10;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        private int y= 10;


        public void printAll(){
            System.out.println("x= "+x);
            System.out.println("y= "+y);

        }


        public static void main(String[] args) {

            WeekOne test = new WeekOne();

            test.setX(12);
            test.setY(12);
            test.printAll();

        }


    }



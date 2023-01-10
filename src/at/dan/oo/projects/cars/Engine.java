package at.dan.oo.projects.cars;

public class Engine {
        public enum TYPE {DIESEL,GAS}
        private int horsePower;
        private at.dan.oo.basics.Engine.TYPE type;

        public Engine(int horsePower, at.dan.oo.basics.Engine.TYPE type) {
            this.horsePower = horsePower;
            this.type = type;
        }

        public void drive(int amount){
            System.out.println("motor is running with " + amount);
        }

        public int getHorsePower() {
            return horsePower;
        }

        public at.dan.oo.basics.Engine.TYPE getType() {
            return type;
        }
}

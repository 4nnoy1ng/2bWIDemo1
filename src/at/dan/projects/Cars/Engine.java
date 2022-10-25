package at.dan.projects.Cars;

public class Engine {
        public enum TYPE {DIESEL,GAS}
        private int horsePower;
        private at.dan.oo.Engine.TYPE type;

        public Engine(int horsePower, at.dan.oo.Engine.TYPE type) {
            this.horsePower = horsePower;
            this.type = type;
        }

        public void drive(int amount){
            System.out.println("motor is running with " + amount);
        }

        public int getHorsePower() {
            return horsePower;
        }

        public at.dan.oo.Engine.TYPE getType() {
            return type;
        }
}

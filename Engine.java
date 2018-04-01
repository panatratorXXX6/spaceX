package rocket;

import actionWhithFuel.FuelConsumptionDelegate;

    public class Engine {

        private int weight;
        private int power;
        private double fuelTankSpace;

        public Engine(MainEngineProperties engineProperties, FuelTanks fuelTanks) {
            this.weight = engineProperties.getWeight() + fuelTanks.getWeight();
            this.power = engineProperties.getEnginePower();
            this.fuelTankSpace = fuelTanks.getCapacity();
        }

        private double accelerationTill1SpaceSpeed(int rocketWeight) {
            return 28440.0 / (this.power / rocketWeight);
        }

        public double accelerationTill2SpaceSpeed(int rocketWeight) {
            return 40020.0 / ((this.power + accelerationTill1SpaceSpeed(rocketWeight) * 0.5) / rocketWeight);
        }

        public int getPower() {
            return this.power;
        }

        public int getWeight() {
            return this.weight;
        }

        public double getFuelTankSpace() {
            return this.fuelTankSpace;
        }
    }


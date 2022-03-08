public class ParkingLot {
        HashMap<Integer, Vehicle> parkedVehicle = new HashMap<>();
        HashMap<Integer, Integer> vehicle_lot_data = new HashMap<>();
    
        public boolean isLotBooked(int lot, Context context) {
            Database db = new Database(context);
            return db.isAlreadyLotsExists(String.valueOf(lot));
        }
    
        public boolean isVehicleExists(int vehicleId, Context context) {
            Database db = new Database(context);
            return db.isAlreadyVehicleExists(String.valueOf(vehicleId));
        }
    
    }
    
    
        public Vehicle(){
    
        }
    
        public Vehicle(int primaryId,int id, int lot){
            this.id = id;
            this.lot = lot;
            this.primaryId = primaryId;
        }
        public Vehicle(int id, int lot){
            this.id = id;
            this.lot = lot;
        }
        public int id;
    
        public int getPrimaryId() {
            return primaryId;
        }
    
        public void setPrimaryId(int primaryId) {
            this.primaryId = primaryId;
        }
    
        public int primaryId;
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public int getLot() {
            return lot;
        }
    
        public void setLot(int lot) {
            this.lot = lot;
        }
    
        public int lot;
    
    }
    
    
}

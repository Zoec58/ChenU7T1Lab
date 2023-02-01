import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        ArrayList<Car> empty = new ArrayList<Car>();
        inventory = empty;
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car addedCar) {
        inventory.add(addedCar);
    }

    public boolean swap(int index1, int index2) {
        if(index1 < inventory.size() && index2 < inventory.size()) {
            Car temp = inventory.get(index1);
            inventory.set(index1, inventory.get(index2));
            inventory.set(index2, temp);
            return true;
        } else {
            return false;
        }
    }

    /* Adds a Car to the the inventory list at the index specified
     by indexToAdd; this method increases the size of inventory by 1

     PRECONDITION: indexToAdd < inventory.size()
   */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        /* IMPLEMENT ME */
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        @return returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element...
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       @return returns the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory list; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in inventory list

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        /* IMPLEMENT ME */
    }

}

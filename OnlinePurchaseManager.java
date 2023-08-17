import java.util.ArrayList;

public class OnlinePurchaseManager
{
    /** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
    private ArrayList<Gizmo> purchases;

    public OnlinePurchaseManager()
    {
        purchases = new ArrayList<Gizmo>();

        // part A sample input
        purchases.add(new Gizmo("ABC", true));
        purchases.add(new Gizmo("ABC", false));
        purchases.add(new Gizmo("XYZ", true));
        purchases.add(new Gizmo("lmnop", false));
        purchases.add(new Gizmo("ABC", true));
        purchases.add(new Gizmo("ABC", false));

        // additional sample data to help with Part B:
        purchases.add(new Gizmo("DUP", true));
        purchases.add(new Gizmo("DUP", true));
    }

    /** Returns the number of purchased Gizmo objects that are electronic and are
     * manufactured by maker, as described in part (a).
     */
    public int countElectronicsByMaker(String maker)
    {
        int n = 0;
        for(Gizmo g: purchases)
        {
            if(g.isElectronic() && g.getMaker().equals(maker))
                n++;
        }
        return n;
    }

    /** Returns true if any pair of adjacent purchased Gizmo objects are equivalent, and
     * false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair()
    {
        if(purchases.size() < 2)
            return false;

        for(int i = 0; i < purchases.size() - 1; i++)
        {
            Gizmo current = purchases.get(i);
            Gizmo adjacent = purchases.get(i + 1);
            if(current.equals(adjacent))
                return true;
        }
        return false;
    }
}

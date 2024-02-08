

public class TASK2 {
    public static void main(String[] args) {
        double yearlymaintenanceCostTotal=0;
        double springmaintenanceCostTotal=156;
        double summermaintenanceCostTotal=258;
        double fallmaintenanceCostTotal=188;
        double wintermaintenanceCostTotal=399;
        yearlymaintenanceCostTotal=springmaintenanceCostTotal + summermaintenanceCostTotal + fallmaintenanceCostTotal + wintermaintenanceCostTotal;
        System.out.println("Your yearly cost for maintenance is, " + yearlymaintenanceCostTotal);
        System.out.println("Your spring cost for maintenance is, " + springmaintenanceCostTotal);
        System.out.println("Your summer cost for maintenance is, " + summermaintenanceCostTotal);
        System.out.println("Your fall cost for maintenance is, " + fallmaintenanceCostTotal);
        System.out.println("Your winter cost for maintenance is, " + wintermaintenanceCostTotal);
    }
}

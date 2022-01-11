package day32_ConstructorOverloading;

public class CarpetTask {


    public double width, length;
    public double unitPrice;
    public boolean isPersian;

    public CarpetTask(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calCost() {
        double totalCost = (width * length) * unitPrice;

        if (isPersian) {
            totalCost+= 200;

        }
            return totalCost;

    }


    public String toString() {
        return "CarpetTask{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost= $" + calCost() +
                '}';
    }



}

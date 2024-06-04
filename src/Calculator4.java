public class Calculator4 {
    private double subtotal;
    private double taxRate;
    private double tipRate;
    private int numberOfGuests;

    public Calculator4 (double subtotal, double taxRate, double tipRate, int numberOfGuests) {
        this.subtotal = subtotal;
        this.taxRate = taxRate;
        this.tipRate = tipRate;
        this.numberOfGuests = numberOfGuests;
    }

    public double findTotal() {
        double total = subtotal * (1 + taxRate + tipRate);
        return total / numberOfGuests;
    }

    public static void main(String[] args) {
        Calculator4 calculator = new Calculator4 (100.0, 0.1, 0.15, 7); // subtotal, taxRate, tipRate, numberOfGuests
        double totalPerGuest = calculator.findTotal();
        System.out.println("Custo por convidado: " + totalPerGuest);
        
        double totalForWholeTable = totalPerGuest * 7;
        System.out.println("Total da mesa inteira: " + totalForWholeTable);
    }
}
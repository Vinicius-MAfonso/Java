package Invoice;


public class InvoiceTest {

   
    public static void main(String[] args) {
        Invoice celular = new Invoice("12345", "Um celular motorola preto", 10, 1200.00);
        System.out.printf("A fatura do celular foi de R$%.2f%n",celular.getInvoiceAmount());
    }
    
}

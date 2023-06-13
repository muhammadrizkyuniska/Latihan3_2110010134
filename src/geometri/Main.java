package geometri;

public class Main {
    public static void main(String[] args) {
        Lingkaran rizky1 = new Lingkaran(10);
        PersegiPanjang rizky2 = new PersegiPanjang(10,20);
        
        
        
        System.out.println("Luas Lingkaran : "+rizky1.luas());
        System.out.println("Keliling Lingkaran : "+rizky1.keliling());
        
        System.out.println("Luas PersegiPanjang : "+rizky2.luas());
        System.out.println("Keliling PersegiPanjang : "+rizky2.keliling());
        
    }
    
   
    
}

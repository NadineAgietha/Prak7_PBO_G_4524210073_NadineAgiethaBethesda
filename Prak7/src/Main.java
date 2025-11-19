public class Main {
    public static void main(String[] args) {
        // Inisiasi objek AransemenLagu
        AransemenLagu aransemen = new AransemenLagu("Senja di Kota");

        aransemen.aturAransemen();

        //Fitur improvisasi dengan mengirimkan Anonymous Class (Biola)
        aransemen.improvisasi(new Instrument() { 
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("  - Biola memainkan improvisasi nada tinggi untuk '" + judulLagu + "' tempo 90 BPM");
            }
        });
        
    }
}
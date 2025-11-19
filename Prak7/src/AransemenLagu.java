
import java.util.ArrayList;

// Class utama untuk menyimpan logika
public class AransemenLagu { 
    String judulLagu; // Atribut String judulLagu
    ArrayList<Instrument> daftarInstrument = new ArrayList<>(); // ArrayList untuk menyimpan objek

    public AransemenLagu(String judulLagu) { // Constructor
        this.judulLagu = judulLagu;
    }

    // Method aturAransemen()
    public void aturAransemen() { 
        System.out.println("--- Pemutaran Aransemen Utama: " + judulLagu + " ---");

        // Piano (Anonymous Class)
        Instrument piano = new Instrument() {
            @Override
            public void mainkan(String judulLagu) { 
                System.out.println("  - Piano memainkan " + judulLagu + " dengan melodi lembut tempo 80 BPM");
            }
        };

        // Gitar (Anonymous Class)
        Instrument gitar = new Instrument() {
            @Override
            public void mainkan(String judulLagu) { 
                System.out.println("  - Gitar memainkan " + judulLagu + " dengan ritme cepat tempo 120 BPM");
            }
        };

        // Drum (Anonymous Class)
        Instrument drum = new Instrument() {
            @Override
            public void mainkan(String judulLagu) { 
                System.out.println("  - Drum memainkan " + judulLagu + " dengan ketukan dinamis tempo 100 BPM");
            }
        };

        // Simpan objek di ArrayList
        daftarInstrument.add(piano);
        daftarInstrument.add(gitar);
        daftarInstrument.add(drum);

        // menampilkan hasil pemanggilan di mainkan()
        for (Instrument currentInstrument : daftarInstrument) { 
            currentInstrument.mainkan(judulLagu);
        }
        System.out.println("---------------------------------------------------------------------\n");
    }

    // Method improvisasi() yang menerima Anonymous Class sebagai parameter
    public void improvisasi(Instrument InstrumentImprovisasi) { 
        System.out.println("=== Improvisasi Lagu: " + judulLagu + " ===");
        InstrumentImprovisasi.mainkan(judulLagu); 
    }
}
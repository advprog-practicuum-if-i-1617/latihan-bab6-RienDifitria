
package inheritance;

public class SoftwareEngineer extends Karyawan {
    private int tunjangan= 5500000;
    public SoftwareEngineer(String jenis, int masaKerja) {
        super(jenis, masaKerja);
    }
    public int getTunjangan(){
        return tunjangan;
    }
    public int getBonus(){
        return bonus+300000;
    }
    public int getGaji(){
        gaji=super.getBonus()+gajiPokok+getTunjangan()+getBonus();
        return gaji;
    }
}

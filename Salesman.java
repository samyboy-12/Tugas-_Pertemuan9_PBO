public class Salesman extends Pegawai {
    private int target;
    private int penjualan;

    public Salesman(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    @Override
    public void setNip(String nip) {
        if (nip.startsWith("S")) {
            this.nip = nip;
        }
    }

    @Override
    public void setNip(int urutan) {
        this.nip = "S" + String.format("%05d", urutan);
    }

    @Override
    public int getThr() {
        return this.penjualan >= this.target ? this.gaji * 2 : this.gaji;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Salesman");
        System.out.println("Nama : " + this.nama);
        System.out.println("Departemen : " + this.departemen);
        System.out.println("NIP : " + this.nip);
        System.out.println("Gaji : " + this.gaji);
        System.out.println("Cuti : " + this.cuti);
        System.out.println("=============================");
    }
}

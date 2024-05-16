public class Manager extends Pegawai {

    public Manager(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    @Override
    public void setNip(String nip) {
        if (nip.startsWith("M")) {
            this.nip = nip;
        }
    }

    @Override
    public void setNip(int urutan) {
        this.nip = "M" + String.format("%05d", urutan);
    }

    @Override
    public int getThr() {
        return this.gaji * 2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Manager");
        System.out.println("Nama : " + this.nama);
        System.out.println("Departemen : " + this.departemen);
        System.out.println("NIP : " + this.nip);
        System.out.println("Gaji : " + this.gaji);
        System.out.println("Cuti : " + this.cuti);
        System.out.println("=============================");
    }
}

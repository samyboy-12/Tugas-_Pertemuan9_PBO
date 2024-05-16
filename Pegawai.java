public class Pegawai {
    protected String nama;
    protected String departemen;
    protected char jenisKelamin;
    protected int gaji;
    protected int cuti = 12;
    protected String nip;
    public Pegawai(String nama, String departemen, char jenisKelamin) {
        this.nama = nama;
        this.departemen = departemen;
        this.jenisKelamin = jenisKelamin;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void setCuti(int cuti) {
        this.cuti += cuti;
    }
    public void setCuti(String tipeCuti) {
        if (tipeCuti.equals("pernikahan")) {
            this.cuti += 2;
        } else if (tipeCuti.equals("persalinan")) {
            if (jenisKelamin == 'P') {
                this.cuti += 90;
            } else if (jenisKelamin == 'L') {
                this.cuti += 3;
            }
        }
    }
    public void setNip(String nip) {
        if (nip.startsWith("P")) {
            this.nip = nip;
        }
    }
    public void setNip(int urutan) {
        this.nip = "P" + String.format("%05d", urutan);
    }
    public int getThr() {
        return this.gaji;
    }
    public void displayInfo() {
        System.out.println("Jabatan : Pegawai");
        System.out.println("Nama : " + this.nama);
        System.out.println("Departemen : " + this.departemen);
        System.out.println("NIP : " + this.nip);
        System.out.println("Gaji : " + this.gaji);
        System.out.println("Cuti : " + this.cuti);
        System.out.println("=============================");
    }
}

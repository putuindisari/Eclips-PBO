package id.ac.undiksha.siak.people;

public class Manusia {
	
	private String nama;
	private String alamat;
	private String tanggalLahir;
	private boolean jeniskelamin;
	
	//object
	public Manusia() {
		
		this.nama 			= "<masukan nama>";
		this.alamat 		= "<masukan alamat>";
		this.tanggalLahir 	= "<masukan tanggal lahir>";
	}
//construktor
	public Manusia(
			String nama,
			String alamat,
			String tanggalLahir,
			boolean jeniskelamin) 
	{		//kalau super () memanggil konstruktornya
		super();
		this.nama 			= nama;
		this.alamat 		= alamat;
		this.tanggalLahir 	= tanggalLahir;
		this.jeniskelamin 	= jeniskelamin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public boolean isJeniskelamin() {
		return jeniskelamin;
	}

	public void setJeniskelamin(boolean jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
	public String getJenisKelamin() {
		if (this.isJeniskelamin()) {
			return "Perempuan";
		} else {
			return "Laki-Laki";
		}
	}
	public void printAll() {
		System.out.println(this.getNama());
		System.out.println(this.getAlamat());
		System.out.println(this.getTanggalLahir());
		System.out.println(this.getJenisKelamin());
		
	}
}

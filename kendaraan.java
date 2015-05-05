public class kendaraan {
	public int kecepatanMaks;
	public int berat;
	public int kapasitas;

	public kendaraan() {
		kecepatanMaks = 20;
		System.out.println("Kecepatan Maksimal Kendaraan = " +kecepatanMaks);
	}

}

	class Mobil extends kendaraan {
	public int jumlahRoda;

	public Mobil(int km, int jr, int b, int kp) {
		kecepatanMaks = km;
		jumlahRoda = jr;
		berat = b;
		kapasitas = kp;
	}

	public void CetakSpesifikasi () {
		System.out.println("Kecepatan Maksimal Mobil = " +kecepatanMaks);
		System.out.println("Berat mobil = " +berat);
		System.out.println("Kapasitas Mobil = " +kapasitas);
		System.out.println("Jumlah Roda = " +jumlahRoda);
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	public void Jalankan(int jalan){
		int jalankan = jalan;
		System.out.println("Mobil Dijalankan Dengan Kecepatan = " +jalankan);
	}

}